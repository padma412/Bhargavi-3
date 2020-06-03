package com.example.colormyviews

import android.graphics.Color.DKGRAY
import android.graphics.Color.GRAY
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()


    }
    private fun setListeners(){
        val clickableViews:List<View> =
            listOf(text1,text2,text3,text4,text5,constraint,button,button2,button3)
        for (item in clickableViews){
            item.setOnClickListener{ makeColored(it)}
        }
    }
    private fun makeColored(view: View){
        when(view.id) {
            R.id.text1->view.setBackgroundColor(android.graphics.Color.DKGRAY)
            R.id.text2->view.setBackgroundColor(android.graphics.Color.GRAY)
            R.id.text3->view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.text4->view.setBackgroundResource(android.R.color.holo_blue_dark)
            R.id.text5->view.setBackgroundResource(android.R.color.holo_purple)
            R.id.button->view.setBackgroundResource(R.color.red)
            R.id.button2->view.setBackgroundResource(R.color.yellow)
            R.id.button3->view.setBackgroundResource(R.color.Green)
            else->view.setBackgroundResource(android.R.color.background_dark)


        }
    }
}
