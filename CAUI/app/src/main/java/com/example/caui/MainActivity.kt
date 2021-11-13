package com.example.caui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.caui.databinding.ActivityMainBinding


lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val btn=findViewById<Button>(R.id.edittextbutton)

        btn.setOnClickListener{
            val edtext=findViewById<EditText>(R.id.edittext)
            var value= edtext.text
            Toast.makeText(this,value,Toast.LENGTH_SHORT).show()
        }
        binding.radiobuttons.setOnCheckedChangeListener {group, checkedId ->

            when {
                checkedId == R.id.radiobutton1 ->
                    Toast.makeText(applicationContext, "Black Tea", Toast.LENGTH_SHORT).show()
                checkedId == R.id.radiobutton2 ->
                    Toast.makeText(applicationContext, "Green Tea", Toast.LENGTH_SHORT).show()
                checkedId == R.id.radiobutton3 ->
                    Toast.makeText(applicationContext, "Lemon Tea", Toast.LENGTH_SHORT).show()

            }

        }
        binding.ckb1.setOnClickListener {
            if(binding.ckb1.isChecked){
                Toast.makeText(applicationContext,"Pasta",Toast.LENGTH_SHORT).show()

            }


        }
        binding.ckb2.setOnClickListener{
            if(binding.ckb2.isChecked){
                Toast.makeText(applicationContext,"Curry",Toast.LENGTH_SHORT).show()

            }


        }
        binding.ckb3.setOnClickListener{
            if(binding.ckb3.isChecked){
                Toast.makeText(applicationContext,"Fries",Toast.LENGTH_SHORT).show()

            }


        }











    }





}




        












