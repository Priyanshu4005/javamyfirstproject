package oops;

class hello1 {
int x=10;
{
System.out.println("x is" + x);
System.out.println("this x" + this.x);
show();
this.show();
}
void show()
{
	System.out.println("show");
}
}

public class  Thiskeyword {
	public static void main(String args[])
	{
		hello1 a = new hello1();
		a.call();
		
	}
}