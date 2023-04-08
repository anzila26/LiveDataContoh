package anzila.binar.livedatacontoh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import anzila.binar.livedatacontoh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapterBarang : BarangAdapter
    lateinit var barangViewModel: BarangViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //init productviewmodel
        barangViewModel = ViewModelProvider(this).get(BarangViewModel::class.java)
        adapterBarang = BarangAdapter(ArrayList())

        //meng observe data dari viewmodel - Livedata
        barangViewModel.getData()
        barangViewModel.barangVM.observe(this, Observer {
            adapterBarang.getDataProduct(it as ArrayList<ListBarang>)
        })

        val glm = GridLayoutManager(this, 2)

        binding.rvBarang.adapter = adapterBarang
        binding.rvBarang.layoutManager = glm
    }
}