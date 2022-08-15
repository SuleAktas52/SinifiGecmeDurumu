import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        double Matematik, Fizik, Turkce, Kimya, Muzik;

        Scanner input= new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        Matematik=input.nextDouble();
        if((Matematik < 0) || (Matematik > 100)){
            System.out.println("Gecersiz Not");
        }

        System.out.print("Fizik notunuzu giriniz: ");
        Fizik=input.nextDouble();
        if((Fizik < 0) ||  (Fizik > 100)){
            System.out.println("Gecersiz Not");
        }

        System.out.print("Turkce notunuzu giriniz: ");
        Turkce=input.nextDouble();
        if((Turkce < 0) || (Turkce > 100)){
            System.out.println("Gecersiz Not");
        }

        System.out.print("Kimya notunuzu giriniz: ");
        Kimya=input.nextDouble();
        if((Kimya < 0) || (Kimya > 100)){
            System.out.println("Gecersiz Not");
        }

        System.out.print("Muzik notunuzu giriniz: ");
        Muzik=input.nextDouble();
        if((Muzik < 0) || (Muzik > 100)){
            System.out.println("Gecersiz Not");
        }

        double ortalama= (Matematik+Fizik+Turkce+Kimya+Muzik)/5;

        System.out.println("Ortalamaniz: " + ortalama);

        if (ortalama>55 && ortalama<=100){
            System.out.println("Sinifi Gectiniz!!");
        }
        else if(ortalama<=55 && ortalama>0){
            System.out.println("Sinifi Gecemediniz..");
        }
        else {
            System.out.println("Gecersiz Not ve Ortalama ");
        }

    }
}
