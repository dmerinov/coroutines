package com.example.corroutines

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ActivityView {

    private val presenter = Presenter(this, datasource = Datasource())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        submit.setOnClickListener { presenter.sayHello(helloUser.text.toString()) }
    }

    override fun showResults(name: String) {
        hellomsg.setText("$name")
    }
}