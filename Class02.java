package Java08;
class Cbbb
{
double a;
double b;
}

public class Class02
{
public static void main(String args[])
{
Cbbb obj1=new Cbbb();
Cbbb obj2=new Cbbb();
Cbbb avg=new Cbbb();

obj1.a=5.2;
obj1.b=3.9;

obj2.a=6.5;
obj2.b=4.6;

avg.a=(obj1.a+obj2.a)/2;
avg.b=(obj1.b+obj2.b)/2;

System.out.println("obj1.a="+obj1.a+", obj1.b="+obj1.b);
System.out.println("obj2.a="+obj2.a+", obj1.b="+obj2.b);
System.out.println("avg.a="+avg.a+", avg.b="+avg.b);
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

