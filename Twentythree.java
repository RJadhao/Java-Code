import java.util.Scanner;

public class Twentythree {
   public static void main(String args[]){
      int num, originalNum, remainder, result = 0, n = 0;

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number to check if it's an Amstrong number:");
      num = sc.nextInt();

      originalNum = num;

      // count number of digits
      while (originalNum != 0) {
         originalNum /= 10;
         ++n;
      }

      originalNum = num;

      // compute the sum of each digit raised to the power of n
      while (originalNum != 0) {
         remainder = originalNum % 10;
         result += Math.pow(remainder, n);
         originalNum /= 10;
      }

      // check if the result is equal to the original number
      if (result == num)
         System.out.println(num + " is an Amstrong number.");
      else
         System.out.println(num + " is not an Amstrong number.");
   }
}
