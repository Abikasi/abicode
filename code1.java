package abcd;
import java.util.Scanner;

public class code1
{
   public static void main(String[] args)
   {
      int num;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter an Integer Value: ");
      num = scan.nextInt();
      
      System.out.println("\nYou've entered: " +num);
   }
}