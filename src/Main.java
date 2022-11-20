import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<>();

       Permanent p1 = new Permanent(20,4500,2,true,500);
       staff.add(new Employee("EMP1",p1) );
       Permanent p2 = new Permanent(18,4000,0,false,0);
       staff.add(new Employee("EMP2",p2));

       Temporary t1 = new Temporary(25,250,250,25,true);
        staff.add(new Employee("EMP3",t1));
       Temporary t2 = new Temporary(45,450,550,15,false
       );
        staff.add(new Employee("EMP4",t2));

       for (Employee emp : staff){
           System.out.println(emp);
           System.out.println(emp.status.toString());
           System.out.println(emp.status.display());
       }
    }
}