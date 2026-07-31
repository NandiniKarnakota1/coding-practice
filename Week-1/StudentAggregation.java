public class StudentAggregation {
    String sname;
    int sid;
    double cgpa;
    LaptopAggregation laptop;

    StudentAggregation(String sname,int sid,double cgpa){
        this.sname = sname;
        this.sid = sid;
        this.cgpa = cgpa;
    }

    //helper method used for lazy instantiation.
    public void addLaptop(String brand, double price){
        laptop = new LaptopAggregation(brand,price);
    }

    public void printStudentDetails(){
        System.out.println("Sname: " + sname);
        System.out.println("Sid: " + sid);
        System.out.println("Cgpa: " + cgpa);
    }

    public static void main(String[] args){
        StudentAggregation s1 = new StudentAggregation("Nrusimha Saraswati",100, 9.99);
        s1.addLaptop("Dell",175000);
        s1.printStudentDetails();
        s1.laptop.printLaptopDetails();

    }
}
