class MyEmployee{
    private int id;
    private String name;
    private int salary;

    //Parameterized Constructor
    public MyEmployee(String myName, int myId, int mySalary){
        id = myId;
        name = myName;
        salary= mySalary;
    }

    //Parameterized Constructor
    public MyEmployee(String myName){ name = myName; }

    //Default Constructor
    public MyEmployee(){
        id = 69;
        name = "Mr.Beast ";
        salary= 1000;
    }

    public void setName(String n){ this.name = n; }
    public String getName(){ return name; }

    public int getId(){ return id; }
    public void setId(int i){ this.id = i; }

    public int getSalary(){ return salary; }
    public void setSalary(int s){ this.salary= s; }
}

public class Constructor {
    public static void main(String[] args) {
        MyEmployee emp1 = new MyEmployee("Ayush Bansal", 101, 10000);
        System.out.println("1st Constructor");
        System.out.println(emp1.getName());
        System.out.println(emp1.getId());
        System.out.println(emp1.getSalary());
        System.out.println();


        MyEmployee emp2 = new MyEmployee("Mr. Bean");
        System.out.println("2nd Constructor");
        System.out.println(emp2.getName());
        System.out.println();


        MyEmployee emp3 = new MyEmployee();
        System.out.println("3rd Constructor");
        System.out.println(emp3.getName());
        System.out.println(emp3.getId());
        System.out.println(emp3.getSalary());
        System.out.println();
    }
}



