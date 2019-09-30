package irinka;
import java.util.Scanner;
public class ClassC {
    public int a,b,c;
    public void First(){
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
    }
    public int lastDigit()
    {
        return (a % 10);
    }
    public int firstDigit()
    {
        while (b >= 10)
            b /= 10;
        return b;
    }
    public int SumofC()
    {
        int p,m = 0;
        while(c > 0)
        {
            p = c % 10;
            m += p;
            c = c/10;
        }
        return m;
    }
    public int fifth(){
        return  lastDigit()*firstDigit();
    }
    public void sixth(){
        int six = firstDigit()+fifth();
        System.out.println(six);
    }
}
