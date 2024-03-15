class string1{
    public static void main(String[] args){
       // String a = "hello";
        //String b = new String("hello");
         /* == operator check the reference of the 
        string weather the string reference are 
         equall or not*/
       // System.out.println(a==b);
       // a.equals(b);
        /* equals() check the content of the String weather they are equall or not */
       // System.out.println(a.equals(b));


        String block1 = "dhoni";
        String block2 = "dhoni";
        String block3 = "dhoni";
        String block4 = new String("gill");
        String block5 = new String("jayswal");
        /*== chect the weather the refences are equall or not*/
        System.out.println(block1==block2);   //true
         System.out.println(block2==block3);  //true
          System.out.println(block3==block1);  //true
           System.out.println(block1==block4);  //false
           System.out.println(block1==block5);   //false
            System.out.println(block2==block4);  //false
             System.out.println(block3==block5);  //false
             System.out.println("\n");
        /* equals() to chect the content of objects*/
         System.out.println(block1.equals(block2));  //false
          System.out.println(block1.equals(block3));  //false
           System.out.println(block1.equals(block4)); //false
               
    }
}