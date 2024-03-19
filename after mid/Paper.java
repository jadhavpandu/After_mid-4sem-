class exam{
    static{
        System.out.println("static block 1:exam");
    }
    exam(){
        System.out.println("exam xonstructor");
    }
    {
        System.out.println("int it block exam");
    }
    static{
        System.out.println("static block 2 : exam");
    }
}
class midterm extends exam{
    static{
        System.out.println("static block 1: midterm");
    }
    midterm(){
        System.out.println("midterm constructor");
    }
    // public String to String(){
    //    return "midterm";
    // }
    static {
         System.out.println("static block 2: midterm");
    }
}
public class Paper {
    public static void main(String[] args) {
        System.out.println("wecome to mid term examination");
        exam Exam = new exam();
        midterm javaprogrammming=new midterm();
        System.out.println("javaprogramming");
       // Paper a = new Paper();
    }
    {
        System.out.println("init block midterm");
    }
}
