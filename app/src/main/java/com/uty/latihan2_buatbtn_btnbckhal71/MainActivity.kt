package com.uty.latihan2_buatbtn_btnbckhal71

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.aktifitikedua.*
import kotlin.String as String1



class MainActivity : AppCompatActivity() {
    //fun main(args: Array<String>) {
    //var grade: String1 =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       //proses_btn.setOnClickListener(){
        //val bilangan1 = bil1.text.toString()
        val nimm=nim.text
        val name =nama.text
        val valuee=nilai.text
       var keterangan:kotlin.String?=null


           // var grade: String = ""to
            if (valuee.length >= 80)keterangan="A"
           else if (valuee.length  >= 60)keterangan= "B"
           else if (valuee.length >= 40) keterangan = "C"
           else if (valuee.length >= 30) keterangan = "D"
            else if (valuee.length  >= 20) keterangan = "E"
            else keterangan = "F"

          proses_btn.setOnClickListener() {
              intent = Intent(this, aktifiti_kedua::class.java)
             intent.putExtra("id_siswa", nimm)
              intent.putExtra("nama_siswa", name)
               intent.putExtra("nilai_sis",valuee)
              intent.putExtra("ket", keterangan)
              startActivity(intent)
             // hasilnama.text = nimm
              //hasilnim.text = name
          }

        }
    }

//private fun Editable.toInt(): Any {

}

//rivate fun EditText.setSelection(int: Int.Companion) {

//}

//private operator fun Int.compareTo(toString: String): Int {

//}

