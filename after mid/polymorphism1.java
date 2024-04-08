 class Forest{
    public void Animals(){
       System.out.println("we are animas we live in forest");
    }
    public void Birds(){
        System.out.println("we are birds we flew in forest");
    }
 }
 class Jungle extends Forest{
    public void Animals(){
        System.out.println("we are animas we hunt other animals for our food ");
     }
     public void Birds(){
         System.out.println("we are birds we eat tiny insects and nuts and fruits");
     }
  }
  class Amazon extends Forest{
    public void Animals(){
        System.out.println("various varities of animals are present ");
     }
     public void Birds(){
         System.out.println("thouands types of animals are present");
     }
  }
 

public class polymorphism1 {
   public static void main(String[] args) {
    Forest sub;
    Jungle sub2 = new Jungle();
    Amazon sub3 = new Amazon();
     sub=sub2;
     sub.Animals();
     sub.Birds();
     System.out.println("..................");
     sub=sub3;
     sub.Animals();
     sub.Birds();

    
   }  
}
