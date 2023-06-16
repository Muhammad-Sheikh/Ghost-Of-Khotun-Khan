import java.security.PublicKey;
import java.util.Objects;
import java.util.Scanner;

public class Combat {

    private Player combatPlayer;
    private Enemy combatEnemy;
    private GhostofKhotunKhan2 combatMain;
    private worldGeneration combatWorld;

    private double enemyHp, enemyDef, enemyChoice, playerAtk, playerHp, playerDef;

    private String playerInput;

    boolean noFlee = true;
    boolean noGambit = true;

    public Combat(Enemy enemy, Player player, GhostofKhotunKhan2 main, worldGeneration world) {
        combatPlayer = player;
        combatEnemy = enemy;
        combatMain = main;
        combatWorld = world;
    }

    public void playerStatus() {
        String[] item1 = combatWorld.getItem1();

        System.out.println("Current HP: " + (combatPlayer.getHp() + Double.parseDouble(item1[3])));
        int currentHp = (int) (combatPlayer.getHp() + Double.parseDouble(item1[3]));
        combatPlayer.setPlayerMaxHp(currentHp);
        System.out.println("Current Energy: " + (combatPlayer.getEnergy() + Double.parseDouble(item1[4])));
        int currentNRG = (int) (combatPlayer.getEnergy() + Double.parseDouble(item1[4]));
        combatPlayer.setPlayerMaxNRG(currentNRG);
        System.out.println("Current Attack: " + combatPlayer.getAtk());
        System.out.println("Current Defense: " + combatPlayer.getDef());
        System.out.println("Current Level: " + combatPlayer.getLevel());
        System.out.println("Current Coin Count: " + combatPlayer.getCoins());
        System.out.println("What will you do? Enter A to Attack, D to Defend, S to see special moves!\n");
        System.out.println("You can also use X to flee!");
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
        String[] item1 = combatWorld.getItem1();
        noFlee = true;
        while (combatPlayer.isAlive() && combatEnemy.isAlive() && noFlee) {
            playerStatus();
            if (Objects.equals(playerInput, "a")) {

                playerAtk = combatPlayer.getAtk() + 100 + Double.parseDouble(item1[1]);
                enemyHp = combatEnemy.getEnemyHp() - playerAtk;
                combatEnemy.setEnemyHp(enemyHp);
                System.out.println("You did: " + playerAtk + " Damage!");
                playerInput = null;
            }
            if (Objects.equals(playerInput, "d")) {
                Defend();
            }
            if (Objects.equals(playerInput, "s")) {
                specialMoves();
            }
            if (Objects.equals(playerInput, "x")) {
                Flee();
            }
            if (Objects.equals(playerInput, "i")) {
                Inventory();
            }
            if(noGambit)
            {
                enemyAttack();
            }
        }
        resultantCheck();
    }

    public void enemyAttack() {
        enemyChoice = (int) (Math.random() * (2 - 1) + 1);
        if (enemyChoice == 1 && playerInput == null) {
            playerHp = combatPlayer.getHp() - combatEnemy.getbaseDamage();
            combatPlayer.setHp(playerHp);
            System.out.println("The enemy strikes you! They deal " + combatEnemy.getbaseDamage() + " Damage!\n");
        } else if (enemyChoice == 2 && playerInput == null) {
            enemyDef = combatEnemy.getEnemyDef() / 100;
            playerAtk = combatPlayer.getAtk() + 50;
            enemyHp = (combatEnemy.getEnemyHp() - (playerAtk - (playerAtk * enemyDef)));
            combatEnemy.setEnemyHp(enemyHp);
            System.out.println("You see an opening in the enemies defense! You strike and do " + playerAtk + " Damage!\n");
        }
    }

    public void specialMoves() {
        String[] item1 = combatWorld.getItem1();
        combatPlayer.milestone();
        if (combatPlayer.getMilestone() >= 1) {
            System.out.println("SPECIAL MOVE #1: Heavenly STRIKE");
            System.out.println("Summon the Ancestors power, and hone your sword into a weapon of perfection.\n");
        }
        if (combatPlayer.getMilestone() >= 2) {
            System.out.println("SPECIAL MOVE #2: Forsaken World, Chasing Slice");
            System.out.println("As you remind yourself of the loss around you, you forsake the world. You feel a surge of power, and in a flash you deliver a strike that shakes the ground.\n");
        }
        if (combatPlayer.getMilestone() >= 3) {
            System.out.println("SPECIAL MOVE #3: Shroud of the Ghost");
            System.out.println("As you summon the power within, a cloak of shadows emerges. You are un-seen, un-heard, and strike the enemies very soul.\n ");
        }
        if (combatPlayer.getMilestone() >= 4) {
            System.out.println("SPECIAL MOVE #4: Khotun Blast");
            System.out.println("Charge your energy into a concentrated blast for your enemies!\n ");
        }
        if (combatPlayer.getMilestone() >= 5) {
            System.out.println("SPECIAL MOVE #5: Superior Lifeform");
            System.out.println("Khotun sacrificed half his lifeforce to the gods above. In exchange, his life and energy are tripled for now...\n ");
        }
        if (combatPlayer.getMilestone() >= 6) {
            System.out.println("SPECIAL MOVE #6: Khotuns Killer Gambit");
            System.out.println("Khotuns rams his sword through his heart, and draw a sword coated in his own blood.\n ");
            System.out.println("With one strike, he will either end his enemy or himself.\n ");

        } else if (combatPlayer.getMilestone() < 1) {
            System.out.println("Khotun Tried to summon a power of some kind, but it seems to fail due to a lack of power!");
            System.out.println("He hears a voice, saying that he may find some new moves at level 5, 10 & 15 \n");
            playerInput = null;
        }
        int specialInput = -1;
        if(combatPlayer.getMilestone() >= 1) {
            System.out.println("Please select the move you would like to use, or press 0 to return to the main menu!");

            Scanner sc = new Scanner(System.in);
            specialInput = sc.nextInt();

            int possibleInput[] = {1, 2, 3, 4, 5, 6, 0};

            boolean validInput = false;
            while (!validInput) {
                //Checks if the user has entered any option from 0-3, the only valid options
                for (int i = 0; i <= 6; i++) {
                    if (specialInput == possibleInput[i]) {
                        validInput = true;
                    }
                }

                if(!validInput) {
                    System.out.println("Please enter a valid input:");
                    specialInput = sc.nextInt();
                }
            }
        }

        if(specialInput == -1)
        {
           Combat();
        }

        if (combatPlayer.getMilestone() >= 1 && specialInput == 1 && (combatPlayer.getEnergy() >= 50)) {
            playerAtk = combatPlayer.getAtk() + 125 + Double.parseDouble(item1[5]);
            enemyHp = combatEnemy.getEnemyHp() - playerAtk;
            combatEnemy.setEnemyHp(enemyHp);
            combatPlayer.setEnergy(combatPlayer.getEnergy() - 50);
            System.out.println("Damage Dealt: \n" + playerAtk);
        }

        if (combatPlayer.getMilestone() >= 2 && specialInput == 2 && (combatPlayer.getEnergy() >= 100)) {
            playerAtk = combatPlayer.getAtk() + 150 + Double.parseDouble(item1[5]);
            enemyHp = combatEnemy.getEnemyHp() - playerAtk;
            combatEnemy.setEnemyHp(enemyHp);
            combatPlayer.setEnergy(combatPlayer.getEnergy() - 100);
            System.out.println("Damage Dealt: " + playerAtk);
            playerInput = null;
        }

        if (combatPlayer.getMilestone() >= 3 && specialInput == 3 && (combatPlayer.getEnergy() >= 150)) {
            playerAtk = combatPlayer.getAtk() + Double.parseDouble(item1[5]);
            enemyHp = combatEnemy.getEnemyHp() - playerAtk;
            combatEnemy.setEnemyHp(enemyHp);
            combatPlayer.setEnergy(combatPlayer.getEnergy() - 150);
            System.out.println("Damage Dealt: " + playerAtk);
            playerInput = null;
        }

        if (combatPlayer.getMilestone() >= 4 && specialInput == 4 && (combatPlayer.getEnergy() >= 200)) {
            playerAtk = combatPlayer.getAtk() + Double.parseDouble(item1[5]);
            enemyHp = combatEnemy.getEnemyHp() - playerAtk;
            combatEnemy.setEnemyHp(enemyHp);
            combatPlayer.setEnergy(combatPlayer.getEnergy() - 200);
            System.out.println("Damage Dealt: " + playerAtk);
            playerInput = null;
        }

        if (combatPlayer.getMilestone() >= 5 && specialInput == 5 && (combatPlayer.getEnergy() >= 250)) {
            combatPlayer.setHp(combatPlayer.getHp() * 2);
            combatPlayer.setEnergy(combatPlayer.getEnergy() * 2);
            combatPlayer.setEnergy(combatPlayer.getEnergy() - 250);
            combatPlayer.setPlayerMaxHp(combatPlayer.getPlayerMaxHp() - 25);
            System.out.println("You feel empowered...");
            playerInput = null;
        }

        if (combatPlayer.getMilestone() >= 6 && specialInput == 6 && (combatPlayer.getEnergy() >= 300)) {
            int choice = (int) (Math.random() * 2 + 0);
            if (choice == 1) {
                combatEnemy.setEnemyHp(-1);
                System.out.println("You got lucky.");
                noGambit = false;
            } else {
                combatPlayer.setHp((combatPlayer.getHp() / 2));
                System.out.println("The Gambit has failed...");
            }
            combatPlayer.setEnergy(combatPlayer.getEnergy() - 300);
            playerInput = null;
        }


    }

    public void resultantCheck() {
        if (combatPlayer.isAlive()) {
            if (noFlee) {
                combatPlayer.encounterSurvived(true);
            }
        } else if (!combatPlayer.isAlive()) {
            combatPlayer.gameOver();
        }
    }

    public void Inventory() {
        //TODO fix null printing for no items
        System.out.println("Here is currently the items you have!");
        String[]None = {"None", "None", "None", "None", "None", "None", "None"};


        String[] item1 = combatWorld.getItem1().clone();
        /*
        String[] item2 = combatWorld.getItem1().clone();
        String[] item3 = combatWorld.getItem3().clone();
        String[] item4 = combatWorld.getItem4().clone();
        String[] item5 = combatWorld.getItem5().clone();
         */

        System.out.println();
        System.out.println("Item #1");
        System.out.println("Name: " + item1[0]);
        System.out.println("Attack Power Boost: " + item1[1]);
        System.out.println("Defense Power Boost: " + item1[2]);
        System.out.println("Health Boost: " + item1[3]);
        System.out.println("Energy Boost: " + item1[4]);
        System.out.println("Special Power Boost: " + item1[5]);
        System.out.println();

        /*
        System.out.println();
        System.out.println("Item #2");
        System.out.println("Name" + item2[0]);
        System.out.println("Attack Power Boost" + item2[1]);
        System.out.println("Defense Power Boost" + item2[2]);
        System.out.println("Health Boost" + item2[3]);
        System.out.println("Energy Boost" + item2[4]);
        System.out.println("Special Power Boost" + item2[5]);
        System.out.println();

        System.out.println();
        System.out.println("Item #1");
        System.out.println("Name" + item3[0]);
        System.out.println("Attack Power Boost" + item3[1]);
        System.out.println("Defense Power Boost" + item3[2]);
        System.out.println("Health Boost" + item3[3]);
        System.out.println("Energy Boost" + item3[4]);
        System.out.println("Special Power Boost" + item3[5]);
        System.out.println();

        System.out.println();
        System.out.println("Item #1");
        System.out.println("Name" + item4[0]);
        System.out.println("Attack Power Boost" + item4[1]);
        System.out.println("Defense Power Boost" + item4[2]);
        System.out.println("Health Boost" + item4[3]);
        System.out.println("Energy Boost" + item4[4]);
        System.out.println("Special Power Boost" + item4[5]);
        System.out.println();

        System.out.println();
        System.out.println("Item #1");
        System.out.println("Name" + item5[0]);
        System.out.println("Attack Power Boost" + item5[1]);
        System.out.println("Defense Power Boost" + item5[2]);
        System.out.println("Health Boost" + item5[3]);
        System.out.println("Energy Boost" + item5[4]);
        System.out.println("Special Power Boost" + item5[5]);
        System.out.println();
         */
    }

    /*
     public void Heal() {
        System.out.println("Khotun takes a swig of his healing waters from his gourd!");
        double healedAmount = combatPlayer.getHp() + (combatPlayer.getPlayerMaxHp() / 6);
        if (healedAmount >= combatPlayer.getPlayerMaxHp()) {
            combatPlayer.setHp(combatPlayer.getPlayerMaxHp());
        } else {
            combatPlayer.setHp(healedAmount);
        }
        System.out.println("He now has " + combatPlayer.getHp() + " health!");
    }
     */


    public void Defend() {
        String[] item1 = combatWorld.getItem1();

        playerDef = ((combatPlayer.getDef() + Double.parseDouble(item1[2])) / 100);
        playerHp = (combatPlayer.getHp() - (combatEnemy.getbaseDamage() - (combatEnemy.getbaseDamage() * playerDef)));
        combatPlayer.setHp(playerHp);
        System.out.println("You Took: " + combatEnemy.getbaseDamage() + " damage from your defense stance!");
    }

    public void Flee() {
        System.out.println("Khotun attempts to flee from the enemy!");

        int coinFlip = (int) (Math.random() * (2 - 1) + 1);

        if (coinFlip == 1) {
            System.out.println("Khotun Successfully exits the battle, but fails to recover any HP or Energy!");
        } else {
            System.out.println("While attempting to run, the enemy gets one last vital hit on Khotuns back!");
            System.out.println("His HP is now " + (combatPlayer.getHp() / 2));
            combatPlayer.setHp(combatPlayer.getHp() / 2);
        }
        noFlee = false;
    }
}