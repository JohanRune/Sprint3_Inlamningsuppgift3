
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Puzzle15 {

   // GUI gui = new GUI();

    //metod som slumpar ut brickorna.
    public List<String> randomBricks () {

        List<String> randomBricks = new ArrayList<>();
        List<String> closeToVictoryBricks = new ArrayList<>();
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
/*
        closeToVictoryBricks = closeToVictory();

        if (test == true)
            return closeToVictoryBricks;
        else

 */
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

    //metod som byter plats på vald bricka och tomma platsen.
    //inparameter: en plats i arrayen där en bricka finns placerad.
    public List<String> changePlace (List<String> brickArray, int indexOfChoosenBrick){

        //hitta index av X.
        int indexOfX = 0;
        for (int i = 0; i < brickArray.size(); i++)
            if (brickArray.get(i).equalsIgnoreCase(""))
                indexOfX = i;
        System.out.println("index på _: " + indexOfX);


        //om godkänd plats så byter den plats.
        if (indexOfChoosenBrick == indexOfX - 1 || indexOfChoosenBrick == indexOfX + 1
                || indexOfChoosenBrick == indexOfX - 4 || indexOfChoosenBrick == indexOfX + 4) {
            brickArray.set(indexOfX, brickArray.get(indexOfChoosenBrick));
            brickArray.set(indexOfChoosenBrick, "");
        }

        //test
        System.out.println("Array efter byte");
        for (int i = 0; i < brickArray.size(); i++) {
            System.out.print(brickArray.get(i) + " ");
        }
        System.out.println();

        return brickArray;

    }




    //metoden kollar om pusslet har lösts.
    public boolean isVictory (List<String> brickArray){

        String[] victoryLayout = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", ""};

        boolean isVicotory = false;
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






    public static void main(String[] args) {

        Puzzle15 puzzle = new Puzzle15();
        //List<String> randomBrickArray = puzzle.randomBricks();

        //for (int i = 0; i < randomBrickArray.size(); i++) {
        //    System.out.print(randomBrickArray.get(i) + " ");
        //}
        System.out.println();

        List<String> testArray = new ArrayList<>();
        testArray.add("1"); //index 0
        testArray.add("2");
        testArray.add("3");
        testArray.add("4");
        testArray.add("5");
        testArray.add("6"); //index 5
        testArray.add("7");
        testArray.add("8");
        testArray.add("9");
        testArray.add("10"); //index 10
        testArray.add("11");
        testArray.add("12");
        testArray.add("13");
        testArray.add("14");
        testArray.add("15"); //index// 15
        testArray.add("X");

        //test
        System.out.println("Array före byte");
        for (int i = 0; i < testArray.size(); i++)
            System.out.print (testArray.get(i) + " ");
        System.out.println();

        puzzle.changePlace(testArray, 3);

        //test
        boolean isVictory = puzzle.isVictory(testArray);
        if (isVictory)
            System.out.println("Seger!");
        else
            System.out.println("Inte seger!");





        String[] brickor = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "X"};
        int temp = 0;
        //for (int i = 0; i < 4; i++) {//råd 1 //0---1

        for (int j = 0; j < 4; j++) //elementet ino råd 0 =5 // 0,1,2,3//4,5,6,7//
            System.out.print(brickor[j]);
        System.out.println();
        for (int jj = 4; jj < 8; jj++) //elementet ino råd
            System.out.print(brickor[jj]);

        System.out.println();
        for (int f = 8; f < 12; f++) //elementet ino råd 0 =5 // 0,1,2,3//4,5,6,7//
            System.out.print(brickor[f]);
        System.out.println();
        for (int jj = 12; jj < 16; jj++) //elementet ino råd
            System.out.print(brickor[jj]);

        System.out.println();


    }


}