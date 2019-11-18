package tj.belajar.menumakan

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import bersatu.kita.menu.R

class Tentang: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //mengset Title
        (supportActionBar as ActionBar).title = "Pembuat Pembuat Aplikasi"
        (supportActionBar as ActionBar).setDisplayHomeAsUpEnabled(true)
        //menampilkan Layout Tentang
        setContentView(R.layout.tentang)
    }
}