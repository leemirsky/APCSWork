public class parrotTrouble
{

  public static boolean parrotTrouble(boolean talking, int hour)
  {
    boolean result = false;

  if (talking == true && (hour < 7 || hour > 20))
    result = true;

  else
    result = false;

  return result;
  }

  public static void main(String[] args)
  {
    System.out.println("talking, 6: " + parrotTrouble(true, 6));
    System.out.println("talking, 10: " + parrotTrouble(true, 10));
    System.out.println("not talking, 6: " + parrotTrouble(false, 6));
    System.out.println("not talking, 10: " + parrotTrouble(false, 10));
  }

}
