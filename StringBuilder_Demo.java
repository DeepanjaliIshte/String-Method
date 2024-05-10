
public class StringBuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();	
		System.out.println(sb.capacity());	// 16
		
		sb.append("hello");
		System.out.println(sb.capacity());	// 16
		
		sb.append("deepanjali ishte");
		System.out.println(sb.capacity());		//(old capacity*2)+2 or (old capacity+1)*2
												// (34*2)+2=70
		
		StringBuilder sb1=new StringBuilder("Deepanjali");
		System.out.println(sb1.append("hi"));
		
		StringBuilder sb2=new StringBuilder("deepanjali");
		System.out.println(sb2.charAt(5));
		
		StringBuilder sb3=new StringBuilder("deepanjali");
		System.out.println(sb3.delete(3, 7));
		

		StringBuilder sb4=new StringBuilder("deepanjali");
		System.out.println(sb4.deleteCharAt(4));
		

		StringBuilder sb5=new StringBuilder("deepanjali");
		System.out.println(sb5.equals(sb1));
		

		StringBuilder sb6=new StringBuilder("deepanjali");
		StringBuilder sb7=sb6.append("hi");
		System.out.println(sb6.equals(sb7));
		
		

		StringBuilder sb8=new StringBuilder("deepanjali");
		System.out.println(sb8.lastIndexOf("i"));
		

		StringBuilder sb9=new StringBuilder("deepanjali");
		System.out.println(sb9.insert(5,"sss"));
		

		StringBuilder sb10=new StringBuilder("deepanjali");
		System.out.println(sb10.replace(4, 6, "s"));
		

		StringBuilder sb11=new StringBuilder("deepanjali");
		System.out.println(sb11.reverse());
		

		StringBuilder sb12=new StringBuilder("deepanjali");
		System.out.println(sb12.subSequence(4, 7));
		

		StringBuilder sb13=new StringBuilder("deepanjali");
		System.out.println(sb13.substring(5,8));
		

		StringBuilder sb14=new StringBuilder("deepanjali");
		System.out.println(sb14.capacity());
		sb14.ensureCapacity(100);
		System.out.println(sb14.capacity());
		

		StringBuilder sb15=new StringBuilder("deepanjali");
		sb15.setCharAt(5,'s');
		System.out.println(sb15);
	
		StringBuilder sb16=new StringBuilder("deepanjali");
		sb16.setLength(7);
		System.out.println(sb16);
		 
		StringBuilder sb17=new StringBuilder("deepanjali");
		sb17.setCharAt(5,'s');
		System.out.println(sb17);
		
		StringBuilder sb18=new StringBuilder();
		sb18.ensureCapacity(100);
		sb18.append("Deepanjali");
		sb18.trimToSize();
		System.out.println(sb18.capacity()	);
	
	}
}
