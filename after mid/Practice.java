class demo{
  public int add(int a , int b){
    int result =a+b;
    return result;
  }
  public int add(int a , int b,int c){
    int result =a+b+c;
    return result;
  }

}
 

public class Practice {
    public static void main(String[] args){
       demo obj = new demo();
      int res1 = obj.add(2,3 );
      int res2= obj.add(1,2,3);
        System.out.println(res1);
        System.out.println(res2);
    }
}
