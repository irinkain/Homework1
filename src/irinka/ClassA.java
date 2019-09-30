package irinka;
import java.util.Scanner;
public class ClassA {
    int x;
    public ClassA(){
        System.out.println("Hello");
    }
    public void First(){
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
    }
    public void Second(){
        System.out.println(x + 12);
    }
    public void Third(){
        if(x % 2 == 0)
            System.out.println("ლუწია");
        else
            System.out.println("კენტია");
    }


}
