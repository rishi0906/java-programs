package codepractice;

public class codepractice2 {
int a=10;
	void m1(){
		System.out.println("m1method");
		System.out.println("integer1111 is " +a);
	}
  codepractice2(){
	System.out.println("hello-constructor");
	System.out.println("integer2222 is " +a);
}
  codepractice2(int b){
	System.out.println("argument1 constructor");
	this.a =b;
	
}
  
  
	public static void main(String[] args)
	{
		codepractice2 t =new codepractice2();
		codepractice2 t1=new codepractice2(12);
		t.m1();
	}
	
}
