package one;

public class Stringclass {
	
	public static void main(String[]args)
	{
		String a="Ahmedabad";
		String b="gujrat";
		
		System.out.println(a.length());
		
		char abc=a.charAt(6);
		System.out.println(abc);
		
		System.out.println(a.replace('d', 'n'));
		
		System.out.println(a.toUpperCase());
		
		System.out.println(a.toLowerCase());
		
		System.out.println(a.isEmpty());
		
		System.out.println(a.startsWith(a));
		
		System.out.println(a.endsWith("d"));
		
		System.out.println(a.concat(b));
}
}