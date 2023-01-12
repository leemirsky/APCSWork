public class nearHundred
{

  public static boolean nearHundred(int n)
  {
  boolean result = false;

  if (((n >= 90) && (n <= 110)) || ((n >= 190) && (n <= 210)))
    result = true;

  else
    result = false;

  return result;
  }

  public static void main(String[] args)
  {
    System.out.println("n = 93: " + nearHundred(93));
    System.out.println("n = 90: " + nearHundred(90));
    System.out.println("n = 89: " + nearHundred(89));
  }

}
