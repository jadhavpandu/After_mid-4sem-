abstract class Taluka{
    abstract public void Srapanch();
    abstract public void Gramseevak();
}
class Village extends Taluka{
    public void Srapanch(){
        System.out.println("Sarpanch  handle the all cases of village ");
    }
    public void Gramseevak(){
        System.out.println("Gramseevak lead the village and documentation of village");
    }
}
class Village1 extends Taluka{
    public void Srapanch(){
        System.out.println(" Duty of Sarpanh to develop the village ");
    }
    public void Gramseevak(){
        System.out.println("Duty of gramseevak to clear the documentation of village people");
    }
}
class demo{
public void demo1(Taluka a){
    a.Gramseevak();
    a.Srapanch();
}
}

public class Abstract {
   public static void main(String[] args) {
    Taluka sub = new Village();
    Taluka sub1 = new Village1();
      demo sub2 = new demo();
      sub2.demo1(sub);
      sub2.demo1(sub1);
    

   } 
}
