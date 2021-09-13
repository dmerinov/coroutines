package com.example.corroutines

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ActivityView {

    private val presenter = Presenter(this, datasource = CommonDatasource())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        submit.setOnClickListener { presenter.sayHello() }
        clear.setOnClickListener { presenter.clearText() }
    }

    override fun showResults(name: String) {
        hellomsg.text = name
    }
}