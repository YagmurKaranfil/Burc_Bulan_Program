import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /* Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart*/

        int month, day;
        String horoscope="";
        boolean isError=false;

        Scanner input=new Scanner(System.in);

        System.out.print("Doğduğunuz ayı girin : ");
        month=input.nextInt();
        if(month>12)
            System.out.println("Yanlış değer girdiniz. Tekrar deneyin");
        month=input.nextInt();


        System.out.print("Doğduğunuz günü girin : ");
        day=input.nextInt();
        if(day>31)
            System.out.println("Yanlış değer girdiniz. Tekrar deneyin");
        day=input.nextInt();

        if(month==1){
            if(day>=1 && day<=31)
            {
                if(day<22)
                {
                    horoscope="Oğlak";
                }
                else
                {
                    horoscope="Kova";
                }
            }else {
                isError=true;
            }
        }

        if(month==2){
            if(day>=1 && day<=28)
            {
                if(day<20)
                {
                    horoscope="Kova";
                }
                else
                {
                    horoscope="Balık";
                }
            }else {
                isError=true;
            }
        }

        if(month==3){
            if(day>=1 && day<=31)
            {
                if(day<21)
                {
                    horoscope="Balık";
                }
                else
                {
                    horoscope="Koç";
                }
            }else {
                isError=true;
            }
        }

        if(month==4){
            if(day>=1 && day<=31)
            {
                if(day<21)
                {
                    horoscope="Koç";
                }
                else
                {
                    horoscope="Boğa";
                }
            }else {
                isError=true;
            }
        }

        if(month==5){
            if(day>=1 && day<=31)
            {
                if(day<22)
                {
                    horoscope="Boğa";
                }
                else
                {
                    horoscope="İkizler";
                }
            }else {
                isError=true;
            }
        }

        if(month==6){
            if(day>=1 && day<=31)
            {
                if(day<23)
                {
                    horoscope="İkizler";
                }
                else
                {
                    horoscope="Yengeç";
                }
            }else {
                isError=true;
            }
        }

        if(month==7){
            if(day>=1 && day<=31)
            {
                if(day<23)
                {
                    horoscope="Yengeç";
                }
                else
                {
                    horoscope="Aslan";
                }
            }else {
                isError=true;
            }
        }

        if(month==8){
            if(day>=1 && day<=31)
            {
                if(day<23)
                {
                    horoscope="Aslan";
                }
                else
                {
                    horoscope="Başak";
                }
            }else {
                isError=true;
            }
        }

        if(month==9){
            if(day>=1 && day<=31)
            {
                if(day<23)
                {
                    horoscope="Başak";
                }
                else
                {
                    horoscope="Terazi";
                }
            }else {
                isError=true;
            }
        }

        if(month==10){
            if(day>=1 && day<=31)
            {
                if(day<23)
                {
                    horoscope="Terazi";
                }
                else
                {
                    horoscope="Akrep";
                }
            }else {
                isError=true;
            }
        }

        if(month==11){
            if(day>=1 && day<=31)
            {
                if(day<22)
                {
                    horoscope="Akrep";
                }
                else
                {
                    horoscope="Yay";
                }
            }else {
                isError=true;
            }
        }

        if(month==12){
            if(day>=1 && day<=31)
            {
                if(day<22)
                {
                    horoscope="Yay";
                }
                else
                {
                    horoscope="Oğlak";
                }
            }else {
                isError=true;
            }
        }

        if(isError)
        {
            System.out.println("Hatalı giriş yaptınız. Tekrar deneyin");
            month=input.nextInt();
            day=input.nextInt();
        }
        else
            System.out.println("Burcunuz : "+horoscope);
    }
}