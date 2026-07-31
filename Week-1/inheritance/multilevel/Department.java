package inheritance.multilevel;

public class Department extends College{
    String dname;
    Department(String uname, String clgname, String dname){
        super(uname,clgname);
        this.dname = dname;
    }
    public void printDepartment(){
        printClgName();
        System.out.println("Department Name: " + dname);
    }
}
