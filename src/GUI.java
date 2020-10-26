
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 * Created by Johan Rune
 * Date: 2020-10-23
 * Time: 08:53
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class GUI extends JFrame implements ActionListener {

    Puzzle15 puzzle = new Puzzle15();
    boolean isTest = false;
    List<String> randomBricks = puzzle.randomBricks();
    List<String> closeToVictoryList = new ArrayList<>();
    List<String> placedBricks = new ArrayList<>();

    JButton i0 = new JButton(randomBricks.get(0));
    JButton i1 = new JButton(randomBricks.get(1));
    JButton i2 = new JButton(randomBricks.get(2));
    JButton i3 = new JButton(randomBricks.get(3));
    JButton i4 = new JButton(randomBricks.get(4));
    JButton i5 = new JButton(randomBricks.get(5));
    JButton i6 = new JButton(randomBricks.get(6));
    JButton i7 = new JButton(randomBricks.get(7));
    JButton i8 = new JButton(randomBricks.get(8));
    JButton i9 = new JButton(randomBricks.get(9));
    JButton i10 = new JButton(randomBricks.get(10));
    JButton i11 = new JButton(randomBricks.get(11));
    JButton i12 = new JButton(randomBricks.get(12));
    JButton i13 = new JButton(randomBricks.get(13));
    JButton i14 = new JButton(randomBricks.get(14));
    JButton i15 = new JButton(randomBricks.get(15));
    JButton newGame = new JButton("Nytt spel!");
    JLabel victoryText = new JLabel("");

    JPanel victoryMessage = new JPanel();
    JPanel bricks = new JPanel();
    JPanel shuffleMessage = new JPanel();
    JPanel bricksNorth = new JPanel();
    JPanel bricksCenter = new JPanel();
    JPanel bricksSouth = new JPanel();


    public void GUI (boolean test) {

        if (test == true)
        {
            isTest = true;

            closeToVictoryList.add("1");
            closeToVictoryList.add("2");
            closeToVictoryList.add("3");
            closeToVictoryList.add("4");
            closeToVictoryList.add("5");
            closeToVictoryList.add("6");
            closeToVictoryList.add("7");
            closeToVictoryList.add("8");
            closeToVictoryList.add("9");
            closeToVictoryList.add("10");
            closeToVictoryList.add("11");
            closeToVictoryList.add("12");
            closeToVictoryList.add("13");
            closeToVictoryList.add("14");
            closeToVictoryList.add("");
            closeToVictoryList.add("15");

            placedBricks = closeToVictoryList;
        }

        if (isTest == false)
            placedBricks = randomBricks;

        setLayout(new BorderLayout());
        add("North", victoryMessage);
        add("Center", bricks);
        add("South", shuffleMessage);

        bricks.setLayout(new GridLayout(4, 4));
        shuffleMessage.add(newGame);

        i0.addActionListener(this);
        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i5.addActionListener(this);
        i6.addActionListener(this);
        i7.addActionListener(this);
        i8.addActionListener(this);
        i9.addActionListener(this);
        i10.addActionListener(this);
        i11.addActionListener(this);
        i12.addActionListener(this);
        i13.addActionListener(this);
        i14.addActionListener(this);
        i15.addActionListener(this);
        newGame.addActionListener(this);

        bricks.add(i0);
        bricks.add(i1);
        bricks.add(i2);
        bricks.add(i3);
        bricks.add(i4);
        bricks.add(i5);
        bricks.add(i6);
        bricks.add(i7);
        bricks.add(i8);
        bricks.add(i9);
        bricks.add(i10);
        bricks.add(i11);
        bricks.add(i12);
        bricks.add(i13);
        bricks.add(i14);
        bricks.add(i15);
        shuffleMessage.add(newGame);
        victoryMessage.add(victoryText);

        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    //lyssnare
    @Override
    public void actionPerformed (ActionEvent e) {

        if(e.getSource() == i0) {
            placedBricks = puzzle.changePlace(placedBricks, 0);
            setBricks(placedBricks);
        }
        if(e.getSource() == i1) {
            placedBricks = puzzle.changePlace(placedBricks, 1);
            setBricks(placedBricks);
        }
        if(e.getSource() == i2) {
            placedBricks = puzzle.changePlace(placedBricks, 2);
            setBricks(placedBricks);
        }
        if(e.getSource() == i3) {
            placedBricks = puzzle.changePlace(placedBricks, 3);
            setBricks(placedBricks);
        }
        if(e.getSource() == i4) {
            placedBricks = puzzle.changePlace(placedBricks, 4);
            setBricks(placedBricks);
        }
        if(e.getSource() == i5) {
            placedBricks = puzzle.changePlace(placedBricks, 5);
            setBricks(placedBricks);
        }
        if(e.getSource() == i6) {
            placedBricks = puzzle.changePlace(placedBricks, 6);
            setBricks(placedBricks);
        }
        if(e.getSource() == i7) {
            placedBricks = puzzle.changePlace(placedBricks, 7);
            setBricks(placedBricks);
        }
        if(e.getSource() == i8) {
            placedBricks = puzzle.changePlace(placedBricks, 8);
            setBricks(placedBricks);
        }
        if(e.getSource() == i9) {
            placedBricks = puzzle.changePlace(placedBricks, 9);
            setBricks(placedBricks);
        }

        if(e.getSource() == i10) {
            placedBricks = puzzle.changePlace(placedBricks, 10);
            setBricks(placedBricks);
        }

        if(e.getSource() == i11) {
            placedBricks = puzzle.changePlace(placedBricks, 11);
            setBricks(placedBricks);
        }

        if(e.getSource() == i12) {
            placedBricks = puzzle.changePlace(placedBricks, 12);
            setBricks(placedBricks);
        }

        if(e.getSource() == i13) {
            placedBricks = puzzle.changePlace(placedBricks, 13);
            setBricks(placedBricks);
        }

        if(e.getSource() == i14) {
            placedBricks = puzzle.changePlace(placedBricks, 14);
            setBricks(placedBricks);
        }

        if(e.getSource() == i15) {
            placedBricks = puzzle.changePlace(placedBricks, 15);
            setBricks(placedBricks);
        }


        if(e.getSource() == newGame){
            placedBricks = puzzle.randomBricks();
            setBricks(placedBricks);
            victoryText.setText("");
        }
    }

    public void setBricks (List<String> bricks){
        i0.setText(bricks.get(0));
        i1.setText(bricks.get(1));
        i2.setText(bricks.get(2));
        i3.setText(bricks.get(3));
        i4.setText(bricks.get(4));
        i5.setText(bricks.get(5));
        i6.setText(bricks.get(6));
        i7.setText(bricks.get(7));
        i8.setText(bricks.get(8));
        i9.setText(bricks.get(9));
        i10.setText(bricks.get(10));
        i11.setText(bricks.get(11));
        i12.setText(bricks.get(12));
        i13.setText(bricks.get(13));
        i14.setText(bricks.get(14));
        i15.setText(bricks.get(15));

        if (puzzle.isVictory(bricks))
            victoryText.setText("Vinst! Grattis!");
    }
}
