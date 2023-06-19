import java.util.*;

class Player {
    //Variable Declaration
    public String levelInput;
    private int playerMaxHp, playerLevel, playerDef, playerAtk, score, milestoneProgress, playerEnergy, playerMaxEnergy;
    private double playerHp;
    int coins;

    //Variable Initialization
    public Player() {
        playerMaxHp = 100;
        playerMaxEnergy = 50;
        playerHp = 100;
        playerEnergy = 50;
        playerLevel = 0;
        playerDef = 1;
        playerAtk = 1;
        score = 100;
    }

    //If the player survived a combat encounter, call this with true or false
    //Levels the player, resets their HP and adds attack and defense power
    //also calls milestone to check if they have unlocked a new move on the level up
    public void encounterSurvived(boolean didSurvive) {
        int gainedMoney;
        if (didSurvive) {
            System.out.println("You live to see another day.");
            System.out.println("Congrats, you leveled up!");
            gainedMoney = (int) (Math.random() * (500 - 10 + 1)) + 10 ;
            coins = coins + gainedMoney;
            System.out.println("You also gain " + gainedMoney + " coins from the enemy!");
            playerLevel = playerLevel + 1;
            System.out.println("Select what you want to level up!");
            System.out.println();
            System.out.println("#1 Health, get more Maximum Health");
            System.out.println();
            System.out.println("#2 Defense, get more defense to block more enemy damage");
            System.out.println();
            System.out.println("#3 Attack, get more attack power!");
            System.out.println();
            System.out.println("#4 Energy get more Maximum Energy");

            Scanner sc = new Scanner(System.in);
            levelInput = sc.nextLine();

            String possibleInput[] = {"1", "2", "3", "4"};

            boolean validInput = false;
            while (!validInput) {
                //Checks if the user has entered any option from 0-3, the only valid options
                for (int i = 0; i <= 3; i++) {
                    if (Objects.equals(levelInput, possibleInput[i])) {
                        validInput = true;
                    }
                }
                if(!validInput) {
                    System.out.println("Please enter a valid input:");
                    levelInput = sc.nextLine();
                }
            }
            
            if(levelInput.equals("1"))
            {
                playerMaxHp = (15 * playerLevel) + 100;
            }
            if(levelInput.equals("2"))
            {
                playerDef = 3 * playerLevel;
            }
            if(levelInput.equals("3"))
            {
                playerAtk = 2 * playerLevel + 5;
            }
            if(levelInput.equals("4"))
            {
                playerMaxEnergy = (15 * playerLevel) + 100;
            }

            playerHp = playerMaxHp;
            playerEnergy = playerMaxEnergy;

            milestone();
        }
    }

    //returns true or false based on it the player is alive or not
    public boolean isAlive() {
        return playerHp > 0;
    }

    //When called, allows to set the players HP
    public void setHp(double Hp) {
        playerHp = Hp;
    }
    //Sets the players coins when called with an integer
    public void setCoins(int money) {
        coins = money;
    }
    //Returns the players coins when called
    public int getCoins() {return coins;}
    //Returns the players max health when called
    public int getPlayerMaxHp() {
        return playerMaxHp;
    }
    //Returns the players max energy when called
    public int getPlayerMaxNRG() {
        return playerMaxEnergy;
    }
    //Returns the players energy when called
    public int getEnergy() {
        return playerEnergy;
    }
    //Sets the players energy with an int when called
    public void setEnergy(int NRG) {
        playerEnergy = NRG;
    }

    //returns the players HP when called
    public double getHp() {return playerHp;}
    //Sets the players max hp when called with an int
    public void setPlayerMaxHp(int maxhp)
    {
        playerMaxHp = maxhp;
    }
    //Sets the players max energy when called with an int
    public  void setPlayerMaxNRG(int maxnrg) {playerMaxEnergy = maxnrg;}

    //gets the players level when called
    public int getLevel() {
        return playerLevel;
    }

    //gets the players defense when called
    public int getDef() {
        return playerDef;
    }

    public void setDef(int d){playerDef = d;}
    public void setPlayerLevel(int l){playerLevel = l;}
    public void setAtk(int a){playerAtk = a;}
    //gets the players attack when called
    public int getAtk() {
        return playerAtk;
    }

    //returns what milestone the player is on when called
    //Milestones are either 1,2 or 3 and is dictated based on
    //the level of the player.
    public int getMilestone() {
        return milestoneProgress;
    }

    //Game over for the player, when they either die or mess up
    //exits the game and prints their score pre death
    public void gameOver() {
        if (!isAlive()) {
            score = score * playerLevel + playerAtk;
            System.out.println("GAME OVER!");
            System.out.println("With the death of Khotun, The Omen slaughtered the rest of Mongolia. If only, his blade was sharper.");
            System.out.println("The game will exit in 15 seconds!");
            //main.tempStop(15);
            System.exit(0);
        }
    }


    //Checks the player level with set levels, and updates the milestone
    //variable as suited. This is then used for various different things
    //such as special moves, story settings & score system
    public void milestone() {
        if (playerLevel == 1) {
            System.out.println("You've unlocked Heavenly JUSTICE!");
            System.out.println("Use this special move to channel the might of the gods in your blade!");
            milestoneProgress = 1;
        }
        if (playerLevel == 4) {
            System.out.println("You've unlocked Forsaken World, Chasing Slice!");
            System.out.println("Use the power of this cursed world to pierce the enemies very soul.");
            milestoneProgress = 2;

        }
        if (playerLevel == 6) {
            System.out.println("You've unlocked the Shroud of the Ghost!");
            System.out.println("Harness your power to shroud yourself in a thick cloak of shadows. Strike from the shadows while having the immunity of demi-gods!");
            milestoneProgress = 3;
        }

        if (playerLevel == 8) {
            System.out.println("You've unlocked Khotun Blast!");
            System.out.println("Channel your energy into a explosive blast to crush the enemies very skeleton.");
            milestoneProgress = 4;
        }

        if (playerLevel == 10) {
            System.out.println("You've unlocked Superior Lifeform!");
            System.out.println("Khotun gives the gods a part of his lifeforce, for a temporary boost in his current battle.");
            milestoneProgress = 5;
        }

        if (playerLevel == 12) {
            System.out.println("You've unlocked Khotuns Killer Gambit");
            System.out.println("Imbue your blade with your own blood, either ending your enemies life or your own. This is, Khotuns Killer Gambit.");
            milestoneProgress = 6;
        }

    }
}