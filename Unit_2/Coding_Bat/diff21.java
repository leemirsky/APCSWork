public class diff21
{

  public static int Diff21(int n)
  {
    int result = 0;

    if (n <= 21)
      result = 21 - n;

    else
      result = 2*(n-21);

    return result;

    }

  public static void main(String[] args)
  {
    System.out.println("n = 6, result = " + Diff21(6));
    System.out.println("n = 21, result = " + Diff21(21));
    System.out.println("n = 30, result = " + Diff21(30));
  }
}
