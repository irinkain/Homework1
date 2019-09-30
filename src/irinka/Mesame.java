package irinka;
import java.util.Random;
import java.util.Scanner;
public class Mesame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        Random Rnum = new Random();
        int Even = 0;
        int Odd = 0;
        int SumEvens = 0;
        int SumOdds = 0;
        if (a > b) {
            int k = a;
            a = b;
            b = k;
        }
        for(int i = 1; i<=40; i++ ){
            int Rannum = Rnum.nextInt(b)+a;
            if(Rannum%2==0){
                Even+=1;
                SumEvens+=Rannum;
            }
            else{
                Odd+=1;
                SumOdds+=Rannum;
            }
        }
        System.out.println("ლუწები "+Even);
        System.out.println("კენტები" +Odd);
        System.out.println("ლუწების ჯამი" + SumEvens);
        System.out.println("კენტების ჯამი" + SumOdds);

        for(int j = 0; j<5; j++){
            System.out.println(new Random().nextInt(b - a + 1) + a);
        }
    }
}