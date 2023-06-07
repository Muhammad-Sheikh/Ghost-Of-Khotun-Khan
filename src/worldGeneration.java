import java.util.Arrays;

public class worldGeneration
{
    //20 Encounters per Playthrough

    //3 mini bosses

    //1 final boss

    //10 combat encounters

    //2 shop interactions

    //
    private int RandomizervalidPool[];
    private String name;
    private int currentRand;

    private String attributeTable[];
    private double attackPower, defensePower, hpBoost, energyBoost, specialPower, price;

    public void setValidPool()
    {
        //Function used to reset the valid pool that the question randomizer uses
        RandomizervalidPool = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }
    public void generateAttributeTable()
    {

        //Items
        worldGeneration sword1 = new worldGeneration();
        worldGeneration sword2 = new worldGeneration();
        worldGeneration sword3 = new worldGeneration();
        worldGeneration sword4 = new worldGeneration();
        worldGeneration sword5 = new worldGeneration();

        worldGeneration sheild1 = new worldGeneration();
        worldGeneration sheild2 = new worldGeneration();

        worldGeneration armour1 = new worldGeneration();
        worldGeneration armour2 = new worldGeneration();

        worldGeneration charm1 = new worldGeneration();
        worldGeneration charm2 = new worldGeneration();
        worldGeneration charm3 = new worldGeneration();
        worldGeneration charm4 = new worldGeneration();
        worldGeneration charm5 = new worldGeneration();
        worldGeneration charm6 = new worldGeneration();

        boolean newItem = false;

        while(!newItem)
        {
            currentRand = (int) (Math.random() * 4 + 0);
            if (RandomizervalidPool[currentRand] == 1) {
                //Sets its own index value to 0, so it cannot be used again
                RandomizervalidPool[currentRand] = 0;
                sword1.name ="Bruh City";
                sword1.attackPower = 20;
                sword1.defensePower = 20;
                sword1.hpBoost = 30;
                sword1.energyBoost = 35;
                sword1.specialPower = 45;
                sword1.price = 250;
                attributeTable = (new String[]{sword1.name, (String.valueOf(sword1.attackPower)), (String.valueOf(sword1.defensePower)), (String.valueOf(sword1.hpBoost)), (String.valueOf(sword1.energyBoost)), (String.valueOf(sword1.specialPower)), (String.valueOf(sword1.price))});
                newItem = true;
            }

            if (RandomizervalidPool[currentRand] == 2) {
                RandomizervalidPool[currentRand] = 0;
                sword2.name ="Not Bruh City";
                sword2.attackPower = 20;
                sword2.defensePower = 20;
                sword2.hpBoost = 30;
                sword2.energyBoost = 35;
                sword2.specialPower = 45;
                sword2.price = 200;
                attributeTable = (new String[]{sword2.name, (String.valueOf(sword2.attackPower)), (String.valueOf(sword2.defensePower)), (String.valueOf(sword2.hpBoost)), (String.valueOf(sword2.energyBoost)), (String.valueOf(sword2.specialPower)), (String.valueOf(sword2.price))});
                newItem = true;
            }

            if (RandomizervalidPool[currentRand] == 3) {
                RandomizervalidPool[currentRand] = 0;
                sword3.name ="Not Bruh City MK2";
                sword3.attackPower = 20;
                sword3.defensePower = 20;
                sword3.hpBoost = 30;
                sword3.energyBoost = 35;
                sword3.specialPower = 45;
                sword3.price = 100;
                attributeTable = (new String[]{sword3.name, (String.valueOf(sword3.attackPower)), (String.valueOf(sword3.defensePower)), (String.valueOf(sword3.hpBoost)), (String.valueOf(sword3.energyBoost)), (String.valueOf(sword3.specialPower)), (String.valueOf(sword3.price))});
                newItem = true;
            }
        }



    }

    public void newShop()
    {
        System.out.println("Welcome to my shop");
        System.out.println("Here is what I am selling today!");
        generateAttributeTable();
        String localAttributeTable[] = attributeTable.clone();
        //for(int i = 0; i <= 2;i++)

            generateAttributeTable();
            System.out.println("Name: " + localAttributeTable[0]);
            System.out.println("Price: " + localAttributeTable[6]);

        generateAttributeTable();
        System.out.println("Name: " + localAttributeTable[0]);
        System.out.println("Price: " + localAttributeTable[6]);

        generateAttributeTable();
        System.out.println("Name: " + localAttributeTable[0]);
        System.out.println("Price: " + localAttributeTable[6]);

    }
    public String[] getAttributeTable() {
        String[] newTable = attributeTable.clone();
        return newTable;
    }



}
