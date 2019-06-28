package SoruBankasi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {


    public static int cozulenSorular = 0;

    public static void main(String[] args) throws IOException {

        Menu();

    }

    public static void Menu() throws IOException {


        System.out.println("Lütfen bir ders seçiniz: ");
        System.out.println("\n >>Türkçe(1)<< || >>Matematik(2)<< ||  >>Kimya(3)<< || >>Biyoloji(4)<<||Cikis(E)<< \n");

        
        
        while(true)
        {
            Scanner scanner = new Scanner(System.in);
            String Secim = scanner.next();
            
            switch(Secim)
            {
                case "1": KategoriOlustur("Turkce"); break;
                case "2": KategoriOlustur("Matematik"); break;
                case "3": KategoriOlustur("Kimya"); break;
                case "4": KategoriOlustur("Biyoloji"); break;
                default: SonuclariDegerlendir();break;
            }
            

            System.out.println("\n\t");

            Menu();
        }

    }

    public static void SonuclariDegerlendir() throws IOException {

        int dogruSayisi = 0;
        int yanlisSayisi = 0;
        
        
        for(int i = 6; i<=cozulenSorular*6; i=i+6) 
        {

        	//System.out.println("i : "+ i);
        	
        	try (Stream<String> all_lines = Files.lines(Paths.get("src/KullaniciDatasi.txt"))) 
        	{
            	String s = all_lines.skip(i-1).findFirst().get();
            	
            	if (s.compareTo(String.valueOf(1))==0) 
            	{
                    dogruSayisi++;
                } else {
                    yanlisSayisi++;
                }
            	
            }
        }
        
        System.out.println("Yanıtlanan Sorular : " + cozulenSorular);
        System.out.println("Doğru Sayisi : " + dogruSayisi + " ; Yanlış Sayısı : " + yanlisSayisi);


        //satır satır okuyarak kaç doğru kaç yanlış, toplam kaç soru yapmış vs. değerlendir.

        }



    public static void KategoriOlustur(String secim)
    {
        if(secim=="Turkce")
        {
            SoruBankasi.TurkceSorulari sorukategorisi = new SoruBankasi.TurkceSorulari();

            int sorusayisi = sorukategorisi.Soru.length;
            System.out.println("Türkçe Kategorisinde Soru Sayisi : " + sorusayisi + "\n");

            for(int i = 0; i<sorusayisi; i++)
            {


                System.out.println("S"+(i+1)+") "+sorukategorisi.Soru[i]._soru + "\n");
                System.out.println("A) "+sorukategorisi.Soru[i]._a);
                System.out.println("B) "+sorukategorisi.Soru[i]._b);
                System.out.println("C) "+sorukategorisi.Soru[i]._c);
                System.out.println("D) "+sorukategorisi.Soru[i]._d);
                System.out.println("E) "+sorukategorisi.Soru[i]._e);

                System.out.println("\nCevabınız : ");

                Scanner scanner = new Scanner(System.in);
                String cevap=scanner.next();

                sorukategorisi.Soru[i].DosyayaYazdir(cevap,i);
                cozulenSorular++;

            }


        }

        else if(secim=="Matematik")
        {
            SoruBankasi.MatematikSorulari sorukategorisi = new SoruBankasi.MatematikSorulari();

            int sorusayisi = sorukategorisi.Soru.length;
            System.out.println("Matematik Kategorisinde Soru Sayisi : " + sorusayisi + "\n");

            for(int i = 0; i<sorusayisi; i++)
            {


                System.out.println("S"+(i+1)+") "+sorukategorisi.Soru[i]._soru + "\n");
                System.out.println("A) "+sorukategorisi.Soru[i]._a);
                System.out.println("B) "+sorukategorisi.Soru[i]._b);
                System.out.println("C) "+sorukategorisi.Soru[i]._c);
                System.out.println("D) "+sorukategorisi.Soru[i]._d);
                System.out.println("E) "+sorukategorisi.Soru[i]._e);

                System.out.println("\nCevabınız : ");

                Scanner scanner = new Scanner(System.in);
                String cevap=scanner.next();

                sorukategorisi.Soru[i].DosyayaYazdir(cevap,i);
                cozulenSorular++;

            }
        }

        else if(secim=="Biyoloji")
        {
            SoruBankasi.BiyolojiSorulari sorukategorisi = new SoruBankasi.BiyolojiSorulari();

            int sorusayisi = sorukategorisi.Soru.length;
            System.out.println("Biyoloji Kategorisinde Soru Sayisi : " + sorusayisi + "\n");

            for(int i = 0; i<sorusayisi; i++)
            {


                System.out.println("S"+(i+1)+") "+sorukategorisi.Soru[i]._soru + "\n");
                System.out.println("A) "+sorukategorisi.Soru[i]._a);
                System.out.println("B) "+sorukategorisi.Soru[i]._b);
                System.out.println("C) "+sorukategorisi.Soru[i]._c);
                System.out.println("D) "+sorukategorisi.Soru[i]._d);
                System.out.println("E) "+sorukategorisi.Soru[i]._e);

                System.out.println("\nCevabınız : ");

                Scanner scanner = new Scanner(System.in);
                String cevap=scanner.next();

                sorukategorisi.Soru[i].DosyayaYazdir(cevap,i);
                cozulenSorular++;
            }
        }

        else
        {
            SoruBankasi.KimyaSorulari sorukategorisi = new SoruBankasi.KimyaSorulari();

            int sorusayisi = sorukategorisi.Soru.length;
            System.out.println("Kimya Kategorisinde Soru Sayisi : " + sorusayisi + "\n");

            for(int i = 0; i<sorusayisi; i++)
            {


                System.out.println("S"+(i+1)+") "+sorukategorisi.Soru[i]._soru + "\n");
                System.out.println("A) "+sorukategorisi.Soru[i]._a);
                System.out.println("B) "+sorukategorisi.Soru[i]._b);
                System.out.println("C) "+sorukategorisi.Soru[i]._c);
                System.out.println("D) "+sorukategorisi.Soru[i]._d);
                System.out.println("E) "+sorukategorisi.Soru[i]._e);

                System.out.println("\nCevabınız : ");

                Scanner scanner = new Scanner(System.in);
                String cevap=scanner.next();

                sorukategorisi.Soru[i].DosyayaYazdir(cevap,i);
                cozulenSorular++;
            }
        }

    }






}
