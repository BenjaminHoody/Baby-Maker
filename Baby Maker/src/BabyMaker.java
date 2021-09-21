import java.util.Scanner;
public class BabyMaker
	{
		static Scanner userInput = new Scanner(System.in);

		public static void main(String[] args)
			{
				Baby myB1 = new Baby("Jeff", 10.7, true);
				
				System.out.println("The first baby is " + myB1.weight + " pounds!");
				
				myB1.cry();

			}

	}
