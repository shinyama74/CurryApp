package com.example.curry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val people = arrayOf<String>("てぃらの","ぱきけふぁろ","とりけら","ぷてらの")
    val food = arrayOf<String>("カレー","スープ","チャーハン","麻婆豆腐")
    val verb = arrayOf<String>("よそえました('◇')ゞ","よそいたい人生だった…","お買い上げいただきました！","注文いただきました！")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun serveFood(view:View){

        val randomName = Random()
        val index = randomName.nextInt(4)
        val name = people[index]

        nameTextView.text=name
        foodTextView.text="に  " + food[Random().nextInt(4)] + "　 を"
        verbTextView.text=verb[Random().nextInt(4)]

        if (verbTextView.text == "よそいたい人生だった…"){
            verbTextView.textSize= 36F
        }else{
            verbTextView.textSize= 14F
        }

        when(nameTextView.text){
            "てぃらの"-> {
                nameTextView.textColors = "#FFCA1313"
            }
            "ぱきけふぁろ"->{
                nameTextView.textColors = "#FFCA6513"
            }
            "とりけら"->{
                nameTextView.textColors = "#FF6FCA13"
            }
            "ぷてらの"->{
                nameTextView.textColors = "#FF934B18"

            }

        }

    }
}
