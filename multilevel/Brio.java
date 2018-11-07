public class Brio extends Honda{

   public Brio()
   {
   System.out.println("Honda : Brio");
   }
   public void speed()
   {
   System.out.println("Max: 120Kmph");
   }
   public static void main(String args[])
   {
    Brio obj=new Brio();
    obj.typeMobil();
    obj.brand();
    obj.speed();
   }
}