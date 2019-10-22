package com.uty.latihan2_buatbtn_btnbckhal71

import  android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.aktifitikedua.*
import kotlinx.android.synthetic.main.activity_main.*


class aktifiti_kedua:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.aktifitikedua)


       // var gradee=grade.text.toString()
       val bundle: Bundle? = intent.extras
        val idsis=bundle?.get("id_siswa")
      val jeneng=bundle?.get("nama_siswa")
        var nilaii=bundle?.get("nilai_sis")
        var kett=bundle?.get("ket")
       // var nilaii=bundle?.get("nilai_sis")
        //var idsis=nim.text.toString()
      //  var jeneng=nama.text.toString()

hasilnama.text = jeneng.toString()
        hasilnim.text = idsis.toString()
      hasilnilai.text= nilaii.toString()
        grade.text=kett.toString()



        btnback.setOnClickListener(){
            intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}

//private fun Any?.toInt(): CharSequence? {

//}
