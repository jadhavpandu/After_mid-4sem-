class A {
    int x;
    A(){
    
        System.out.println("this is zero parameter constructor");
    }
    A(int x){
       this();
        System.out.println("this is int parameter type");
    }
}
class B extends A{
    B(){
       super(4);
        System.out.println("this is zero parameter of child class");
    }
    B(int x){
       
        System.out.println("this is int parameter type of child class");
    }
}
public class inner{
    public static void main(String[] args) {
      B obj = new B();
      
    }
}