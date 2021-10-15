package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mat ve Fiz Problemleri Programı");

        String islemler = "İşlemler...\n" +
                "1. Daire Alanı Hesaplama\n" +
                "2. Ucgen Çevresi Hesaplama\n" +
                "3. 2. Vektörün İç Çarpımını Hesaplama\n" +
                "Çıkış: q";


        while(true){

            System.out.println(islemler);

            System.out.println("İşlemi seçiniz");
            String islem = scanner.nextLine();

            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }

            else if(islem.equals("1")) {

                System.out.println("Dairenin yarıçapı: ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();

                Problem.Matematik.daireAlan(yaricap);

            }

            else if(islem.equals("2")) {
                System.out.println("Kenar1 ");
                int kenar1 = scanner.nextInt();
                System.out.println("Kenar2 ");
                int kenar2 = scanner.nextInt();
                System.out.println("Kenar3 ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();

                Problem.Matematik.ucgenCevresi(kenar1,kenar2,kenar3);


            }

            else if(islem.equals("3")) {

                Vec vec1 = new Vec("Vektor1");
                Vec vec2 = new Vec("Vektor2");


                Problem.Fizik.icCarpim(vec1, vec2);


            }


        }
    }
}
