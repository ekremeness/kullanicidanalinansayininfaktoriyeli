package info.com;

import java.util.Scanner;

public class faktöriyelHesapla {
    public static void main(String args[]){
        Scanner tarama = new Scanner(System.in);

        System.out.println("bir sayı giriniz");

        int sayi = tarama.nextInt();
        int sonuc = 1;

        if (sayi==0){
            sonuc=1;{

            }
        }else
        for(int i = 1 ;i<=sayi ;i++){
            sonuc = sonuc*i;

        }
        System.out.println(sonuc);


    }

}
