import java.util.Scanner;

/**
 * ClassName: Main
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 5/3/2023 12:30 PM
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int a,b,c,max,min;
        Scanner input = new Scanner(System.in);
        System.out.println("Girilen 3 Sayi siralami programmi  ");
        System.out.print("ilik sayi giriniz ");
        a = input.nextInt();
        System.out.print("ikkinci sayi giriniz");
        b = input.nextInt();
        System.out.print("ucuncu sayi giriniz");
        c = input.nextInt();
        max = a;
        if (b > max ){
            max = b;
        }  if (c > max) {
            max = c;
        }
        min = a;
        if (b<min){
            min = b;
        }if (c < min){
            min = c;
        }
        int orta = a + b + c - max - min ;
        System.out.println(max + ">" + orta + ">" + min);
    }
}
