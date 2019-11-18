package tj.belajar.menumakan

import bersatu.kita.menu.R

object DataMakanan{

    private val namaMakanan = arrayOf(
        "Tahu Bacem",
        "Soto Babat",
        "Nasi Goreng",
        "Ayam Goreng",
        "Bakso",
        "Mie Ayam",
        "Sate Kambing",
        "Tomyam",
        "Ikan Bakar",
        "Gulai",
        "Rica-Rica"
    )
    private val detailMakanan = arrayOf(
        "merupakan sajian panganan dari daerah Jawa Tengah, juga Yogyakarta bagian timur (Mataraman). Orang Yogyakarta menyukai bacem yang bercitarasa manis, yaitu dengan bumbu khas gula merah",
        "Soto bisa dibuat dengan bahan favorit Anda seperti babat yang merupakan jeroan sapi. Sebelum dicampurkan dalam kuah soto, babat harus diolah terlebih dulu agar empuk dan hilang bau tak sedapnya.",
        "Nasi goreng pada umumnya hanya membutuhkan bumbu-bumbu dasar yang ada di dapur. Seperti bawang merah, bawang putih, telur dan nasi putih. Kemudian semua diolah dimasak menjadi satu kesatuan dalam wajan. Meskipun terlihat sederhana, namun menu makanan yang satu ini memiliki cita rasa unik di lidah.",
        "Ayam goreng Nusantara adalah hidangan Asia Tenggara yang merupakan ayam yang digoreng dalam minyak goreng. Dalam dunia internasional, istilah ayam goreng merujuk kepada ayam goreng gaya Nusantara",
        "Bakso atau baso adalah jenis bola daging yang lazim ditemukan pada masakan Indonesia. Bakso umumnya dibuat dari campuran daging sapi giling dan tepung tapioka, akan tetapi ada juga bakso yang terbuat dari daging ayam, ikan, atau udang bahkan daging kerbau",
        "Mi ayam atau bakmi ayam adalah masakan Indonesia yang terbuat dari mi kuning direbus mendidih kemudian ditaburi saos kecap khusus beserta daging ayam dan sayuran. Mi Ayam terkadang ditambahi dengan bakso, pangsit dan jamur. Mi berasal dari Tiongkok tetapi mi ayam yang serupa di Indonesia tidak ditemukan di Tiongkok",
        "Sate kambing adalah sejenis makanan sate terbuat dari daging kambing. Daging kambing tersebut disate dan dibumbui dengan rempah-rempah dan bumbu dapur, kemudian dibakar. Penyajiannya disajikan bersama lalapan kubis, tomat, dan bawang merah yang diiris tipis kemudian diberi kecap dan ditambahkan taburan merica.",
        "Tom yam adalah sup yang berasal dari Thailand. Sup ini merupakan salah satu makanan Thailand yang terkenal. Di Thailand, tom yum biasanya dibuat dengan udang, ayam, ikan, atau makanan laut yang dicampur dan jamur",
        "Ikan bakar adalah hidangan ikan yang dibakar atau dipanggang di atas api atau bara api. Hidangan ikan yang dibakar, muncul secara universal di berbagai belahan dunia.",
        "Gulai adalah masakan berbahan baku daging ayam, aneka ikan, kambing, sapi, jeroan, atau sayuran seperti nangka muda dan daun singkong, yang diolah dalam kuah bumbu rempah yang bercita rasa gurih",
        "Rica-Rica atau terkadang hanya disebut rica adalah jenis bumbu pedas yang ditemukan di masakan Manado dari Sulawesi Utara, Indonesia. Rica-Rica banyak menggunakan potongan cabai, cabai rawit, bawang merah, bawang putih, jahe, garam, dan gula."
    )
    private val gambarMakanan = intArrayOf(


        R.drawable.tahu_bacem,
        R.drawable.soto_babat,
        R.drawable.nasi_goreng,
        R.drawable.ayam_goreng,
        R.drawable.bakso,
        R.drawable.mie_ayam,
        R.drawable.satekambing,
        R.drawable.tomyam,
        R.drawable.ikanbakar,
        R.drawable.gulai,
        R.drawable.ricarica
    )
    private val komposisiMakanan = arrayOf(
        "6 buah tahu putih ukuran kecil\n" +
                "2 lembar daun salam\n" +
                "2 cm lengkuas memarkan\n" +
                "700 ml air kelapa\n" +
                "50 gram gula merah sisir halus\n" +
                "3 sendok makan kecap manis\n" +
                "1 sendok teh asam jawa dan 2 sendok makan air, larutkan\n" +
                "500 ml minyak untuk menggoreng\n",
        "Bawang putih ukuran sedang besar kurang lebih sebanyak 5-6 pcs.\n" +
                "Jahe ukuran sedang kurang lebih sepanjang 2 cm saja.\n" +
                "Garam dapur beryodium secukupnya atau kurang lebih sebanyak 2 sendok kecil saja.\n" +
                "Kemiri yang sudah disangrai sebelumnya kurang lebih sebanyak 4 pcs saja.\n" +
                "Merica butiran yang sudah disangrai sebelumnya kurang lebih sebanyak 1 sendok teh. Bisa diganti juga dengan merica bubuk sesuai selera.\n" +
                "Kunyit kurang lebih sepanjang 2 cm saja.",
        "- Minyak\n" +
                "- Daun bawang 1 batang. Iris halus\n" +
                "- Cabai merah 3 buah\n" +
                "- Daging ayam 125 g. Cincang halus\n" +
                "- Telur 1 butir. Kocok\n" +
                "- Kecap manis 2 sdm\n" +
                "- Bawang merah 5 siung\n" +
                "- Garam 1 sdt\n" +
                "- Merica sdt\n" +
                "- Nasi 600 gr\n" +
                "- Bawang putih 3 siung",
        "1/2 kg daging ayam (potong sesuai selera)\n" +
                "1 sdt garam\n" +
                "4 siung bawang putih\n" +
                "3 cm kunyit \n" +
                "1 sdt ketumbar\n" +
                "Kaldu ayam bubuk (secukupnya)\n" +
                "1 lembar daun jeruk\n" +
                "1 lembar daun salam\n" +
                "1 batang serai (memarkan)",
        "500 gr daging sapi yang segar. Sebaiknya tanpa lemak, sehingga rasa yang didapat makin legit. Disarankan untuk membeli daging di pasar tradisional saat masih pagi, karena dagingnya bisanya baru saja disembelih.\n" +
                "Sekitar 3-5 siung bawang putih, lalu dihaluskan. Jumlah ini tidak baku, boleh saja diperbanyak.\n" +
                "3 siung bawang putih, iris dan goring\n" +
                "Siapkan 150 gr es batu, dalam keadaan sudah dihancurkan. Jika tidak ada, gunakan air es yang SANGAT dingin.\n" +
                "50 ml putih telur. Bila anda menggunakan jasa penggilingan, bahan ini tidak digunakan. Namun, bahan ini penting untuk menambah cita rasa dan kekenyalan.\n" +
                "Garam secukupnya, sekitar 2 sdt\n" +
                "Tepung sagu kering sebanyak 100 gr. Takaran ini tidak baku, bisa lebih banyak atau dikurangi tergantung selera Anda.\n" +
                "Soda kue atau juga bisa menggunakan baking powder, takaran ½ sdt",
        "Kemiri 2 butir\n" +
                "Bawang putih 4 siung\n" +
                "Daun bawang 2 batang, iris halus\n" +
                "Bawang merah 3 siung\n" +
                "Sawi manis 1 ikat, potong-potong\n" +
                "Daging ayam 250 gr, iris kotak dan rebus\n" +
                "Gula 1/2 sdm\n" +
                "Minyak ayam 8 ml\n" +
                "Air 2 L\n" +
                "Jahe 1 ruas\n" +
                "Penyedap rasa 1 sdt\n" +
                "Mie basah atau mie telur 500 g\n" +
                "Bawang goreng\n" +
                "Kecap manis 3 sdm\n" +
                "Garam 1 sdm\n" +
                "Ketumbar 1 sdt\n" +
                "Kecap inggris 2 sdm\n" +
                "Kecap asin 50 ml\n" +
                "Tulang ayam",
        "10 siung bawang merah dan potong halus\n" +
                "15 buah cabai rawit dan iris halus\n" +
                "5 sendok makan kecap manis\n" +
                "1 sendok teh merica bubuk\n" +
                "2 sendok makan jeruk limau",
        "200 gram udang jerbung, kupas, belah punggungnya dan sisakan ekornya\n" +
                "200 gram cumi, bersihkan, potong-potong, belah dua kepalanya\n" +
                "200 gram ikan kakap fillet, potong-potong\n" +
                "150 gram jamur merang, belah dua\n" +
                "3 batang serai, ambil putihnya,\n" +
                "8 lembar daun jeruk, buang tulang daunnya\n" +
                "2 cm lengkuas, iris\n" +
                "10 buah cabai rawit merah utuh \n" +
                "3 sendok makan kecap ikan \n" +
                "4 1/2 sendok teh garam \n" +
                "1/4 sendok teh merica bubuk \n" +
                "2 1/4 sendok teh gula pasir \n" +
                "2 1/2 sendok makan air asam dari 1 1/2 sendok teh asam jawa larutkan dengan 3 sendok makan air \n" +
                "3 tangkai daun ketumbar, petiki\n" +
                "1 1/2 sendok makan air jeruk lemon \n" +
                "2.000 ml kaldu udang dari air rebusan kulit dan kepala udang \n",
        "Ikan Segar, 1 kg\n" +
                "Bawang putih, secukupnya\n" +
                "Bawang merah, secukupnya\n" +
                "Ketumbar, 5 butir\n" +
                "Kemiri, 2 buah\n" +
                "Kecap manis, secukupnya\n" +
                "Jahe, 1 ruas\n" +
                "Garam halus, secukupnya",
        "200 ml santan kental\n" +
                "4 lembar daun jeruk purut\n" +
                "3 lembar daun Salam\n" +
                "2 batang serai memarkan\n" +
                "2 butir cengkeh\n" +
                "1 batang kayu manis\n" +
                "\n" +
                "6 butir kemiri sangrai\n" +
                "5 siung bawang Merah\n" +
                "4 siung bawang Putih\n" +
                "2 cm kunyit\n" +
                "2 cm lengkuas\n" +
                "1 cm jahe\n" +
                "1 sendok teh jintan\n" +
                "1 sendok teh ketumbar\n" +
                "minyak goreng secukupnya (untuk menumis)",
        "Bahan:\n" +
                "- 1 ekor ayam potong sesuai selera\n" +
                "- 5 lembar daun jeruk\n" +
                "- 1 batang sere\n" +
                "- 2 ikat daun kemangi\n" +
                "- Garam secukupnya\n" +
                "- 10 buah cabai merah keriting\n" +
                "- 8 siung bawang merah\n" +
                "- 5 siung bawang putih\n" +
                "- 1 buah tomat\n" +
                "- Seruas jahe\n" +
                "- Seruas kunyit\n" +
                "- 2 sdt ketumbar sangrai dulu\n" +
                "- 50gr gula merah\n" +
                "- 8 buah cabai rawit merah (biarkan utuh)\n" +
                "- Air secukupnya"
    )

    //fungsi untuk membuat ArrayList pada variable yang telah dibuat diatas
    val listMakan : ArrayList<Makanan> get() {
            val data = arrayListOf<Makanan>()
            for (position in namaMakanan.indices){
                //deklarai Array yang digunakan
                val  makan = Makanan()
                makan.nama = namaMakanan[position]
                makan.detail = detailMakanan[position]
                makan.gambar = gambarMakanan[position]
                makan.Komposisi = komposisiMakanan[position]
                data.add(makan)
            }
            return data
        }
}