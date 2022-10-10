public class posNeg
{

  public static boolean posNeg(int a, int b, boolean negative)
  {

    boolean result = false;

    if (a < 0 && b < 0 && negative == true)
      result = true;

    else if (a < 0 && b < 0 && negative == false)
      result = false;

    //the below returns TRUE for both negative and false
    else if ((a < 0 || b < 0) && negative == false)
      result = true;

    else
      result = false;

    return result;

  }

  public static void main(String[] args)
  {
    System.out.println("1, -1, false: " + posNeg(1, -1, false) + ", expected: true");
    System.out.println("-1, 1, false: " + posNeg(-1, 1, false) + ", expected: true");
    System.out.println("-4, -5, true: " + posNeg(-4, -5, true) + ", expected: true");
    System.out.println("-4, -5, false: " + posNeg(-4, -5, false) + ", expected: false");
  }

}
