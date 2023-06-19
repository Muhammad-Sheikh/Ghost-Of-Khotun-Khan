import java.util.*;

public class Combat {

    //Main variable declaration as private to use encapsulation
    private Player combatPlayer;
    private Enemy combatEnemy;
    private GhostofKhotunKhan2 combatMain;
    private worldGeneration combatWorld;
    private int setAtk, setDef;
    private double enemyHp, enemyDef, enemyChoice, playerAtk, playerHp, playerDef, itemSpecBonus;
    //Local String arrays that hold all the item stats
    String[] item1, item2, item3, item4, item5;
    private String playerInput;
    boolean noFlee = true;
    boolean specialBonusAdded = false;
    boolean bonusAdded = false;
    /*
    Sets the valid items gotten from world generations
    Makes sures that item strings are not set as null, but as none with
    stats of "0" to ensure the math doesn't crash.
     */
    public void itemSet() {
        String[] blankItem = {"None", "0", "0", "0", "0", "0", "0"};

        if (combatWorld.getItem1() == null) {
            item1 = blankItem.clone();
        } else {
            item1 = combatWorld.getItem1();
        }

        if (combatWorld.getItem2() == null) {
            item2 = blankItem.clone();
        } else {
            item2 = combatWorld.getItem2();
        }

        if (combatWorld.getItem3() == null) {
            item3 = blankItem.clone();
        } else {
            item3 = combatWorld.getItem3();
        }

        if (combatWorld.getItem4() == null) {
            item4 = blankItem.clone();
        } else {
            item4 = combatWorld.getItem4();
        }

        if (combatWorld.getItem5() == null) {
            item5 = blankItem.clone();
        } else {
            item5 = combatWorld.getItem5();
        }
    }

    //Object initialization, uses the same instance for the objects as main with a diffrent name.
    public Combat(Enemy enemy, Player player, GhostofKhotunKhan2 main, worldGeneration world) {
        combatPlayer = player;
        combatEnemy = enemy;
        combatMain = main;
        combatWorld = world;
    }

    //Outputs the players status in combat encounters.
    public void playerStatus() {
        //Sets the valid items
        itemSet();
        //Calculates the item bonuses given by the items to Health, Attack, Defense and Energy

        if (!bonusAdded)
        {
            int maxNRG = (int) (combatPlayer.getPlayerMaxNRG() + Double.parseDouble(item1[4]) + Double.parseDouble(item2[4]) + Double.parseDouble(item3[4]) + Double.parseDouble(item4[4]) + Double.parseDouble(item5[4]));
            //Sets the base health + bonus item health to current max hp
            int maxHp = (int) (combatPlayer.getPlayerMaxHp() + Double.parseDouble(item1[3]) + Double.parseDouble(item2[3]) + Double.parseDouble(item3[3]) + Double.parseDouble(item4[3]) + Double.parseDouble(item5[3]));
            setDef = (int) (combatPlayer.getDef() + Double.parseDouble(item1[2]) + Double.parseDouble(item2[2]) + Double.parseDouble(item3[2]) + Double.parseDouble(item2[2]) + Double.parseDouble(item5[2]));
            setAtk = (int) (combatPlayer.getAtk() + Double.parseDouble(item1[1]) + Double.parseDouble(item2[1]) + Double.parseDouble(item3[1]) + Double.parseDouble(item1[1]) + Double.parseDouble(item5[1]));
            combatPlayer.setPlayerMaxHp(maxHp);

            //Sets the base energy + bonus item energy to current max energy
            combatPlayer.setPlayerMaxNRG(maxNRG);

            combatPlayer.setAtk(setAtk);
            combatPlayer.setDef(setDef);
            bonusAdded = true;
        }


        //Sets the base energy + bonus item energy to current max energy


        System.out.println("Current HP: " + combatPlayer.getHp());
        System.out.println("Current Energy: " + combatPlayer.getEnergy());
        //Prints out the current attack and defense with item bonuses
        System.out.println("Current Attack: " + setAtk);
        System.out.println("Current Defense: " + setDef);
        System.out.println("Current Level: " + combatPlayer.getLevel());
        System.out.println("Current Coin Count: " + combatPlayer.getCoins());
        System.out.println("What will you do? Enter A to Attack, D to Defend, S to see special moves, and I to check your items!!\n");
        System.out.println("You can also use X to flee!");
        //Ensures a valid input is entered during input, making sure it's a String and lower cased for easier processing
        Scanner CombatInput = new Scanner(System.in);
        playerInput = CombatInput.nextLine();
        playerInput = playerInput.toLowerCase();

        String possibleInput[] = {"a", "d", "s", "x", "i"};

        boolean validInput = false;
        while (!validInput) {
            //Checks if the user has entered any option from 0-3, the only valid options
            for (int i = 0; i <= 4; i++) {
                if (playerInput.equals(possibleInput[i])) {
                    validInput = true;
                }
            }
            //otherwise keeps asking the user to enter a valid input until it matches the if statement above.
            if (!validInput) {
                System.out.println("Please enter a valid input:");
                playerInput = CombatInput.nextLine();
                playerInput = playerInput.toLowerCase();
            }
        }
    }

    public void Combat() {
        //Sets the items again, to ensure null calculation are done
        itemSet();
        //Sets no flee to true, meaning the player hasn't fled this encounter yet.
        noFlee = true;
        //Calculates the attack bonus given by all the items
        double itemAtkBonus = Double.parseDouble(item1[1]) + Double.parseDouble(item2[1]) + Double.parseDouble(item3[1]) + Double.parseDouble(item4[1]) + Double.parseDouble(item5[1]);

        //Only does a round of combat (You attack, then the enemy atatcks) when the player and enemy are alive, AND the player hasn't fled.
        while (combatPlayer.isAlive() && combatEnemy.isAlive() && noFlee) {
            //Prints the players status
            playerStatus();
            //If the player attacks, does damage to enemy
            if (Objects.equals(playerInput, "a")) {

                playerAtk = combatPlayer.getAtk() + 100 + itemAtkBonus;
                enemyHp = combatEnemy.getEnemyHp() - playerAtk;
                combatEnemy.setEnemyHp(enemyHp);
                System.out.println("You did: " + playerAtk + " Damage!");
                //Ensures the players input is reset to null after its used
                playerInput = null;
            }
            //Calls to defend method if the player chooses to defend
            if (Objects.equals(playerInput, "d")) {
                Defend();
            }
            //Calls to special moves method if the player chooses to use a special move
            if (Objects.equals(playerInput, "s")) {
                specialMoves();
            }
            //Calls the flee method if the player chooses to flee
            if (Objects.equals(playerInput, "x")) {
                Flee();
            }
            //Calls the inventory method if the player chooses to check their inventory
            if (Objects.equals(playerInput, "i")) {
                Inventory();
            }
            enemyAttack();
        }
        //Checks if the enemy and player are still alive after a round of combat.
        resultantCheck();
    }

    public void enemyAttack()
    {
        //Decides if the enemy will attack, or if you get a bonus attack in
        enemyChoice = (int) (Math.random() * (2));
        if (enemyChoice == 1 && playerInput == null) {
            playerHp = combatPlayer.getHp() - combatEnemy.getbaseDamage();
            combatPlayer.setHp(playerHp);
            System.out.println("The enemy strikes you! They deal " + combatEnemy.getbaseDamage() + " Damage!\n");
        } else if (enemyChoice == 0 && playerInput == null) {
            enemyDef = combatEnemy.getEnemyDef() / 100;
            playerAtk = combatPlayer.getAtk() + 50;
            enemyHp = (combatEnemy.getEnemyHp() - (playerAtk - (playerAtk * enemyDef)));
            combatEnemy.setEnemyHp(enemyHp);
            System.out.println("You see an opening in the enemies defense! You strike and do " + playerAtk + " Damage!\n");
        }
    }

    public void specialMoves() {
        //Sets the items to be used, and then calculates the bonus from special attacks given by items
        itemSet();
        if(!specialBonusAdded)
        {
            itemSpecBonus = Double.parseDouble(item1[5]) + Double.parseDouble(item2[5]) + Double.parseDouble(item3[5]) + Double.parseDouble(item4[5]) + Double.parseDouble(item5[5]);
            specialBonusAdded = true;
        }

        //Calls the milestone method in player, which checks which special moves you have unlocked according to your level
        combatPlayer.milestone();
        //According to the milestone, prints out the special moves you have available.
        if (combatPlayer.getMilestone() >= 1) {
            System.out.println("SPECIAL MOVE #1: Heavenly STRIKE");
            System.out.println("Summon the Ancestors power, and hone your sword into a weapon of perfection.");
            System.out.println("Energy Cost: 50\n");
        }
        if (combatPlayer.getMilestone() >= 2) {
            System.out.println("SPECIAL MOVE #2: Forsaken World, Chasing Slice");
            System.out.println("As you remind yourself of the loss around you, you forsake the world. You feel a surge of power, and in a flash you deliver a strike that shakes the ground.");
            System.out.println("Energy Cost: 100\n");
        }
        if (combatPlayer.getMilestone() >= 3) {
            System.out.println("SPECIAL MOVE #3: Shroud of the Ghost");
            System.out.println("As you summon the power within, a cloak of shadows emerges. You are un-seen, un-heard, and strike the enemies very soul. ");
            System.out.println("Energy Cost: 150\n");
        }
        if (combatPlayer.getMilestone() >= 4) {
            System.out.println("SPECIAL MOVE #4: Khotun Blast");
            System.out.println("Charge your energy into a concentrated blast for your enemies! ");
            System.out.println("Energy Cost: 200\n");
        }
        if (combatPlayer.getMilestone() >= 5) {
            System.out.println("SPECIAL MOVE #5: Superior Lifeform");
            System.out.println("Khotun sacrificed half his lifeforce to the gods above. In exchange, his life and energy are tripled for now... ");
            System.out.println("Energy Cost: 250\n");
        }
        if (combatPlayer.getMilestone() >= 6) {
            System.out.println("SPECIAL MOVE #6: Khotuns Killer Gambit");
            System.out.println("Khotuns rams his sword through his heart, and draw a sword coated in his own blood. ");
            System.out.println("With one strike, he will either end his enemy or himself. ");
            System.out.println("Energy Cost: 300\n");

        }

        String specialInput = "-1";
        //If you have 1 or more special move allows you to select it or return you to the main menu.
        if (combatPlayer.getMilestone() >= 1) {
            System.out.println("Please select the move you would like to use, or press 0 to return to the main menu!");

            Scanner sc = new Scanner(System.in);
            specialInput = sc.nextLine();

            String possibleInput[] = {"1", "2", "3", "4", "5", "6", "0"};

            boolean validInput = false;
            while (!validInput) {
                //Checks if the user has entered any option from 0-3, the only valid options
                for (int i = 0; i <= 6; i++) {
                    if (Objects.equals(specialInput, possibleInput[i])) {
                        validInput = true;
                    }
                }

                if (!validInput) {
                    System.out.println("Please enter a valid input:");
                    specialInput = sc.nextLine();
                }
            }
        }

        if (specialInput.equals("-1")) {
            Combat();
        }

        //Checks if you Have the move, have entered that this is the move you want and makes sure you have enough energy to do this move.
        if (combatPlayer.getMilestone() >= 1 && specialInput.equals("1") && (combatPlayer.getEnergy() >= 50)) {
            playerAtk = combatPlayer.getAtk() + 125 + itemSpecBonus;
            enemyHp = combatEnemy.getEnemyHp() - playerAtk;
            combatEnemy.setEnemyHp(enemyHp);
            combatPlayer.setEnergy(combatPlayer.getEnergy() - 50);
            System.out.println("Damage Dealt: \n" + playerAtk);
            //If not, tells you do not have enough energy to do this move
        }else if(specialInput.equals("1"))
        {
            System.out.println("It seems you do not have enough energy for this move!");
        }

        //Checks if you Have the move, have entered that this is the move you want and makes sure you have enough energy to do this move.
        if (combatPlayer.getMilestone() >= 2 && specialInput.equals("2") && (combatPlayer.getEnergy() >= 100)) {
            playerAtk = combatPlayer.getAtk() + 150 + itemSpecBonus;
            enemyHp = combatEnemy.getEnemyHp() - playerAtk;
            combatEnemy.setEnemyHp(enemyHp);
            combatPlayer.setEnergy(combatPlayer.getEnergy() - 100);
            System.out.println("Damage Dealt: " + playerAtk);
            playerInput = null;
        }else if(specialInput.equals("2"))
        {
            System.out.println("It seems you do not have enough energy for this move!");
        }
        //Checks if you Have the move, have entered that this is the move you want and makes sure you have enough energy to do this move.
        if (combatPlayer.getMilestone() >= 3 && specialInput.equals("3") && (combatPlayer.getEnergy() >= 150)) {
            playerAtk = combatPlayer.getAtk() + 175 + itemSpecBonus;
            enemyHp = combatEnemy.getEnemyHp() - playerAtk;
            combatEnemy.setEnemyHp(enemyHp);
            combatPlayer.setEnergy(combatPlayer.getEnergy() - 150);
            System.out.println("Damage Dealt: " + playerAtk);
            playerInput = null;
        }else if(specialInput.equals("3"))
        {
            System.out.println("It seems you do not have enough energy for this move!");
        }
        //Checks if you Have the move, have entered that this is the move you want and makes sure you have enough energy to do this move.
        if (combatPlayer.getMilestone() >= 4 && specialInput.equals("4") && (combatPlayer.getEnergy() >= 200)) {
            playerAtk = combatPlayer.getAtk() + 200 + itemSpecBonus;
            enemyHp = combatEnemy.getEnemyHp() - playerAtk;
            combatEnemy.setEnemyHp(enemyHp);
            combatPlayer.setEnergy(combatPlayer.getEnergy() - 200);
            System.out.println("Damage Dealt: " + playerAtk);
            playerInput = null;
        }else if(specialInput.equals("4"))
        {
            System.out.println("It seems you do not have enough energy for this move!");
        }
        //Checks if you Have the move, have entered that this is the move you want and makes sure you have enough energy to do this move.
        if (combatPlayer.getMilestone() >= 5 && specialInput.equals("5") && (combatPlayer.getEnergy() >= 250)) {
            combatPlayer.setHp(combatPlayer.getHp() * 2);
            combatPlayer.setEnergy(combatPlayer.getEnergy() * 2);
            combatPlayer.setEnergy(combatPlayer.getEnergy() - 250);
            combatPlayer.setPlayerMaxHp(combatPlayer.getPlayerMaxHp() - 25);
            System.out.println("You feel empowered...");
            playerInput = null;
        }else if(specialInput.equals("5"))
        {
            System.out.println("It seems you do not have enough energy for this move!");
        }
        //Checks if you Have the move, have entered that this is the move you want and makes sure you have enough energy to do this move.
        if (combatPlayer.getMilestone() >= 6 && specialInput.equals("6") && (combatPlayer.getEnergy() >= 300)) {
            int choice = (int) (Math.random() * 2 + 0);
            if (choice == 1) {
                combatEnemy.setEnemyHp(-1);
                System.out.println("You got lucky.");
            } else {
                combatPlayer.setHp((combatPlayer.getHp() / 2));
                System.out.println("The Gambit has failed...");
            }
            combatPlayer.setEnergy(combatPlayer.getEnergy() - 300);
            playerInput = null;
        } else if(specialInput.equals("6"))
        {
            System.out.println("It seems you do not have enough energy for this move!");
        }




    }

    //Checks if both enemy and player survived the encounter, calls the survival encounter in player
    public void resultantCheck() {
        if (combatPlayer.isAlive()) {
            if (noFlee) {
                combatPlayer.encounterSurvived(true);
                bonusAdded = false;
            }
        } else if (!combatPlayer.isAlive()) {
            combatPlayer.gameOver();
        }
    }

    //Checks the users inventory
    public void Inventory() {
        //Sets the items which will be printed
        itemSet();

        //Prints out each items attributes which are stored in an array
        System.out.println();
        System.out.println("Item #1");
        System.out.println("Name: " + item1[0]);
        System.out.println("Attack Power Boost: " + item1[1]);
        System.out.println("Defense Power Boost: " + item1[2]);
        System.out.println("Health Boost: " + item1[3]);
        System.out.println("Energy Boost: " + item1[4]);
        System.out.println("Special Power Boost: " + item1[5]);
        System.out.println();


        System.out.println();
        System.out.println("Item #2");
        System.out.println("Name: " + item2[0]);
        System.out.println("Attack Power Boost: " + item2[1]);
        System.out.println("Defense Power Boost: " + item2[2]);
        System.out.println("Health Boost: " + item2[3]);
        System.out.println("Energy Boost: " + item2[4]);
        System.out.println("Special Power Boost: " + item2[5]);
        System.out.println();

        System.out.println();
        System.out.println("Item #3");
        System.out.println("Name: " + item3[0]);
        System.out.println("Attack Power Boost: " + item3[1]);
        System.out.println("Defense Power Boost: " + item3[2]);
        System.out.println("Health Boost: " + item3[3]);
        System.out.println("Energy Boost: " + item3[4]);
        System.out.println("Special Power Boost: " + item3[5]);
        System.out.println();

        System.out.println();
        System.out.println("Item #4");
        System.out.println("Name: " + item4[0]);
        System.out.println("Attack Power Boost: " + item4[1]);
        System.out.println("Defense Power Boost: " + item4[2]);
        System.out.println("Health Boost: " + item4[3]);
        System.out.println("Energy Boost: " + item4[4]);
        System.out.println("Special Power Boost: " + item4[5]);
        System.out.println();

        System.out.println();
        System.out.println("Item #5");
        System.out.println("Name: " + item5[0]);
        System.out.println("Attack Power Boost: " + item5[1]);
        System.out.println("Defense Power Boost: " + item5[2]);
        System.out.println("Health Boost: " + item5[3]);
        System.out.println("Energy Boost: " + item5[4]);
        System.out.println("Special Power Boost: " + item5[5]);
        System.out.println();

        //Asks the user to press any key to continue and then clears the text
        combatMain.contunieChar();
        combatMain.textClear();
    }


    public void Defend() {
        itemSet();
        //Calculates the defense bonus from items
        double itemDefBonus = Double.parseDouble(item1[2]) + Double.parseDouble(item2[2]) + Double.parseDouble(item3[2]) + Double.parseDouble(item4[2]) + Double.parseDouble(item5[2]);

        //Calculates and prints the amount of damage you defended.
        playerDef = ((combatPlayer.getDef() + itemDefBonus) / 100);
        Double defendedAmount = (combatEnemy.getbaseDamage() - (combatEnemy.getbaseDamage() * playerDef));
        playerHp = (combatPlayer.getHp() - (combatEnemy.getbaseDamage() - (combatEnemy.getbaseDamage() * playerDef)));
        combatPlayer.setHp(playerHp);
        System.out.println("You Took: " + defendedAmount + " damage from your defense stance!");
    }

    public void Flee() {
        System.out.println("Khotun attempts to flee from the enemy!");

        //Does a coinflip to see if you take damage or not
        int coinFlip = (int) (Math.random() * (2));

        if (coinFlip == 1) {
            System.out.println("Khotun Successfully exits the battle, but fails to recover any HP or Energy!");
        } else {
            //If failed, your hp gets halved.
            System.out.println("While attempting to run, the enemy gets one last vital hit on Khotuns back!");
            System.out.println("His HP is now " + (combatPlayer.getHp() / 2));
            combatPlayer.setHp(combatPlayer.getHp() / 2);
        }
        //Sets no flee to false so the enemy doesn't attack you after you have fled
        noFlee = false;
        //Asks the user to press any key to continue and then clears the text
        combatMain.contunieChar();
        combatMain.textClear();
    }
}