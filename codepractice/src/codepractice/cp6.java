package codepractice;

public class cp6 {
	 
    private String name= "not a static name";
    private static String name1 ="stattic name";
    
    public void m1()
    {
    	System.out.println("String is1  " +this.name);
    	System.out.println("String is 2 " +name);
    	System.out.println("String is 3  " +cp6.name1);
        
    }
	
    public  static void m2()
    {
    	System.out.println(cp6.name1);
    	System.out.println(name1);
    	
    }
	
    
    public static void main(String args[]) 
    {
    
    
    cp6 a =new cp6();
    a.m1();
    cp6.m2();
    
  }
}



