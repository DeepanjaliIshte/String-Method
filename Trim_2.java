
public class Trim_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="          ";
		if (name.length()==0)
		{
			System.out.println("name is empty");
		}
		else
		{
			System.out.println("valid name");
		}
		
		System.out.println();
		
		
		if (name.trim().length()==0)
		{
			System.out.println("name is empty");
		}
		else
		{
			System.out.println("valid name");
		}
	}

}
