public class icyHot
{

  public static void testIcyHot(int temp1, int temp2)
  {
    
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
    System.out.println("120, -1: " + icyHot(120, -1) + ", expected: true");
    System.out.println("-1, 120: " + icyHot(-1, 120) + ", expected: true");
    System.out.println("2, 120: " + icyHot(2, 120) + ", expected: false");
  }

}
