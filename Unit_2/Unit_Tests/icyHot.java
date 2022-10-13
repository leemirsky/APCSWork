public class icyHot
{

  public static void testIcyHot(int temp1, int temp2, boolean expected)
  {
    boolean result = icyHot(temp1, temp2);

    System.out.print("Temp 1: " + temp1 + " Temp 2: " + temp2 +
            " Expected: " + expected + " Result: " + result);

    if (result == expected)
      System.out.println(" Passed!");
    else
      System.out.println(" Failed :(");
  }

  public static boolean icyHot(int temp1, int temp2)
  {
    boolean result = false;

    if ((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100))
      result = true;

    else
      result = false;

    return result;
  }

  public static void main(String[] args)
  {
    testIcyHot(120, -1, true);
    testIcyHot(-1, 120, true);
    testIcyHot(2, 120, false);
  }

}
