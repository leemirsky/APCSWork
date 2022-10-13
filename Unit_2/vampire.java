public class vampire
{

  public static void testIsVampire(float hour, boolean awake, boolean expected)
  {
    boolean result = isVampire(hour, awake);

    System.out.print("Hour: " + hour + ", Awake: " + awake + ", Result: " +
              result + ", Expected: " + expected);

    if (result == expected)
      System.out.println(", Passed! :)");
    else
      System.out.println(", Failed :(");
  }

  public static boolean isVampire(float hour, boolean awake)
  {
    boolean result = false;

    if (((6 <= hour || hour >= 22) && (awake == false)) || ((hour < 6 || hour > 22)
              && (awake == true)))
      result = true;
    else
      result = false;

    return result;
  }

  public static void main(String[] args)
  {
    testIsVampire(2.5f, true, true);
    testIsVampire(23, true, true);
    testIsVampire(4, false, false);
    testIsVampire(8, false, true);
    testIsVampire(6, true, false);
  }

}
