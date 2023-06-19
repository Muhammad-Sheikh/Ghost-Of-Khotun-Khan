
import javax.swing.plaf.synth.SynthUI;
import java.util.Arrays;
import java.util.Scanner;

public class worldGeneration {
    //25 Encounters per Play-through

    //2 mini bosses

    //1 final boss

    //15 combat encounters

    //3 shop interactions

    //Variable Declaration
    private int RandomizervalidPool[];
    private String name, worldInput;
    private int currentRand, price;

    private String attributeTable[];
    private double attackPower, defensePower, hpBoost, energyBoost, specialPower;

    Scanner worldScanner = new Scanner(System.in);

    private Player worldPlayer;
    private Enemy worldEnemy;
    private GhostofKhotunKhan2 worldMain;

    boolean validInput = false;
    private String item1[], item2[], item3[], item4[], item5[];

    //Sets up local object of other classes to use with the same instance as main
    public worldGeneration(Player player, Enemy enemy, GhostofKhotunKhan2 main) {
        worldMain = main;
        worldEnemy = enemy;
        worldPlayer = player;
    }


    public void setValidItemPool() {
        //Function used to reset the valid pool that the item pools are generated with.
        RandomizervalidPool = new int[]{100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200, 1300};
    }



    //Getters for all the 5 items the player has at any time
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


    //Assigns a brandnew item to a blank slot the player
    public void setItemtoBlankSlot(String[] currentAttributes) {
        //If an item value is found to be null, clones the new items attribute to that slot
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
            System.out.println("Error! You have to many items!");
        }
    }

    //Generates an attribute table, which is an array full of all the attributes an item may have
    //Ensures attribute tables are not reused, so evrey item only appears once
    public void generateAttributeTable() {
        
        /*
        Every single type of item is given its own object, each with the attributes such 
        attack power, health bonus, energy bonus etc. This also allows for easy adding
        of new types of swords, shields, weapons etc.
         */
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
        
        //Assumes a new item isn't found when re-running the method
        boolean newItem = false;
        
        //While loop until a new item is found
        while (!newItem) {
            //Randomly makes an index number to determine what items are chosen
            currentRand = (int) (Math.random() * (12) + 0);

            if (RandomizervalidPool[currentRand] == 100) {
                //Sets the current index number to 0, so the if statement can never be true again.
                RandomizervalidPool[currentRand] = 0;
                //Sets all the stats for the weapon
                sword1.name = "The Mongols Fury";
                sword1.attackPower = 20;
                sword1.defensePower = 2;
                sword1.hpBoost = 15;
                sword1.energyBoost = 15;
                sword1.specialPower = 25;
                sword1.price = 750;
                //Makes the attribute table equal to the attribute table array, so it can be transported across classes more easily
                attributeTable = (new String[]{sword1.name, (String.valueOf(sword1.attackPower)), (String.valueOf(sword1.defensePower)), (String.valueOf(sword1.hpBoost)), (String.valueOf(sword1.energyBoost)), (String.valueOf(sword1.specialPower)), (String.valueOf(sword1.price))});
                newItem = true;
            }

            if (RandomizervalidPool[currentRand] == 200) {
                //Sets the current index number to 0, so the if statement can never be true again.
                RandomizervalidPool[currentRand] = 0;
                //Sets all the stats for the weapon
                sword2.name = "Cherry Blossom Blade";
                sword2.attackPower = 15;
                sword2.defensePower = 1;
                sword2.hpBoost = 10;
                sword2.energyBoost = 14;
                sword2.specialPower = 15;
                sword2.price = 200;
                //Makes the attribute table equal to the attribute table array, so it can be transported across classes more easily
                attributeTable = (new String[]{sword2.name, (String.valueOf(sword2.attackPower)), (String.valueOf(sword2.defensePower)), (String.valueOf(sword2.hpBoost)), (String.valueOf(sword2.energyBoost)), (String.valueOf(sword2.specialPower)), (String.valueOf(sword2.price))});
                newItem = true;
            }

            if (RandomizervalidPool[currentRand] == 300) {
                //Sets the current index number to 0, so the if statement can never be true again.
                RandomizervalidPool[currentRand] = 0;
                //Sets all the stats for the weapon
                sword3.name = "Blade of Thunder & Flame";
                sword3.attackPower = 20;
                sword3.defensePower = 2;
                sword3.hpBoost = 50;
                sword3.energyBoost = 50;
                sword3.specialPower = 20;
                sword3.price = 4000;
                //Makes the attribute table equal to the attribute table array, so it can be transported across classes more easily
                attributeTable = (new String[]{sword3.name, (String.valueOf(sword3.attackPower)), (String.valueOf(sword3.defensePower)), (String.valueOf(sword3.hpBoost)), (String.valueOf(sword3.energyBoost)), (String.valueOf(sword3.specialPower)), (String.valueOf(sword3.price))});
                newItem = true;
            }

            if (RandomizervalidPool[currentRand] == 400) {
                //Sets the current index number to 0, so the if statement can never be true again.
                RandomizervalidPool[currentRand] = 0;
                //Sets all the stats for the weapon
                sword4.name = "Blunt Traveller Sword";
                sword4.attackPower = 5;
                sword4.defensePower = 1;
                sword4.hpBoost = 5;
                sword4.energyBoost = 5;
                sword4.specialPower = 5;
                sword4.price = 50;
                //Makes the attribute table equal to the attribute table array, so it can be transported across classes more easily
                attributeTable = (new String[]{sword4.name, (String.valueOf(sword4.attackPower)), (String.valueOf(sword4.defensePower)), (String.valueOf(sword4.hpBoost)), (String.valueOf(sword4.energyBoost)), (String.valueOf(sword4.specialPower)), (String.valueOf(sword4.price))});
                newItem = true;
            }
            if (RandomizervalidPool[currentRand] == 500) {
                //Sets the current index number to 0, so the if statement can never be true again.
                RandomizervalidPool[currentRand] = 0;
                //Sets all the stats for the weapon
                sword5.name = "Elemental Excalibur";
                sword5.attackPower = 200;
                sword5.defensePower = 10;
                sword5.hpBoost = 75;
                sword5.energyBoost = 75;
                sword5.specialPower = 200;
                sword5.price = 7500;
                //Makes the attribute table equal to the attribute table array, so it can be transported across classes more easily
                attributeTable = (new String[]{sword5.name, (String.valueOf(sword5.attackPower)), (String.valueOf(sword5.defensePower)), (String.valueOf(sword5.hpBoost)), (String.valueOf(sword5.energyBoost)), (String.valueOf(sword5.specialPower)), (String.valueOf(sword5.price))});
                newItem = true;
            }
            if (RandomizervalidPool[currentRand] == 600) {
                //Sets the current index number to 0, so the if statement can never be true again.
                RandomizervalidPool[currentRand] = 0;
                //Sets all the stats for the weapon
                sheild1.name = "Turtle Shell Sheild";
                sheild1.attackPower = 0;
                sheild1.defensePower = 3;
                sheild1.hpBoost = 20;
                sheild1.energyBoost = 20;
                sheild1.specialPower = 0;
                sheild1.price = 1000;
                //Makes the attribute table equal to the attribute table array, so it can be transported across classes more easily
                attributeTable = (new String[]{sheild1.name, (String.valueOf(sheild1.attackPower)), (String.valueOf(sheild1.defensePower)), (String.valueOf(sheild1.hpBoost)), (String.valueOf(sheild1.energyBoost)), (String.valueOf(sheild1.specialPower)), (String.valueOf(sheild1.price))});
                newItem = true;
            }
            if (RandomizervalidPool[currentRand] == 700) {
                //Sets the current index number to 0, so the if statement can never be true again.
                RandomizervalidPool[currentRand] = 0;
                //Sets all the stats for the weapon
                sheild2.name = "Shield Of Shadows";
                sheild2.attackPower = 0;
                sheild2.defensePower = 7;
                sheild2.hpBoost = 50;
                sheild2.energyBoost = 50;
                sheild2.specialPower = 0;
                sheild2.price = 2225;
                //Makes the attribute table equal to the attribute table array, so it can be transported across classes more easily
                attributeTable = (new String[]{sheild2.name, (String.valueOf(sheild2.attackPower)), (String.valueOf(sheild2.defensePower)), (String.valueOf(sheild2.hpBoost)), (String.valueOf(sheild2.energyBoost)), (String.valueOf(sheild2.specialPower)), (String.valueOf(sheild2.price))});
                newItem = true;
            }
            if (RandomizervalidPool[currentRand] == 800) {
                //Sets the current index number to 0, so the if statement can never be true again.
                RandomizervalidPool[currentRand] = 0;
                //Sets all the stats for the weapon
                armour1.name = "Sword Saints Armour";
                armour1.attackPower = 0;
                armour1.defensePower = 5;
                armour1.hpBoost = 50;
                armour1.energyBoost = 0;
                armour1.specialPower = 0;
                armour1.price = 2000;
                //Makes the attribute table equal to the attribute table array, so it can be transported across classes more easily
                attributeTable = (new String[]{armour1.name, (String.valueOf(armour1.attackPower)), (String.valueOf(armour1.defensePower)), (String.valueOf(armour1.hpBoost)), (String.valueOf(armour1.energyBoost)), (String.valueOf(armour1.specialPower)), (String.valueOf(armour1.price))});
                newItem = true;
            }
            if (RandomizervalidPool[currentRand] == 900) {
                //Sets the current index number to 0, so the if statement can never be true again.
                RandomizervalidPool[currentRand] = 0;
                //Sets all the stats for the weapon
                armour2.name = "Heavenly Demon Armour";
                armour2.attackPower = 0;
                armour2.defensePower = 10;
                armour2.hpBoost = 60;
                armour2.energyBoost = 0;
                armour2.specialPower = 0;
                armour2.price = 3000;
                //Makes the attribute table equal to the attribute table array, so it can be transported across classes more easily
                attributeTable = (new String[]{armour2.name, (String.valueOf(armour2.attackPower)), (String.valueOf(armour2.defensePower)), (String.valueOf(armour2.hpBoost)), (String.valueOf(armour2.energyBoost)), (String.valueOf(armour2.specialPower)), (String.valueOf(armour2.price))});
                newItem = true;
            }

            if (RandomizervalidPool[currentRand] == 1000) {
                //Sets the current index number to 0, so the if statement can never be true again.
                RandomizervalidPool[currentRand] = 0;
                //Sets all the stats for the weapon
                charm1.name = "Dark Sun Ring";
                charm1.attackPower = 20;
                charm1.defensePower = 0;
                charm1.hpBoost = 0;
                charm1.energyBoost = 0;
                charm1.specialPower = 0;
                charm1.price = 1000;
                //Makes the attribute table equal to the attribute table array, so it can be transported across classes more easily
                attributeTable = (new String[]{charm1.name, (String.valueOf(charm1.attackPower)), (String.valueOf(charm1.defensePower)), (String.valueOf(charm1.hpBoost)), (String.valueOf(charm1.energyBoost)), (String.valueOf(charm1.specialPower)), (String.valueOf(charm1.price))});
                newItem = true;
            }
            if (RandomizervalidPool[currentRand] == 1100) {
                //Sets the current index number to 0, so the if statement can never be true again.
                RandomizervalidPool[currentRand] = 0;
                //Sets all the stats for the weapon
                charm2.name = "Rusty Medallion";
                charm2.attackPower = 5;
                charm2.defensePower = 1;
                charm2.hpBoost = 5;
                charm2.energyBoost = 5;
                charm2.specialPower = 5;
                charm2.price = 250;
                //Makes the attribute table equal to the attribute table array, so it can be transported across classes more easily
                attributeTable = (new String[]{charm2.name, (String.valueOf(charm2.attackPower)), (String.valueOf(charm2.defensePower)), (String.valueOf(charm2.hpBoost)), (String.valueOf(charm2.energyBoost)), (String.valueOf(charm2.specialPower)), (String.valueOf(charm2.price))});
                newItem = true;
            }

            if (RandomizervalidPool[currentRand] == 1200) {
                //Sets the current index number to 0, so the if statement can never be true again.
                RandomizervalidPool[currentRand] = 0;
                //Sets all the stats for the weapon
                charm3.name = "Beserker Gloves";
                charm3.attackPower = 50;
                charm3.defensePower = 0;
                charm3.hpBoost = 0;
                charm3.energyBoost = 0;
                charm3.specialPower = 60;
                charm3.price = 2000;
                //Makes the attribute table equal to the attribute table array, so it can be transported across classes more easily
                attributeTable = (new String[]{charm3.name, (String.valueOf(charm3.attackPower)), (String.valueOf(charm3.defensePower)), (String.valueOf(charm3.hpBoost)), (String.valueOf(charm3.energyBoost)), (String.valueOf(charm3.specialPower)), (String.valueOf(charm3.price))});
                newItem = true;
            }

            if (RandomizervalidPool[currentRand] == 1300) {
                //Sets the current index number to 0, so the if statement can never be true again.
                RandomizervalidPool[currentRand] = 0;
                //Sets all the stats for the weapon
                charm4.name = "Void Of Extinction";
                charm4.attackPower = 50;
                charm4.defensePower = 10;
                charm4.hpBoost = 30;
                charm4.energyBoost = 30;
                charm4.specialPower = 50;
                charm4.price = 8000;
                //Makes the attribute table equal to the attribute table array, so it can be transported across classes more easily
                attributeTable = (new String[]{charm4.name, (String.valueOf(charm4.attackPower)), (String.valueOf(charm4.defensePower)), (String.valueOf(charm4.hpBoost)), (String.valueOf(charm4.energyBoost)), (String.valueOf(charm4.specialPower)), (String.valueOf(charm4.price))});
                newItem = true;
            }

        }
    }

    //Generates a new shop with new items when called
    public void newShop() {
        System.out.println("Welcome to my shop");
        System.out.println("Here is what I am selling today!");

        //Makes local copies of attribute table as items, and then outputs a price & name
        System.out.println();
        generateAttributeTable();
        String localAttributeTable1[] = attributeTable.clone();
        System.out.println("Item #1");
        System.out.println("Name: " + localAttributeTable1[0]);
        System.out.println("Price: " + localAttributeTable1[6]);
        System.out.println();
        //Makes local copies of attribute table as items, and then outputs a price & name
        System.out.println();
        generateAttributeTable();
        String localAttributeTable2[] = attributeTable.clone();
        System.out.println("Item #2");
        System.out.println("Name: " + localAttributeTable2[0]);
        System.out.println("Price: " + localAttributeTable2[6]);
        System.out.println();
        //Makes local copies of attribute table as items, and then outputs a price & name
        System.out.println();
        generateAttributeTable();
        String localAttributeTable3[] = attributeTable.clone();
        System.out.println("Item #3");
        System.out.println("Name: " + localAttributeTable3[0]);
        System.out.println("Price: " + localAttributeTable3[6]);
        System.out.println();

        //Outputs the players coin amount
        System.out.println("You currently have " + worldPlayer.getCoins() + " coins!");

        System.out.println("Enter the item number you want to buy!");
        //Checks for valid player input with a string
        worldInput = worldScanner.nextLine();
        while (!validInput) {
            //Checks if the user has entered any option from 0-3, the only valid options
            if (worldInput.equals("1") || worldInput.equals("2") || worldInput.equals("3")) {
                //sets a valid input to be true
                validInput = true;
            } else {
                //otherwise keeps asking the user to enter a valid input until it matches the if statement above.
                System.out.println("Please enter a valid input:");
                worldInput = worldScanner.nextLine();
            }
        }

        if (worldInput.equals("1")) {
            //Checks if the player has enough money to buy the item
            if (worldPlayer.getCoins() >= Integer.parseInt(localAttributeTable1[6])) {
                System.out.println("Thank you for buying the " + localAttributeTable1[0] + " !");
                //Removes the price from players count
                worldPlayer.setCoins(worldPlayer.getCoins() - Integer.parseInt(localAttributeTable1[6]));
                //Adds the item to players inventory
                setItemtoBlankSlot(localAttributeTable1);
            } else {
                System.out.println("Who do you think you are, trying to scam me like that! Get out of my face!");
            }
        }

        if (worldInput.equals("2")) {
            if (worldPlayer.getCoins() >= Integer.parseInt(localAttributeTable2[6])) {
                System.out.println("Thank you for buying the " + localAttributeTable2[0] + " !");
                //Removes the price from players count
                worldPlayer.setCoins(worldPlayer.getCoins() - Integer.parseInt(localAttributeTable2[6]));
                //Adds the item to players inventory
                setItemtoBlankSlot(localAttributeTable2);
            } else {
                System.out.println("Who do you think you are, trying to scam me like that! Get out of my face!");
            }
        }

        if (worldInput.equals("3")) {
            if (worldPlayer.getCoins() >= (Integer.parseInt(localAttributeTable3[6]))) {
                System.out.println("Thank you for buying the " + localAttributeTable3[0] + " !");
                //Removes the price from players count
                worldPlayer.setCoins(worldPlayer.getCoins() - Integer.parseInt(localAttributeTable3[6]));
                //Adds the item to players inventory
                setItemtoBlankSlot(localAttributeTable3);
            } else {
                System.out.println("Who do you think you are, trying to scam me like that! Get out of my face!");
            }
        }

    }

    //Used to set enemy health and print encounter message. needs to be given a number from
    // 1 to 3 to dictate what kind of encounter it is
    public void CombatEncounterMessage(int encounterType) {

        int localEncounterNumber = 0;


        if (encounterType == 1) {
            //Generic Encounter
            //Makes the local encounter only 1-10 as it's a generic  encounter
            localEncounterNumber = (int) (Math.random() * (10 - 1) + 1);
        } else if (encounterType == 2) {
            //Mini Boss Encounter
            //Makes the local encounter only 11-12 as it's a mini boss  encounter
            localEncounterNumber = (int) (Math.random() * (13 - 11) + 11);

        } else if (encounterType == 3) {
            //Final Boss Encounter
            //Makes the local encounter only 13 so the boss encounter is done
            localEncounterNumber = 13;
        }

        if (localEncounterNumber == 1) {

            System.out.println("[A group of bandits attack Jin from the bushes. IT'S AN AMBUSH!]");
            System.out.println("We have been oppressed by your family for too long! We don't care if we die, as long as you die too Khotun! Exclaimed one bandit");
            System.out.println("You fool it is what you did that has made you oppressed. Said Khotun");
            System.out.println("Fine, you leave me no choice. Get ready to die, bandits. Said Khotun");
            System.out.println("May you all rest in peace… It's sad that your actions led to this. I hope the next generation doesn't make the same mistakes.\n");
            worldEnemy.setEnemyHp(worldPlayer.getHp() * 3);
            worldEnemy.setBaseDamage((worldPlayer.getAtk() + 35) / 2);
        }

        if (localEncounterNumber == 2) {
            System.out.println("[The soldiers confronting Khotun were laughing.]");
            System.out.println("Ai! Apparently we left one alive, let's finish him off. ahaha");
            System.out.println("[Khotun attacks them immediately!]");
            System.out.println("[They are in a intense face-off!]\n");
            worldEnemy.setEnemyHp(worldPlayer.getHp() * 3);
            worldEnemy.setBaseDamage((worldPlayer.getAtk() + 35) / 2);
        }
        if (localEncounterNumber == 3) {
            System.out.println("\"AY! Ghost scum. Get ready to die! I'll kill you exactly how I've killed the countless other people like you who have tried revolting against the Japanese chain of command!\" " + "Shouted the Japanese general.");
            System.out.println("FOR MY PEOPLE! Shouted Khotun.\n");
            worldEnemy.setEnemyHp(worldPlayer.getHp() * 3);
            worldEnemy.setBaseDamage((worldPlayer.getAtk() + 35) / 2);
        }
        if (localEncounterNumber == 4) {
            System.out.println("[Khotun gets spots a cannibal. It ravages the meat of a dead farmer.]");
            System.out.println("[Khotun calls them a Shyuri, a type of forsaken man that wanders the lands ]");
            System.out.println("I'll FACE you Shyuri, you will not ravage us any further!");
            worldEnemy.setEnemyHp(worldPlayer.getHp() * 3);
            worldEnemy.setBaseDamage((worldPlayer.getAtk() + 35) / 2);
        }
        if (localEncounterNumber == 5) {
            System.out.println("[Khotun gets in an encounter with a wild bear during scouting the area!]");
            System.out.println("[This bear is diffrent though, they seem to have glowing orange eyes.]");
            System.out.println("FACE ME, AND LET ME SHOW YOU NATURES WRATH yells the bear.");
            System.out.println("Khotun readies his weapon.");
            worldEnemy.setEnemyHp(worldPlayer.getHp() * 3);
            worldEnemy.setBaseDamage((worldPlayer.getAtk() + 35) / 2);
        }
        if (localEncounterNumber == 6) {
            System.out.println("A massive undead colossus, animated by dark magic, lumbers towards you, its towering presence casting a shadow of dread");
            System.out.println("Unleash your inner fury and topple this abomination with the strength of a true Mongolian warrior!\"");
            System.out.println("Let the battle begin.\n");
            worldEnemy.setEnemyHp(worldPlayer.getHp() * 3);
            worldEnemy.setBaseDamage((worldPlayer.getAtk() + 35) / 2);
        }
        if (localEncounterNumber == 7) {
            System.out.println("A swarm of undead souls, bound by dark enchantments, seeks to overwhelm you with their sheer numbers.");
            System.out.println("Channel Khotuns inner power to strike them down!");
            System.out.println("Let the battle begin.\n");
            worldEnemy.setEnemyHp(worldPlayer.getHp() * 3);
            worldEnemy.setBaseDamage((worldPlayer.getAtk() + 35) / 2);
        }
        if (localEncounterNumber == 8) {
            System.out.println("From the crypts rise ancient warriors, their decaying armor clinging to their bony frames.");
            System.out.println("As a true descendant of Mongol conquerors, you wield your sword with unyielding strength, cleaving through their spectral defenses!");
            System.out.println("Let the battle begin.\n");
            worldEnemy.setEnemyHp(worldPlayer.getHp() * 3);
            worldEnemy.setBaseDamage((worldPlayer.getAtk() + 35) / 2);
        }
        if (localEncounterNumber == 9) {
            System.out.println("A ghastly necromancer commands the undead forces, manipulating death itself.");
            System.out.println("Use your agility and speed to outmaneuver their dark sorcery and strike at the heart of their necromantic power!\"");
            System.out.println("Let the battle begin.\n");
            worldEnemy.setEnemyHp(worldPlayer.getHp() * 3);
            worldEnemy.setBaseDamage((worldPlayer.getAtk() + 35) / 2);
        }
        if (localEncounterNumber == 10) {
            System.out.println("The specters of fallen soldiers rise, their hollow eyes fixed upon you.");
            System.out.println("Channel the courage and resilience of the Mongolian warriors who came before you, and let their spirits guide your blade!");
            System.out.println("Let the battle begin.\n");
            worldEnemy.setEnemyHp(worldPlayer.getHp() * 3);
            worldEnemy.setBaseDamage((worldPlayer.getAtk() + 35) / 2);
        }

        //Miniboss
        if (localEncounterNumber == 11) {
                System.out.println("You see a massive man, wielding a posion laced broadsword approach you.");
                System.out.println("AYYY KHOTUN! LET ONE OF OMENS DRUNKARDS TAKE YOU ON!");
                System.out.println("Let the battle begin.\n");
                worldEnemy.setEnemyHp(worldPlayer.getHp() * 5);
                worldEnemy.setBaseDamage((worldPlayer.getAtk() + 45) / 2);
        }

        //Miniboss
        if (localEncounterNumber == 12) {
            System.out.println("You feel a presence watching you. Before you get a chance, you are hit by a kunai from the trees.");
            System.out.println("Slow as always Khotun. My next kunai will pierce your soul.");
            System.out.println("Let the battle begin.\n");
            worldEnemy.setEnemyHp(worldPlayer.getHp() * 5);
            worldEnemy.setBaseDamage((worldPlayer.getAtk() + 45) / 2);
        }

        if (localEncounterNumber == 13) {
            System.out.println("The ground shakes around you, as thousands of undead souls rise from around you.");
            System.out.println("The souls merge into a monstrosity with hundreds of eyes, mouths and elongated tentacles crushing the walls around you.");
            System.out.println("Khotun..., I am the one who has been ravaging these lands. Your Omen dictates you die here. ");
            System.out.println("Let the battle begin.\n");
            worldEnemy.setEnemyHp(worldPlayer.getHp() * 7);
            worldEnemy.setBaseDamage((worldPlayer.getAtk() + 60) / 2);
        }

    }

    //Used for overworld non encounter messages
    public void overworldEncounterMessage() {
        int localEncounterNumber;

        localEncounterNumber = (int) (Math.random() * (4 - 1) + 1);

        if (localEncounterNumber == 1) {
            System.out.println("You see a chest out the corner of your eye.");
            System.out.println("You go over to investigate.");
            int coinFlip;
            coinFlip = (int) (Math.random() * (2));
            if (coinFlip == 1) {
                System.out.println("You find the chest to be trapped! You take 50 damage!");
                worldPlayer.setHp(worldPlayer.getHp() - 50);
            } else if(coinFlip == 0) {
                System.out.println("You get luck and find a pouch of gold coins inside!");
                worldPlayer.setCoins(worldPlayer.getCoins() + 1000);
            }
        }

        if (localEncounterNumber == 2) {
            System.out.println("You see an old man on the side of the road.");
            System.out.println("You go to help him out, as it seems he may be passed out.");
            System.out.println("As you wake up the man, he thanks you for your aid. In exchange, he gives you the little gold he has left.");
            worldPlayer.setCoins(worldPlayer.getCoins() + 50);
        }

        if (localEncounterNumber == 3) {
            System.out.println("You see a shady looking merchant");
            System.out.println("As you approach he says: quote The Finest wares in Mongolia are sold here! For only 2500 coins our mystery item can be yours!");
            System.out.println("What do you do? (Enter Y to purchase, N to dismiss the man.)");

            String choice;
            Scanner choiceInput = new Scanner(System.in);
            choice = choiceInput.nextLine();
            choice = choice.toLowerCase();
            String possibleInput[] = {"y", "n"};

            boolean validInput = false;
            while (!validInput) {
                //Checks if the user has entered any option from 0-1, the only valid options
                for (int i = 0; i <= 1; i++) {
                    if (choice.equals(possibleInput[i])) {
                        validInput = true;
                    }
                }
                //otherwise keeps asking the user to enter a valid input until it matches the if statement above.
                if (!validInput) {
                    System.out.println("Please enter a valid input:");
                    choice = choiceInput.nextLine();
                    choice = choice.toLowerCase();
                }
            }

            if (choice.equals("y") && worldPlayer.getCoins() >= 2500) {
                int coinFlip = (int) (Math.random() * (2));

                if (coinFlip == 1) {
                    System.out.println("The man looks at you, smirks and proceeds to disappear with your money!");
                    worldPlayer.setCoins(worldPlayer.getCoins() - 2500);
                } else {
                    generateAttributeTable();
                    String localAttributeTable[] = attributeTable.clone();
                    worldPlayer.setCoins(worldPlayer.getCoins() - Integer.parseInt(localAttributeTable[6]));
                    setItemtoBlankSlot(localAttributeTable);
                    worldPlayer.setCoins(worldPlayer.getCoins() - 2500);
                    System.out.println("The man happily takes your money and hands you a " + localAttributeTable[0] + " !");
                }
            } else  if(choice.equals("n"))
            {
                System.out.println("The man scowls at you, before telling you to get lost.");
                System.out.println("You continue walking away, but cant stop wondering what the man was selling....");
            } else if (worldPlayer.getCoins() < 2500)
            {
                System.out.println("Who do you think you are trying to scam me like that!??");
            }

        }
        if(localEncounterNumber == 4)
        {
            System.out.println("As you continue on your path, you see an old women begging on the side of the road.");
            System.out.println("Do you approach to help her?");

            String choice;
            Scanner encounterInput = new Scanner(System.in);
            choice = encounterInput.nextLine();
            choice = choice.toLowerCase();
            boolean validInput = false;
            while (!validInput) {
                if (choice.equals("y") || choice.equals("n")) {
                    validInput = true;
                }
            }
            if (!validInput) {
                System.out.println("Please enter a valid input:");
                choice = encounterInput.nextLine();
                choice = choice.toLowerCase();
            }
            if (choice.equals("y"))
            {
                System.out.println("The women looks up at you, and then stabs your chest with a knife!");
                worldPlayer.setHp(worldPlayer.getHp() - 50);
                System.out.println("No one is getting my precious knife....");
                System.out.println("You quickly strike her down, but you feel the knife wound aching inside of you..");
            } else
            {
                System.out.println("As you walk by her, you hear a groan asking for help.");
                System.out.println("You keep walking, and eventually don't hear her breath anymore...");
            }

        }

    }
}


