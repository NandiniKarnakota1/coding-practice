public class CopyConstructor {
    int x,y;
    public CopyConstructor(int x, int y){
        this.x = x;
        this.y = y;
    }
     CopyConstructor(CopyConstructor other){
        // copyconstructor
        this.x = other.x;
        this.y = other.y;
    }

    public static void main(String[] args){
        CopyConstructor c1 = new CopyConstructor(3,4);
        CopyConstructor c2 = new CopyConstructor(c1);
        c2.x = 100;
        System.out.println(c1.x + " " + c2.x + " " + c1.y + " " + c2.y);
    }

}
