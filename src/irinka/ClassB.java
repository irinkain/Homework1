package irinka;
import java.util.Scanner;
public class ClassB extends ClassA {
    int y;
    public void first(){
        Scanner input = new Scanner(System.in);
        y = input.nextInt();
    }
    public int print(){
        return x+y;
    }
}
