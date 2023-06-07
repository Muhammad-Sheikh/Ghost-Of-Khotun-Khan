public class worldGeneration
{
    //20 Encounters per Playthrough

    //3 mini bosses

    //1 final boss

    //10 combat encounters

    //2 shop interactions

    //

   private String name;

   private String attributeTable[];
    private double attackPower, defensePower, hpBoost, energyBoost, specialPower, price;

    public void generateAttributeTable()
    {
        //Items
        worldGeneration sword1 = new worldGeneration();
        worldGeneration sword3 = new worldGeneration();
        worldGeneration sword4 = new worldGeneration();
        worldGeneration sword5 = new worldGeneration();
        worldGeneration sword6 = new worldGeneration();

        worldGeneration sheild1 = new worldGeneration();
        worldGeneration sheild2 = new worldGeneration();

        worldGeneration charm1 = new worldGeneration();
        worldGeneration charm2 = new worldGeneration();
        worldGeneration charm3 = new worldGeneration();
        worldGeneration charm4 = new worldGeneration();
        worldGeneration charm5 = new worldGeneration();


        sword1.name ="Bruh City";
        sword1.attackPower = 20;
        sword1.defensePower = 20;
        sword1.hpBoost = 30;
        sword1.energyBoost = 35;
        sword1.specialPower = 45;
        attributeTable = (new String[]{sword1.name, (String.valueOf(sword1.attackPower)), (String.valueOf(sword1.defensePower)), (String.valueOf(sword1.hpBoost)), (String.valueOf(sword1.energyBoost)), (String.valueOf(sword1.specialPower)), (String.valueOf(sword1.price))  });
    }

    public String[] getAttributeTable() {
        String[] newTable = attributeTable.clone();
        return newTable;
    }



}
