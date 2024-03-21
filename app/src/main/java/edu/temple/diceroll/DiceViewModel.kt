package edu.temple.diceroll

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {
    private val selected = MutableLiveData<Int>()

    fun setSelectedImage(number: Int) {
        selected.value = number
    }

    fun getSelectedImage() : LiveData<Int> {
        return selected
    }

    fun updateNumber(number: Int) {
        selected.value = number
    }
}