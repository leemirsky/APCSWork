public class FibonacciTwo
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 1;

        System.out.println(a);
        System.out.println(b);

        for (int i=0; i<29; i++)
        {

          System.out.println(a+b);

          a = b;
          b = c;

        }

    }
}
