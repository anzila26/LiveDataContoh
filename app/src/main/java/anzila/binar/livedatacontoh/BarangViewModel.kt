package anzila.binar.livedatacontoh

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BarangViewModel : ViewModel() {

    var listData = arrayListOf(
        ListBarang("Mesin Cuci", "800000", "startoko", R.drawable.mesincuci),
        ListBarang("Mesin Cuci", "800000", "startoko", R.drawable.mesincuci),
        ListBarang("Mesin Cuci", "800000", "startoko", R.drawable.mesincuci),
        ListBarang("Mesin Cuci", "800000", "startoko", R.drawable.mesincuci),
        ListBarang("Mesin Cuci", "800000", "startoko", R.drawable.mesincuci)
    )

    val barangVM : MutableLiveData<List<ListBarang>> = MutableLiveData()

    fun getData() {
        barangVM.value = listData
    }
}