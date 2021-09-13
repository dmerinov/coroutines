package com.example.corroutines

class Presenter(private val view: ActivityView, private val datasource: IDatasource) {

    fun sayHello(name: String) {
        view.showResults(datasource.getData())
    }


}

interface ActivityView {
    fun showResults(string: String)

}