package com.example.corroutines

class CommonDatasource() : Datasource {

    override suspend fun getData(): String {
        Thread.sleep(2000)
        return "Data from network"
    }


}

interface Datasource {
    suspend fun getData(): String
}