//Text Based Adventure game, sequel to Ghost Of Khotun Khan. Fight off a new threat to Mongolia, and conquer the land once again.
//Ghost Of Khotun Khan 2 Ver: 1.0.0
//By: Muhammad Sheikh
//Summative for ICS3U1-4
//Date: 2023/06/16


import java.util.*;


class GhostofKhotunKhan2 {


    public static void main(String[] args) {


        //Object Declaration, uses the same player, enemy and main instance to ensure variables stay constant across classes
        GhostofKhotunKhan2 main = new GhostofKhotunKhan2();
        Player player = new Player();
        Enemy enemy = new Enemy();
        worldGeneration world = new worldGeneration(player, enemy, main);
        Combat combat = new Combat(enemy, player, main, world);



        //Call the title screen method
        main.titleScreen();
        while (main.gameStart) {
            //Sets the valid item pool to every item in the game
            world.setValidItemPool();
            //Calls the tutorial method
            main.tutorial();
            //Asks if the player wants to continue
            main.contunieChar();
            //Clears the screen
            main.textClear();

            //Prints the story
            System.out.println("In the year 1275, amidst the vast Mongolian Mountains, a valiant warrior named Khotun Khan emerged as a beacon of honor and strength");
            System.out.println("He had prevented the takeover of the Japanese Jin Sakia the previous year, cementing him as one of Mongolia's Greatest Warriors.");
            System.out.println("He had descended from a lineage of mighty Mongol warriors, possessed an unwavering spirit and unyielding determination.");
            System.out.println();
            System.out.println("However, soon rumors spread that Mongolia was in trouble once again.");
            System.out.println("Rumors reached Khotun's ears of a dark spirit lord, once a noble leader corrupted by evil forces, terrorizing the lands. ");
            System.out.println("This wicked being, known as The Omen, had amassed an army of undead minions, plunging villages into despair and devouring the souls of the innocent.");
            System.out.println("He had gathered his forces and was now residing in the city of Khanthar, awaiting the only man who could defeat him.");
            System.out.println();
            System.out.println("Driven by a deep sense of duty and a desire to protect his people, Khotun embarked on a perilous journey to confront The Omen and rid the land of his vile presence.");
            System.out.println("But as Khotun exited his humble cave home, he was attacked by an enemy!");
            System.out.println();
            main.contunieChar();
            main.textClear();

            //First combat encounter
            world.CombatEncounterMessage(1);
            combat.Combat();
            main.textClear();

            //more story is printed here
            System.out.println("The path to Khantar  was treacherous, filled with spectral guardians and twisted traps.");
            System.out.println("Khotuns's unwavering resolve and his bond with the spirits of his ancestors guided him through these harrowing trials, testing his mettle and pushing him to his limits.");
            main.contunieChar();
            main.textClear();

            //For loop does generic combat encounters 5 times
            for(int i = 0; i <= 4; i++)
            {
                world.CombatEncounterMessage(1);
                combat.Combat();
                main.textClear();
            }

            //An overworld encounter, called from the world Generation class
            world.overworldEncounterMessage();
            main.contunieChar();
            main.textClear();

            //More story
            System.out.println("As Khotun was coming close to the City of Khantar, The Omen got very worried.");
            System.out.println("So he conjured some of the strongest spirits in Mongolia to fight and kill Khotun.");
            System.out.println("He hoped the next enemy he threw at Khotun would put him in the ground.");
            main.contunieChar();

            //Miniboss encounter, uses encounter type 2
            world.CombatEncounterMessage(2);
            combat.Combat();
            main.textClear();

            //More story
            System.out.println("As Khotun bested another of The Omens trials, he saw a man setting up shop.");
            System.out.println("As he got closer, the man looked at him and his heavy gold pouch and eagerly offered his goods.");
            main.contunieChar();

            //Generates a shop for the player to buy something
            world.newShop();
            main.contunieChar();
            main.textClear();

            //More story
            System.out.println("His Second obstacle emerged in the form of the Woods of The Dead, a sinister labyrinth filled with malevolent spirits and restless souls. ");
            System.out.println("Khotun braved the  whispers that echoed through the ancient trees, evading the grasp of tendrils that reached out from the darkness.");
            System.out.println("With each step, he had to rely on his keen instincts and the guiding wisdom of his forefathers to stay on the right path.");
            main.contunieChar();

            //For loop does generic combat encounters 5 times
            for(int i = 0; i <= 4; i++)
            {
                world.CombatEncounterMessage(1);
                combat.Combat();
                main.textClear();
            }

            //Another overworld encounter for the player
            world.overworldEncounterMessage();
            main.contunieChar();
            main.textClear();

            //More story
            System.out.println("As he exited the Woods of The Dead, he sensed someone with an extremely high power level.");
            System.out.println("It seemed The Omen had send another one of Mongolia's strongest after Khotun...");
            main.contunieChar();
            main.textClear();


            //Another Miniboss encounter
            world.CombatEncounterMessage(2);
            combat.Combat();
            main.textClear();

            //More story
            System.out.println("Khotun then saw the odd man, setting up shop once again. Quickly, he ran over to check his wares.");
            main.contunieChar();
            main.textClear();

            //Generates a new shop for the player to buy something
            world.newShop();
            main.contunieChar();
            main.textClear();

            //More story
            System.out.println("For the last step of his Journey, Khotun ventured into the Forbidden Valley, a desolate and barren land haunted by eerie winds. ");
            System.out.println("The valley seemed devoid of life, except for the occasional flicker of ghostly apparitions.");
            System.out.println("Khotun faced perilous sandstorms and fought off phantom warriors who rose from the scorched earth, testing his endurance and willpower.");
            main.contunieChar();
            main.textClear();


            //Does a generic combat encounter  4 times
            for(int i = 0; i <= 3; i++)
            {
                world.CombatEncounterMessage(1);
                combat.Combat();
                main.textClear();
            }

            //Last overworld encounter before boss
            world.overworldEncounterMessage();
            main.contunieChar();
            main.textClear();

            //Story into the boss
            System.out.println("Finally, after enduring countless trials and tribulations, Kohtun reached the city of Khantar, the ancient fortress where The Omen had lied waiting.");
            System.out.println("Khotun made his way inside Khantar Castle, and there he felt an incredible amount of resolve overcome him. This was it.");
            main.contunieChar();
            main.textClear();

            //Calling the boss encounter
            world.CombatEncounterMessage(3);
            combat.Combat();
            main.textClear();

            //Calling the game finished method to finish the game
            main.gameFinished();
        }






    }




    //main variable setup
    String dummy;
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

    //asks user to input a key, and does nothing with it,
    public void contunieChar() {
        Scanner dummySCanner = new Scanner(System.in);
        System.out.println("Press Any Key to Continue!");
        dummy = dummySCanner.nextLine();
    }

    //Ran at the end of the game to print credits and congratulate the player
    public void gameFinished() {
        System.out.println("Congrats! You've Beaten Ghost of Khotun Khan 2: Rise Of The Omen!");
        tempStop(5);
        textClear();
        System.out.println("THE GHOST OF KHOTUN KHAN 2: RISE OF THE OMEN, A HEAD-EXPANSE PRODUCTION\n");
        tempStop(2);
        textClear();
        System.out.println("HEAD OF GAME PRODUCTION & DEVELOPMENT: MUHAMMAD SHEIKH\n");
        tempStop(2);
        textClear();
        System.out.println("HEAD OF CREATIVE DECISIONS & STORY: MUHAMMAD SHEIKH\n");
        tempStop(2);
        textClear();
        System.out.println("BETA TESTERS: MUHAMMAD SHEIKH\n");
        tempStop(2);
        textClear();
        System.out.println("SPECIAL THANKS: Intellij Idea Community Edition\n");
        tempStop(2);
        System.out.println("CLASS CODE/ PUBLISHER: ICS3U1-4 \n");
        tempStop(2);
        textClear();
        System.out.println("We hope you enjoyed! This program will exit as soon as you press anything!");
        contunieChar();
        System.exit(0);
    }

    //Prints  out the tutorial of the game and starts off the game
    //Also tells the player how to play
    public void tutorial() {
        System.out.println("WELCOME TO GHOST OF KHOTUN KHAN! BEFORE WE GET STARTED, LETS GO OVER SOME BASICS!\n");
        System.out.println("THIS IS MAINLY A STORY GAME! YOU WILL FIND 2 CONSOLES " +
                "ONE WHICH ALLOWS INPUTS & ONE WHICH ALLOWS YOU TO READ WHATS HAPPENING!\n");
        System.out.println("AT THE START OF ANY FIGHT, YOU WILL BE GIVEN BACKSTORY OF THE DUEL!" +
                "YOU WILL THEN GET YOUR CURRENT HIT POINTS, ATTACK, DEFENSE, LEVEL, COIN COUNT AND ENERGY! THE STATUS WILL LOOK LIKE THIS: ");
        System.out.println("HEALTH POINTS ARE EASY, IF YOU RUN OUT OF THEM ITS GAME OVER AND YOU MUST RESTART!");
        System.out.println("ATTACK IS BONUS AMOUNT OF DAMAGE YOU DO ON-TOP OF YOUR BASE DAMAGE! ");
        System.out.println("DEFENCE IS THE AMOUNT OF DAMAGE ABSORPTION YOU HAVE!");
        System.out.println("ENERGY IS USED FOR SPECIAL MOVES, MAKE SURE YOU HAVE ENOUGH TO SUMMON ");
        System.out.println("COIN COUNT INDICATES HOW MUCH MONEY YOU HAVE! KILLING ENEMIES GRANTS YOU A CHANCE TO LOOT AND TAKE THEIR GOLD!");
        System.out.println("LASTLY IS LEVEL, AS YOU GROW STRONGER YOUR LEVEL ALSO INCREASES!");
        System.out.println();
        System.out.println("WITH EVERY LEVEL UP, YOU GET TO CHOOSE ON WHAT STAT TO INCREASE! CHOOSE WISELY!");
        System.out.println();
        System.out.println("SECONDLY, YOU HAVE 5 OPTIONS IN BATTLE! TO ATTACK, DEFEND, SPECIAL MOVES, FLEE OR INVENTORY!");
        System.out.println();
        System.out.println("ATTACK ALLOWS YOU STRIKE THE ENEMY, DOING DAMAGE TO THERE HEALTH!");
        System.out.println();
        System.out.println("DEFENCE ALLOWS YOU DEFEND AGAINST AN ENEMIES STRIKE, ALLOWING YOU TO SURVIVE FOR MUCH LONGER!");
        System.out.println();
        System.out.println("SPECIAL MOVES ARE POWERFUL BUT USE FORBIDDEN ENERGY TO USE THEM. GAIN MORE LEVELS TO UNLOCK THEM.");
        System.out.println();
        System.out.println("IF YOU GET OVERWHELMED, YOU CAN ALWAYS FLEE! HOWEVER, YOU WILL NOT REGAIN YOUR HEALTH OR ENERGY UPON FLEEING!");
        System.out.println("THE ENEMY MAY ALSO GET A CRITICAL HIT IN WHEN YOUR FLEEING, SO CHOOSE CAREFULLY!");
        System.out.println();
        System.out.println("THE INVENTORY ALLOWS YOU TO SEE THE STATS OF THE ITEMS YOU CURRENTLY HAVE!");
        System.out.println();
        System.out.println("ITEMS ARE EITHER PURCHASED FROM MERCHANTS OR GOTTEN FROM NON COMBAT ENCOUNTERS! ITEMS ARE EXPENSIVE DUE TO THEIR HIGH POWER BOOST, SO SAVE UP!");
        System.out.println("YOU WONT KNOW THE STATS OF ITEMS, AS KHOTUN CANT FEEL THEIR POWER BOOSTS WITHOUT HOLDING THEM!");
        System.out.println("ITEMS ALSO GROW WITH YOU, SO YOU WILL BECOME STRONGER AND STRONGER EVERY ENCOUNTER YOU GO INTO WITH THEM!");
        System.out.println("HOWEVER, SOME ITEMS MAY BOOST ONE STAT WHILE MAKING ANOTHER WEAKER! A SHIELD BOOSTS DEFENSE WHILE MAKING ATTACK WEAKER!");
        System.out.println();
        System.out.println("THE MAX AMOUNT OF ITEMS YOU CAN HAVE 5, BE CAREFUL NOT TO GO OVER THAT!");
        System.out.println();
        System.out.println("NOW THEN, LET US BEGIN!");
    }


    //Print the title screen of the game, and takes start options
    //Also provides exit, credit and start menu with caps detection
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
        //Checks for clean input

        Scanner input = new Scanner(System.in);
        playerStart = input.nextLine();
        playerStart = playerStart.toLowerCase();

        String possibleInput[] = {"start", "credits", "exit"};

        boolean validInput = false;
        while (!validInput) {
            for (int i = 0; i <= 2; i++) {
                if (Objects.equals(playerStart, possibleInput[i])) {
                    validInput = true;
                }
            }

            if (!validInput) {
                System.out.println("Please enter a valid input:");
                playerStart = input.nextLine();
                playerStart = playerStart.toLowerCase();
            }
        }

        if(playerStart.equals("start"))
        {
            return gameStart = true;
        }

        if(playerStart.equals("credits")) {
            System.out.println("THE GHOST OF KHOTUN KHAN 2, A HEAD-EXPANSE PRODUCTION\n");
            System.out.println("HEAD OF GAME PRODUCTION & DEVELOPMENT: MUHAMMAD SHEIKH\n");
            System.out.println("HEAD OF CREATIVE DECISIONS & STORY: MUHAMMAD SHEIKH\n");
            System.out.println("BETA TESTERS: MUHAMMAD SHEIKH\n");
            System.out.println("SPECIAL THANKS: INTELLIJ IDEA COMMUNITY EDITION\n");
            System.out.println("PUBLISHING/CLASS CODE: ICS3U1-4 \n");
            System.out.println("The program will exit in 30 seconds.");
            tempStop(30);
            System.exit(0);
        }

        if(playerStart.equals("exit")) {
            System.exit(0);
        }
        return gameStart = false;
    }


}



