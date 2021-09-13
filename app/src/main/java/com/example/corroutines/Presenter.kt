package com.example.corroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class Presenter(private val view: ActivityView, private val datasource: Datasource) {

    fun sayHello() {
        CoroutineScope(Dispatchers.Main).launch {
            val result = withContext(Dispatchers.IO) { datasource.getData() }
            view.showResults(result)
        }
    }

}

interface ActivityView {
    fun showResults(name: String)
}