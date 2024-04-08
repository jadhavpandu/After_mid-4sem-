class Forest {
    public void Animals(){
        System.out.println("we are animals live in the forest");
    }
    public void Birds(){
        System.out.println("we are the birds we flew in the forest");
    }
}
class Jungle extends Forest{
    public void Animals(){
        System.out.println("we are animals live in the Jungle");
    }
    public void Birds(){
        System.out.println("we are the birds we flew in the Jungle");
    }
}
class Amazon extends Forest{
    public void Animals(){
        System.out.println("we are animals live in the Animals");
    }
    public void Birds(){
        System.out.println("we are the birds we flew in the Birds");
    }
}
class Human{

public void display(Forest sub2){
    sub2.Animals();
    sub2.Birds();
    System.out.println(".................");

}
}
public class polymorphism2{
    public static void main(String[] args) {
        Jungle sub = new Jungle();
        Amazon sub1 = new Amazon();
        Human sub2 = new Human();
        sub2.display(sub);
        sub2.display(sub1);

    }
}