//Greatest Common Divisor (GCD)
class Twentyfive
{
    public static void main(String[] args)
    {
        int n1 = 18, n2 = 76;

        while(n1 != n2)
        {
          if(n1>n2)
          {
              n1 = n1-n2;
          }
          else
          {
              n2 = n2-n1;
          }
        }
        System.out.println("GCD: "+n1);
    }
}