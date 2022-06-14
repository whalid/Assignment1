package com.example.saarccountries

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var bdButton: Button
    private lateinit var inButton: Button
    private lateinit var pakButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bdButton = findViewById (R.id.bdButtonId)
        inButton = findViewById (R.id.inButtonId)
        pakButton = findViewById (R.id.pakButtonId)

    }



    fun myFun(view: View){
        if(view.id == R.id.bdButtonId){
            bdButton.setOnClickListener{
                intent = Intent(this, CountryProfileActivity::class.java)
                intent.putExtra("name", "bangladesh")
                startActivity(intent)
            }
        }
        else if(view.id == R.id.inButtonId){
            inButton.setOnClickListener{
                intent = Intent(this, CountryProfileActivity::class.java)
                intent.putExtra("name", "india")
                startActivity(intent)
            }
        }
        else if(view.id == R.id.pakButtonId){
            pakButton.setOnClickListener{
                intent = Intent(this, CountryProfileActivity::class.java)
                intent.putExtra("name", "pakistan")
                startActivity(intent)
            }
        }
    }
}