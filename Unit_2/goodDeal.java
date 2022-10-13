public class goodDeal
{
  public static void testGoodDeal(double originalPrice, double salePrice,
              boolean expected)
  {
    boolean result = goodDeal(originalPrice, salePrice);

    System.out.print("Original Price: " + originalPrice + ", Sale Price: " +
              salePrice + ", Result: " + result + ", Expected: " + expected);

    if(result == expected)
      System.out.println(", Passed! :)");
    else
      System.out.println(", Failed :(");
  }

  public static boolean goodDeal(double originalPrice, double salePrice)
  {
    boolean result = false;

    if(salePrice < originalPrice * .75)
      result = true;
    else
      result = false;

    return result;
  }

  public static void main(String[] args)
  {
    testGoodDeal(10, 7.5, false);
    testGoodDeal(10, 5, true);
    testGoodDeal(10, 8, false);
  }


}
