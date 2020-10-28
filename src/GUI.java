
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JPanel;

//set visible false.
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
    List<JButton> buttonsList = new ArrayList<>();


    JButton i0 = new JButton();
    JButton i1 = new JButton();
    JButton i2 = new JButton();
    JButton i3 = new JButton();
    JButton i4 = new JButton();
    JButton i5 = new JButton();
    JButton i6 = new JButton();
    JButton i7 = new JButton();
    JButton i8 = new JButton();
    JButton i9 = new JButton();
    JButton i10 = new JButton();
    JButton i11 = new JButton();
    JButton i12 = new JButton();
    JButton i13 = new JButton();
    JButton i14 = new JButton();
    JButton i15 = new JButton();
    JButton newGame = new JButton("Play!");
    JLabel victoryText = new JLabel("");


    JPanel victoryMessage = new JPanel();
    JPanel bricks = new JPanel();
    JPanel shuffleMessage = new JPanel();


    public void GUI (boolean test) {

        buttonsList.add(i0);
        buttonsList.add(i1);
        buttonsList.add(i2);
        buttonsList.add(i3);
        buttonsList.add(i4);
        buttonsList.add(i5);
        buttonsList.add(i6);
        buttonsList.add(i7);
        buttonsList.add(i8);
        buttonsList.add(i9);
        buttonsList.add(i10);
        buttonsList.add(i11);
        buttonsList.add(i12);
        buttonsList.add(i13);
        buttonsList.add(i14);
        buttonsList.add(i15);

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

        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed (ActionEvent e) {

        for (int i = 0; i < buttonsList.size(); i++) {

        }


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


        for (int i = 0; i < bricks.size(); i++) {
            buttonsList.get(i).setText(bricks.get(i));
            if (bricks.get(i) == "")
                buttonsList.get(i).setVisible(false);
            else
                buttonsList.get(i).setVisible(true);
        }

/*
        i0.setText(bricks.get(0));
        if (bricks.get(0) == "")
            i0.setVisible(false);
        else
            i0.setVisible(true);

        i1.setText(bricks.get(1));
        if (bricks.get(1) == "")
            i1.setVisible(false);
        else
            i1.setVisible(true);

        i2.setText(bricks.get(2));
        if (bricks.get(2) == "")
            i2.setVisible(false);
        else
            i2.setVisible(true);
        i3.setText(bricks.get(3));
        if (bricks.get(3) == "")
            i3.setVisible(false);
        else
            i3.setVisible(true);

        i4.setText(bricks.get(4));
        if (bricks.get(4) == "")
            i4.setVisible(false);
        else
            i4.setVisible(true);

        i5.setText(bricks.get(5));
        if (bricks.get(5) == "")
            i5.setVisible(false);
        else
            i5.setVisible(true);

        i6.setText(bricks.get(6));
        if (bricks.get(6) == "")
            i6.setVisible(false);
        else
            i6.setVisible(true);

        i7.setText(bricks.get(7));
        if (bricks.get(7) == "")
            i7.setVisible(false);
        else
            i7.setVisible(true);

        i8.setText(bricks.get(8));
        if (bricks.get(8) == "")
            i8.setVisible(false);
        else
            i8.setVisible(true);

        i9.setText(bricks.get(9));
        if (bricks.get(9) == "")
            i9.setVisible(false);
        else
            i9.setVisible(true);

        i10.setText(bricks.get(10));
        if (bricks.get(10) == "")
            i10.setVisible(false);
        else
            i10.setVisible(true);

        i11.setText(bricks.get(11));
        if (bricks.get(11) == "")
            i11.setVisible(false);
        else
            i11.setVisible(true);

        i12.setText(bricks.get(12));
        if (bricks.get(12) == "")
            i12.setVisible(false);
        else
            i12.setVisible(true);

        i13.setText(bricks.get(13));
        if (bricks.get(13) == "")
            i13.setVisible(false);
        else
            i13.setVisible(true);

        i14.setText(bricks.get(14));
        if (bricks.get(14) == "")
            i14.setVisible(false);
        else
            i14.setVisible(true);

        i15.setText(bricks.get(15));
        if (bricks.get(15) == "")
            i15.setVisible(false);
        else
            i15.setVisible(true);

*/

        if (puzzle.isVictory(bricks))
            victoryText.setText("Victory Congratulations!");
    }
}
