package re;

public class Foo {
    static int x = 12;

    public  static void go(final int x) {
        System.out.println(x);
    }


    public static void main(String[] args) {
        Foo a = new Foo();
        a.go(x);
    }
}