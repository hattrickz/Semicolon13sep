import java.util.Scanner;

public class Squareroot {
	public static void main (String [] args){
	Scanner input = new Scanner(System.in);
	System.out.println("enter a number to get the Squareroot");
	double num = input.nextDouble();
	
	double sq = Math.pow(num, 2);
	System.out.println(sq);

	
	}
}