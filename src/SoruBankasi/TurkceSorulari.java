package SoruBankasi;

public class TurkceSorulari{

    public SoruBankasi.Sorular soru1;
    public SoruBankasi.Sorular soru2;
    public SoruBankasi.Sorular soru3;
	public SoruBankasi.Sorular soru4;
	public SoruBankasi.Sorular soru5;
    public SoruBankasi.Sorular[] Soru;

	public TurkceSorulari()
	{
		soru1 = new SoruBankasi.Sorular("Türkçe",1,"D","Aşağıdakilerden hangisi istek kipindedir?");
		soru2 = new SoruBankasi.Sorular("Türkçe", 1, "E", "Aşağıdaki cümlelerin hangisinde birden fazla yapım eki kullanılmıştır?");
		soru3 = new SoruBankasi.Sorular("Türkçe",1,"B","Aşağıdaki cümlelerden hangisinde sıfat ya da zarf kullanılmamıştır ?");
		soru4 = new SoruBankasi.Sorular("Türkçe",1,"B","Aşağıdaki cümlelerin hangisinde yazım yanlışı vardır?");
		soru5 = new SoruBankasi.Sorular("Türkçe",1,"D","Aşağıdaki dizelerden hangisinde bugün kelimesi farklı görevde kullanılmıştır?");
		
		soru1.ASikki("Aklına geleni işleme, her ağacı taşlama.");
		soru1.BSikki("Ecel geldi cihana, baş ağrısı bahane.");
		soru1.CSikki("Ak gün ağartır, kara gün karartır.");
		soru1.DSikki("Dilim seni dilim dilim dileyim.");
		soru1.ESikki("Ağır ağır acele etmeli.");


		soru2.ASikki("O gün park çok kalabalıktı.");
		soru2.BSikki("Herkesin kendine göre bir derdi vardır.");
		soru2.CSikki("Elinde bir üzüm salkımıyla çıkageldi.");
		soru2.DSikki("At, binicisini tanıdı ve ona doğru koştu.");
		soru2.ESikki("Suçluluk duygusu, onu rahatsız ediyordu.");
		
		soru3.ASikki("Öğretmenimiz kapağı yırtık bir kitaptan şiirler okudu.");
		soru3.BSikki("Bahçe kapısında, sıra arkadaşımın kardeşi bizi bekliyordu.");
		soru3.CSikki("Eşyaları taşıma işi bittiğinde hepimiz yorulmuştuk.");
		soru3.DSikki("Görevlilerin bulunduğu oda, dışarıya göre oldukça sıcaktı.");
		soru3.ESikki("Çocukların sevincine ortak olmayı, aslında çok isterdim.");
		
		soru4.ASikki("İstanbul’a gelince Ortaköy’ü gezmeye gitmiş.");
		soru4.BSikki("O kötü kazadan sonra Dünya başına yıkılmış.");
		soru4.CSikki("Fark ettin mi, artık derslerinde daha başarılı.");
		soru4.DSikki("İzmirli arkadaşlarıyla tatile gidecekler mi?");
		soru4.ESikki("Anıl tuzlu şeyleri yemeyi sever.");
		
		soru5.ASikki("Bugün hava güzel.");
		soru5.BSikki("Bugün içim içime sığmıyor.");
		soru5.CSikki("Annemden mektup aldım bugün.");
		soru5.DSikki("Unutmayacağım göklerin maviliğini, bir de bugünü.");
		soru5.ESikki("Cümlenin sağlığına duacıyım bugün.");
		
		Soru = new SoruBankasi.Sorular[]{soru1, soru2, soru3, soru4, soru5};

	}


}
