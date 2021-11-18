import java.util.Scanner;

/**
 * @author fatih-git
 */

public class kombinasyon {

    public static void main(String[] args) {

        int n, r, pay=1, payda=1;
        Scanner input=new Scanner(System.in);

        System.out.print("Kombinasyon için n sayısı giriniz: ");
        n= input.nextInt();

        System.out.print("Kombinasyon için r sayısı giriniz: ");
        r= input.nextInt();

        for(int i=n; i>0; i--){
            pay*=i;
        }

        for(int j=r; j>0; j--){
            payda*=j;
        }

        for(int k=(n-r); k>0; k--){
            payda*=k;
        }

        System.out.println(n+"'in "+r+"'li kombinasyonu= "+(pay/payda));

    }

}
