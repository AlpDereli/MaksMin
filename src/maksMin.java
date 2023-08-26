import java.util.Scanner;
public class maksMin {
    public static void main(String[] args) {
        System.out.println("Please enter the number of numbers: ");
        Scanner take = new Scanner(System.in);
        int num = take.nextInt();
        int maks = 0, min = 0;
        for(int i = 0; i<num;i++)
        {
            System.out.println("Number: ");
            int sayi = take.nextInt();
            if(sayi > 0 && min == 0)
            {
                min =sayi;
            }
            if(sayi<0 && maks ==0)
            {
                maks=sayi;
            }
            if (sayi <= min)
            {
                min = sayi;
            }
            if (sayi>=maks)
            {
                maks = sayi;
            }
        }
        System.out.println("Maks: " + maks);
        System.out.println("Min: " + min);
    }
}
