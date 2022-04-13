package com.example.food_delivery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.food_delivery.model.Restaurant

class RestaurantVM : ViewModel() {
    private var _listOfData : MutableLiveData<ArrayList<Restaurant>> = MutableLiveData()
    val listOfData : LiveData<ArrayList<Restaurant>>
        get() = _listOfData
    fun loadData(){
        val data = DataStore.getDataSet()
        _listOfData.postValue(data)
    }
}