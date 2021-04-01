package com.lauwba.xmlkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hari__tanggal__time.*
import java.text.SimpleDateFormat
import java.util.*

class Hari_Tanggal_Time : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hari__tanggal__time)

        val c = Calendar.getInstance()
        System.out.println("Current time => " + c.time)

        val df = SimpleDateFormat("EEEE, dd MMMM, ''yy")
        val formattedDate: String = df.format(c.time)

        val df2 = SimpleDateFormat(" h:mm a")
        val formattedDate2: String = df2.format(c.time)

        val df3 = SimpleDateFormat("H:mm")
        val formattedDate3: String = df3.format(c.time)

        val df4 = SimpleDateFormat("dd/MM/yy")
        val formattedDate4: String = df4.format(c.time)

        val df5 = SimpleDateFormat("dd MMMM yyyy")
        val formattedDate5: String = df5.format(c.time)







        format1.text= "$formattedDate"
        format2.text = "$formattedDate2"
        format3.text = "$formattedDate3"
        format4.text="$formattedDate4"
        format5.text="$formattedDate5"
    }
}