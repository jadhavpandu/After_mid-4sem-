class demo{
  int x, y;
  demo(){
    System.out.println("zero parameters constructor");
  }
  demo(int x , int y){
    System.out.println("x");
    System.out.println("y");
  }
}
class demo1 extends demo{
  int a ,b;
  demo1(){
    super();
     System.out.println("this is child class of demo class");
  }
  demo1(int a , int b ){
    this();
     System.out.println("a");
     System.out.println("b");
  }
  }

public class Super{
  public static void main(String[] args) {
    //demo1 sub = new demo1();
    demo1 sub1 = new demo1(2,5);
  }
}