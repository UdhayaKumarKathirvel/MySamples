class message
{
	public static void main(String a[])
	{
	try
	{
	for(int i=0;i<Integer.parseInt(a[0]);i++)
	{
	  Thread.sleep(1000);
	  System.out.println(i);
	}
	}catch(Exception e)
	{}
	}
}