public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args){
        System.out.println(EagerSingleton.getInstance());
    }

}
