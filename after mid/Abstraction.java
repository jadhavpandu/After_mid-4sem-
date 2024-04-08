 class Forest{
   public void getAnimals(){
System.out.println("this is the forest where animals will live");
    }
    public void getBirds(){
System.out.println("we are birds we live in forest take shelter on tree");
    }
}
class Jungle extends Forest{
    public void getAnimals(){
        System.out.println("this is the jungle where animals will live");
            }
            public void getBirds(){
        System.out.println("we are birds we live in jungle take shelter on tree");
            }
}
class Amazon extends Forest{
    public void getAnimals(){
        System.out.println("this is the Amazon where animals will live");
            }
            public void getBirds(){
        System.out.println("we are birds we live in Amazon take shelter on tree");
            }
}
class display {
    public void getData(Forest sub){
        sub.getAnimals();
        sub.getBirds();

    }
}
public class Abstraction {
    public static void main(String[] args) {
        
    
    Jungle sub1 = new Jungle();
    Amazon sub2 = new Amazon();
    Forest sub = new Forest();
    sub=sub1;
    sub=sub2;
     
}
}
