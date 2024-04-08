public class Exceptation {
     public static void main(String[] args) {
        int a = 6;
        int b = 0;
        int result = 0;
        try{
            System.err.println("first in try");
            result = a/b;
            System.out.println("second in try");
        }
        catch(Exception e){
            System.out.println("some thing went wrong");
        }
        System.out.println(result);
     }
}
