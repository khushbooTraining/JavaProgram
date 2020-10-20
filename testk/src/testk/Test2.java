package testk;

public class Test2 {
  static void m1()
  {
	  System.out.println("m1");
  }
  
  static int m2()
     {
	  System.out.println("20");
	  return 50;
    }
  
  public static void main(String[] args)
  {
	  m1();
      m1();
	  
	  m2();
	  int x = m2();
	  
	  System.out.println(m2());
  }
 
 
 
}
