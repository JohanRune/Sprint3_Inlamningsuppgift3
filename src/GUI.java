
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class GUI extends JFrame  {

    JButton i0 = new JButton("1");
    JButton i1 = new JButton("");
    JButton i2 = new JButton("");
    JButton i3 = new JButton("4");
    JButton i4 = new JButton("5");
    JButton i5 = new JButton("");
    JButton i6 = new JButton("");
    JButton i7 = new JButton("8");
    JButton i8 = new JButton("9");
    JButton i9 = new JButton("");
    JButton i10 = new JButton("");
    JButton i11 = new JButton("12");
    JButton i12 = new JButton("13");
    JButton i13 = new JButton("");
    JButton i14 = new JButton("");
    JButton i15 = new JButton("16");

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


    public static void main(String[] args) {
        GUI g = new GUI();
        g.GUI();

    }

}
