public class Santa {
    private static final Santa instance = new Santa();
    private Santa() {};

    public static Santa getInstance(){
        return instance;
    }

    public void chooseToy(){
        System.out.println("Choose one of the following options.");
        System.out.println("1.Balls");
        System.out.println("2.Motorcycles");
    }
}
