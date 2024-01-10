package GLA.Generics;

interface Printable<T>{
    T print(T a);
}
public class Main {
    public static void main(String[] args) {
        Printable<String> p = (a) -> {
            return a;
        };
        System.out.println(p.print("Dheeraj"));

    }
}
