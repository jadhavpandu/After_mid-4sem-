 class demo{
   int age;
   String name;
   demo(){
       System.out.println("this is default constructor");
       age = 18;
       name = "dhoni";
   }
   demo(int age){
       this.age = age;
       name ="virat";
   }
   demo(int age, String name){
       this.age=age;
       this.name=name;
   }
   public void dispaly(){
    System.out.println(age);
    System.out.println(name);
   }
}

public class Const_overloading {
    public static void main(String[] args) {
       demo sub = new demo();
        sub.dispaly();

        demo sub1 = new demo(19);
        sub1.dispaly();

        demo sub2 = new demo(20,"anushka");
        sub2.dispaly();
       
    }
}
