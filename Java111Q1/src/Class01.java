
class Cal_area                    // �w�q���OCal_area
{
   int length,heigth,width;
   double pi=3.14159;   
   double radius;
   void set(int x,int y,int z) // �]�w���e��
   {
	   length=x;
       heigth=z;
       width=y;
   }
   void set(double r)         // �]�wradius
   {
      radius=r;
   }
   void set(double r,int x,int y,int z)   // �P�ɳ]�w���e���Pradius
   {
	   length=x;
       heigth=z;
       width=y;
       radius=r;
   }
   void show()
   {
      System.out.println("�b�|="+radius+",�y����n="+pi/4*radius*radius*radius);
      System.out.println("��="+length+" �e="+width+" ��="+heigth+" ��������n="+(2*(length*heigth)+2*(heigth*width)+2*(width*length)));
   }
}

public class Class01
{
   public static void main(String args[])
   {
	  Cal_area cir1=new Cal_area();
      cir1.set(10,4,5,6);   // �I�s��19�檺set()
      cir1.show();
   }
}

