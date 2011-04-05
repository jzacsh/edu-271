import java.util.*;

public class ArrayExptest
{

	public static void main(String[] args)
	{
		MyArrayList  names = new MyArrayList();
		try
		{
			names.myadd((Object)"Sarah");
			names.myadd((Object)"Bill");
			names.myadd((Object)"Sarah");
			names.myadd((Object)"Dave");
		}
		catch (ArrayExp ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			System.out.println("All Done");
		}	
	}

}