package design_patterns.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        SingletonService singletonService = SingletonService.getInstance();
        System.out.println(singletonService);
        singletonService.print();
        SingletonService singletonServiceOther = SingletonService.getInstance();
        System.out.println(singletonServiceOther);
    }
}
