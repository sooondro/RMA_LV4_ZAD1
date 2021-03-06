package hr.ferit.sandroblavicki.rma_lv4_zad1.ui.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import hr.ferit.sandroblavicki.rma_lv4_zad1.model.BirdCounter

class BirdCounterViewModel() : ViewModel() {

    private val counter = MutableLiveData<BirdCounter>(BirdCounter())

    val birdsSeen = Transformations.map(counter) {it.birdsSeen}
    val birdColor = Transformations.map(counter) {it.birdColor}


    fun seeBird(color: Int) = counter.value?.seeBird(color)
    fun resetBirdCount() = counter.value?.resetBirdCounter()

}