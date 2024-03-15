class Reversing1{
    public static void main(String[] args){
        String str1 = "hello world";
        String str2 = " ";
        String[] str3 =str1.split(" ");
        for(int i=str3.length-1; i>=0; i--){
          str2 = str2+str3[i] + " ";
        }
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}