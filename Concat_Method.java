
		// by using BODMAS rule
// Concat() and join() method
public class Concat_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Deepanjali";
		String s2="Ishte";
		
		System.out.println(s1+s2);	//DeepanjaliIshte
		System.out.println(s1+10);	//Deepanjali10
		System.out.println(s1+10+20);	// Deepanjali1020
		System.out.println(s1+10+s2+20);	//Deepanjali10Ishte20
		System.out.println(10+s1+20);	//10Deepanjali20
		System.out.println(10+20+s1);	// 30Deepanjali
		System.out.println(s1+20/2);
		System.out.println(s1+20*10);
		// System.out.println(s1+10-20);		// providing error
	
			System.out.println(s1.concat(s2));	//Deepanjali Ishte
			// Concat method
			System.out.println(String.join(";",s1,s2, s1));
				//join method
	}

}
