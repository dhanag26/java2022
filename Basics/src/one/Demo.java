package one;

public class Demo {
	

	public static void main(String[]args)
	{
		String name="India is my country";
		String b="country";
		System.out.println(name.contains(b));
		//or
		System.out.println(name.contains("nation"));
	
		boolean bl=name.contains(b);
		
		System.out.println(bl);
		
		System.out.println(name.contains("country"));
	}

}
