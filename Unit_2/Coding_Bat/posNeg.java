public class posNeg
{

  public static boolean posNeg(int a, int b, boolean negative)
  {

    boolean result = false;

    if (a < 0 && b < 0 && negative == true)
      result = true;

    //the below returns TRUE for both negative and false
    else if ((a < 0 || b < 0) && negative == false)
      result = true;

    else
      result = false;

    return result;

  }

}
