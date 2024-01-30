
interface artifact{
    void mainStat();
    void level();
    void subStat1();
    void subStat2(String[] a);
    void subStat3(String[] b);
}

interface maxArtifact extends artifact{
    void subStat4(String [] c);
}
class flower implements artifact {
    public void mainStat() {
        System.out.println("HP");
    }

    public void level() {
        int min = 0;
        int max = 20;
        int level = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(level);
    }

    public void subStat1() {
        String[] subStats = {"ATK", "DEF", "HP", "Energy Recharge", "Elemental Mastery"};

        int max = subStats.length - 1;
        int min = 0;

        int random = (int) (Math.random() * (max - min + 1) + min);

        String chosenSubStat = subStats[random];

        System.out.println(chosenSubStat);
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

    public void subStat2(String[] subStats) {

        int max = subStats.length - 1;
        int min = 0;

        int random = (int) (Math.random() * (max - min + 1) + min);

        String chosenSubStat = subStats[random];
        System.out.println("Sub Stat: " + chosenSubStat);
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

    public void subStat3(String[] subStats) {
        int max = subStats.length - 1;
        int min = 0;

        int random = (int) (Math.random() * (max - min + 1) + min);

        String chosenSubStat = subStats[random];
        System.out.println("Sub Stat: " + chosenSubStat);
        String[] newArr = new String[subStats.length - 1];

        for (int i = 0, k = 0; i < subStats.length; i++) {
            if (i == random) {
                continue;
            } else {
                newArr[k++] = subStats[i];
            }
        }
    }
}

class feather extends flower {
    @Override
    public void mainStat() {
        System.out.println("ATK");
    }
    @Override
    public void subStat1() {
        String[] subStats = {"DEF", "HP", "Energy Recharge", "Elemental Mastery"};

        int max = subStats.length - 1;
        int min = 0;

        int random = (int) (Math.random() * (max - min + 1) + min);

        String chosenSubStat = subStats[random];
        System.out.println(chosenSubStat);
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
}
class sands extends flower implements maxArtifact {
    @Override
    public void mainStat() {
        String[] mainStats = {"ATK%", "DEF%", "HP%"};
        int max = mainStats.length - 1;
        int min = 0;

        int random = (int) (Math.random() * (max - min + 1) + min);

        String chosenMainStat = mainStats[random];
        System.out.println(chosenMainStat);
    }
    @Override
    public void subStat3(String[] subStats) {
        int max = subStats.length - 1;
        int min = 0;

        int random = (int) (Math.random() * (max - min + 1) + min);

        String chosenSubStat = subStats[random];
        System.out.println("Sub Stat: " + chosenSubStat);
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

    public void subStat4(String[] subStats){
        int max = subStats.length - 1;
        int min = 0;

        int random = (int) (Math.random() * (max - min + 1) + min);

        String chosenSubStat = subStats[random];
        System.out.println("Sub Stat: " + chosenSubStat);
        String[] newArr = new String[subStats.length - 1];

        for (int i = 0, k = 0; i < subStats.length; i++) {
            if (i == random) {
                continue;
            } else {
                newArr[k++] = subStats[i];
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int setCount = 3;
        int i = 0;

        while (i != setCount) {
            System.out.println();
            System.out.println("-- -- -- -- -- -- -- -- --");
            System.out.println();


            System.out.print("Flower ");
            System.out.println("\uD83E\uDD40");
            flower myFlower = new flower();

            System.out.print("Main Stat: ");
            myFlower.mainStat();

            System.out.print("Level: ");
            myFlower.level();

            System.out.print("Sub Stat: ");
            myFlower.subStat1();

            System.out.println();
            System.out.print("Feather ");
            System.out.println("\uD83E\uDEB6");
            feather myFeather = new feather();

            System.out.print("Main Stat: ");
            myFeather.mainStat();

            System.out.print("Level: ");
            myFeather.level();

            System.out.print("Sub Stat: ");
            myFeather.subStat1();

            System.out.println();
            System.out.print("Sands ");
            System.out.println("\u23F3");
            sands mySands = new sands();

            System.out.print("Main Stat: ");
            mySands.mainStat();

            System.out.print("Level: ");
            mySands.level();

            System.out.print("Sub Stat: ");
            mySands.subStat1();

            ++i;
        }
    }
}
