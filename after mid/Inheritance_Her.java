class Father{
    public void setFather(){
        System.out.println("I am your Father");
    }
}
//hierarchical inheritance
class Elder extends Father{
    public void setElder(){
        System.out.println("I am your Elder son");
    }
}
class Younger extends Father{
    public void setYounger(){
        System.out.println("I am your Younger son");
    }
}
public class Inheritance_Her {
    public static void main(String[] args) {
        Younger s = new Younger();
        s.setFather();
        s.setYounger();
        
    }
}
