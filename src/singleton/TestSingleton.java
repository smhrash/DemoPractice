package singleton;

public class TestSingleton {

    public static void main(String[] args) {

        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        System.out.println(x.str.toUpperCase());
        System.out.println(y.str.toLowerCase());
        System.out.println(z.str);
    }
}
