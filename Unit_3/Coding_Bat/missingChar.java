public class missingChar
{

  public static String missingChar(String str, int n)
  {
    String result = "";

    int length = str.length();

    result = str.substring(0,n) + str.substring(n+1,length);

    return result;
  }

  public static int length(String str)
  {
    int length = str.length();

    return length;
  }

  public static void main(String[] args)
  {
    System.out.println("length test | kitten: " + length("kitten"));
    System.out.println("kitten, 1: " + missingChar("kitten", 1));
    System.out.println("kitten, 0: " + missingChar("kitten", 0));
    System.out.println("kitten, 4: " + missingChar("kitten", 4));
  }

}
