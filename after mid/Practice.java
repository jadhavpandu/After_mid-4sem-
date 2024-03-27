class demo{
  public void college(){
    System.out.println("this is college");
  }
  public void school(){
    System.out.println("this is school");
  }
}
 class demo1 extends demo{
  public void college(){
    System.out.println("this is college jee and neet preperation");
  }
  public void school(){
    System.out.println("this is school  SSC board preperation");
  }
 } 
public class Practice {
    public static void main(String[] args){
     
    demo1 sub = new demo1();
    sub.college();
    sub.school();
    
    }
}
