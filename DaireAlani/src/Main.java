import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int r,a;
    double pi=3.14;

        Scanner inp = new Scanner(System.in);

        System.out.println("Yaricap giriniz: ");
        r = inp.nextInt();
        System.out.println("Merkez açisini giriniz: ");
        a = inp.nextInt();

        double dilim = (pi * (r*r) * a)/360;
        System.out.println("Dilimin alanı : " + dilim);
    }
}
