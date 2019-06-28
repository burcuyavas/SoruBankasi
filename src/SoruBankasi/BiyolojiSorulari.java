package SoruBankasi;

public class BiyolojiSorulari {

    public SoruBankasi.Sorular soru1;
	public SoruBankasi.Sorular soru2;
	public SoruBankasi.Sorular soru3;
	public SoruBankasi.Sorular soru4;
	public SoruBankasi.Sorular soru5;
	public SoruBankasi.Sorular[] Soru;

	public BiyolojiSorulari()
	{
		soru1 = new SoruBankasi.Sorular("Biyoloji",1,"E","Kloroplast sadece ..... hücrelerinde bulunur. Boşluğa ne gelmelidir?");
		soru2 = new SoruBankasi.Sorular("Biyoloji",1,"B","Balıkların kalbi kaç odacıklıdır?");
		soru3 = new SoruBankasi.Sorular("Biyoloji",1,"C","Organik moleküllerden bazıları aşağıdaki gibidir;\r\n" +"I. Glikoz\r\n" +	"II. Riboz\r\n" +"III. Enzim\r\n" +	"IV.B1 vitamini\r\n" +"Bunların hangileri karbonhidrattır?");
		soru4 = new SoruBankasi.Sorular("Biyoloji",1,"A","Aşağıdakilerden hangisinin kimyasal yapısında protein bulunmaz?");
		soru5 = new SoruBankasi.Sorular("Biyoloji",1,"A","İyot çözeltisi aşağıdaki organik moleküllerden hangisine dökülürse mavi renk oluşur?");

		soru1.ASikki("Çekirdek");
		soru1.BSikki("Koful");
		soru1.CSikki("Golgi");
		soru1.DSikki("Lizozom");
		soru1.ESikki("Kloroplast");

		soru2.ASikki("1");
		soru2.BSikki("2");
		soru2.CSikki("3");
		soru2.DSikki("4");
		soru2.ESikki("5");
		
		soru3.ASikki("Yalnız I");
		soru3.BSikki("Yalnız II");
		soru3.CSikki("I ve II");
		soru3.DSikki("II ve III");
		soru3.ESikki("III ve IV");
		
		soru4.ASikki("Hücre çeperi");
		soru4.BSikki("Kloroplast");
		soru4.CSikki("Mitokondri");
		soru4.DSikki("Hormon");
		soru4.ESikki("Enzim");
		
		soru5.ASikki("Glikoz");
		soru5.BSikki("Protein");
		soru5.CSikki("Yağ");
		soru5.DSikki("Glikojen");
		soru5.ESikki("Nişasta");
		

		Soru = new SoruBankasi.Sorular[]{soru1, soru2, soru3, soru4, soru5};
	}

}
