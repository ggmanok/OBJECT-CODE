package Java08;
class CSphere
{
   private int a;   
   private int b;  
   private int c;   
   private int radius;   

    void setLocation(int x, int y, int z)
   {
    a = x ;              
    b = y ;
    c = z ;
   }
   void setRadius(int r)
   {
    radius=r;
   }
   double surfaceArea()
   {
    return (double)4*3.1416*radius*radius*radius;
   }
   double volume()
   {

	return ((double)(3.0/4)*3.1416*radius*radius*radius);
	   }
	void showCenter()
	   {
 System.out.println("a="+a+", b="+b+", c="+c);
	   }
}
  public class Class16
  {
   public static void main(String args[])
   {
   CSphere cs=new CSphere();
   
   cs.setLocation(3,4,5);
   cs.setRadius(1);
   cs.showCenter();
   System.out.println("surface area="+cs.surfaceArea());
   System.out.println("volume="+cs.volume());
    }
  }