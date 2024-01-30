/**
 * This program generates a set of artifacts including their Main Stat, level, and Sub Stat.
 *
 * @author Mikaella Louise Layug
 * @version 1.0
 * @since 2022-11-05
 */

import java.util.Scanner;

interface artifact{
    void mainStat();
    void level();
    void subStat1();
    void subStat2(String[] a);
    void subStat3(String[] b);
    void subStat4(String[] c);
}
/**
 * This is the class for the artifact Flower. It implements the interface artifact.
 */
class Flower implements artifact {
    public int mainStatPowerUp;
    public double subStat1PowerUp;
    public double subStat2PowerUp;
    public double subStat3PowerUp;
    public double subStat4PowerUp;

    static double HP;
    static double DEF;
    static double ATK;
    static double ER;
    static double EM;
    static double CR;
    static double CD;

    /**
     * This method prints out the Main Stat, HP.
     */
    @Override
    public void mainStat() {
        System.out.print("Main Stat: HP +");
    }

    /**
     *This method randomly generates the levels (from 0-20), and multiplies it by 1000 to get ethe Main Stat Power Up.
     * This method also prints out both
     */
    @Override
    public void level() {
        int min = 0;
        int max = 20;
        int level = (int) (Math.random() * (max - min + 1) + min);
        mainStatPowerUp = level * 1000;
        HP += mainStatPowerUp;
        System.out.println(mainStatPowerUp);
        System.out.println("Level: " + level);
    }

    /**
     * This method randomly generates a Sub Stat from the given String array.
     * This also randomly generates the power ups of each Sub Stat.
     * This method prints out both.
     * This method also subtracts the chosen Sub Stat from the String array and passes that String Array on to the next method.
     */
    @Override
    public void subStat1() {
        String[] subStats = {"HP", "ATK", "DEF", "ER", "EM", "CR", "CD"};
        int max = subStats.length - 1;
        int min = 0;
        int random = (int) (Math.random() * (max - min + 1) + min);
        String chosenSubStat = subStats[random];

        if (chosenSubStat.equals("HP") || chosenSubStat.equals("ATK") || chosenSubStat.equals("DEF") || chosenSubStat.equals("EM")) {
            int minPowerUp = 50;
            int maxPowerUp = 85;
            subStat1PowerUp = (int) (Math.random() * (maxPowerUp - minPowerUp + 1) + minPowerUp);
            String printSubStatAsInt = Integer.toString((int) subStat1PowerUp);
            System.out.println("Sub Stat: " + chosenSubStat + " +" + printSubStatAsInt);
        } else if (chosenSubStat.equals("ER") || chosenSubStat.equals("CR") || chosenSubStat.equals("CD")) {
            double minPowerUp = 25.00;
            double maxPowerUp = 50.00;
            subStat1PowerUp = (Math.random() * (maxPowerUp - minPowerUp + 1) + minPowerUp);
            System.out.println("Sub Stat: " + chosenSubStat + " +" + String.format("%.2f", subStat1PowerUp));
        }

        if (chosenSubStat.equals("HP")) {
            HP += subStat1PowerUp;
        } else if (chosenSubStat.equals("DEF")) {
            DEF += subStat1PowerUp;
        } else if (chosenSubStat.equals("ATK")) {
            ATK += subStat1PowerUp;
        } else if (chosenSubStat.equals("ER")) {
            ER += subStat1PowerUp;
        } else if (chosenSubStat.equals("EM")) {
            EM += subStat1PowerUp;
        } else if (chosenSubStat.equals("CR")) {
            CR += subStat1PowerUp;
        } else if (chosenSubStat.equals("CD")) {
            CD += subStat1PowerUp;
        }

        String[] newArr = new String[subStats.length - 1];

        for (int i = 0, k = 0; i < subStats.length; i++) {
            if (i == random) {
                continue;
            } else {
                newArr[k++] = subStats[i];
            }
        }
        subStat2(newArr);
    }

    /**
     * This method randomly generates a Sub Stat from the given String array.
     * This also randomly generates the power ups of each Sub Stat.
     * This method prints out both.
     * This method also subtracts the chosen Sub Stat from the String array and passes that String Array on to the next method.
     */
    @Override
    public void subStat2(String[] subStats) {
        int max = subStats.length - 1;
        int min = 0;
        int random = (int) (Math.random() * (max - min + 1) + min);
        String chosenSubStat = subStats[random];

        if (chosenSubStat.equals("HP") || chosenSubStat.equals("ATK") || chosenSubStat.equals("DEF") || chosenSubStat.equals("EM")) {
            int minPowerUp = 50;
            int maxPowerUp = 85;
            subStat2PowerUp = (int) (Math.random() * (maxPowerUp - minPowerUp + 1) + minPowerUp);
            String printSubStatAsInt = Integer.toString((int) subStat2PowerUp);
            System.out.println("Sub Stat: " + chosenSubStat + " +" + printSubStatAsInt);
        } else if (chosenSubStat.equals("ER") || chosenSubStat.equals("CR") || chosenSubStat.equals("CD")) {
            double minPowerUp = 25.00;
            double maxPowerUp = 50.00;
            subStat4PowerUp = (Math.random() * (maxPowerUp - minPowerUp + 1) + minPowerUp);
            System.out.println("Sub Stat: " + chosenSubStat + " +" + String.format("%.2f", subStat2PowerUp));
        }

        if (chosenSubStat.equals("HP")) {
            HP += subStat1PowerUp;
        } else if (chosenSubStat.equals("DEF")) {
            DEF += subStat1PowerUp;
        } else if (chosenSubStat.equals("ATK")) {
            ATK += subStat1PowerUp;
        } else if (chosenSubStat.equals("ER")) {
            ER += subStat1PowerUp;
        } else if (chosenSubStat.equals("EM")) {
            EM += subStat1PowerUp;
        } else if (chosenSubStat.equals("CR")) {
            CR += subStat1PowerUp;
        } else if (chosenSubStat.equals("CD")) {
            CD += subStat1PowerUp;
        }

        String[] newArr = new String[subStats.length - 1];

        for (int i = 0, k = 0; i < subStats.length; i++) {
            if (i == random) {
                continue;
            } else {
                newArr[k++] = subStats[i];
            }
        }
        subStat3(newArr);
    }

    /**
     * This method randomly generates a Sub Stat from the given String array.
     * This also randomly generates the power ups of each Sub Stat.
     * This method prints out both.
     * This method also subtracts the chosen Sub Stat from the String array and passes that String Array on to the next method.
     */
    @Override
    public void subStat3(String[] subStats) {
        int max = subStats.length - 1;
        int min = 0;
        int random = (int) (Math.random() * (max - min + 1) + min);
        String chosenSubStat = subStats[random];

        if (chosenSubStat.equals("HP") || chosenSubStat.equals("ATK") || chosenSubStat.equals("DEF") || chosenSubStat.equals("EM")) {
            int minPowerUp = 50;
            int maxPowerUp = 85;
            subStat3PowerUp = (int) (Math.random() * (maxPowerUp - minPowerUp + 1) + minPowerUp);
            String printSubStatAsInt = Integer.toString((int) subStat3PowerUp);
            System.out.println("Sub Stat: " + chosenSubStat + " +" + printSubStatAsInt);
        } else if (chosenSubStat.equals("ER") || chosenSubStat.equals("CR") || chosenSubStat.equals("CD")) {
            double minPowerUp = 25.00;
            double maxPowerUp = 50.00;
            subStat3PowerUp = (Math.random() * (maxPowerUp - minPowerUp + 1) + minPowerUp);
            System.out.println("Sub Stat: " + chosenSubStat + " +" + String.format("%.2f", subStat3PowerUp));
        }

        if (chosenSubStat.equals("HP")) {
            HP += subStat1PowerUp;
        } else if (chosenSubStat.equals("DEF")) {
            DEF += subStat1PowerUp;
        } else if (chosenSubStat.equals("ATK")) {
            ATK += subStat1PowerUp;
        } else if (chosenSubStat.equals("ER")) {
            ER += subStat1PowerUp;
        } else if (chosenSubStat.equals("EM")) {
            EM += subStat1PowerUp;
        } else if (chosenSubStat.equals("CR")) {
            CR += subStat1PowerUp;
        } else if (chosenSubStat.equals("CD")) {
            CD += subStat1PowerUp;
        }

        String[] newArr = new String[subStats.length - 1];

        for (int i = 0, k = 0; i < subStats.length; i++) {
            if (i == random) {
                continue;
            } else {
                newArr[k++] = subStats[i];
            }
        }
        subStat4(newArr);
    }

    /**
     * This method randomly generates a Sub Stat from the given String array.
     * This also randomly generates the power ups of each Sub Stat.
     * This method prints out both.
     * This method also subtracts the chosen Sub Stat from the String array and passes that String Array on to the next method.
     */
    @Override
    public void subStat4(String[] subStats) {
        int max = subStats.length - 1;
        int min = 0;
        int random = (int) (Math.random() * (max - min + 1) + min);
        String chosenSubStat = subStats[random];

        if (chosenSubStat.equals("HP") || chosenSubStat.equals("ATK") || chosenSubStat.equals("DEF") || chosenSubStat.equals("EM")) {
            int minPowerUp = 50;
            int maxPowerUp = 85;
            subStat4PowerUp = (int) (Math.random() * (maxPowerUp - minPowerUp + 1) + minPowerUp);
            String printSubStatAsInt = Integer.toString((int) subStat4PowerUp);
            System.out.println("Sub Stat: " + chosenSubStat + " +" + printSubStatAsInt);
        } else if (chosenSubStat.equals("ER") || chosenSubStat.equals("CR") || chosenSubStat.equals("CD")) {
            double minPowerUp = 25.00;
            double maxPowerUp = 50.00;
            subStat4PowerUp = (Math.random() * (maxPowerUp - minPowerUp + 1) + minPowerUp);
            System.out.println("Sub Stat: " + chosenSubStat + " +" + String.format("%.2f", subStat4PowerUp));
        }

        if (chosenSubStat.equals("HP")) {
            HP += subStat1PowerUp;
        } else if (chosenSubStat.equals("DEF")) {
            DEF += subStat1PowerUp;
        } else if (chosenSubStat.equals("ATK")) {
            ATK += subStat1PowerUp;
        } else if (chosenSubStat.equals("ER")) {
            ER += subStat1PowerUp;
        } else if (chosenSubStat.equals("EM")) {
            EM += subStat1PowerUp;
        } else if (chosenSubStat.equals("CR")) {
            CR += subStat1PowerUp;
        } else if (chosenSubStat.equals("CD")) {
            CD += subStat1PowerUp;
        }

        String[] newArr = new String[subStats.length - 1];

        for (int i = 0, k = 0; i < subStats.length; i++) {
            if (i == random) {
                continue;
            } else {
                newArr[k++] = subStats[i];
            }
        }
    }

    static double getHP(){
        return HP;
    }

    static double getDEF(){
        return DEF;
    }

    static double getATK(){
        return ATK;
    }

    static double getER(){
        return ER;
    }

    static double getEM(){
        return EM;
    }

    static double getCR(){
        return CR;
    }

    static double getCD(){
        return CD;
    }
}

/**
 * This is the class for the artifact Feather. It extends class Flower.
 */
class Feather extends Flower {
    /**
     * This method prints out the Main Stat, ATK.
     */
    @Override
    public void mainStat() {
        System.out.print("Main Stat: ATK +");
    }

    /**
     *This method randomly generates the levels (from 0-20), and multiplies it by 1000 to get ethe Main Stat Power Up.
     * This method also prints out both
     */
    @Override
    public void level() {
        int min = 0;
        int max = 20;
        int level = (int) (Math.random() * (max - min + 1) + min);
        mainStatPowerUp = level * 1000;
        ATK += mainStatPowerUp;
        System.out.println(mainStatPowerUp);
        System.out.println("Level: " + level);
    }
}

/**
 * This is the class for the artifact Sands. It extends class Flower.
 */
class Sands extends Flower{
    /**
     * This method randomly generates a Main Stat from the String Array given.
     * This also prints the chosen Main Stat.
     */
    @Override
    public void mainStat() {
        String[] subStats = {"HP", "DEF", "ATK", "ER", "EM"};
        int max = subStats.length - 1;
        int min = 0;
        int random = (int) (Math.random() * (max - min + 1) + min);
        String mainStat = subStats[random];
        System.out.print("Main Stat: " + mainStat + " +");
    }
}

public class Main {
    /**
     * This method calculates the total Stats, and prints them.
     */
    public static void calcStats(){
        System.out.print("HP: ");
        double totalHP = Flower.getHP() + Feather.getHP() + Sands.getHP();
        System.out.println(String.format("%.2f", totalHP));

        double totalDEF = Flower.DEF + Feather.DEF + Sands.DEF;
        System.out.print("DEF: ");
        System.out.println(String.format("%.2f", totalDEF));

        double totalATK = Flower.ATK + Feather.ATK + Sands.ATK;
        System.out.print("ATK: ");
        System.out.println(String.format("%.2f", totalATK));

        double totalER = Flower.ER + Feather.ER + Sands.ER;
        System.out.print("ER: ");
        System.out.println(String.format("%.2f", totalER));

        double totalEM = Flower.EM + Feather.EM + Sands.EM;
        System.out.print("EM: ");
        System.out.println(String.format("%.2f", totalEM));

        double totalCR = Flower.CR + Feather.CR + Sands.CR;
        System.out.print("CR: ");
        System.out.println(String.format("%.2f", totalCR));

        double totalCD = Flower.CD + Feather.CD + Sands.CD;
        System.out.print("CD: ");
        System.out.println(String.format("%.2f", totalCD));
    }

    /**
     *This is the main method, where we call all classes and their methods.
     */

    public static void main(String[] args) {
        System.out.println("[Merry Christmas!]");
        boolean condition = true;
        Scanner ansObj = new Scanner(System.in);

        do {
            System.out.println();

            System.out.print("Flower ");
            System.out.println("\uD83E\uDD40");
            Flower myFlower = new Flower();

            myFlower.mainStat();
            myFlower.level();
            myFlower.subStat1();

            System.out.println();
            System.out.print("Feather ");
            System.out.println("\uD83E\uDEB6");
            Feather myFeather = new Feather();

            myFeather.mainStat();
            myFeather.level();
            myFeather.subStat1();

            System.out.println();
            System.out.print("Sands ");
            System.out.println("\u23F3");
            Sands mySands = new Sands();

            mySands.mainStat();
            mySands.level();
            mySands.subStat1();

            System.out.println();
            calcStats();

            System.out.println();
            System.out.println("Generate new artifact set?");
            System.out.println("Press y or Y if Yes");
            System.out.println("Press any key to exit");
            String answer = ansObj.nextLine();

            if (answer.equals("y") || answer.equals("Y")){
                condition = true;
            }

            else {
                condition = false;
            }

        } while (condition);
    }
}
