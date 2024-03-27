class College{
    public void teacher(){
      System.out.println("this is teacher ");
    }
    public void student(){
      System.out.println("this is student class");
    }
}
class School extends College{

}
public class Practice {
    static public void  main(String[] args){
    School sub = new School();
    sub.teacher();
    sub.student();
    
    
    }
}
