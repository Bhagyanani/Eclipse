package exception2;

public class Exp1 {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println(10/5);
			String[] ar = {"java",".net","php"};
			System.out.println(ar[4]);
			String str="java";
			System.out.println(str.charAt(3));
		String s ="Helo";
		System.out.println(s.charAt(0));
		System.out.println("helo");
		}
		//	System.out.println();
	catch (ArithmeticException ae)
	{
		System.out.println("don't enter zero values here ");
	}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("check your array size");
		}
		catch (StringIndexOutOfBoundsException sie)
		{
			System.out.println("check your  string length");
			}
	catch (NullPointerException  npe)
		{
		System.out.println("please enter a string data to ");
		}
		catch (Exception e)
		{
			System.out.println("check your inputs");
			
		}
		//	System.out.println();
		finally 
		{
			System.out.println("finally.");
		}
		System.out.println("");
		
	
	}
	

}
/*
*try
*catch
*finally
*throws
*throw
*/



















