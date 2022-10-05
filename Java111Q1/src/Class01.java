
class Cal_area                    // 定義類別Cal_area
{
   int length,heigth,width;
   double pi=3.14159;   
   double radius;
   void set(int x,int y,int z) // 設定長寬高
   {
	   length=x;
       heigth=z;
       width=y;
   }
   void set(double r)         // 設定radius
   {
      radius=r;
   }
   void set(double r,int x,int y,int z)   // 同時設定長寬高與radius
   {
	   length=x;
       heigth=z;
       width=y;
       radius=r;
   }
   void show()
   {
      System.out.println("半徑="+radius+",球體體積="+pi/4*radius*radius*radius);
      System.out.println("長="+length+" 寬="+width+" 高="+heigth+" 長方體表面積="+(2*(length*heigth)+2*(heigth*width)+2*(width*length)));
   }
}

public class Class01
{
   public static void main(String args[])
   {
	  Cal_area cir1=new Cal_area();
      cir1.set(10,4,5,6);   // 呼叫第19行的set()
      cir1.show();
   }
}

