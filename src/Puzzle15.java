
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Puzzle15 {

    public List<String> randomBricks () {
        List<String> randomBricks = new ArrayList<>();
        int randomNum;
        randomNum = ThreadLocalRandom.current().nextInt(0, 16);
        randomBricks.add(String.valueOf(randomNum));

        while (randomBricks.size() < 16) {
            randomNum = ThreadLocalRandom.current().nextInt(0, 16);
            Boolean check = false;

            for (int i = 0; i < randomBricks.size(); i++)
                if (randomNum == Integer.parseInt(randomBricks.get(i)))
                    check = true;

            if (check == false)
                randomBricks.add(String.valueOf(randomNum));
        }

        int indexOfZero = randomBricks.indexOf("0");
        randomBricks.set(indexOfZero, "");

            return randomBricks;
    }


    public List<String> closeToVictory(){
        List<String> closeToVictoryList = new ArrayList<>();

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

        return closeToVictoryList;
    }


    public List<String> changePlace (List<String> brickArray, int indexOfChoosenBrick){

        int indexOfSpace = 0;
        for (int i = 0; i < brickArray.size(); i++)
            if (brickArray.get(i).equalsIgnoreCase(""))
                indexOfSpace = i;
        System.out.println("index på _: " + indexOfSpace);

        if (indexOfChoosenBrick == indexOfSpace - 1 || indexOfChoosenBrick == indexOfSpace + 1
                || indexOfChoosenBrick == indexOfSpace - 4 || indexOfChoosenBrick == indexOfSpace + 4) {
            brickArray.set(indexOfSpace, brickArray.get(indexOfChoosenBrick));
            brickArray.set(indexOfChoosenBrick, "");
        }

        return brickArray;
    }


    public boolean isVictory (List<String> brickArray){

        String[] victoryLayout = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", ""};
        int victoryCount = 0;

        for (int i = 0; i < brickArray.size(); i++) {
            if (brickArray.get(i) == victoryLayout[i])
                victoryCount += 1;
        }

        if (victoryCount == 16)
            return true;
        else
            return false;
    }
}