public class TestShape
{
   public static void main(String args[])
   {
      Circle c1=new Circle();
      Circle c2=new Circle(11);
      System.out.println("\nFirst Circle....\n"+c1);
      System.out.println("\nSecond Circle...\n"+c2);

      Rectangle r1=new Rectangle();
      Rectangle r2=new Rectangle(6,7);
      Rectangle r3=new Rectangle(8,9,"Red",true);
      System.out.println("\nFirst Rectangle....\n"+r1);
      System.out.println("\nSecond Rectangle...\n"+r2);
      System.out.println("\nThird Rectangle...\n"+r3);
     
     
      Square s1=new Square();
      Square s2=new Square(11);
      System.out.println("\nFirst Square....\n"+s1);
      System.out.println("\nSecond Square...\n"+s2);
      Square s3=new Square(20,"Green",true);
      System.out.println("\n\nThird Square Details...\n"+s3);
      
   }
  
}