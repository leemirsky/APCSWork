public class diff21
{

  public static void testDiff21(int n, int expected)
  {
    int result = Diff21(n);

    System.out.print("n: " + n + ", Expected: " + expected +
            ", Result: " + result);

    if (result == expected)
      System.out.println(", Passed!");
    else
      System.out.println(", Failed :(");

  }

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
    testDiff21(6, 15);
    testDiff21(21, 0);
    testDiff21(30, 18);
  }
}
