/*
TODO
-Add rest of the attirbute tables
-Add random encounter + world generation
-Add upgraded leveling system
-Add generic encounters
-Add more abilties
-Add coloured text where needed
 */

import java.util.*;

//Text Based Adventure game set in Mongolia Post Japanese Invasion
//Ghost Of Khotun Khan Version: 1.2
//By: Muhammad Sheikh & Hassan Abassi
//Summative for ICS201-7C
//Date: 2022/06/15
public class GhostofKhotunKhan2 {


    public static void main(String[] args) {


        //Object Declaration
        GhostofKhotunKhan2 main = new GhostofKhotunKhan2();
        worldGeneration world2 = new worldGeneration();

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

        world2.setValidPool();
        world2.newShop();

        while (true)
        {
            int choice = (int) (Math.random() * 2 + 0);
            System.out.println(choice);
        }



    }


    Player player = new Player();
    Enemy enemy = new Enemy();

    worldGeneration world = new worldGeneration();




    //main variable setup
    int playerInput;
    char dummy;
    boolean gameStart, finalBoss;
    String playerStart;
    double enemyHp, enemyDef, enemyChoice, playerAtk, playerHp, playerDef;

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
            System.out.println("dfdfdf");


            tempStop(30);
            System.exit(0);

        } else if (playerStart.equals("EXIT") || playerStart.equals("exit")) {
            System.exit(0);
        }
        return gameStart = false;
    }

    //Prints the players' status, as in the HP, Attack, and Defense  & level.
    //Also asks the player what they will do, and stores it as a variable
    public void playerStatus() {
        System.out.println("Current HP: " + player.getHp());
        System.out.println("Current Attack: " + player.getAtk());
        System.out.println("Current Defense: " + player.getDef());
        System.out.println("Current Level: " + player.getLevel());
        System.out.println("What will you do? Enter 1 to Attack, 2 to Defend, 3 to see special moves!\n");
        Scanner CombatInput = new Scanner(System.in);
        playerInput = CombatInput.nextInt();
    }

    //Prints out one of 5 encounter messages. These messages dictate who the player will fight.
    //Also, auto balances the HP and Attack of the encounter, depending on how powerful the player gets.
    public void encounterMessage() {

        double localEncounterNumber = enemy.getEncounterNumber() ;

        localEncounterNumber = (int) (Math.random() * 5) + 1;

        if (finalBoss) {
            localEncounterNumber = 13;
        }
        if (localEncounterNumber == 1) {

            System.out.println("[A group of bandits attack Jin from the bushes. IT'S AN AMBUSH!]");
            System.out.println("We have been oppressed by your family for too long! We don't care if we die, as long as you die too Khotun! Exclaimed one bandit");
            System.out.println("You fool it is what you did that has made you oppressed. Said Khotun");
            System.out.println("Fine, you leave me no choice. Get ready to die, bandits. Said Khotun");
            System.out.println("May you all rest in peace… It's sad that your actions led to this. I hope the next generation doesn't make the same mistakes.\n");
            enemy.setEnemyHp(player.getHp() * 3);
            enemy.setBaseDamage((player.getAtk() + 25) / 2);
        }

        if (localEncounterNumber == 2) {
            System.out.println("[The soldiers confronting Khotun were laughing.]");
            System.out.println("Ai! Apparently we left one alive, let's finish him off. ahaha");
            System.out.println("[Khotun attacks them immediately!]");
            System.out.println("[They are in a intense face-off!]\n");
            enemy.setEnemyHp(player.getHp() * 3);
            enemy.setBaseDamage((player.getAtk() + 25) / 2);
        }
        if (localEncounterNumber == 3) {
            System.out.println("\"AY! Ghost scum. Get ready to die! I'll kill you exactly how I've killed the countless other people like you who have tried revolting against the Japanese chain of command!\" " + "Shouted the Japanese general.");
            System.out.println("FOR MY PEOPLE! Shouted Khotun.\n");
            enemy.setEnemyHp(player.getHp() * 3);
            enemy.setBaseDamage((player.getAtk() + 25) / 2);
        }
        if (localEncounterNumber == 4) {
            System.out.println("[Khotun gets spots a cannibal. It ravages the meat of a dead farmer.]");
            System.out.println("[Khotun calls them a Shyuri, a type of forsaken man that wanders the lands ]");
            System.out.println("I'll FACE you Shyuri, you will not ravage us any further!");
            enemy.setEnemyHp(player.getHp() * 3);
            enemy.setBaseDamage((player.getAtk() + 25) / 2);
        }
        if (localEncounterNumber == 5) {
            System.out.println("[Khotun gets in an encounter with a wild bear during scouting the area!]");
            System.out.println("[This bear is diffrent though, they seem to have glowing orange eyes.]");
            System.out.println("FACE ME, AND LET ME SHOW YOU NATURES WRATH yells the bear.");
            System.out.println("Khotun readies his weapon.");
            enemy.setEnemyHp(player.getHp() * 3);
            enemy.setBaseDamage((player.getAtk() + 25) / 2);
        }
        if (localEncounterNumber == 6) {
            System.out.println("The ground rumbles around you. This is it. The final challenge between you and Victory.");
            System.out.println("Let the battle begin.\n");
            enemy.setEnemyHp(player.getHp() * 5);
            enemy.setBaseDamage((player.getAtk() + 50));
        }
        if (localEncounterNumber == 7) {
            System.out.println("Add Guy");
            System.out.println("Let the battle begin.\n");
            enemy.setEnemyHp(player.getHp() * 5);
            enemy.setBaseDamage((player.getAtk() + 50));
        }
        if (localEncounterNumber == 8) {
            System.out.println("Add Guy");
            System.out.println("Let the battle begin.\n");
            enemy.setEnemyHp(player.getHp() * 5);
            enemy.setBaseDamage((player.getAtk() + 50));
        }
        if (localEncounterNumber == 9) {
            System.out.println("Add Guy");
            System.out.println("Let the battle begin.\n");
            enemy.setEnemyHp(player.getHp() * 5);
            enemy.setBaseDamage((player.getAtk() + 50));
        }
        if (localEncounterNumber == 10) {
            System.out.println("Add Guy");
            System.out.println("Let the battle begin.\n");
            enemy.setEnemyHp(player.getHp() * 5);
            enemy.setBaseDamage((player.getAtk() + 50));
        }

    }

    //Main combat method. When called, prints out one of the encounter message and starts the turn based combat.
    //Also handles special move allocation, as in the player can use their special moves here after unlocking them via playing the game or tell the player how to get it
    //Also handles enemy combat and what they do per turn
    public void Combat() {
        encounterMessage();
        while (player.isAlive() && enemy.isAlive()) {
            playerStatus();
            if (playerInput >= 4 || playerInput <= 0) {
                System.out.println("In the heat of the battle, Kohotun could not decide what to do.\n");
                System.out.println("The enemy saw him confused, and pierced his heart in a swift strike!");
                player.setHp(-1);
                player.gameOver();
            }
            if (playerInput == 1) {
                playerAtk = player.getAtk() + 100;
                enemyHp = enemy.getEnemyHp() - playerAtk;
                enemy.setEnemyHp(enemyHp);
                System.out.println("You did: " + playerAtk + " Damage!");
                playerInput = 0;

            }
            if (playerInput == 2) {
                playerDef = player.getDef() / 100;
                playerHp = (player.getHp() - (enemy.getbaseDamage() - (enemy.getbaseDamage() * playerDef)));
                player.setHp(playerHp);
                System.out.println("You Took: " + enemy.getbaseDamage() + " Damage!");
                playerInput = 0;
            }

            if (playerInput == 3) {
                if (player.getMilestone() == 1)
                {
                    System.out.println("SPECIAL MOVE #1: Heavenly STRIKE");
                    System.out.println("Summon the Ancestors power, and hone your sword into a weapon of perfection.\n");
                    playerAtk = player.getAtk() + 125;
                    enemyHp = enemy.getEnemyHp() - playerAtk;
                    enemy.setEnemyHp(enemyHp);
                    System.out.println("Damage Dealt: \n" + playerAtk);
                    playerInput = 0;
                }
                if (player.getMilestone() == 2)
                {
                    System.out.println("SPECIAL MOVE #2: Forsaken World, Chasing Slice");
                    System.out.println("As you remind yourself of the loss around you, you forsake the world. You feel a surge of power, and in a flash you deliver a strike that shakes the ground.\n");
                    playerAtk = player.getAtk() + 150;
                    enemyHp = enemy.getEnemyHp() - playerAtk;
                    enemy.setEnemyHp(enemyHp);
                    System.out.println("Damage Dealt: " + playerAtk);
                    playerInput = 0;
                }
                if (player.getMilestone() == 3)
                {
                    System.out.println("SPECIAL MOVE #3: Shroud of the Ghost");
                    System.out.println("As you summon the power within, a cloak of shadows emerges. You are un-seen, un-heard, and strike the enemies very soul.\n ");
                    playerAtk = player.getAtk() + 175;
                    enemyHp = enemy.getEnemyHp() - playerAtk;
                    enemy.setEnemyHp(enemyHp);
                    System.out.println("Damage Dealt: " + playerAtk);
                    playerInput = 0;
                }
                if (player.getMilestone() == 4)
                {
                    System.out.println("SPECIAL MOVE #4: Khotun Blast");
                    System.out.println("Charge your energy into a concentrated blast for your enemies!\n ");
                    playerAtk = player.getAtk() + 175;
                    enemyHp = enemy.getEnemyHp() - playerAtk;
                    enemy.setEnemyHp(enemyHp);
                    System.out.println("Damage Dealt: " + playerAtk);
                    playerInput = 0;
                }
                if (player.getMilestone() == 5)
                {
                    System.out.println("SPECIAL MOVE #5: Khotuns Ascension");
                    System.out.println("Khotun sacrificed half his lifeforce to the gods above. In exchange, his life and energy are tripled for now...\n ");
                    player.setHp(player.getHp() * 2);
                    player.setEnergy(player.getEnergy() * 2);
                    System.out.println("You feel empowered...");
                    playerInput = 0;
                }
                if (player.getMilestone() == 6)
                {
                    System.out.println("SPECIAL MOVE #5: Khotuns Killer Gambit");
                    System.out.println("Khotuns rams his sword through his heart, and draw a sword coated in his own blood.\n ");
                    System.out.println("With one strike, he will either end his enemy or himself.\n ");
                    int choice = (int) (Math.random() * 2 + 0);
                    if(choice == 1)
                    {
                        enemy.setEnemyHp(-1);
                        System.out.println("You got lucky.");
                    } else
                    {
                        player.setHp((player.getHp()/2));
                        System.out.println("The Gambit has failed...");
                    }
                    playerInput = 0;
                }
                else if (player.getMilestone() < 1)
                {
                    System.out.println("Khotun Tried to summon a power of some kind, but it seems to fail due to a lack of power!");
                    System.out.println("He hears a voice, saying that he may find some new moves at level 5, 10 & 15 \n");
                }
            }

            enemyChoice = (int) (Math.random() * 2) + 1;
            if (enemyChoice == 1 && playerInput == 0) {
                playerHp = player.getHp() - enemy.getbaseDamage();
                player.setHp(playerHp);
                System.out.println("The enemy strikes you! They deal " + enemy.getbaseDamage() + " Damage!\n");
            } else if (enemyChoice == 2 && playerInput == 0) {
                enemyDef = enemy.getEnemyDef() / 100;
                playerAtk = player.getAtk() + 50;
                enemyHp = (enemy.getEnemyHp() - (playerAtk - (playerAtk * enemyDef)));
                enemy.setEnemyHp(enemyHp);
                System.out.println("You see an opening in the enemies defense! You strike and do " + playerAtk + " Damage!\n");
            }
            tempStop(3);
        }
        if (player.isAlive()) {
            player.encounterSurvived(true);
        } else if (!player.isAlive()) {
            player.gameOver();
        }
    }


}