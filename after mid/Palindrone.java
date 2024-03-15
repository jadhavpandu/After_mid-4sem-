//palindrone word which can read same as from staringa and ending
class Palindrone{
    public static void main(String args[]){
        String str1 = "MADAM";
        String str2 = "";
        /*equals() check  the content of string object weather they are equal or not*/
        for(int i=str1.length()-1; i>=0; i--){
            str2 = str2+str1.charAt(i);
        }
        if(str2.equals(str1)){
            System.out.println("it is plaindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
    }
}