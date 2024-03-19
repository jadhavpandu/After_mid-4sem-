class demo{
    int age;
    String name;
    demo(){
        this(19);
        System.out.println("this is default constructor");
        age = 18;
        name = "dhoni";
    }
    demo(int age){
        this(20,"anushka");
        this.age = age;
        name ="virat";
        dispaly();
    }
    demo(int age, String name){
        this.age=age;
        this.name=name;
        dispaly();
    }
    public void dispaly(){
     System.out.println(age);
     System.out.println(name);
    }
 }
 
 public class This {
     public static void main(String[] args) {
        demo sub = new demo();
         sub.dispaly(); 
     }
 }
 