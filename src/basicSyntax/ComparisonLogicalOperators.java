package basicSyntax;

public class ComparisonLogicalOperators {

    public static void main(String[] args) {
//(1)
      int a = 8;
      int b = 3;
      
      boolean isGreaterA = (a > b);
      System.out.println(isGreaterA);
      
//(2)
      boolean isSunny = true;
      boolean isWarm = true;
      
      boolean andResultA = (isSunny && isWarm);
      System.out.println(andResultA);
      
//(3)
      int x = 3;
      int y = 8;
      
      boolean andResultB = (x >= 0);
      boolean andResultC = (y % 2 == 0 );
      boolean andResultD = (andResultB && andResultC);
      System.out.println(andResultD);
      
//(4)
      boolean hasPermission = false;
      boolean notResult = !(hasPermission);
      System.out.println(notResult);
    }
}
