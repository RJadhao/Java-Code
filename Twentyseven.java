import java.util.Scanner;

public class Twentyseven
{
    public static void main(String args[])
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        for (int i = 2; i <num ; i++)
        {
            if (num !=i && num % i == 0) {
                System.out.println("The Number " + num + " is not Prime Number");
                break;
            } else {
                System.out.println("The Number " + num + " is Prime Number");
                break;
            }
        }
    }
}
