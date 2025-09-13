import java.util.Scanner;

public class Miniapp{
    public  static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name : ");
        String Name = input.nextLine();
        System.out.println("Hello, " + (Name+ "!")   +  " Welcome to your personal assistant. ");

        System.out.println("Enter your age : ");
        int Age = input.nextInt();
        if (Age < 13){
            System.out.println("You are a young explorer!");
        }
        else if (Age >= 13 && Age <= 19){
            System.out.println("Teen life is fun, enjoy it!");
        }
        else if (Age >= 20 && Age <= 59){
            System.out.println("Adulting can be challenging, Stay strong!");
        } else if (Age >= 60) {
         System.out.println("Wisdom looks good on you!");
        }

        System.out.println("How do you feel: (Happy), (Sad), (Excited), (Tired).");
        String Mood = input.next();
        if (Mood.equals("Happy") || Mood.equals("happy") || Mood.equals("HAPPY")){
            System.out.println("Keep smiling");
        }
        else if (Mood.equals("Sad") || Mood.equals("sad") || Mood.equals("SAD")){
            System.out.println("Cheer up! Tomorrow is a new day");
        }
        else if (Mood.equals("Exicted") || Mood.equals("exicted") || Mood.equals("EXICTED")){
            System.out.println("Awesome! Enjoy your energy!" );
        }
        else if (Mood.equals("Tired") || Mood.equals("tired") || Mood.equals("TIRED")){
            System.out.println("Rest well and recharge!");
        }
        else {
            System.out.println("Invalid input");
        }

        System.out.println("I've chosen a number from 1 to 10 guess it to win a promo?");
        int Guess = input.nextInt();
        if (Guess <= 4  ){
            System.out.println( "Try again next time!" );
        }
        else if (Guess == 5){
            System.out.println("Wow! You guessed it!");
        }
        else if (Guess >= 6 && Guess <=10){
            System.out.println("Try again next time!" );
        }

        System.out.println(" Do you want any suggestion base on your mood? ((Yes), (No)). ");
        String Suggestion = input.next();
        if (Suggestion.equals( "yes" )){
            if (Mood.equals("Happy") || Mood.equals("happy") || Mood.equals("HAPPY")){
                System.out.println("Go out and play a sport you like");
            }
            else if (Mood.equals("Sad") || Mood.equals("sad") || Mood.equals("SAD")){
                System.out.println("Take a short walk outside and get some fresh air.");
            }
            else if (Mood.equals("exicted") || Mood.equals("Exicted") || Mood.equals("Exicted")){
                System.out.println( "Share your excitement by helping someone!" );
            }
            else if (Mood.equals("tired") || Mood.equals("Tired") || Mood.equals("TIRED")){
                System.out.println("Rest well and recharge!");
            }
		

            else {
                System.out.println("Invalid input");
            }
}
        }




















    }
