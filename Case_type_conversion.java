
public class Case_type_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Deepanjali";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		//----------------------------------
		//type casting
		int a=10,b=20;
		String s=String.valueOf(a);
		String d=String.valueOf(b);
		System.out.println(a+b);
		System.out.println(s+d);	//concat 
		
		char[] c=name.toCharArray();
		System.out.println(c);
	}

}
