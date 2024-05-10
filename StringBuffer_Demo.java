
public class StringBuffer_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		StringBuffer sb=new StringBuffer();	
		System.out.println(sb.capacity());	// 16
		
		sb.append("hello");
		System.out.println(sb.capacity());	// 16
		
		sb.append("deepanjali ishte");
		System.out.println(sb.capacity());		//(old capacity*2)+2 or (old capacity+1)*2
												// (34*2)+2=70
		
		StringBuffer sb1=new StringBuffer("Deepanjali");
		System.out.println(sb1.append("hi"));
		
		StringBuffer sb2=new StringBuffer("deepanjali");
		System.out.println(sb2.charAt(5));
		
		StringBuffer sb3=new StringBuffer("deepanjali");
		System.out.println(sb3.delete(3, 7));
		

		StringBuffer sb4=new StringBuffer("deepanjali");
		System.out.println(sb4.deleteCharAt(4));
		

		StringBuffer sb5=new StringBuffer("deepanjali");
		System.out.println(sb5.equals(sb1));
		

		StringBuffer sb6=new StringBuffer("deepanjali");
		StringBuffer sb7=sb6.append("hi");
		System.out.println(sb6.equals(sb7));
		
		

		StringBuffer sb8=new StringBuffer("deepanjali");
		System.out.println(sb8.lastIndexOf("i"));
		

		StringBuffer sb9=new StringBuffer("deepanjali");
		System.out.println(sb9.insert(5,"sss"));
		

		StringBuffer sb10=new StringBuffer("deepanjali");
		System.out.println(sb10.replace(4, 6, "s"));
		

		StringBuffer sb11=new StringBuffer("deepanjali");
		System.out.println(sb11.reverse());
		

		StringBuffer sb12=new StringBuffer("deepanjali");
		System.out.println(sb12.subSequence(4, 7));
		

		StringBuffer sb13=new StringBuffer("deepanjali");
		System.out.println(sb13.substring(5,8));
		

		StringBuffer sb14=new StringBuffer("deepanjali");
		System.out.println(sb14.capacity());
		sb14.ensureCapacity(100);
		System.out.println(sb14.capacity());
		

		StringBuffer sb15=new StringBuffer("deepanjali");
		sb15.setCharAt(5,'s');
		System.out.println(sb15);
	
		StringBuffer sb16=new StringBuffer("deepanjali");
		sb16.setLength(7);
		System.out.println(sb16);
		 
		StringBuffer sb17=new StringBuffer("deepanjali");
		sb17.setCharAt(5,'s');
		System.out.println(sb17);
		
		StringBuffer sb18=new StringBuffer();
		sb18.ensureCapacity(100);
		sb18.append("Deepanjali");
		sb18.trimToSize();
		System.out.println(sb18.capacity()	);
	}

}
