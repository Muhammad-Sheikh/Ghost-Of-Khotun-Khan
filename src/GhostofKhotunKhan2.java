/*
TODO
-Add rest of the attirbute tables
-Add generic encounters
-Add coloured text where needed
-make int input cleaners into string ones
 */

import java.util.*;
import java.util.Random;


//Text Based Adventure game set in Mongolia Post Japanese Invasion
//Ghost Of Khotun Khan Version: 1.2
//By: Muhammad Sheikh & Hassan Abassi
//Summative for ICS201-7C
//Date: 2022/06/15
class GhostofKhotunKhan2 {


    public static void main(String[] args) {


        //Object Declaration
        GhostofKhotunKhan2 main = new GhostofKhotunKhan2();

        Player player = new Player();
        Enemy enemy = new Enemy();
        worldGeneration world = new worldGeneration(player, enemy, main);
        Combat combat = new Combat(enemy, player, main, world);

        System.out.println("Welcome to the Ghost of Khotun Khan 2 Beta!");

        System.out.println("In this Beta, we will be highlighting the Shop, Combat and Encounter Systems.");

        System.out.println("Firstly, Lets get you set up with an item. I've given you 9999 Coins, so go crazy!");
        player.setCoins(9999);
        world.setValidItemPool();
        world.newShop();
        System.out.println();
        System.out.println();

        System.out.println("Now, Lets fight! Try out this combat encounter against a normal enemy!");
        world.encounterMessage(1);
        combat.Combat();

        System.out.println("Now, lets try for something a little harder! A mini boss is coming your way! I've powered you up with some new moves!");
        System.out.println();
        System.out.println();
        player.setEnergy(9999);
        player.setPlayerLevel(12);


        world.encounterMessage(2);
        combat.Combat();

        /*
        //Calls title screen
        main.titleScreen();
        while (main.gameStart) {
            //Calls The tutorial
            main.tutorial();
            main.contunieChar();
            main.textClear();

            //OUTPUT MAIN GAME STORY
            System.out.println("Khoton you are being invaded by a raging enemy, THE JAPANESE!\n");

            System.out.println("KHOTUN! We need you! The Conqueror Jin Sakai is attacking us!\n");

            System.out.println("Quick! Get your weapons and armor. Protect our great nation!\n");

            System.out.println("[Khotun walks out from his castle into the battlefield. He sees his brethren getting slain right in front of his eyes…]\n");

            System.out.println("Khotun rides on horseback to their leader, Jin, in front of the enemy's army..\n");

            System.out.println("[It's a fierce staredown between two alphas in the pack…]\n");

            System.out.println("Khotun lands the first blow, but it does’t strike through Jin’s fierce armor.");

            System.out.println("System.out.printlnJin strikes back and with the first strike he dismantles Khotun’s armor, leaving him exposed to fatal blows. With just one more strike from Jin, Khotun has fallen.\n ");

            System.out.println("[Jin thinking Khotun has been eliminated, throws Khotun in the river flowing inwards the island.]\n");

            System.out.println("[What he doesn’t realize is that Khotun is strong and there's a reason he ruled the land…]\n");

            //INPUT TO CLEAR PREVIOUS OUTPUT AND DISPLAY NEW OUTPUT
            main.contunieChar();
            main.textClear();

            //OUTPUT MAIN GAME STORY
            System.out.println("[Khotun wakes up in a nice and comfortable bed, with warm food to his side. He looks at his stomach and he sees bandages covering his torso. Someone has been taking care of me, he thought.]\n");

            System.out.println("Oh! Hey you’re awake! My lord, I’ve been taking care of you...\n");

            System.out.println("[A poor farmer had been taking care of Khotun]\n");

            System.out.println("T-thank you… How can I repay you? Said Khotun.\n");

            System.out.println("No-no my lord, It's my duty to help you out. After all, you are our ruler.\n");

            System.out.println("What's your name? Asked Khotun.\n");

            main.tempStop(15);

            System.out.println("Oh! It's Sika!\n");

            System.out.println("Thank you Sika, I will reward you once I reclaim my rightful land.\n");

            System.out.println("Thank you my lord. I won’t reject your generous gift. Said Sika.\n");

            System.out.println("Um, Lord you are the only warrior left in this island…\n");

            System.out.println("I see… I feared most of my warriors must have been slain, but all…\n");

            System.out.println("Sika, I need to rest for some more time to heal, than I can go ahead and get revenge on that bastard Jin for what he did..\n");

            System.out.println("I’ll take care of you until your fully healed my lord. Implied Sika.\n");

            System.out.println("Ok. Replied Khotun\n");

            System.out.println("[2 WEEKS PASS]\n");

            //INPUT TO CLEAR PREVIOUS OUTPUT AND DISPLAY NEW OUTPUT
            main.contunieChar();
            main.textClear();

            //OUTPUT MAIN GAME STORY
            System.out.println("Sika, I won’t forget what you have done for me. After I complete my mission, I promise I will reward you.\n");

            System.out.println("Thank you my lord. Just… be safe.\n");

            System.out.println("Farewell. I will go see a blacksmith I've been keeping in touch with to get better tools. Goodbye Sika.\n");

            System.out.println("[Khotun goes on horseback to a distant unattacked village. He is greeted by the blacksmith.\n");

            System.out.println("Khotun gives the blacksmith his sword and tells the blacksmith to sharpen it enough to where it could slice through Jin’s armor.]\n");


            main.tempStop(15);

            System.out.println("[The same day, Khotun travels to another village. This time, he gives his armor to an armorer to make it more formidable than Jin’s armor.]\n");

            System.out.println("[A few days later… Khotun gets his new gear. He feels the power in him. Khotun is SURE he can defeat Jin. He has too.]\n");

            System.out.println("[Khotuns journey begins…]\n");

            System.out.println("[Khotun begins to travel to a stronghold taken over by Japanese soldiers.]\n");

            //PROCESSING COMBAT
            main.Combat();
            //OUTPUT MAIN GAME STORY
            System.out.println("[Even with the bandits always attacking the citizens of Khotun's land, he always showed remorse to them after their soul left the battlefield...]\n");

            main.contunieChar();

            //PROCESSING COMBAT SECTION
            for (int i = 0; i < 4; i++) {
                main.Combat();
                main.textClear();
            }
            main.contunieChar();

            //OUTPUT MAIN GAME STORY
            System.out.println("[Khotun continues his journey.]\n");

            System.out.println("[The closer Khotun got to the stronghold, the more his thirst for blood grew. Revenge was the only thing he could think of… ]\n");

            System.out.println("[Khotun finally reaches the stronghold. He walks in the front gate, showing no fear]\n");
            main.contunieChar();

            //PROCESSING COMBAT SECTION
            for (int i = 0; i < 5; i++) {
                main.Combat();
                main.textClear();
            }
            //ASKS USER TO CONTINUE
            main.contunieChar();

            //OUTPUT MAIN GAME STORY
            System.out.println("Khotun frees the prisoners in the stronghold and liberates the stronghold.\n");

            System.out.println("[With the blood of his enemies, Khotun prints the following letters: G H O S T. His enemies will see it, and it will strike fear in them. Khotun wears a ghost mask, and begins his journey to get Jin’s head.]\n");

            main.tempStop(15);

            System.out.println("[ JIN SAKAI’S PERSPECTIVE ]\n");

            System.out.println("[Jin hears the news of the Ghosts activities…]\n");

            System.out.println("WHO HAS TAKEN DOWN MY STRONGHOLD! THEY WILL PAY! THEY DARE TRY TO TAKE MY LAND! I BEAT THEIR LEADER! I KILLED HIM! WHOEVER THIS GHOST IS, WILL PAY! Exclaimed Jin.\n");

            System.out.println("[ KHOTUNS PERSPECTIVE ]\n");

            System.out.println("[Khotun rides on horseback and continues his journey. The next place Khotun has gone to liberate is his hometown.]\n");

            System.out.println("[Khotun travels and find a search party hunting him. He faces them head on, with the anguish of all the loss drowning out any reason.]\n");

            main.contunieChar();

            //PROCESSING COMBAT AND FUNCTION
            for (int i = 0; i < 4; i++) {
                main.Combat();
                main.textClear();
            }
            main.contunieChar();

            //OUTPUT MAIN GAME STORY
            System.out.println("[As Khotun reaches the village, he prays that all the lives lost will be given justice and continues on his war path.]\n");

            System.out.println("[Lets hope its worth it, he mutters.]\n");

            main.contunieChar();
            //PROCESSING COMBAT AND FUNCTIONS
            for (int i = 0; i < 5; i++) {
                main.Combat();
                main.textClear();
            }
            main.contunieChar();

            //OUTPUT MAIN GAME STORY
            System.out.println("[As the residents of the village are thanking the Ghost for saving them, an arrow grazes him in the side. It is Jin who shot the arrow. \n");

            System.out.println("Khotun stares at Jin through his ghost mask, not even sweating at his injury. The Ghost takes off his mask, revealing his identity. Jin is enraged to find out the GHOST is Khotun]\n");

            System.out.println("[No words are exchanged. They head straight to battle. They both hate each other with a blood thirsty passion. The final fight to decide the fate of the land has begun.]\n");

            System.out.println("THIS… IS…FOR EVERYTHING!\n");

            //PROCESSING COMBAT AND FUNCTIONS
            main.finalBossEcho(true);
            main.Combat();
            main.textClear();

            //OUTPUT MAIN GAME STORY
            System.out.println("[With that final strike, the GHOST, Khotun strikes Jin down to his knees... First Khotun slashes his arms, then his chest, and finally, his head. Jin Sakai, leader of the Japanese army, has been decapitated.]\n");

            System.out.println("[Tears fall down Khotuns face. Not because of the many slashes his body has suffered throughout his journey. But because he has finally freed his people.]\n");

            System.out.println("[Tears of joy. Tears of relief. Tears of fading pain, are what fall down Khotuns face.]\n");

            System.out.println("[Over a weeks span, Khotun defeats every Japanese soldier in his homeland.]\n");

            System.out.println("[Now with everything under control, Khotun reclaims his homeland completely and visits SIka and makes her entire family and herself rich. After that Khotun ends his bloodthirsty journey and begins a peaceful and joyful one...]\n");

            System.out.println("[ THE END ]\n");

            //END GAME, OUTPUT
            main.gameFinished();
         */


        //world.test();
/*
        world.setValidItemPool();
        world.newShop();

        System.out.println(Arrays.toString(world.getItem1()));
        System.out.println(Arrays.toString(world.getItem2()));

        world.setValidItemPool();
        world.newShop();

        System.out.println(Arrays.toString(world.getItem1()));
        System.out.println(Arrays.toString(world.getItem2()));
 */


    }


    //Replace with instance methods
    Player player = new Player();
    Enemy enemy = new Enemy();
    //GhostofKhotunKhan2 main = new GhostofKhotunKhan2();
    //worldGeneration world = new worldGeneration(player, enemy,main) ;


    //main variable setup
    String playerInput;
    char dummy;
    boolean gameStart, finalBoss;
    String playerStart;


    //Clears the users screen of any past text
    public void textClear() {
        for (int row = 1; row <= 21; row = row + 1) {
            for (int clear = 1; clear <= 2; clear = clear + 1) {
                System.out.println();
            }
        }
    }

    //Temporarily stops execution of code when given an integer amount of seconds
    public void tempStop(int seconds) {
        int milliseconds;
        milliseconds = seconds * 1000;
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException ie) {
        }
    }

    //asks user to input a key
    public void contunieChar() {
        System.out.println("Press Any Key to Continue!");
    }

    //Ran at the end of the game to print  credits and score of the player
    public void gameFinished() {
        System.out.println("Congrats! You've Beaten Ghost of Khotun Khan!");
        System.out.println("Final Score : " + player.getScore());
        tempStop(10);
        textClear();
        System.out.println("THE GHOST OF KHOTUN KHAN, A HEAD-EXPANSE PRODUCTION\n");
        tempStop(5);
        textClear();
        System.out.println("HEAD OF GAME PRODUCTION & DEVELOPMENT: MUHAMMAD SHEIKH\n");
        tempStop(5);
        textClear();
        System.out.println("HEAD OF CREATIVE DECISIONS & STORY: HASSAN ABASSI\n");
        tempStop(5);
        textClear();
        System.out.println("HEAD OF MANAGEMENT: NEKTARIA KOUTROUBIS\n");
        tempStop(5);
        textClear();
        System.out.println("BETA TESTERS: MUHAMMAD SHEIKH & HASSAN ABASSI\n");
        tempStop(5);
        textClear();
        System.out.println("BACKGROUND ACTOR #1: KIEFER GAS-POWERED\n");
        tempStop(5);
        System.out.println("BACKGROUND ACTOR #2: SHEHERYAR USMANI\n");
        tempStop(5);
        System.out.println("SPECIAL THANKS: Intellij Idea Community Edition\n");
        tempStop(5);
        System.out.println("CLASS CODE/ PUBLISHER: \n");
        tempStop(5);
        textClear();
        System.out.println("We hope you enjoyed! This program will exit as soon as you press anything!");
        contunieChar();
        tempStop(15);
        System.exit(0);
    }

    //Prints  out the tutorial of the game and starts off the game
    //Also tells the player how to play
    public void tutorial() {
        System.out.println("WELCOME TO GHOST OF KHOTUN KHAN! BEFORE WE GET STARTED, LETS GO OVER SOME BASICS!\n");
        System.out.println("THIS IS MAINLY A STORY GAME! YOU WILL FIND 2 CONSOLES " +
                "ONE WHICH ALLOWS INPUTS & ONE WHICH ALLOWS YOU TO READ WHATS HAPPENING!\n");
        System.out.println("AT THE START OF ANY FIGHT, YOU WILL BE GIVEN BACKSTORY OF THE DUEL!\n " +
                "YOU WILL THEN GET YOUR CURRENT HIT POINTS, ATTACK AND DEFENSE! THE STATUS WILL LOOK LIKE THIS: ");
        System.out.println("Current HP: " + player.getHp());
        System.out.println("Current Attack: " + player.getAtk());
        System.out.println("Current Defense: " + player.getDef());
        System.out.println("Current Level: " + player.getLevel());
        System.out.println("HEALTH POINTS ARE EASY, IF YOU RUN OUT OF THEM ITS GAME OVER AND YOU MUST RESTART!");
        System.out.println("ATTACK IS BONUS AMOUNT OF DAMAGE YOU DO ON-TOP OF YOUR BASE DAMAGE! " +
                "THIS INCREASES PER LEVEL, AS KHOTUN IS ALWAYS GROWING!\n");
        System.out.print("DEFENCE IS THE PERCENTAGE OF DAMAGE ABSORPTION YOU HAVE! WITH 50 DEFENCE, ALL DAMAGE IS HALVED!");
        System.out.println("LASTLY IS LEVEL, AS YOU GROW STRONGER YOUR LEVEL ALSO INCREASES!\n");
        System.out.println("SECONDLY, YOU HAVE 3 OPTIONS IN BATTLE! TO ATTACK, DEFEND OR USE A SPECIAL MOVE!\n");
        System.out.println();
        System.out.print("ATTACK ALLOWS YOU STRIKE THE ENEMY, DOING DAMAGE TO THERE HIT-POINTS!\n");
        System.out.println("DEFENCE ALLOWS YOU DEFEND AGAINST AN ENEMIES STRIKE, ALLOWING YOU TO SURVIVE FOR MUCH LONGER!\n");
        System.out.print("SPECIAL MOVES ARE FORBIDDEN MOVES. GAIN MORE POWER TO UNLOCK THEM.");
        System.out.println();
        System.out.println("NOW THEN, LET US BEGIN!");
    }

    //Echos the final boss method, by setting the variable to true
    //Basically, when set true tells the game that its time for the final boss
    public void finalBossEcho(boolean echo) {
        finalBoss = echo;
    }

    //Print the title screen of the game, and takes start options
    //Also provides exit,credit and start menu with caps detection
    public boolean titleScreen() {
        System.out.println(" __-----_________________{]__________________________________________________\n" +
                "{&&&&&&&#%%&#%&%&%&%&%#%&|]__________________________________________________\\\n" +
                "                         {]");
        System.out.println();
        System.out.println();
        System.out.println("  /$$$$$$  /$$                             /$$                      /$$$$$$        /$$   /$$ /$$                   /$$                               /$$   /$$ /$$                                  /$$$$$$ \n" +
                " /$$__  $$| $$                            | $$                     /$$__  $$      | $$  /$$/| $$                  | $$                              | $$  /$$/| $$                                 /$$__  $$\n" +
                "| $$  \\__/| $$$$$$$   /$$$$$$   /$$$$$$$ /$$$$$$          /$$$$$$ | $$  \\__/      | $$ /$$/ | $$$$$$$   /$$$$$$  /$$$$$$   /$$   /$$ /$$$$$$$       | $$ /$$/ | $$$$$$$   /$$$$$$  /$$$$$$$       |__/  \\ $$\n" +
                "| $$ /$$$$| $$__  $$ /$$__  $$ /$$_____/|_  $$_/         /$$__  $$| $$$$          | $$$$$/  | $$__  $$ /$$__  $$|_  $$_/  | $$  | $$| $$__  $$      | $$$$$/  | $$__  $$ |____  $$| $$__  $$        /$$$$$$/\n" +
                "| $$|_  $$| $$  \\ $$| $$  \\ $$|  $$$$$$   | $$          | $$  \\ $$| $$_/          | $$  $$  | $$  \\ $$| $$  \\ $$  | $$    | $$  | $$| $$  \\ $$      | $$  $$  | $$  \\ $$  /$$$$$$$| $$  \\ $$       /$$____/ \n" +
                "| $$  \\ $$| $$  | $$| $$  | $$ \\____  $$  | $$ /$$      | $$  | $$| $$            | $$\\  $$ | $$  | $$| $$  | $$  | $$ /$$| $$  | $$| $$  | $$      | $$\\  $$ | $$  | $$ /$$__  $$| $$  | $$      | $$      \n" +
                "|  $$$$$$/| $$  | $$|  $$$$$$/ /$$$$$$$/  |  $$$$/      |  $$$$$$/| $$            | $$ \\  $$| $$  | $$|  $$$$$$/  |  $$$$/|  $$$$$$/| $$  | $$      | $$ \\  $$| $$  | $$|  $$$$$$$| $$  | $$      | $$$$$$$$\n" +
                " \\______/ |__/  |__/ \\______/ |_______/    \\___/         \\______/ |__/            |__/  \\__/|__/  |__/ \\______/    \\___/   \\______/ |__/  |__/      |__/  \\__/|__/  |__/ \\_______/|__/  |__/      |________/");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                 ⠀⠀⠀⠀   ⠀⠀⠀⠀⠀⠀⠀⠀⠀           ⠀⠀⠀⡆⢰⠀⠀⠀\n" +
                "⠀⠀⠀⠘⡇⠀⠀⠀⢠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀                                                                                                                                                      ⢠⠀⠀⠀⡇⠘⠀⠀⠀\n" +
                "⠀⠀⠀⠀⢷⠀⢠⢣⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                        ⡏⢣⢠⠀⢷⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⢘⣷⢸⣾⣇⣶⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                  ⣄⣦⣶⣇⣾⢸⣷⢘⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⣿⣿⣿⣹⣿⣿⣷⣿⣆⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                 ⠀⠀          ⣀⣀⣆⣿⣷⣿⣿⣹⣿⣿⣿⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢼⡇⣿⣿⣽⣶⣶⣯⣭⣷⣶⣿⣿⣶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                               ⠀⠀  ⠀    ⣶⣿⣿⣶⣷⣭⣯⣶⣶⣽⣿⣿⡇⢼⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠸⠣⢿⣿⣿⣿⣿⡿⣛⣭⣭⣭⡙⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                        ⠁⡙⣭⣭⣭⣛⡿⣿⣿⣿⣿⢿⠣⠸⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⣿⣿⠿⠿⠿⢯⡛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⡛⢯⠿⠿⠿⣿⣿⣿⣿⣿⠸⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣾⣿⡿⡷⢿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⡄⢿⡷⡿⣿⣾⣿⣿⣿⣿⢠⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⡔⣺⣿⣿⣽⡿⣿⣿⣿⣟⡳⠦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \t ██▀███    ██  ██████  ▓█████     ▒█████   ▒ ████▒    ▄▄▄█████▓  ██░ ██  ▓█████     ▒█████   ███▄ ▄███▓ ▓█████ ███▄    █⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠦⡳⣟⣿⣿⣿⡿⣽⣿⣿⣺⡔⠀⠀⠀⠀ \n" +
                "⠀⠀⠀⠀⠀⠀⢠⣭⣾⣿⠃⣿⡇⣿⣿⡷⢾⣭⡓⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\t▓██ ▒ ██▒▒▓██▒██    ▒  ▓█   ▀    ▒██▒  ██▒▒▓██        ▓  ██▒ ▓▒▒▓██░ ██  ▓█   ▀    ▒██▒  ██▒▓██▒▀█▀ ██▒ ▓█   ▀ ██ ▀█   █⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⡓⣭⢾⡷⣿⣿⡇⣿⠃⣿⣾⣭⢠⠀⠀⠀ \n" +
                "⠀⠀⠀⠀⠀⠀⣾⣿⡿⠷⣿⣿⡇⣿⣿⣟⣻⠶⣭⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \t▓██ ░▄█ ▒░▒██░ ▓██▄    ▒███      ▒██░  ██▒░▒████      ▒ ▓██░ ▒░░▒██▀▀██  ▒███      ▒██░  ██▒▓██    ▓██░ ▒███  ▓██  ▀█ ██▒⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⣭⠶⣻⣟⣿⣿⡇⣿⣿⠷⡿⣿⣾⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⣋⣵⣞⣭⣮⢿⣧⣝⣛⡛⠿⢿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\t▒██▀▀█▄   ░██  ▒   ██▒ ▒▓█  ▄    ▒██   ██░░░▓█▒       ░ ▓██▓ ░  ░▓█ ░██  ▒▓█  ▄    ▒██   ██░▒██    ▒██  ▒▓█  ▄▓██▒  ▐▌██▒⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⣦⢿⠿⡛⣛⣝⣧⢿⣮⣭⣞⣵⣋⠀⠀\n" +
                "⠀⣀⣀⣠⣶⣿⣿⣿⣿⡿⠟⣼⣿⡿⣟⣿⡇⠀⠙⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\t░██▓ ▒██▒ ░██▒██████▒▒▒░▒████    ░ ████▓▒░ ░▒█░         ▒██▒ ░  ░▓█▒░██▓▒░▒████    ░ ████▓▒░▒██▒   ░██▒▒░▒████▒██░   ▓██░⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠀⡇⣿⣟⡿⣿⣼⠟⡿⣿⣿⣿⣿⣶⣠⣀⣀⠀\n" +
                "⡼⣿⣿⣿⢟⣿⣿⣿⣷⡿⠿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\t░ ▒▓ ░▒▓░ ░▓ ▒ ▒▓▒ ▒ ░░░░ ▒░     ░ ▒░▒░▒░   ▒ ░         ▒ ░░     ▒ ░░▒░▒░░░ ▒░     ░ ▒░▒░▒░ ░ ▒░   ░  ░░░░ ▒░ ░ ▒░   ▒ ▒ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⣿⣿⣿⣿⣿⠿⡿⣷⣿⣿⣿⢟⣿⣿⣿⡼\n" +
                "⠀⠀⠉⠁⠀⢉⣭⣭⣽⣯⣿⣿⢿⣫⣮⣅⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\t  ░▒ ░ ▒░  ▒ ░ ░▒  ░ ░░ ░ ░        ░ ▒ ▒░   ░             ░      ▒ ░▒░ ░░ ░ ░        ░ ▒ ▒░ ░  ░      ░░ ░ ░  ░ ░░   ░ ▒░⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣅⣮⣫⢿⣿⣿⣯⣽⣭⣭⢉⠀⠁⠉⠀⠀\n" +
                "⠀⠀⠀⠀⢀⣿⣟⣽⣿⣿⣿⣿⣾⣿⣿⣯⡛⠻⢷⣶⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀\t   ░   ░   ▒ ░  ░  ░      ░      ░ ░ ░ ▒    ░ ░         ░ ░      ░  ░░ ░    ░      ░ ░ ░ ▒  ░      ░       ░     ░   ░ ░ ⠀⠀⠀⠀⠀⠀⠀⡀⣄⣤⣶⢷⠻⡛⣯⣿⣿⣾⣿⣿⣿⣿⣽⣟⣿⢀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⢀⡞⣾⣿⣿⣿⣿⡟⣿⣿⣽⣿⣿⡿⠀⠀⠀⠈⠙⠛⠿⣶⣤⣄⡀⠀⠀\t   ░       ░       ░  ░   ░          ░ ░                         ░  ░  ░░   ░          ░ ░         ░   ░   ░           ░ ⠀⠀⡀⣄⣤⣶⠿⠛⠙⠈⠀⠀⠀⡿⣿⣿⣽⣿⣿⡟⣿⣿⣿⣿⣾⡞⢀⠀\t\n" +
                "⠀⠀⠀⣾⣸⣿⣿⣷⣿⣿⢧⣿⣿⣿⣿⣿⣷⠁⠀⠀⠀⠀⠀⠀⠀⠈⠙⠻⢷⣦                                                                                                                            ⣦⢷⠻⠙⠈⠀⠀⠀⠀⠀⠀⠀⠁⣷⣿⣿⣿⣿⣿⢧⣿⣿⣷⣿⣿⣸⣾⠀⠀⠀⠀\n" +
                "⠀⠀⠀⡿⣛⣛⣛⣛⣿⣿⣸⣿⣿⣿⣻⣿⣿⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠆⣿⣿⣻⣿⣿⣿⣸⣿⣿⣛⣛⣛⣛⡿⠀⠀⠀⠀\n" +
                "⠀⠀⢸⡇⣿⣿⣿⣿⣿⡏⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                             ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⡇⣿⣿⣿⣿⣿⣿⣿⡏⣿⣿⣿⣿⣿⡇⢸⠀\n" +
                "⠀⠀⠀⢰⣶⣶⣶⣾⣿⢃⣿⣿⣿⣿⣯⣿⣭⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                             ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠁⣭⣿⣯⣿⣿⣿⣿⢃⣿⣾⣶⣶⣶⢰⠀⠀⠀");
        System.out.print("");
        System.out.println();
        System.out.println();
        System.out.println(" __-----_________________{]__________________________________________________\n" +
                "{&&&&&&&#%%&#%&%&%&%&%#%&|]__________________________________________________\\\n" +
                "                         {]");

        System.out.println();
        System.out.println("TYPE IN THE OPTION YOU WANT!");
        System.out.println("START");
        System.out.println("CREDITS");
        System.out.println("EXIT");
        Scanner input = new Scanner(System.in);
        playerStart = input.nextLine();
        System.out.println(playerStart);
        if (playerStart.equals("START") || playerStart.equals("start") || playerStart.equals("Start")) {
            return gameStart = true;
        } else if (playerStart.equals("CREDITS") || playerStart.equals("credits")) {
            System.out.println("THE GHOST OF KHOTUN KHAN, A HEAD-EXPANSE PRODUCTION\n");
            System.out.println("HEAD OF GAME PRODUCTION & DEVELOPMENT: MUHAMMAD SHEIKH\n");
            System.out.println("HEAD OF CREATIVE DECISIONS & STORY: HASSAN ABASSI\n");
            System.out.println("HEAD OF MANAGEMENT: [REDACTED] \n");
            System.out.println("BETA TESTERS: MUHAMMAD SHEIKH & HASSAN ABASSI\n");
            System.out.println("BACKGROUND ACTOR #1: [REDACTED]\n");
            System.out.println("BACKGROUND ACTOR #2: [REDACTED] \n");
            System.out.println("SPECIAL THANKS: INTELLIJ IDEA COMMUNITY EDTION\n");
            System.out.println("PUBLISHING/CLASS CODE: [REDACTED] \n");
            System.out.println("The program will exit in 30 seconds.");



            tempStop(30);
            System.exit(0);

        } else if (playerStart.equals("EXIT") || playerStart.equals("exit")) {
            System.exit(0);
        }
        return gameStart = false;
    }

}

