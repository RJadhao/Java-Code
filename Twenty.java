import java.util.Scanner;
public class Twenty {
    public static void main(String[] args) 
    {
     Scanner number = new Scanner(System.in);
     int num;
     int fact=1;
     System.out.print("Enter The Number = ");
     num = number.nextInt();
     for (int i = 2; i<=num; i++) 
     {
      fact=fact*i;   
     }
     System.out.println("The Factorial Of "+num+" is "+fact);   
    }
}
