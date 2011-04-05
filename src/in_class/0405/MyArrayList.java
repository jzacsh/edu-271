import java.util.*;

public class MyArrayList extends ArrayList 
{

	public boolean myadd(Object o) throws ArrayExp
	{
		int k, j;
		if (this.isEmpty())
		{
			super.add(o);
		}
		else
		{
			String o1, o2;
			for (k=0;k<this.size()-1 ;k++ )
			{
				
					o1 = (String)this.get(k);
					
					if (o1.equals(o))
					{
						throw new ArrayExp();
					}
				
			}
			this.add(o);
		}
		return(true);
	}
}
