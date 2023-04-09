import java.util.Scanner;

public class Twentytwo 
{
 public static void main(String[] args) {
    int n1 = 0;
    int n2 = 1;
    int n3 = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    System.out.println("The Fibonecci Series :- ");
    for (int i = 0; i < num; i++) 
    {
     n3 = n1 + n2;
     System.out.print(n3+" ");
     n1 = n2;
     n2 = n3;
    }
 }    
}
