// subSequence() and substring()
public class SubSequence_Method {
	public static void main (String[]args)
	{
		String s1= "This is demo";
		
		System.out.println(s1.subSequence(3, 9));
		// subSequence() method
		System.out.println(s1.substring(3));
		// substring() method
		System.out.println(s1.substring(3, 11));
	//	System.out.println(s1.substring(6, -1));	// Show error
		// provide String bound exception
		System.out.println(s1.substring(0,0));
		
	}
}
