import java.util.Scanner;

public class Twentyfour {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        double result =0;
        int orig = num;
        int remainder;
        while(num != 0)
        {
            remainder = num % 10;
            result = result + Math.pow(remainder, 3);
            num = num/10;

        }
        if (result == orig) 
        {
         System.out.println("The Number "+orig+" is Amstrong Number.");   
        } 
        else 
        {
          System.out.println("The Number "+orig+" is not Amstrong Number.");  
        }
    }
    
}
