package Java08;
class CBox
{
int l;
int w;
int h;

int volume()
{
return l*w*h;
}
int surfaceArea()
{
return 2*((l*w)+(w*h)+(l*h));
}
void showData()
{
System.out.println("l="+l);
System.out.println("w="+w);
System.out.println("h="+h);
}
void showAll()
{
showData();
System.out.println("surface area="+surfaceArea());
System.out.println("volume="+volume());
}
}

public class Class05
{
public static void main(String args[])
{
CBox box;
box=new CBox();


box.l=3;
box.w=6;
box.h=9;

box.showAll();
}
}