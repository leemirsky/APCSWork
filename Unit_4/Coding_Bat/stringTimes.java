public class stringTimes
{

  public static String stringTimes(String str, int n)
  {

    String result = "";

    if (n >=0)
    {
      for(int i=0; i<n; i++)
      {
        result += str;
      }
      return result;
    }

    else{
      result = "n can't be negative!";
      return result;
    }

  }

  public static void main(String[] args)
  {
    System.out.println("Hi, 4: " + stringTimes("Hi",4));
  }

}
