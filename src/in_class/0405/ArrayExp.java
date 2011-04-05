// Own exception
// Handle duplicate array elements

import java.awt.*;

public class ArrayExp extends Exception
   
{
	
	public ArrayExp()
	{
		super("Duplicate element");
	}
	public ArrayExp(String s)
	{
		super(s);
	}
}
