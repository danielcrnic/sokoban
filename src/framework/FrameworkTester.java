package framework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

public class FrameworkTester extends GameFramework {

    private ArrayList<File> texturesFiles;
    private int count = 1;

    private int song2;

    public FrameworkTester() {
        JPanel label = new JPanel();
        label.setBackground(Color.RED);

        JPanel label2 = new JPanel();
        label2.setBackground(Color.BLUE);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(new JMenu("Hello 1"));
        menuBar.add(new JMenu("Hello 2"));
        menuBar.add(new JMenu("Hello 3"));
        menuBar.add(new JMenu("Hello 4"));
        menuBar.add(new JMenu("Hello 5"));

        JMenuBar menuBar2 = new JMenuBar();
        menuBar2.add(new JMenu("Bruh momento")); // Inte Okej Daniel.. ;)   // Vad annars skulle jag ha skrivit? :P

        setMenuBar(menuBar);
        setComponent(label);

        // Timer timer = new Timer(1000, new ActionListener() {    // LÄGG INTE DELAY NÅGOT LÄGRE!!!
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         if (count == 1) {
        //             setMenuBar(menuBar2);
        //             setComponent(label2);
        //             count = 2;
        //         }
        //         else {
        //             setMenuBar(menuBar);
        //             setComponent(label);
        //             count = 1;
        //         }
        //     }
        // });
        // timer.start();

        int song1 = loadSound(new File("audio/song1.mp3"));
        song2 = loadSound(new File("audio/song3.mp3"));
        playSound(song1);

        new Timer(10000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopSound(song1);
            }
        }).start();
    }

    @Override
    public int getGUIWidth() {
        return 500;
    }

    @Override
    public int getGUIHeight() {
        return 500;
    }

    @Override
    public String getGameName() {
        return "Test game";
    }

    @Override
    public void goLeft() {
        System.out.println("Left");
        playSound(song2);
    }

    @Override
    public void goRight() {
        System.out.println("Right");
        stopSound(song2);
    }

    @Override
    public void goUp() {
        System.out.println("Up");
    }

    @Override
    public void goDown() {
        System.out.println("Down");
    }

    @Override
    public void pressedEnter() {

    }

    // @Override
    // public ArrayList<File> getFilePaths() {
    //     texturesFiles = new ArrayList<>();
    //     texturesFiles.add(new File("textures/blank.png"));
    //     texturesFiles.add(new File("textures/blankmarked.png"));
    //     texturesFiles.add(new File("textures/crate.png"));
    //     texturesFiles.add(new File("textures/cratemarked.png"));
    //     texturesFiles.add(new File("textures/player.png"));
    //     texturesFiles.add(new File("textures/playerflipped.png"));
    //     texturesFiles.add(new File("textures/wall.png"));
    //     return texturesFiles;
    // }

    public static void main(String[] args) {
        FrameworkTester frameworkTester = new FrameworkTester();
    }
}