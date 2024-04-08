abstract class Aeroplane{
   abstract public void cargoplane();
   abstract public void passangerplane();
}
class motor extends Aeroplane{
    public void cargoplane(){
        System.out.println("this is cargo plane");
    }
    public void passangerplane(){
        System.out.println("this is passanger plane");
    }
    public void demo(){
        System.out.println("this is demo class");
    }
}
public class Abstraction1 {
    public static void main(String[] args) {
        Aeroplane s = new motor();
        s.cargoplane();
        s.passangerplane();
        ((motor)s).demo();


    }
}