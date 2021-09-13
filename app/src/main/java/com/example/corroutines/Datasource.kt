package com.example.corroutines

class Datasource() : IDatasource {
    override fun getData(): String = "Data from network"


}

interface IDatasource {
    fun getData(): String
}