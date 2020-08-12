package singleton;

public class Singleton {

    // In OOP Singleton Class is a Class that can have only one object (instance of a class)
    // Make a constructor as private
    // Should have a method as public static and return type of object of the singleton class (lazy initialization)
    private static Singleton singleton_instance = null;
    public String str;

    private Singleton(){
        str= "I am using Singleton class pattern";
    }
    public static Singleton getInstance() {
        if (singleton_instance == null)
            singleton_instance = new Singleton();
            return singleton_instance;

    }
}
