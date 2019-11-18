package tj.belajar.menumakan

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import bersatu.kita.menu.R
import com.bumptech.glide.Glide

class DetailMakanan : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailmakanan)
        (supportActionBar as ActionBar).setDisplayHomeAsUpEnabled(true)
        //memangil fungsi getItentItem
        getIntentItem()
    }
    @SuppressLint("ResourceType")
    private fun getIntentItem() {
        //mengambil data yang telah dikirimkan dengan nama parameter harus sama
        val img = intent.getIntExtra("photo", 0)
        val name = intent.getStringExtra("nama")
        val detail = intent.getStringExtra("detail")
        val Komposisi = intent.getStringExtra("Komposisi")

        // membuat varaible yang menunjukan letak
        val jdl: TextView = findViewById(R.id.detailJudul)
        val dtl: TextView = findViewById(R.id.detaiIsi)
        val imgP: ImageView = findViewById(R.id.imgViewDetail)
        val sej : TextView = findViewById(R.id.Komposisi)

        //mengisi varaibalenya dangan data yang dikirimkan
        jdl.text = name
        dtl.text = detail
        sej.text = Komposisi

        //menampilkan gambar mengunakan glide
        Glide.with(this)
            .load(img)
            .into(imgP)

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = name
        }
    }

}