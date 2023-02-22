package com.example.myroom.core.recourc

sealed class Recourc<T> {
    class Success<T>(val data: T) : Recourc<T>()
    class Error<T> : Recourc<T>()
    class Loading<T> : Recourc<T>()
}
