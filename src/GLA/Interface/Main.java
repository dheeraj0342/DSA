package GLA.Interface;

interface Printable{
    void m1();
    void m2();
}
@FunctionalInterface
interface Drawable{
    void draw();
}

@FunctionalInterface
interface Cal{
    int sum(int a,int b);
}

public class Main {
    public static void main(String[] args) {

/*       Test t = new Test();
        int marks = t.getMarks(3);
       System.out.println(marks);

 */

        // Anonymous Class
        Printable p = new Printable() {
            @Override
            public void m1() {
                System.out.println("method 1 of Printable interface");
            }

            @Override
            public void m2() {
                System.out.println("method 2 of Printable interface");
            }
        };
        p.m1();
        p.m2();

        //Lambda Expression:
        Drawable d = () -> {
            System.out.println("draw");
        };
        d.draw();

        Cal c = (int a , int b) ->{
          return a+b;
        };
        System.out.println("Sum Is:"+(c.sum(2,3)));
    }
}
