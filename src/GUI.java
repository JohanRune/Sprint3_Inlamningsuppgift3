
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    List<String> randomBricks = puzzle.randomBricks();

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

    JPanel victoryMessage = new JPanel();
    JPanel bricks = new JPanel();
    JPanel shuffleMessage = new JPanel();
    JPanel bricksNorth = new JPanel();
    JPanel bricksCenter = new JPanel();
    JPanel bricksSouth = new JPanel();

    public void GUI () {

        setLayout(new BorderLayout());
        add("North", victoryMessage);
        add("Center", bricks);
        add("South", shuffleMessage);

        bricks.setLayout(new GridLayout(4, 4));

        i5.addActionListener(this);

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

        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //lyssnare
    @Override
    public void actionPerformed (ActionEvent e) {

        i5.setText("hej");

    }



    public static void main(String[] args) {
        GUI g = new GUI();
        g.GUI();

    }

}
