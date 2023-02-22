package com.example.myroom.pages.homepage

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myroom.core.recourc.Recourc
import com.example.myroom.pages.homepage.data.model.StoreModel
import com.example.myroom.pages.homepage.data.repository.ProductRepository
import com.example.myroom.pages.homepage.data.repository.ProductRepositoryImp
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class HomeViewModel @Inject constructor(
     val productRepository:ProductRepository
    ) : ViewModel() {
    val channel = Channel<Int>()
    val _state = channel.receiveAsFlow().shareIn(viewModelScope, SharingStarted.Lazily)
    val state = _state
    var counter=0


    fun emitNewState(){
        emitState()
    }


   private fun  emitState(){
        counter++
        viewModelScope.launch {
            channel.send( 1)
        }
    }
//    init {
//        getProducts()
//    }
   // var state = MutableStateFlow<Recourc<StoreModel>>(Recourc.Loading())
//    fun getProducts() {
//        viewModelScope.launch {
//            productRepository.getProducts().onEach {
//                state.value = it
//            }.launchIn(this)
//        }
//    }
}
data class StateProduct(var resouce:Int=0)