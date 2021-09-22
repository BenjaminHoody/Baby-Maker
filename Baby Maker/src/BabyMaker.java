import java.util.Scanner;
public class BabyMaker
	{
		static Scanner userInput = new Scanner(System.in);

		public static void main(String[] args)
			{
				Baby myBaby = new Baby("Jeff", 10.7, true);
				
				System.out.println("The first baby is " + myBaby.getWeight() + " pounds!");
				
				myBaby.setName("Max");
				
				myBaby.cry();

			}

	}
