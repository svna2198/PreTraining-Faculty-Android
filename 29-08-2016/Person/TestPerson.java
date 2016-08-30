public class TestPerson
{
   public static void main(String args[])
   {
     Person p1=new Person("nagajaneyulu","vijayawada");
     System.out.println("Name....="+p1.getName());
     System.out.println("Addres....="+p1.getAddress());
     System.out.println(p1);
     
     Student s1=new Student("vijay","mylavaram","B.Tech",2,45000);
     System.out.println(s1);
     
     Staff sf1=new Staff("Dr.S.Naganjaneyulu","Professor Department of IT","Lakireddy Balireddy College of Engineering",75000);
     System.out.println(sf1);
   }
} 