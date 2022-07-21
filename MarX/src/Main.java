// importing scanner and random class
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// creating new characters
		Character haxParro = new Character ("HaxParro", 100, 0, "Pirate");
		Character karen = new Character("Karen", 200, 0, "Sea Creature");
		Character polly = new Character("Polly", 150, 0, "Parrot");
		Character bones = new Character("Bones", 50, 0, "Skeleton");
		
		// to get user input
		Scanner input = new Scanner(System.in);
		
		
		// ask player to choose a character
		System.out.println("Welcome to a game of X marks the spot!");
		System.out.println("- ~ - - ~ - ~ - X ~ - ~ - ~ ~ ~ - ~ -");
		System.out.println("Please choose a character to play as...");
		System.out.println("1) " + haxParro.getType() +"\n2) " + karen.getType() + "\n3) " + polly.getType() + "\n4) " + bones.getType());
		
		// for storing the chosen character to a variable so we can call upon it later
		String player = "";
		int playerEnergy = 0;
					
		// used as a condition for while loop
		Boolean charSelected = false;
		
		// used loop to allow the player to choose a character even if the wrong input is done. The loop will continue until a character is picked.
		while (charSelected == false) {
			// storing players choice in a variable
			String userChar = input.nextLine().toLowerCase();
			
			// using switch case to give details of the character that the player chose
			switch (userChar) {
			case "1":
			case "pirate":
				haxParro.printDetails();
				player = haxParro.getName();
				playerEnergy = haxParro.getEnergy();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println(" ");
				charSelected = true;
				break;
			case "2":
			case "sea creature":
				karen.printDetails();
				player = karen.getName();
				playerEnergy = karen.getEnergy();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println(" ");
				System.out.println(userChar);
				charSelected = true;
				break;
			case "3":
			case "parrot":
				polly.printDetails();
				player = polly.getName();
				playerEnergy = polly.getEnergy();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println(" ");
				charSelected = true;
				break;
			case "4":
			case "skeleton":
				bones.printDetails();
				player = bones.getName();
				playerEnergy = bones.getEnergy();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println(" ");
				charSelected = true;
				break;
			default:
				System.out.println("That option does not exist, please try again");
				System.out.println("");
				charSelected = false;
				break;
			}// end of switch case

		}// end of while loop
		
		//setting the map size (x, y)
		Map map = new Map(10, 10);
		
		// setting the player starting position at random
		map.setCurrentx((int) (Math.random()*10));
		map.setCurrenty((int) (Math.random()*10));
		
		// telling the player where they are
		System.out.println("Your coordinates are: " + map.getCurrentx() + ", " + map.getCurrenty());
		
		// condition for ending the game/loop
		Boolean endGame = false;
		
		while (endGame == false) {
			System.out.println("Choose a direction to explore");
			System.out.println("North, South, East, West");
			System.out.println(" ");
			String pos = input.next().toLowerCase();
			
			// taking the user input of direction and then moving the player using move method
			if (pos.equals("n") || pos.equals("north")) {
				map.move("N");
				playerEnergy -= 10;
				System.out.println("Your coordinates are: " + map.getCurrentx() + ", " + map.getCurrenty());
				System.out.println("Your energy level is " + playerEnergy);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			} else if (pos.equals("s") || pos.equals("south")) {
				map.move("S");
				playerEnergy -= 10;
				System.out.println("Your coordinates are: " + map.getCurrentx() + ", " + map.getCurrenty());
				System.out.println("Your energy level is " + playerEnergy);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			} else if (pos.equals("e") || pos.equals("east")) {
				map.move("E");
				playerEnergy -= 10;
				System.out.println("Your coordinates are: " + map.getCurrentx() + ", " + map.getCurrenty());
				System.out.println("Your energy level is " + playerEnergy);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			} else if (pos.equals("w") || pos.equals("west")) {
				map.move("W");
				playerEnergy -= 10;
				System.out.println("Your coordinates are: " + map.getCurrentx() + ", " + map.getCurrenty());
				System.out.println("Your energy level is " + playerEnergy);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}// end of if statement
			
			// store user input for events
			String ans = input.nextLine().toLowerCase();
			
			// used for deciding outcomes for events
			Random rand = new Random();
			int range = 10;
			int generate = rand.nextInt(range+1);
			
			// coordinate events & end game
			if (map.getCurrentx() == 7 && map.getCurrenty() == 5) {
				System.out.println("You have found the buried treasure!");
				System.out.println("You open the chest and find gold, gems and trinkets galore!");
				System.out.println("       ____...------------...____");
				System.out.println(" _.-\"` /o/__ ____ __ __  __ \\o\\_`\"-._");
				System.out.println(".'     / /                    \\ \\     '.");
				System.out.println("|=====/o/======================\\o\\=====|");
				System.out.println("|____/_/________..____..________\\_\\____|");
				System.out.println("/   _/ \\_     <_o#\\__/#o_>     _/ \\_   \\");
				System.out.println("\\_________\\####/_________/");
				System.out.println("  |===\\!/========================\\!/===|");
				System.out.println("  |   |=|          .---.         |=|   |");
				System.out.println("  |===|o|=========/     \\========|o|===|");
				System.out.println("  |===|o|=========/     \\========|o|===|");
				System.out.println("  |   | |         \\() ()/        | |   |");
				System.out.println("  |===|o|======{'-.) A (.-'}=====|o|===|");
				System.out.println("  | __/ \\__     '-.\\uuu/.-'    __/ \\__ |");
				System.out.println("  | __/ \\__     '-.\\uuu/.-'    __/ \\__ |");
				System.out.println("  |==== .'.'^'.'.====|");
				System.out.println("  |  _\\o/   __  {.' __  '.} _   _\\o/  _|");
				System.out.println("  `\"\"\"\"-\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"-\"\"\"\"`");
				System.out.println(" ");				
				endGame = true;
				break; // break out of while loop which ends the game
			} else if (map.getCurrentx() == 8 && map.getCurrenty() == 3) {
				System.out.println("~?~?~?~?~ RIDDLE ~?~?~?~?~");
				System.out.println("A ship would drop this to stay still even when the waters calm.\nIt's also a tattoo that can found on Popeye's arm!");
				ans = input.nextLine().toLowerCase();
				if (ans.equals("anchor")) {
					System.out.println("Correct! You earned 15 energy!");
					playerEnergy += 15;
					System.out.println("Your energy level is " + playerEnergy);
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				} else {
					System.out.println("Incorrect! You lost 20 energy!");
					playerEnergy -= 20;
					System.out.println("Your energy level is " + playerEnergy);
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				}// end of nested riddle
				
			} else if (map.getCurrentx() == 4 && map.getCurrenty() == 6) {
				System.out.println("~?~?~?~?~ RIDDLE ~?~?~?~?~");
				System.out.println("When you're looking for buried gold, this item can help you a lot.\nAs on this particular piece of parchment you'll find where X marks the spot.");
				System.out.println("What is the item?");
				ans = input.nextLine().toLowerCase();
				if ("treasure map".equals(ans) || "map".equals(ans) || "a map".equals(ans)) {
					System.out.println("Correct! You earned 15 energy!");
					playerEnergy += 15;
					System.out.println("Your energy level is " + playerEnergy);
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				}else {
					System.out.println("Incorrect! You lost 20 energy!");
					playerEnergy -= 20;
					System.out.println("Your energy level is " + playerEnergy);
					System.out.println(ans);
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				}// end of nested riddle
				
			} else if (map.getCurrentx() == 2 && map.getCurrenty() == 4) {
				System.out.println("~!~!~!~!~ Encounter ~!~!~!~!~");
				System.out.println("You have bumped into a crew of shady looking pirates. They've noticed your looking for buried treasure.");
				System.out.println("They start to surround you, what do you do?");
				System.out.println("Run (Cost: 10 energy) or Fight (Cost: ??)");
				ans = input.next().toLowerCase();
				if (ans.equals("run")) {
					System.out.println("Phew! You lost them");
					System.out.println("You ran away as quick as you could and ended up in a different location");
					// setting the player in a random position
					map.setCurrentx((int) (Math.random()*10));
					map.setCurrenty((int) (Math.random()*10));
					playerEnergy -= 10;
					// telling the player where their new location is
					System.out.println("Your new coordinates are: " + map.getCurrentx() + ", " + map.getCurrenty());
					System.out.println("Your energy level is " + playerEnergy);
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				}else if (ans.equals("fight")){
					if(generate > 5) {
						System.out.println("You brawled for 5 minutes, stopping once for a rum break...\nYou knocked out 3 of the 5 pirates and the last 2 guys ran away screaming!");
						System.out.println("They left behind some Pineapples and rum for you to re-fuel with.\nYou gained 8 energy");
						playerEnergy += 8;
						System.out.println("Your energy level is " + playerEnergy);
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					} else if (generate <= 5) {
						System.out.println("You brawled for 5 minutes, not even being able to stop for a rum break...");
						System.out.println("You've taken a few peg legs to the stomach and hooks to the face, unsure if you can take anymore you play dead until they leave.");
						System.out.println("You lost 12 energy during the conflict");
						playerEnergy -= 12;
						System.out.println("Your energy level is " + playerEnergy);
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					}// end of nested, nested
				}// end of nested
			}// end of statement
			
			// if player runs out of energy it will end the game
			if (playerEnergy <= 0) {
				endGame = true;
				System.out.println(player + " has fainted!");
				System.out.println("You ran out of energy!");
			} else {
				endGame = false;
			}
			
		}// end of while loop
		
		//Need to add more encounters
		
				

	}//end of main method

}// end of main class
