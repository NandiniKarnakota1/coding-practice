package inheritance.multilevel;

public class University {
    String uname;
    University(String uname){
        this.uname = uname;
    }
    public void printUniversity(){
        System.out.println("University Name: " + uname);
    }
}
