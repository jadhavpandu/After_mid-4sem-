class string{
    public static void main(String[] args){
        //immutabl string which cannot be updated
        String a = "hello";
        System.out.println(a);
         a.concat("world");
          System.out.println(a);
          //mutabe string which can be update
          StringBuilder b = new StringBuilder("this");
          System.out.println(b);
          b.append("world");
          System.out.println(b);

          String block1 = "pandu";
          String block2 = "pandu";
          System.out.println(block1==block2);
          String block3 = new String("datta");
          String block4 = new String ("datta");
          System.out.println(block3==block4);
    }
}