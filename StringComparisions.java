
public class StringComparisions{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="deepak";
		String s2="amit";	//false
		//String s2="Deepak";	//false
		// String s2="deepak";	// true
		System.out.println(s1.equals(s2));
	
		String s3="deepak";
	//	String s4="amit";	//false
	//	String s4="deepak";	//true
		String s4="Deepak";	//true
		System.out.println(s3.equalsIgnoreCase(s4));
	}
}
