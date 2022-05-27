package abcdjava;

public class Data

{
 int a=45;      			//instance variable
 static boolean b=true;			//static variable
 
 protected void Demo()
 {
 
	 String name="prajakta";
	 
	 System.out.println(name);  // local variable
	 
 }
 
 public static void main(String[]args)
	
 {
	
	 Data abc=new Data();  			//obj ref.
	System.out.println(abc.a);			// by calling by obj ref
	System.out.println(abc.b);             // by calling by obj ref
		//OR
	System.out.println(b); 						//by direct calling static variable
	abc.Demo();					 				  // by calling by obj ref
	 
 }
	
}






