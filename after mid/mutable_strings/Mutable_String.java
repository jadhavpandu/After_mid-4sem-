  
class Mutable_String{
    public static void main(String[] args) {
       String str = "pandu";
        str.concat("jadhav");
       System.out.println(str);
       StringBuilder str2 = new StringBuilder("datta");
       System.out.println(str2);
       str2.append("jadhav");
       System.out.println(str2);
       
    }
}