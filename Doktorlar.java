package hastaneProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Doktorlar extends VeriBankasi {

    String isim="";
    String soyIsim="";
    String unvan="";
    int baslangic=0;
    public static List<Doktorlar> doktorlarList=new ArrayList<>();

    public Doktorlar(String isim, String soyIsim, String unvan, int baslangic) {
        this.isim = doctorIsimleri[baslangic];
        this.soyIsim = doctorSoyIsimleri[baslangic];
        this.unvan = unvanlar[baslangic];
        this.baslangic = baslangic;


    }

    public static void main(String[] args) {
        String isim="";
        String soyIsim="";
        String unvan="";
        int baslangic=0;

        Doktorlar doktor1=new Doktorlar(isim,soyIsim,unvan,baslangic);
        Doktorlar doktor2=new Doktorlar(isim,soyIsim,unvan,1);
        Doktorlar doktor3=new Doktorlar(isim,soyIsim,unvan,2);
        Doktorlar doktor4=new Doktorlar(isim,soyIsim,unvan,3);
        Doktorlar doktor5=new Doktorlar(isim,soyIsim,unvan,4);
        Doktorlar doktor6=new Doktorlar(isim,soyIsim,unvan,5);


        doktorlarList.add(doktor1);
        doktorlarList.add(doktor2);
        doktorlarList.add(doktor3);
        doktorlarList.add(doktor4);
        doktorlarList.add(doktor5);
        doktorlarList.add(doktor6);

        doktorBul(doktorlarList);


    }

    public static void doktorBul(List<Doktorlar> doktorlarList) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen rahatsızlığınızı belirtiniz.");

        String rahatsizlik = scan.next();

        String yonlendirilecekBolum="";

        for (int i = 0; i < doktorlarList.size(); i++) {
            if(rahatsizlik.equals("Allerji")){yonlendirilecekBolum="Allergist";}
            else if(rahatsizlik.equals("Bas agrisi")){yonlendirilecekBolum="Norolog";}
            else if(rahatsizlik.equals("Diabet")){yonlendirilecekBolum="Genel cerrah";}
            else if(rahatsizlik.equals("Soguk alginligi")){yonlendirilecekBolum="Cocuk doktoru";}
            else if(rahatsizlik.equals("Migren")){yonlendirilecekBolum="Dahiliye";}
            else if(rahatsizlik.equals("Kalp hastaliklari")){yonlendirilecekBolum="Kardiolog";}



            if (doktorlarList.get(i).unvan == yonlendirilecekBolum) {
                System.out.println("İsim: "+doktorlarList.get(i).isim);
                System.out.println("Soyisim: "+doktorlarList.get(i).soyIsim);
                System.out.println("Rahatsizlik: "+doktorlarList.get(i).unvan);}

    }
}}
