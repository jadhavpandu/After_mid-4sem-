class College{
    public void student(){
        System.out.println("student can take  admission ");
    }
    public void facuty(){
        System.out.println("faculty  can hire");
    }
}
class student1 extends College{
    /* this is method overriding concept here the child class nvoke the propetioe of 
     * parent class and methos content will be change
     */
    public void student(){
        System.out.println("admission can get through mock test only ");
    }
}
class faculty1 extends College{
    public void facuty(){
        System.out.println("faculty  will hired through education qulification");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        student1 sub = new student1();
        faculty1 sub1 = new faculty1();
        College res;
        res=sub;
        res=sub1;
        res.student();;
        res.facuty();

    }
}
