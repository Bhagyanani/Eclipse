package exception2;

public class exc3 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
				}
		catch (Exception e)
		{
			//by using get message();
			System.out.println(e.getMessage());
			//by printing exception class object
			System.out.println(e);
			//using print stack Trace()method
			e.printStackTrace();
		}
	}
}
