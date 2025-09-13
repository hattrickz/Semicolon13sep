import  java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.println("Enter annual interest rate in percentage: ");
        double annualinterest = input.nextDouble();

        System.out.println("Enter number of years: ");
        double numberOfYears = input.nextInt();

        double monthlyInterestRate = (annualinterest / 1200);

        double futureInvestValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

        System.out.printf("Accumulated value is $%.2f%n", futureInvestValue);





        System.out.print(futureInvestValue);
    }
}