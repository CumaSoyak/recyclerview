package com.example.recyclervev

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.icu.lang.UScript
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclervev.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


         var superkahramanısımlerı=ArrayList<String>()
        superkahramanısımlerı.add("Batman")
        superkahramanısımlerı.add("Supermen")
        superkahramanısımlerı.add("Ironman")
        superkahramanısımlerı.add("Aquman")
        superkahramanısımlerı.add("Spiderman")


        val BatmanBıtmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val SupermanBıtmap= BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val IronmanBıtmap= BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ıronman)
        val AquammanBıtmap= BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aquaman)
        val SpıdermanBıtmap= BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spıderman)


        var superkahramangorsellerı= ArrayList<Bitmap>()

        superkahramangorsellerı.add(BatmanBıtmap)
        superkahramangorsellerı.add(SupermanBıtmap)
        superkahramangorsellerı.add(IronmanBıtmap)
        superkahramangorsellerı.add(AquammanBıtmap)
        superkahramangorsellerı.add(SpıdermanBıtmap)


        val adapter=RecyclerAdapter (superkahramanısımlerı,superkahramangorsellerı)

    }
}