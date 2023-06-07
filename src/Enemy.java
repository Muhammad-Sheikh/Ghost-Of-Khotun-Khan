class Enemy {
    //variable declaration
    private double enemyDef, enemyHp, encounterNumber, baseDamage;

    //Variable initialization
    public Enemy() {
        enemyDef = 0;
        enemyHp = 0;
        encounterNumber = 0;
    }

    //returns true or false depending on if the enemy is alive
    public boolean isAlive() {
        return enemyHp > 0;
    }

    public double getEncounterNumber(){return encounterNumber;}


    //returns the enemy's defense
    public double getEnemyDef() {
        return enemyDef;
    }

    //Sets the enemy's base damage when called with a double
    public void setBaseDamage(double Damage) {
        baseDamage = Damage;
    }

    //returns the enemy's base damage
    public double getbaseDamage() {
        return baseDamage;
    }

    //returns the enemy's HP when called
    public double getEnemyHp() {
        return enemyHp;
    }

    //sets the enemy's hp when called and given a double
    public void setEnemyHp(double enemyCurrentHp) {
        enemyHp = enemyCurrentHp;
    }

}