class demo{
  static{
      System.out.println("this is static block");
  }
}
public class Practice {
    public static void main(String[] args){
      System.out.println("hello");
      demo x = new demo();
    }
    {
      System.out.println("this is init block");
    }
}
