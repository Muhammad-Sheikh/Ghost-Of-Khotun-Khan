
import java.util.Arrays;
import java.util.Scanner;

public class worldGeneration {
    //20 Encounters per Playthrough

    //2 mini bosses

    //1 final boss

    //10 combat encounters

    //3 shop interactions

    //
    private int RandomizervalidPool[];
    private String name;
    private int currentRand, worldInput, price;

    private String attributeTable[];
    private double attackPower, defensePower, hpBoost, energyBoost, specialPower;

    private String test;
    Scanner worldScanner = new Scanner(System.in);

    private Player worldPlayer;
    private Enemy worldEnemy;
    private GhostofKhotunKhan2 worldMain;

    public worldGeneration(Player player, Enemy enemy, GhostofKhotunKhan2 main) {
        worldMain = main;
        worldEnemy = enemy;
        worldPlayer = player;
    }


    public void setValidItemPool() {
        //Function used to reset the valid pool that the question randomizer uses
        RandomizervalidPool = new int[]{100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
    }


    boolean validInput = false;
    private String item1[], item2[], item3[], item4[], item5[];


    public String[] getItem1() {
        return item1;
    }

    public String[] getItem2() {
        return item2;
    }

    public String[] getItem3() {
        return item3;
    }

    public String[] getItem4() {
        return item4;
    }

    public String[] getItem5() {
        return item5;
    }


    public void setItemtoBlankSlot(String[] currentAttributes) {
        if (item1 == null) {
            item1 = currentAttributes.clone();
        } else if (item2 == null) {
            item2 = currentAttributes.clone();
        } else if (item3 == null) {
            item3 = currentAttributes.clone();
        } else if (item4 == null) {
            item4 = currentAttributes.clone();
        } else if (item5 == null) {
            item5 = currentAttributes.clone();
        } else {
            System.out.println("Flag");
        }
    }


    public void generateAttributeTable() {
        //Items

        worldGeneration sword1 = new worldGeneration(worldPlayer, worldEnemy, worldMain);
        worldGeneration sword2 = new worldGeneration(worldPlayer, worldEnemy, worldMain);
        worldGeneration sword3 = new worldGeneration(worldPlayer, worldEnemy, worldMain);
        worldGeneration sword4 = new worldGeneration(worldPlayer, worldEnemy, worldMain);
        worldGeneration sword5 = new worldGeneration(worldPlayer, worldEnemy, worldMain);

        worldGeneration sheild1 = new worldGeneration(worldPlayer, worldEnemy, worldMain);
        worldGeneration sheild2 = new worldGeneration(worldPlayer, worldEnemy, worldMain);

        worldGeneration armour1 = new worldGeneration(worldPlayer, worldEnemy, worldMain);
        worldGeneration armour2 = new worldGeneration(worldPlayer, worldEnemy, worldMain);

        worldGeneration charm1 = new worldGeneration(worldPlayer, worldEnemy, worldMain);
        worldGeneration charm2 = new worldGeneration(worldPlayer, worldEnemy, worldMain);
        worldGeneration charm3 = new worldGeneration(worldPlayer, worldEnemy, worldMain);
        worldGeneration charm4 = new worldGeneration(worldPlayer, worldEnemy, worldMain);
        worldGeneration charm5 = new worldGeneration(worldPlayer, worldEnemy, worldMain);
        worldGeneration charm6 = new worldGeneration(worldPlayer, worldEnemy, worldMain);

        boolean newItem = false;

        while (!newItem) {
            currentRand = (int) (Math.random() * 4 + 0);


            if (RandomizervalidPool[currentRand] == 100) {
                //Sets its own index value to 0, so it cannot be used again
                RandomizervalidPool[currentRand] = 0;
                sword1.name = "Bruh City";
                sword1.attackPower = 20;
                sword1.defensePower = 20;
                sword1.hpBoost = 30;
                sword1.energyBoost = 35;
                sword1.specialPower = 45;
                sword1.price = 250;
                attributeTable = (new String[]{sword1.name, (String.valueOf(sword1.attackPower)), (String.valueOf(sword1.defensePower)), (String.valueOf(sword1.hpBoost)), (String.valueOf(sword1.energyBoost)), (String.valueOf(sword1.specialPower)), (String.valueOf(sword1.price))});
                newItem = true;
            }

            //If the random index number in RandomizervalidPool lines up with this, it sets the current question, options and answer.
            if (RandomizervalidPool[currentRand] == 200) {
                RandomizervalidPool[currentRand] = 0;
                sword2.name = "Not Bruh City";
                sword2.attackPower = 20;
                sword2.defensePower = 20;
                sword2.hpBoost = 30;
                sword2.energyBoost = 35;
                sword2.specialPower = 45;
                sword2.price = 200;
                attributeTable = (new String[]{sword2.name, (String.valueOf(sword2.attackPower)), (String.valueOf(sword2.defensePower)), (String.valueOf(sword2.hpBoost)), (String.valueOf(sword2.energyBoost)), (String.valueOf(sword2.specialPower)), (String.valueOf(sword2.price))});
                newItem = true;
            }

            if (RandomizervalidPool[currentRand] == 300) {
                RandomizervalidPool[currentRand] = 0;
                sword3.name = "Not Bruh City MK2";
                sword3.attackPower = 20;
                sword3.defensePower = 20;
                sword3.hpBoost = 30;
                sword3.energyBoost = 35;
                sword3.specialPower = 45;
                sword3.price = 100;
                attributeTable = (new String[]{sword3.name, (String.valueOf(sword3.attackPower)), (String.valueOf(sword3.defensePower)), (String.valueOf(sword3.hpBoost)), (String.valueOf(sword3.energyBoost)), (String.valueOf(sword3.specialPower)), (String.valueOf(sword3.price))});
                newItem = true;
            }

            if (RandomizervalidPool[currentRand] == 400) {
                RandomizervalidPool[currentRand] = 0;
                sword3.name = "Not Bruh City MK3";
                sword3.attackPower = 20;
                sword3.defensePower = 20;
                sword3.hpBoost = 30;
                sword3.energyBoost = 35;
                sword3.specialPower = 45;
                sword3.price = 20;
                attributeTable = (new String[]{sword3.name, (String.valueOf(sword3.attackPower)), (String.valueOf(sword3.defensePower)), (String.valueOf(sword3.hpBoost)), (String.valueOf(sword3.energyBoost)), (String.valueOf(sword3.specialPower)), (String.valueOf(sword3.price))});
                newItem = true;
            }
        }
    }

    public void newShop() {
        worldPlayer.setCoins(99999);
        System.out.println("Welcome to my shop");
        System.out.println("Here is what I am selling today!");

        System.out.println();
        generateAttributeTable();
        String localAttributeTable1[] = attributeTable.clone();
        System.out.println("Item #1");
        System.out.println("Name: " + localAttributeTable1[0]);
        System.out.println("Price: " + localAttributeTable1[6]);
        System.out.println();

        System.out.println();
        generateAttributeTable();
        String localAttributeTable2[] = attributeTable.clone();
        System.out.println("Item #2");
        System.out.println("Name: " + localAttributeTable2[0]);
        System.out.println("Price: " + localAttributeTable2[6]);
        System.out.println();

        System.out.println();
        generateAttributeTable();
        String localAttributeTable3[] = attributeTable.clone();
        System.out.println("Item #3");
        System.out.println("Name: " + localAttributeTable3[0]);
        System.out.println("Price: " + localAttributeTable3[6]);
        System.out.println();

        System.out.println("You currently have " + worldPlayer.getCoins() + " coins!");

        System.out.println("Enter the item number you want to buy!");
        worldInput = worldScanner.nextInt();
        while (!validInput) {
            //Checks if the user has entered any option from 0-3, the only valid options
            if (worldInput == 1 || worldInput == 2 || worldInput == 3) {
                //sets a valid input to be true
                validInput = true;
            } else {
                //otherwise keeps asking the user to enter a valid input until it matches the if statement above.
                System.out.println("Please enter a valid input:");
                worldInput = worldScanner.nextInt();
            }
        }

        if (worldInput == 1) {
            if (worldPlayer.getCoins() >= Integer.parseInt(localAttributeTable1[6])) {
                System.out.println("Thank you for buying the " + localAttributeTable1[0] + " !");
                worldPlayer.setCoins(worldPlayer.getCoins() - Integer.parseInt(localAttributeTable1[6]));
                setItemtoBlankSlot(localAttributeTable1);
            } else {
                System.out.println("Who do you think you are, trying to scam me like that! Get out of my face!");
            }
        }

        if (worldInput == 2) {
            if (worldPlayer.getCoins() >= Integer.parseInt(localAttributeTable2[6])) {
                System.out.println("Thank you for buying the " + localAttributeTable2[0] + " !");
                worldPlayer.setCoins(worldPlayer.getCoins() - Integer.parseInt(localAttributeTable2[6]));
                setItemtoBlankSlot(localAttributeTable2);
            } else {
                System.out.println("Who do you think you are, trying to scam me like that! Get out of my face!");
            }
        }

        if (worldInput == 3) {
            if (worldPlayer.getCoins() >= (Integer.parseInt(localAttributeTable3[6]))) {
                System.out.println("Thank you for buying the " + localAttributeTable3[0] + " !");
                worldPlayer.setCoins(worldPlayer.getCoins() - Integer.parseInt(localAttributeTable3[6]));
                setItemtoBlankSlot(localAttributeTable3);
            } else {
                System.out.println("Who do you think you are, trying to scam me like that! Get out of my face!");
            }
        }

    }

    public String[] getAttributeTable() {
        String[] newTable = attributeTable.clone();
        return newTable;
    }

    public void encounterMessage(int encounterType) {

        int localEncounterNumber = 0;

        if (encounterType == 1) {
            //Generic Encounter

            localEncounterNumber = (int) (Math.random() * (10 - 1) + 1);
        } else if (encounterType == 2) {
            //Mini Boss Encounter
            localEncounterNumber = (int) (Math.random() * (12 - 11) + 11);
        } else if (encounterType == 3) {
            //Final Boss Encounter
            localEncounterNumber = 13;
        } else if (encounterType == 4) {
            //Shop Encounter
            newShop();
        }

        if (localEncounterNumber == 1) {

            System.out.println("[A group of bandits attack Jin from the bushes. IT'S AN AMBUSH!]");
            System.out.println("We have been oppressed by your family for too long! We don't care if we die, as long as you die too Khotun! Exclaimed one bandit");
            System.out.println("You fool it is what you did that has made you oppressed. Said Khotun");
            System.out.println("Fine, you leave me no choice. Get ready to die, bandits. Said Khotun");
            System.out.println("May you all rest in peace… It's sad that your actions led to this. I hope the next generation doesn't make the same mistakes.\n");
            worldEnemy.setEnemyHp(worldPlayer.getHp() * 3);
            worldEnemy.setBaseDamage((worldPlayer.getAtk() + 25) / 2);
        }

        if (localEncounterNumber == 2) {
            System.out.println("[The soldiers confronting Khotun were laughing.]");
            System.out.println("Ai! Apparently we left one alive, let's finish him off. ahaha");
            System.out.println("[Khotun attacks them immediately!]");
            System.out.println("[They are in a intense face-off!]\n");
            worldEnemy.setEnemyHp(worldPlayer.getHp() * 3);
            worldEnemy.setBaseDamage((worldPlayer.getAtk() + 25) / 2);
        }
        if (localEncounterNumber == 3) {
            System.out.println("\"AY! Ghost scum. Get ready to die! I'll kill you exactly how I've killed the countless other people like you who have tried revolting against the Japanese chain of command!\" " + "Shouted the Japanese general.");
            System.out.println("FOR MY PEOPLE! Shouted Khotun.\n");
            worldEnemy.setEnemyHp(worldPlayer.getHp() * 3);
            worldEnemy.setBaseDamage((worldPlayer.getAtk() + 25) / 2);
        }
        if (localEncounterNumber == 4) {
            System.out.println("[Khotun gets spots a cannibal. It ravages the meat of a dead farmer.]");
            System.out.println("[Khotun calls them a Shyuri, a type of forsaken man that wanders the lands ]");
            System.out.println("I'll FACE you Shyuri, you will not ravage us any further!");
            worldEnemy.setEnemyHp(worldPlayer.getHp() * 3);
            worldEnemy.setBaseDamage((worldPlayer.getAtk() + 25) / 2);
        }
        if (localEncounterNumber == 5) {
            System.out.println("[Khotun gets in an encounter with a wild bear during scouting the area!]");
            System.out.println("[This bear is diffrent though, they seem to have glowing orange eyes.]");
            System.out.println("FACE ME, AND LET ME SHOW YOU NATURES WRATH yells the bear.");
            System.out.println("Khotun readies his weapon.");
            worldEnemy.setEnemyHp(worldPlayer.getHp() * 3);
            worldEnemy.setBaseDamage((worldPlayer.getAtk() + 25) / 2);
        }
        if (localEncounterNumber == 6) {
            System.out.println("The ground rumbles around you. This is it. The final challenge between you and Victory.");
            System.out.println("Let the battle begin.\n");
            worldEnemy.setEnemyHp(worldPlayer.getHp() * 5);
            worldEnemy.setBaseDamage((worldPlayer.getAtk() + 50));
        }
        if (localEncounterNumber == 7) {
            System.out.println("Add Guy");
            System.out.println("Let the battle begin.\n");
            worldEnemy.setEnemyHp(worldPlayer.getHp() * 5);
            worldEnemy.setBaseDamage((worldPlayer.getAtk() + 50));
        }
        if (localEncounterNumber == 8) {
            System.out.println("Add Guy");
            System.out.println("Let the battle begin.\n");
            worldEnemy.setEnemyHp(worldPlayer.getHp() * 5);
            worldEnemy.setBaseDamage((worldPlayer.getAtk() + 50));
        }
        if (localEncounterNumber == 9) {
            System.out.println("Add Guy");
            System.out.println("Let the battle begin.\n");
            worldEnemy.setEnemyHp(worldPlayer.getHp() * 5);
            worldEnemy.setBaseDamage((worldPlayer.getAtk() + 50));
        }
        if (localEncounterNumber == 10) {
            System.out.println("Add Guy");
            System.out.println("Let the battle begin.\n");
            worldEnemy.setEnemyHp(worldPlayer.getHp() * 5);
            worldEnemy.setBaseDamage((worldPlayer.getAtk() + 50));
        }

        //Miniboss
        if (localEncounterNumber == 11) {
            System.out.println("Add Guy");
            System.out.println("Let the battle begin.\n");
            worldEnemy.setEnemyHp(worldPlayer.getHp() * 5);
            worldEnemy.setBaseDamage((worldPlayer.getAtk() + 50));
        }

        //Miniboss
        if (localEncounterNumber == 12) {
            System.out.println("Add Guy");
            System.out.println("Let the battle begin.\n");
            worldEnemy.setEnemyHp(worldPlayer.getHp() * 5);
            worldEnemy.setBaseDamage((worldPlayer.getAtk() + 50));
        }

        if (localEncounterNumber == 13) {
            System.out.println("Add Guy");
            System.out.println("Let the battle begin.\n");
            worldEnemy.setEnemyHp(worldPlayer.getHp() * 5);
            worldEnemy.setBaseDamage((worldPlayer.getAtk() + 50));
        }

    }


}


