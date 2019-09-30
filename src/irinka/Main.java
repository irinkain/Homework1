package irinka;

public class Main {

    public static void main(String[] args) {
        ClassC c = new ClassC();
        c.First();
        System.out.println(c.lastDigit());
        System.out.print(c.firstDigit());
        System.out.println(c.SumofC());
        System.out.println(c.fifth());
        c.sixth();
        ClassA a = new ClassA();
        a.First();
        a.Second();
        a.Third();
        ClassB b = new ClassB();
        b.first();
        System.out.println(b.print());
    }
}
