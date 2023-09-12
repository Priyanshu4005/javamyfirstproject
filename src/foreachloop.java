
public class foreachloop {
public static void main( String args[])
{
	int data[]= {16,12,15,20};
	for(int x=0; x<4; x++)
	{
		System.out.println(data[x]);
		}
	for(int a: data)
		System.out.println(a);
	}
}
