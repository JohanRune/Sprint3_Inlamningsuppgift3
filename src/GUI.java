
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JPanel;

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

        for (int i = 0; i < buttonsList.size(); i++) {
            buttonsList.get(i).addActionListener(this);
        }

        newGame.addActionListener(this);

        for (int i = 0; i < buttonsList.size(); i++) {
            bricks.add(buttonsList.get(i));
        }

        shuffleMessage.add(newGame);
        victoryMessage.add(victoryText);

        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed (ActionEvent e) {

        for (int i = 0; i < buttonsList.size(); i++)
            if(e.getSource() == buttonsList.get(i)){
                placedBricks = puzzle.changePlace(placedBricks, i);
                setBricks(placedBricks);
            }

        if (e.getSource() == newGame && isTest == false){
            placedBricks = puzzle.randomBricks();
            setBricks(placedBricks);
            victoryText.setText("");
        }
        else if (e.getSource() == newGame && isTest == true){
            placedBricks = closeToVictoryList;
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

        if (puzzle.isVictory(bricks))
            victoryText.setText("Victory! Congratulations!");
    }
}