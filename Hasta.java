package hastaneProjesi;

import java.lang.reflect.Array;
import java.util.*;

public class Hasta extends VeriBankasi {
    int baslangic = 0;
    int ID = 0;
    String isim = "";
    String soyIsim = "";
    String durum = "";
    public static List<Hasta> hastalar = new ArrayList<>();

    public Hasta(int baslangic, String isim, String soyIsim, String durum, int Id) {
        this.ID = hastaIDleri[baslangic];
        this.isim = hastaIsimleri[baslangic];
        this.soyIsim = hastaSoyIsimleri[baslangic];
        this.durum = durumlar[baslangic];
    }

    public static void main(String[] args) {
        int baslangic = 0;
        int ID = 0;
        String isim = "";
        String soyIsim = "";
        String durum = "";

        Hasta hasta1 = new Hasta(0, isim, soyIsim, durum, ID);
        Hasta hasta2 = new Hasta(1, isim, soyIsim, durum, ID);
        Hasta hasta3 = new Hasta(2, isim, soyIsim, durum, ID);
        Hasta hasta4 = new Hasta(3, isim, soyIsim, durum, ID);
        Hasta hasta5 = new Hasta(4, isim, soyIsim, durum, ID);
        Hasta hasta6 = new Hasta(5, isim, soyIsim, durum, ID);


        hastalar.add(hasta1);
        hastalar.add(hasta2);
        hastalar.add(hasta3);
        hastalar.add(hasta4);
        hastalar.add(hasta5);
        hastalar.add(hasta6);

       hastaDurumu(hastalar);


    }

    public static void hastaDurumu(List<Hasta> hastalar) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen durumunu öğrenmek istediğiniz hastanın ID sini giriniz.");

        int hasta = scan.nextInt();

        for (int i = 0; i < hastalar.size(); i++) {


            if (hastalar.get(i).ID == hasta) {
                System.out.println("İsim: "+hastalar.get(i).isim);
                System.out.println("Soyisim: "+hastalar.get(i).soyIsim);
                System.out.println("Rahatsizlik: "+hastalar.get(i).durum);

                if(hastalar.get(i).durum.equals("Allerji")){System.out.println("Yönlendirilecek bölüm: Allerjist");}
                else if(hastalar.get(i).durum.equals("Bas agrisi")){System.out.println("Yönlendirilecek bölüm: Norolog");}
                else if(hastalar.get(i).durum.equals("Diabet")){System.out.println("Yönlendirilecek bölüm: Genel Cerrah");}
                else if(hastalar.get(i).durum.equals("Soguk alginligi")){System.out.println("Yönlendirilecek bölüm: Çocuk doktoru");}
                else if(hastalar.get(i).durum.equals("Migren")){System.out.println("Yönlendirilecek bölüm: Dahiliye");}
                else if(hastalar.get(i).durum.equals("Kalp hastaliklari")){System.out.println("Yönlendirilecek bölüm: Kardiyoji");}

                if(hastalar.get(i).durum.equals("Allerji")){System.out.println("Aciliyet Durumu: yok");}
                else if(hastalar.get(i).durum.equals("Bas agrisi")){System.out.println("Aciliyet Durumu: yok");}
                else if(hastalar.get(i).durum.equals("Diabet")){System.out.println("Aciliyet Durumu: yok");}
                else if(hastalar.get(i).durum.equals("Soguk alginligi")){System.out.println("Aciliyet Durumu: yok");}
                else if(hastalar.get(i).durum.equals("Migren")){System.out.println("Aciliyet Durumu: yok");}
                else if(hastalar.get(i).durum.equals("Kalp hastaliklari")){System.out.println("Aciliyet Durumu: var");}

            }



        }



    }

    }

















