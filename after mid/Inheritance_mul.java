class Father{
    public void getFather(){
      System.out.println("I am your father");
    }
}
class Elder extends Father{
    public void getElder(){
        System.out.println("I am your Elder son");
      }
}
class Younger extends Elder{
    public void getYounger(){
        System.out.println("I am your Younger son");
      }
}

public class Inheritance_mul{
  public static void main(String[] args) {
   Elder p = new Elder();
   p.getFather();
   p.getElder();

    // Younger s = new Younger();
    // s.getFather();
    // s.getElder();
    // s.getYounger();

  }
}