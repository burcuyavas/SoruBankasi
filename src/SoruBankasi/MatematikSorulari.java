package SoruBankasi;

public class MatematikSorulari {

    public SoruBankasi.Sorular soru1;
    public SoruBankasi.Sorular soru2;
    public SoruBankasi.Sorular soru3;
	public SoruBankasi.Sorular soru4;
	public SoruBankasi.Sorular soru5;
	public SoruBankasi.Sorular[] Soru;

	public MatematikSorulari()
	{
		soru1 = new SoruBankasi.Sorular("Matematik",1,"A","A sayısının mutlak değeri 3 olduğuna göre, A yerine gelebilecek sayıların toplamı kaçtır?");
		soru2 = new SoruBankasi.Sorular("Matematik",1,"D","1 ile 100 arasında 3 ve 5 ile bölünebilen kaç tane sayı vardır ? (1 ve 100 dahil değildir.)");
		soru3 = new SoruBankasi.Sorular("Matematik",1,"C","Asagidakilerden hangisi 12' nin asal carpanlarindandir ?");
		soru4 = new SoruBankasi.Sorular("Matematik",1,"D","Aşağıdakilerden hangisi hem 3 hem de 5' e bölünür ?");
		soru5 = new SoruBankasi.Sorular("Matematik",1,"B","30 Ağustos cuma gününe denk geliyorsa 9 eylül hangi güne denk gelir ?");
		
		
		soru1.ASikki("0");
		soru1.BSikki("1");
		soru1.CSikki("2");
		soru1.DSikki("3");
		soru1.ESikki("4");

		soru2.ASikki("3");
		soru2.BSikki("4");
		soru2.CSikki("5");
		soru2.DSikki("6");
		soru2.ESikki("7");
		
		soru3.ASikki("6");
		soru3.BSikki("4");
		soru3.CSikki("2");
		soru3.DSikki("1");
		soru3.ESikki("7");
		
		soru4.ASikki("8350");
		soru4.BSikki("7777");
		soru4.CSikki("1001");
		soru4.DSikki("7305");
		soru4.ESikki("2005");
		
		soru5.ASikki("Cuma");
		soru5.BSikki("Pazartesi");
		soru5.CSikki("Çarşamba");
		soru5.DSikki("Salı");
		soru5.ESikki("Pazar");

		Soru = new SoruBankasi.Sorular[]{soru1, soru2, soru3, soru4, soru5};

	}


}
