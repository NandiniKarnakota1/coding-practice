package inheritance.multilevel;

public class College extends University{
    String clgname;
    College(String uname, String clgname){
        super(uname);
        this.clgname = clgname;
    }
    public void printClgName(){
        printUniversity();
        System.out.println("Clg Name: " + clgname);
    }
}
