package SoruBankasi;

import java.io.*;

public class Sorular {

    public String _soru;
    public String kategori;
    public String _a;
    public String _b;
    public String _c;
    public String _d;
    public String _e;
    public int zorluk;
    public String d_cevap;

    public Sorular(String kategori, int zorluk, String dcevap, String soru)
    {
        this.zorluk = zorluk;
        this._soru = soru;
        this.kategori = kategori;
        this.d_cevap = dcevap;
    }

    public void ASikki(String _a){

        this._a = _a;

    }
    public void BSikki(String _b){

        this._b = _b;

    }
    public void CSikki(String _c){

        this._c = _c;

    }
    public void DSikki(String _d){

        this._d = _d;

    }
    public void ESikki(String _e){

        this._e = _e;

    }
    public void DosyayaYazdir(String k_cevap,int i)
    {

        File dosya=new File("src/KullaniciDatasi.txt");

        try {

            //
            /*Her sorunun yazdırılan elemanları dosya içerisinde toplam 6 satır kaplamakta.*/
            //

            FileWriter yazici =new FileWriter(dosya,true);
            
            yazici.write(String.valueOf(i+1));    //sorunun numarası
            yazici.write(("\n"));
            yazici.write(d_cevap);                //sorunun doğru cevabı
            yazici.write(("\n"));
            yazici.write(k_cevap);                //kullanıcının cevabı
            yazici.write(("\n"));
            yazici.write(kategori);               //sorunun kategorisi
            yazici.write(("\n"));
            yazici.write(String.valueOf(zorluk)); //sorunun zorluk derecesi
            yazici.write(("\n"));
            
            System.out.println(d_cevap.compareTo(k_cevap));
            
            if(d_cevap.compareTo(k_cevap) == 0)
            {
                yazici.write(String.valueOf(1));  //sorunun doğru cevaplanmış olması
                yazici.write(("\n"));
            } else {
                yazici.write(String.valueOf(0));  //sorunun yanlış cevaplanmış olması
                yazici.write(("\n"));
            }

            yazici.flush();
            yazici.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
