
  class demo{
    public demo(){
        System.out.println("this is parent class");
    }
    public demo( int x, int y){
        System.out.println("this will execute by super()");
    }
  }
  class demo1 extends demo{
    int x,y;
    public void  dallo(){
        System.out.println("this s child class");
    }
  }
public class Super {
    public static void main(String[] args) {
       demo1 a = new demo1(); 
    }
}
