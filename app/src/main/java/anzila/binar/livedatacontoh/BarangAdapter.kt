package anzila.binar.livedatacontoh

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import anzila.binar.livedatacontoh.databinding.ItemBarangBinding

class BarangAdapter (var listBarang: ArrayList<ListBarang>) : RecyclerView.Adapter<BarangAdapter.ViewHolder>() {


    class ViewHolder(val binding : ItemBarangBinding): RecyclerView.ViewHolder(binding.root) {

        fun bindProduct(itemData : ListBarang){
            binding.barang = itemData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BarangAdapter.ViewHolder {
        var view = ItemBarangBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: BarangAdapter.ViewHolder, position: Int) {
        holder.bindProduct(listBarang[position])
    }

    override fun getItemCount(): Int {
        return listBarang.size
    }

    fun getDataProduct(itemBarang: ArrayList<ListBarang>){
        this.listBarang = itemBarang
    }
}