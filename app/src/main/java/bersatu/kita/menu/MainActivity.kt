package tj.belajar.menumakan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import bersatu.kita.menu.R

class MainActivity : AppCompatActivity() {
    //deklarasi ReclyeView
    private lateinit var rvMakan:RecyclerView
    //deklarasi Title
    private var title = "Menu Makan"
    //Deklarai List yang ada di Dalam Array List
    private var list: ArrayList<Makanan> = arrayListOf()

    //Fungsi yang pertama dijalankan
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //mengisi RecyleView
        rvMakan = findViewById(R.id.rv_makan)
        rvMakan.setHasFixedSize(true)
        list.addAll(DataMakanan.listMakan)
        //memangil fungsi tampil
        tampilkanList()
        //menjalankan fungsi setActionBarTitle dengan parameter title
        setActionBarTitle(title)
    }

    //fungsi tampilkan List
    private fun tampilkanList() {
        rvMakan.layoutManager = LinearLayoutManager(this)
        val ListAdapterMakanan = ListAdapterMakanan(list)
        rvMakan.adapter = ListAdapterMakanan

        //memberi fungsi setonclikITemcallBack pada list adapater
        ListAdapterMakanan.setOnItemClickCallback(object : ListAdapterMakanan.OnItemClickCallback{
            override fun onItemClicked(data: Makanan) {
                showSelected(data)
            }
        })

    }
    //fungsi untuk menampilkan ketika di clik pada menu
    private fun showSelected(makan: Makanan){
        Toast.makeText(this, "Kamu Memilih "+ makan.nama,
            Toast.LENGTH_SHORT).show()
    }

    //fungsi untuk membuat menuInflater
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    //fungsi Memberi Title pada saat di pilih
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    //menjalankan menu apabila di clik
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                val tentang = Intent(this@MainActivity, Tentang::class.java)
                startActivity(tentang)
            }

        }
        setActionBarTitle(title)
    }
    //fungsi untuk mengset Titile pada applikasi
    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}
