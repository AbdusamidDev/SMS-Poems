package Models

data class Sher(val name: String, val matni: String, var like: Boolean)

object SherListObject {
    lateinit var sevgiList: ArrayList<Sher>
    lateinit var soginchList: ArrayList<Sher>
    lateinit var tabrikList: ArrayList<Sher>
    lateinit var otaOnaList: ArrayList<Sher>
    lateinit var dostlikList: ArrayList<Sher>
    lateinit var hazilList: ArrayList<Sher>
    lateinit var yangilarList: ArrayList<Sher>
    lateinit var saqlanganList: ArrayList<Sher>
    lateinit var list: ArrayList<Sher>
}

fun loadData() {
    SherListObject.list = ArrayList()
    for (i in 0..5) {
        SherListObject.list.add(Sher("Qales", "Hello Word", true))
    }
    SherListObject.sevgiList = ArrayList()
    for (i in 0..5) {
        SherListObject.sevgiList.add(
            Sher(
                "Sevgisiga Yetolmaganlar",
                "Bu dunyoda sevgisiga barcha birdek yetolmas. Boshingizni toshga urib sevgingizni ayblamang . Balki u ham sizni eslab yurak bagrin nimtalar, Aybingizni yashirib siz sevgingizni ayblamang." +
                        " Qiz aytadi yigit aybdor, yigitga esa aksi.  Peshonada yozilgan bor sevgingizni ayblamang. Yillar otib baxtsiz bolsang, baxtsiz korsangiz uni " +
                        "Kimni aybdor bilsangiz ham sevgingizni ayblamang. Taqdiringiz ayro tushdi chidang endi hayot shu," +
                        "Baxtin tilang sevgingizni baxtsiz bolsa azob shu.Hayotiyizda ne tashvishlar korsangizda do` stlarim. Hayotda -ku, Hayolda ham sevgingizni ayblamang .",
                true
            )
        )
    }

    SherListObject.soginchList = ArrayList()
    for (i in 0..5)
        SherListObject.soginchList.add(
            Sher(
                "Sog'inch",
                "Parchagina bulut, Cheksiz osmon, Adir ortidagi yolg'izoyoq yo' l.Barcha tashvishlarni unutib, shodon," +
                        "Qaytgim kelayotir qoshingga butkul.Qismat mayin ichdim - achchiq va taxir, Tuydim ehtirosning samoviy kuchin. " +
                        "Dunyoda odamzod yashamas, axir, Faqat irodasin sinamoq uchun. Parchagina bulut, Cheksiz osmon," +
                        "Adir ortidagi yolg'izoyoq yo' l . Barcha tashvishlarni unutib, shodon, Qayta olsam edi qoshingga butkul .",
                true
            )
        )



    SherListObject.tabrikList = ArrayList()
    for (i in 0..5)
        SherListObject.tabrikList.add(
            Sher(
                "Oshiq derlar meni",
                "Sokin tunda bezota qilib, Eng so'nggilar safida bo' lib. So 'zlarimni guldasta bilib," +
                        "Deyman Tug'ilgan kuningiz bilan! Quvonaman juda judayam, Quvonchizdan quvonar olam . Garchi gullar tutolmasam ham," +
                        "Deyman Tug 'ilgan kuningiz bilan! Bu sherni mehrimni parchash dedim, Har bir misrasini sizga atadim.Tabriklayman sizni azizim singlim," +
                        "Deyman Tug 'ilgan kuningiz bilan! Sizga tilaklari hali ko'p bisyor, Baxtingiz gullasin go 'yoki bahor. Ko 'nglizda qolmasin zarracha g' ubor," +
                        "Deyman Tug 'ilgan kuningiz bilan! Bu balki siz uchun katta sovg'amas, Balki bu umuman sovg'a ham emas. Bilaman baribir bundan quvonas," +
                        " Deyman Tug 'ilgan kuningiz bilan!",
                true
            )
        )

    SherListObject.otaOnaList = ArrayList()
    for (i in 0..5)
        SherListObject.otaOnaList.add(
            Sher(
                "Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                        "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                        "Mayli xijron azobi qiynasin meni,\n" +
                        "O’lsam ham baribir sevaman seni!",
                true
            )
        )

    SherListObject.dostlikList = ArrayList()
    for (i in 0..5)
        SherListObject.dostlikList.add(
            Sher(
                "Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                        "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                        "Mayli xijron azobi qiynasin meni,\n" +
                        "O’lsam ham baribir sevaman seni!",
                true
            )
        )

    SherListObject.hazilList = ArrayList()
    for (i in 0..5)
        SherListObject.hazilList.add(
            Sher(
                "Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                        "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                        "Mayli xijron azobi qiynasin meni,\n" +
                        "O’lsam ham baribir sevaman seni!",
                true
            )
        )

    SherListObject.yangilarList = ArrayList()
    for (i in 0..5)
        SherListObject.yangilarList.add(
            Sher(
                "Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                        "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                        "Mayli xijron azobi qiynasin meni,\n" +
                        "O’lsam ham baribir sevaman seni!",
                true
            )
        )

    SherListObject.saqlanganList = ArrayList()
    for (i in 0..5)
        SherListObject.saqlanganList.add(
            Sher(
                "Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                        "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                        "Mayli xijron azobi qiynasin meni,\n" +
                        "O’lsam ham baribir sevaman seni!",
                true
            )
        )
}