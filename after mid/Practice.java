class Suzuki{
  public void red_car(){
    System.out.println("Suzuki is the red color");
  }
  public void blue_car(){
    System.out.println("Suzuki is the blue color car");
  }
}
class maruti extends Suzuki{
  public void red_car(){
    System.out.println("maruti is the red color");
  }
  public void blue_car(){
    System.out.println("maruti is the blue color car");
  }
}
class tata extends Suzuki{
  public void red_car(){
    System.out.println("tata is the red color");
  }
  public void blue_car(){
    System.out.println("tata is the blue color car");
  }
}
class promotion{
  public void release(Suzuki rr){
     rr.red_car();
     rr.blue_car();
  }
}
public class Practice {
    public static void main(String[] args){
     maruti a = new maruti();
     tata b = new tata();
    promotion c = new promotion();
     c.release(a);
     c.release(b);

     
     

    }
}
