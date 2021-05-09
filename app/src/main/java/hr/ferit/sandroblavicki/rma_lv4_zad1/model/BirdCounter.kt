package hr.ferit.sandroblavicki.rma_lv4_zad1.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class BirdCounter {

    private val _birdsSeen: MutableLiveData<Int> = MutableLiveData<Int>(0)
    val birdsSeen: LiveData<Int> = _birdsSeen
    private val _birdColor: MutableLiveData<Int> = MutableLiveData<Int>(0)
    val birdColor: LiveData<Int> = _birdColor


    fun seeBird() = _birdsSeen.value?.let { _birdsSeen.postValue(it + 1) }
    fun resetBirdCounter() = _birdsSeen.value?.let { _birdsSeen.postValue(0) }


}