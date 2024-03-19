class college{
    public void student(){
     System.out.println("student can get admission in college");
    }
    public void faculty(){
        System.out.println("faculty can hire  in college");
       }
}
class admission extends college{
    //method  overiding 
    public void student(){
        System.out.println("Admission will decide on mock test");
       }
       //method specialized
    public void student1(){
        System.out.println("100% placement security");
    }

}
class requirement extends college{
    //method overiding
    public void faculty(){
        System.out.println("faculty will be hire based on P.HD  qualificaion");
       }
    // method specialized
    public void faculty1(){
        System.out.println("well and friendly nature maintained");
    }
}
public class Con_overiding{
    public static void main(String[] args) {
        admission sub = new admission();
        sub.student();
        sub.student1();
        requirement sub1 = new requirement();
        sub1.student();
        sub1.faculty1();
    }
}