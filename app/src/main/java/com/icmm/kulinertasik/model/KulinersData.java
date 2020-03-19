package com.icmm.kulinertasik.model;

import com.icmm.kulinertasik.R;

import java.util.ArrayList;

public class KulinersData {
    private static String[] kulinerNames = {
            "Nasi Cikur",
            "Sale Pisang",
            "Kolontong",
            "Rengginang Oyek",
            "Bubur Ayam Haji Zaenal",
            "Soto Ayam Pataruman",
            "Mie Bakso Laksana",
            "Keripik Sukun",
            "Kupat Tahu Tasikmalaya",
            "Martabak Ramayana",
            "Tahu Bulat",
            "Cilok Goang",
            "Pecel Oranye",
            "Mie Ayam Pelangi",
            "Opak",
            "Wajit",
            "Nasi T.O Tasik",
            "Citruk",
            "Godeblag",
            "Noga Kacang",
            "Es Bojong",
            "Kue Aci",
            "Ladu",
            "Kalua Jeruk",
            "Sate Maranggi"
    };

    private static String[] kulinerDetails = {
            "Makanan khas Tasikmalaya Jawa Barat yang pertama adalah nasi cikur yang dijual di salah satu warung yang berada di pertigaan antara Jalan Panyerutan dan Jalan Tentara Pelajar, Tasikmalaya, Jawa Barat. Mungkin saja warung ini adalah satu satunya warung yang menjual makanan berupa nasi cikur. Warung yang terlihat sederhana ini memang hanya berada di pertigaan antara Jalan Panyerutan dan Jalan Tentara Pelajar, namun jangan salah karena olahan nasi cikur disini rasanya benar benar enak. Kata orang Tasik “ngeunah pokona mah euy”! rasanya sangat pantas diacungi jempol dan juga harganya sangat terjangkau. Makanan berupa nasi cikur ini porsinya pas untuk mengobati rasa lapar yang menyerang.",
            "Seperti kebanyakan jenis sale yang sering kita jumpai di daerah lainnya, sale pisang Tasikmalaya merupakan sajian makanan ringan atau cemilan yang wajib kamu jadikan teman dalam melakukan perjalanan keliling kota Tasikmalaya maupun kamu jadikan oleh oleh untuk sanak saudara di rumah. Sale pisang Tasikmalaya ini terbuat dari pisang yang diolah dengan cara khusus yaitu dengan cara di sisir tidak terlalu tebal kemudian dijemur dibawah matahari secara langsung. Setelah itu, bahan sale pisang bisa langsung dikonsumsi maupun digoreng terlebih dulu menggunakan tepung.",
            "Cemilan khas Tasikmalaya ini terbuat dari beras ketan yang diolah sedemikian rupa dicampur dengan bumbu khusus sehingga menghasilkan sajian makanan ringan yang bercita rasa gurih.",
            "Cemilan yang selalu hadir saat lebaran tiba ini merupakan makanan yang berasal dari salah satu daerah di Tasikmalaya, tepatnya Tenjowaringin. Terbuat dari beras ketan yang diolah dalam waktu yang cukup lama dan melalui beberapa tahapan panjang. Meskipun mengolahnya lama, namun rasanya sangat enak sehingga menjadi primadona sebagian besar masyarakat Tasikmalaya.",
            "Tempat makan khas Tasikmalaya yang cukup terkenal adalah Bubur Ayam Haji Zainal yang terletak di Jalan Kalektoran, Tasikmalaya. Bubur ayam Haji Zainal sudah sangat terkenal bahkan sampai ke luar kota Tasikmalaya. Setiap harinya rumah makan ini selalu kebanjiran pengunjung baik dari dalam kota Tasikmalaya maupun luar kota Tasikmalaya. Harga bubur ayam di warung makan Haji Zainal juga terjangkau berbanding lurus dengan rasanya yang enak, pantas saja jika banyak yang menjadikan bubur ayam Haji Zainal sebagai makanan favorit. Cita rasa bubur ayamnya yang gurih pasti akan selalu terkenang oleh siapapun yang mencobanya, sehingga ketika berkunjung ke Tasikmalaya lagi pasti akan ketagihan untuk mencoba bubur ayam Haji Zainal ini lagi.",
            "Maknaan khas Tasikmalaya Jabar yang satu ini merupakan sajian makanan berkuah yang menjadi favorit hampir sebagian besar masyarakat Tasikmalaya dan pengunjung yang datang ke Tasikmalaya. Salah satu penjual soto ayam pataruman yang legendaris adalah Ibu Rina yang telah berjualan sejak tahun 1960-an. Menurut si pembuat soto ini, tidak ada sesuatu yang khusus dalam pembuatan dan penyajiannya, hanya saja konsistensi cita rasa yang khas dari soto ayam pataruman sejak jaman dulu hingga sekaranglah yang menjadi faktor penentu makanan ini menjadi favorit banyak orang. Telah ada sejak tahun 1960-an dan cita rasanya tidak berubah, membuat soto ayam pataruman ini mempunyai banyak penggemar. Jika kamu ingin mencoba soto ayam pataruman ini, datanglah ke Jalan Pataruman Nomor 23, Tasikmalaya.",
            "Bakso merupakan makanan favorit sebagian orang. Selain itu, sajian kuliner bakso juga gampang ditemukan di hampir semua daerah di Indonesia. Bahkan tidak jarang warung bakso antara satu dengan yang lainnya sangat berdekatan dan kesemuanya selalu ramai pengunjung. Demikian pula di Tasikmalaya, ada satu warung bakso yang cukup terkenal akan rasa baksonya yang lezat. Nama warung bakso tersebut dikenal dengan Bakso Laksana yang terletak di Jalan Pemuda Nomor 5, Tasikmalaya. Rasanya sangat khas sedikit berbeda dengan sajian kuliner bakso di daerah maupun tempat lainnya sehingga bakso laksana menjadi terkenal.",
            "Makanan ringan khas Tasikmalaya yang disebut dengan keripik sukun ini berbahan dasar buah sukun yang sudah matang. Buah sukun tersebut diolah sedemikian rupa dengan cara dipotong kecil kecil kamudian digoreng dan dibumbui. Keripik sukun ini sering dijadikan cemilan oleh masyarakat Tasikmalaya sebagai teman minum teh atau teman berkumpul bersama sanak saudara. Kamu juga bisa membawa keripik sukun khas Tasikmalaya ini sebagai buah tangan karena saat ini keripik sukun sudah disajikan dengan bungkus yang modern dan mudah dibawa.",
            "Kupat tahu merupakan satu dari sekian banyak sajian kuliner khas Tasikmalaya yang harus kamu coba ketika berkunjung ke Tasikmalaya. Kupat tahu Tasikmalaya biasanya banyak dijual oleh para pedagang kaki lima. Rasanya sedikit berbeda dengan sajian kuliner kupat tahu di daerah lainnya karena menggunakan campuran bumbu yang khas asli dari Tasikmalaya. Tampilannya boleh jadi sama dengan kupat tahu dari daerah lain, namun rasanya beuh sangat lezat khas masakan sunda Tasikmalaya. Jika kamu penasaran dengan rasa kupat tahu Tasikmalaya, maka kamu dapat datang ke Jalan Raya Mangunreja, Singaparna, disitu ada penjual kupat tahu Tasikmalaya yang rasanya enak.",
            "Bagi kamu penggemar makanan manis harus dan wajib mencoba martabak ramayana yang dijual di Tasikmalaya. Belum ke Tasikmalaya jika belum mencoba rasa martabak ramayana ini. Martabak ramayana dapat kamu temukan di Jalan Tentara Pelajar, Tasikmalaya. Martabak ramayana lebih enak jika disantap langsung setelah selesai dibuat karena masih hangat ditambah taburan topping yang pas sesuai selera.",
            "Makanan khas Tasikmalaya selanjutnya ada tahu bulat. Makanan yang sempat booming sampai ada jenis game berjudul tahu bulat ini dulunya tidak terlalu terkenal. Namun, saat ini para pedagang sudah melakukan inovasi pada produknya sehingga tahu bulat menjadi booming. Salah satu bentuk inovasi para pedagang tahu bulat adalah dengan tagline “digoreng dadakan” dimana tahu bulat disajikan masih panas dengan cara digoreng dadakan ketika ada orang yang membeli serta dibubuhi bumbu kering rasa balado, asin, atau pedas. Selain itu, penjual tahu bulat juga berjualan berkeliling menggunakan mobil bak terbuka yang bagian belakang disulap menjadi tempat memasak tahu dan jingle iklan yang familiar di telinga masyarakat. Rasa dari tahu bulat ini sangat khas dan unik dengan tekstur yang kenyal dan gurih. Tahu bulat ini enak dimakan tanpa didampingi makanan lain, cukup es teh manis saja.",
            "Makanan khas sunda Tasikmalaya yang satu ini mempunyai rasa pedas dengan tekstur yang kenyal dan gurih saat dimakan. Ditambah dengan bumbu khasnya yang super enak dan sambal goang sebagai siraman kuahnya. Cilok goang sejatinya merupakan sajian cilok atau aci dicolok yang disiram dengan kuah sambal goang sehingga dinamakan dengan cilok goang. Meskipun cilok berasal dari sajian makanan ringan aci yang dicolok, namun dalam cilok goang ini acinya tidak dicolok atau ditusuk melainkan hanya dibiarkan begitu saja kemudian disiram kuah goangnya. Tidak lupa tambahan mie kering, ceker ayam, tahu, dan juga taburan bawang gorengnya agar rasa cilok goang ini menjadi semakin lezat.",
            "Pecel oranye ini merupakan warung yang menyajikan sajian kuliner Tasikmalaya legendaris yang sudah ada sejak tahun 1925. Beberapa menu makanan yang dijual di warung ini adalah gado gado, lotek, karodek, pecel bumbu kacang dan sejumlah makanan khas Sunda lainnya. Makanan di warung makan ini dijual dengan harga mulai 15 ribu rupiah saja, cukup murah bukan? Warung makan yang menyajikan sajian makanan Sunda ini terletak di Jalan Empang, Tasikmalaya tepatnya di seberang Hotel Selamat.",
            "Berlokasi di Jalan HZ Mustofa Nomor 362, kedai mie ayam pelangi ini menyajikan sajian kuliner olahan mie yang berwarna warni. Warna warna dari mie ini berasal dari pewarna makanan alami yang berasal dari sayur sayuran ada warna hijau dari bayam, kuning, merah, dan juga warna putih. Satu porsi mie ayam pelangi dijual dengan harga 12 sampai dengan 15 ribu rupiah tergantung dari tambahan bahan apa yang dicampurkan, misalnya bakso atau lauk lainnya.",
            "Oleh oleh makanan khas Tasikmalaya bernama opak ini sangat populer. Selain dijadikan oleh oleh, opak ini juga menjadi makanan ringan yang wajib disajikan saat ada acara hajatan atau acara syukuran. Opak sangat digemari oleh masyarakat Tasikmalaya, sehingga banyak sekali pedagang makanan yang menjual opak ini. Jangan takut tidak sempat mencicipi opak ketika berada di Tasikmalaya karena kamu akan dengan mudah menemukan sajian kuliner makanan ringan ini.",
            "Harganya murah dan rasanya yang lezat adalah daya tarik tersendiri dari wajit ini. Wajit adalah makanan ringan yang dibuat dari ketan dan dicampur dengan kelapa yang dihaluaskan kemudian dimasak bersama dengan gula merah. Terakhir sebelum disajikan wajit ini dibungkus dengan daun jagung berwarna putih. Wajit Tasikmalaya mempunyai cita rasa yang manis cocok bagi kamu pecinta makanan manis. Wajit Tasikmalaya wajib kamu coba ketika berkunjung ke Tasikmalaya. Bisa juga kamu jadikan oleh oleh karena harganya murah dan bentuknya kecil sehingga kamu tidak akan kerepotan saat membawanya.",
            "Berikutnya akan disajikan resep makanan khas Tasikmalaya yang mempunyai nama beken Nasi TO Tasik atau Nasi Tutug Oncom Tasik. Dalam bahasa Sunda, tutug mempunyai arti menumbuk karena tutug oncom dibuat dengan cara diaduk serta ditumbuk dengan oncom. Bahan yang perlu disiapkan adalah nasi putih, oncom, bawang merah, bawang putih, kencur, cabai raiwt, kemangi, garam, dan gula serta tambahan lauk pelengkap. Pertama tama sangrai oncom dan uleg bumbu hingga halus lalu tumis dengan oncom. Selanjutnya masukan nasi dan aduk hingga tercampur rata dengan bumbu dan oncom. Begitu matang, sajikan tutug oncom bersama dengan lauk pauk yang telah disiapkan sebelumnya.",
            "Kuliner jadul khas Tasikmalaya ini sekarang sudah jarang ditemui. Citruk merupakan jajanan khas Tasikmalaya sejenis kerupuk yang terbuat dari campuran tepung kanji dan tepung terigu yang dibentuk bundar mirip dengan koin logam. Citruk merupakan singkatan dari aci ngagetruk yang berarti aci atau tepung kanji yang teksturnya agak keras namun rasanya renyah. Citruk biasa dijadikan cemilan orang warga masyarakat Tasikmalaya karena rasanya gurih dan nagih.",
            "Makanan khas daerah Tasikmalaya berikutnya ada godeblag, yaitu makanan ringan yang dibuat dari singkong atau ketela pohon yang ditambah dengan bumbu yang banyak didapatkan di pasar. Sentra penghasil godeblag berada di daerah Manonjaya. Singkong atau ketela pohon yang akan diolah menjadi godeblag harus yang berkualitas terbaik dan tidak terkena hama atau rasanya akan menjadi aneh setelah diolah. Godeblag hanya ada satu rasa, yaitu rasa asin.",
            "Makanan khas Kabupaten Tasikmalaya berikutnya ada noga kacang yang banyak diproduksi di daerah Indihiang. Noga kacang mempunyai sejarah khusus dan menjadi makanan lokal yang bercita rasa gurih dan bertekstur renyah serta sudah dikenal sejak tahun 1982. Noga kacang terbuat dari campuran kacang tanah dan gula pasir tanpa diberi pewarna kimia, pemanis buatan, maupun bahan pengawet.",
            "Minuman khas Tasikmalaya ini biasanya disajikan saat berbuka puasa. Es bojong merupakan minuman sirup yang legendaris. Terbuat dari campuran air sirup dan santan dengan tambahan potongan nangka, nanas, kelapa muda, alpukat, tape ketan, cincau hitam, dan buah durian. Keunikan dari minuman ini adalah dominasi rasa santan yang pekat dan sangat khas, bukan dari rasa susu kental manis karena memang tidak menggunakan susu sebagai bahan campurannya.",
            "Kue aci terbuat dari bahan sederhana diantaranya tepung tapioka, gula, mentega, dan juga telur yang dicampur menjadi satu adonan. Adonan tersebut kemudian diolah lagi menjadi kue aci. Kue aci dijual dengan harga 20 ribu rupiah saja per bungkusnya.",
            "Ladu adalah makanan ringan yang terbuat dari beras ketan dengan cita rasa manis. Ladu bertekstur mirip dengan dodol garut. Ladu banyak disajikan saat lebaran tiba. Meskipun begitu sekarang sudah banyak toko oleh oleh yang menjual ladu untuk dijadikan oleh oleh khas Tasikmalaya.",
            "Kalua jeruk masuk dalam daftar makanan khas Tasikmalaya. Kalua jeruk adalah manisan kulit jeruk yang dipadukan dengan gula dan perasa unik seperti durian ataupun strawberry. Hal ini membuat kalua jeruk menjadi makanan yang bercita rasa unik.",
            "Makanan Tasikmalaya terakhir yang harus kamu coba adalah sate maranggi yang terbuat dari daging sapi yang dipotong besar besar. Daging tersebut dibakar kemudian disiram dengan sambal kecap yang terbuat dari kecap, bawang merah, cabai, irisan tomat, dan taburan merica serta bawang goreng. Bisa juga disajikan dengan siraman bumbu kacang, sesuai selera dari pembelinya."
    };

    private static String [] kulinerKategori = {
            "makanan",
            "makanan",
            "makanan",
            "makanan",
            "makanan",
            "makanan",
            "makanan",
            "makanan",
            "makanan",
            "makanan",
            "makanan",
            "makanan",
            "makanan",
            "makanan",
            "makanan",
            "makanan",
            "makanan",
            "makanan",
            "makanan",
            "makanan",
            "minuman",
            "makanan",
            "makanan",
            "makanan",
            "makanan"
    };

    private static String[] kulinerHargas = {
            "Rp. 10.000",
            "Rp. 15.000",
            "Rp. 15.000",
            "Rp. 5.000",
            "Rp. 15.000",
            "Rp. 13.000",
            "Rp. 30.000",
            "Rp. 15.000",
            "Rp. 20.000",
            "Rp. 20.000",
            "Rp. 500",
            "Rp. 5.000",
            "Rp. 15.000",
            "Rp. 12.000",
            "Rp. 5.000",
            "Rp. 7.500",
            "Rp. 8.000",
            "Rp. 10.000",
            "Rp. 10.000",
            "Rp. 15.000",
            "Rp. 17.000",
            "Rp. 15.000",
            "Rp. 25.000",
            "Rp. 12.000",
            "Rp. 100.000"
    };

    private static int[] kulinersImages = {
            R.drawable.nasi_cikur,
            R.drawable.sale_pisang,
            R.drawable.kolontong,
            R.drawable.rengginang_oyek,
            R.drawable.bubur_ayam_zaenal,
            R.drawable.soto_ayam_pataruman,
            R.drawable.mie_bakso_laksana,
            R.drawable.kerupuk_sukun,
            R.drawable.kupat_tahu_tasikmalaya,
            R.drawable.martabak_ramayana,
            R.drawable.tahu_bulat,
            R.drawable.cilok_enak,
            R.drawable.pecel_oranye,
            R.drawable.mie_ayam_pelangi,
            R.drawable.opak_tasik,
            R.drawable.wajit_ketan,
            R.drawable.nasi_totasik,
            R.drawable.teh_citruk,
            R.drawable.godeblag,
            R.drawable.noga_kacang,
            R.drawable.es_bojong,
            R.drawable.kue_aci_tasik,
            R.drawable.ladu_tasik,
            R.drawable.kalua_jeruk_enak,
            R.drawable.sate_maranggi_tasik
    };

    public static ArrayList<Kuliner> getListData() {
        ArrayList<Kuliner> list = new ArrayList<>();
        for (int position = 0; position < kulinerNames.length; position++) {
            Kuliner kuliner = new Kuliner();
            kuliner.setName(kulinerNames[position]);
            kuliner.setDetail(kulinerDetails[position]);
            kuliner.setPhoto(kulinersImages[position]);
            kuliner.setKategori(kulinerKategori[position]);
            kuliner.setHarga(kulinerHargas[position]);
            list.add(kuliner);
        }
        return list;
    }
}
