class demo{
    private int x=13;
   private String name;
    public void setData(int x){
       this. x=x;
    }
    public void getData(){
      System.out.println(x);
    }
}

public class Shadowing {
    public static void main(String[] args) {
      demo sub = new demo();
      sub.setData(3);
      sub.getData(); 
      sub.setData(5);
      sub.getData();  
    }
}
