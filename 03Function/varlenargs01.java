//  varriable h arguments
// know as varagrs

import java.util.Arrays;

class varlenargs01
{
  public static void main(String[] args)
  {
    fun(5,8,7,96,85,52,29,62,28,41);      // 1.we can use n no. of the parameters without the declaration of data type

    str("harshal","harry","jay","india"); // 2.we can use n no. of the parameters without the declaration of data type

    multiple(25,95,"india","usa","japan","nepal");
  }
  static void fun(int ...n)
  { 
    System.out.println(Arrays.toString(n));  
  }

  static void str(String ...x)
  {
    System.out.println(Arrays.toString(x));
  } 

  static void multiple(int a, int b,String ...z)
  {
    System.out.println(a);
    System.out.println(b);
    System.out.println(Arrays.toString(z));

  }
}
