public class makes10
{

  public static boolean makes10(int a, int b)
  {

    boolean result = false;

    if (a == 10 || b == 10 || a+b == 10)
      result = true;

    else
      result = false;

    return result;

  }

  public static void main(String[] args)
  {
    System.out.println("a=10, b=3, a+b=13: " + makes10(10, 3));
    System.out.println("a=4, b=10, a+b=14: " + makes10(4, 10));
    System.out.println("a=3, b=7, a+b=10: " + makes10(3, 7));
    System.out.println("a=2, b=4, a+b=6: " + makes10(2, 4));
  }

}
