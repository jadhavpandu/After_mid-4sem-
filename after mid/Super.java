class Father{
    public void getFather(){
      System.out.println("I am your father");
    }
}
class Elder extends Father{

}
class Younger extends Elder{

}

public class Super{
  public static void main(String[] args) {
    //demo1 sub = new demo1();
    Younger s = new Younger();
    s.getFather();
  }
}