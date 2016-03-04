package WeekSeven;
import java.util.Scanner;
import java.util.Random;
public class RPS {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String rps = "";
		Random oneToThree = new Random();
		int counter = 0;
		int random = 0;
		int counter2 = 0;
		int counter3 = 0;
		int userPick;
		System.out.println("Welcome to Rock Paper Sissors");
		do {
		do {
			if (!rps.equalsIgnoreCase("r") && !rps.equalsIgnoreCase("p") && !rps.equalsIgnoreCase("s")) {
				System.out.println("You entered an invalid input, please try again.");
			}
			System.out.print("\n Type below R for rock P for Paper and S for Siccors.\n");
			rps = input.nextLine();
		}  while(!rps.equalsIgnoreCase("r") && !rps.equalsIgnoreCase("p") && !rps.equalsIgnoreCase("s")); 

		if (rps.equalsIgnoreCase("r")) {
			userPick = 0; // 0 = rock
		}
		else if (rps.equalsIgnoreCase("p")) {
			userPick = 1; // 1 = Paper
		}
		else {
			userPick = 2; // 2 = Siccors 
		}



		
			random = oneToThree.nextInt(2);
			if (random == 0 && userPick == 0) {
				System.out.println("its a draw, you both picked rock");
			}
			else if (random == 1 && userPick == 1) {
				System.out.println("its a draw, you both picked paper");
			}
			else if (random == 2 && userPick == 2) {
				System.out.println("Its a draw you both picked paper");
			}
			else if (random == 0 && userPick == 1) {
				System.out.println("You win, You picked Paper and computer picked Rock.");
				counter2 ++;
			}
			else if (random == 0 && userPick == 2) {
				System.out.println("You lose, you picked Siccsors while computer picked rock.");
				counter3++;
			}
			else if (random == 1 && userPick == 0) {
				System.out.println("You lose, You picked Rock and computer picked Paper.");
				counter3++;

			}
			else if (random == 1 && userPick == 2) {
				System.out.println("You Win, you picked Siccsors while computer picked paper.");
				counter2 ++;

			}
			else if (random == 2 && userPick == 1) {
				System.out.println("You lose, You picked Paper and computer picked Sisscors.");
				counter3++;
			}
			else if (random == 2 && userPick == 0) {
				System.out.println("You win, you picked Rock while computer picked Siccors.");
				counter2++;

			}
		} while (counter2 < 2 && counter3 < 2); 
		
		
		if (counter2 == 2) {
			System.out.println("You WIN the game!!");
		}
		else if (counter3 == 2) {
			System.out.println("You LOSE the game :(:(");
		}


	}
}
