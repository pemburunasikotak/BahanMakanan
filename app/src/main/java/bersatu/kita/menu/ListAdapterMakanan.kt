package tj.belajar.menumakan

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import bersatu.kita.menu.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListAdapterMakanan(private val listmakanan: ArrayList<Makanan>) : RecyclerView.Adapter<ListAdapterMakanan.ListViewHolder>() {
    private lateinit var onItemCallback: OnItemClickCallback

    //membuat fungsi setonItemClikcCallback
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemCallback = onItemClickCallback
    }


    //menampilkan List
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.datamenu, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        //Deklarasi Varibale
        val menu = listmakanan[position]

        //menampilan gambar dengan glide
        Glide.with(holder.itemView.context)
            .load(menu.gambar)
            .apply(RequestOptions().override(100, 100))
            .into(holder.imgPhoto)

        //menampikan Text
        holder.tvName.text = menu.nama
        holder.tvDetail.text = menu.detail
        holder.itemView.setOnClickListener {
            onItemCallback.onItemClicked(listmakanan[holder.adapterPosition])
            val movedata = Intent(holder.itemView.context,DetailMakanan::class.java)

            //mengirimkan data ke intent selanjutknya
            movedata.putExtra("nama", listmakanan[holder.adapterPosition].nama)
            movedata.putExtra("detail", listmakanan[holder.adapterPosition].detail)
            movedata.putExtra("photo",listmakanan[holder.adapterPosition].gambar)
            movedata.putExtra("Komposisi",listmakanan[holder.adapterPosition].Komposisi)
            holder.itemView.context.startActivity(movedata)
        }
    }


    //menghitung List
    override fun getItemCount(): Int {
        return listmakanan.size
    }


    //mengambil nilai yang akan digunakan
     class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         var imgPhoto: ImageView = itemView.findViewById(R.id.imageView)
         var tvName: TextView = itemView.findViewById(R.id.judul)
         var tvDetail: TextView = itemView.findViewById(R.id.detail)



    }
    interface OnItemClickCallback {
        fun onItemClicked(data: Makanan)
    }


}