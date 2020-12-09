package com.lauwba.xmlkotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity


class JustifyText : AppCompatActivity() {

    lateinit var web : WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_justify_text)


        web= findViewById(R.id.webviewtext) as WebView
        web.isVerticalScrollBarEnabled = false
        web.loadData(getString(R.string.hello), "text/html; charset=utf-8", "utf-8")
    }
}