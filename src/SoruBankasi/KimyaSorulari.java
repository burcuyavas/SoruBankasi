package SoruBankasi;

public class KimyaSorulari {

    public SoruBankasi.Sorular soru1;
    public SoruBankasi.Sorular soru2;
    public SoruBankasi.Sorular soru3;
	public SoruBankasi.Sorular soru4;
	public SoruBankasi.Sorular soru5;
	public SoruBankasi.Sorular[] Soru;


	public KimyaSorulari()
	{
		soru1 = new SoruBankasi.Sorular("Kimya",1,"C","ötr bir atomda ilk 15 orbitali tam dolu olup, son 3 orbitalinde de birer elektron vardır. Bu atomun değerlik elektron sayısı kaçtır?");
		soru2 = new SoruBankasi.Sorular("Kimya",1,"B","CH4 ve SO2 gazlarından oluşan bir karışımın 5 molü 224 g ise karışımda kaç mol CH4 vardır? (C:12, H:1, S:32, O:16)");
		soru3 = new SoruBankasi.Sorular("Kimya",1,"A","Aynı tür atomların biraraya gelmesiyle oluşan yapı aşağıdakilerden hangisidir?");
		soru4 = new SoruBankasi.Sorular("Kimya",1,"A","Bir atom bileşik oluştururken elektron dizilimini He atomunun elektron dizilimine benzetiyor. Bu değişim sırasında, atomda aşağıdakilerden hangisi gerçekleşmiştir?");
		soru5 = new SoruBankasi.Sorular("Kimya",1,"A","Aşağıdaki bileşiklerden hangisi türediği alkanın “-an” eki yerine “-en” eki getirilerek adlandırılır?");
		
		
		soru1.ASikki("3");
		soru1.BSikki("4");
		soru1.CSikki("5");
		soru1.DSikki("6");
		soru1.ESikki("7");

		soru2.ASikki("1");
		soru2.BSikki("2");
		soru2.CSikki("3");
		soru2.DSikki("4");
		soru2.ESikki("5");
		
		soru3.ASikki("Element");
		soru3.BSikki("Bileşik");
		soru3.CSikki("Atom");
		soru3.DSikki("Molekül");
		soru3.ESikki("Tuz");
		
		soru4.ASikki("Dublet kuralına uymuştur.");
		soru4.BSikki("Oktet kuralına uymuştur.");
		soru4.CSikki("Son katmandaki elektron sayısı 8 olmuştur.");
		soru4.DSikki("Son katmandaki elektron sayısı 10 olmuştur.");
		soru4.ESikki("Hiçbiri.");
		
		soru5.ASikki("C2H4");
		soru5.BSikki("C2H2");
		soru5.CSikki("C2H6");
		soru5.DSikki("C6H6");
		soru5.ESikki("C3H7");

		Soru = new SoruBankasi.Sorular[]{soru1, soru2, soru3, soru4, soru5};
	}

}
