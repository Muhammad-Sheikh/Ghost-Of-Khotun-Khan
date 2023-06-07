class Player {
    //Variable Declaration
    private int playerMaxHp, playerLevel, playerDef, playerAtk, score, milestoneProgress, coins;
    private double playerHp;
    //Variable


    public Player() {
        playerMaxHp = 100;
        playerHp = 100;
        playerLevel = 0;
        playerDef = 5;
        playerAtk = 5;
        score = 100;
        coins = 0;
    }

    //If the player survived a combat encounter, call this with true or false
    //Levels the player, resets their HP and adds attack and defense power
    //also calls milestone to check if they have unlocked a new move on the level up
    public void encounterSurvived(boolean didSurvive) {
        if (didSurvive) {
            System.out.println("You live to see another day.");
            System.out.println("Congrats, you leveled up!");
            playerHp = playerMaxHp;
            playerLevel = playerLevel + 1;
            playerDef = 3 * playerLevel;
            playerAtk = 2 * playerLevel + 5;
            playerMaxHp = 15 * playerLevel + 100;
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

    public void setCoins(int money)
    {
        coins = money;
    }

    public int getCoins()
    {
        return coins;
    }

    //returns the players HP when called
    public double getHp() {
        return playerHp;
    }

    //gets the players level when called
    public int getLevel() {
        return playerLevel;
    }

    //Gets the players score when called
    public int getScore() {
        score = score * playerLevel + playerAtk;
        return score;
    }

    //gets the players defense when called
    public int getDef() {
        return playerDef;
    }

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
            System.out.println("With the death of Khotun, the bloodiest coup in mankind's history unfolds. If only, his blade was sharper.");
            System.out.println("Your Final Score was: " + score);
            System.out.println("The game will exit in 15 seconds!");
            //main.tempStop(15);
            System.exit(0);
        }
    }


    //Checks the player level with set levels, and updates the milestone
    //variable as suited. This is then used for various different things
    //such as special moves, story settings & score system
    public void milestone() {
        if (playerLevel == 5) {
            System.out.println("You've unlocked Heavenly JUSTICE!");
            System.out.println("Use this special move to channel the might of the gods in your blade!");
            milestoneProgress = 1;
        }
        if (playerLevel == 10) {
            System.out.println("You've unlocked Forsaken World, Chasing Slice!");
            System.out.println("Use the power of this cursed world to pierce the enemies very soul.");
            milestoneProgress = 2;

        }
        if (playerLevel == 15) {
            System.out.println("You've unlocked the Shroud of the Ghost!");
            System.out.println("Harness your power to shroud yourself in a thick cloak of shadows. Strike from the shadows while having the immunity of demi-gods!");
            milestoneProgress = 3;
        }

    }
}