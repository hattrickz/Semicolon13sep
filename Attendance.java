import java.util.Scanner;
public class Attendance {
public static void main (String [] args){
// prompt user to enter grade letter and store it in a variable 

Scanner input = new Scanner(System.in);
System.out.println("Enter Student attendance");
int attend = input.nextInt();
// check if attendance is greater than 75 print eligible if not  
 if (attend >= 75){
	System.out.print("Eligible");
	}
	 display not eligible
	else{
	System.out.print("not eligible");
	}


}
}
