package com.example.webview

import android.annotation.SuppressLint
import android.os.Build
import android.os.Build.VERSION_CODES
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import android.webkit.WebView



class MainActivity : AppCompatActivity() {
    private lateinit var wb_webView:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wb_webView=findViewById<WebView>(R.id.wb_webView)

        webViewSetup()
    }


    private fun webViewSetup() {
        wb_webView.webViewClient = WebViewClient()

        wb_webView.apply {
            loadUrl("https://jherman.mccdgm.net/web105/lists-links-3/pages/links.html")
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true


        }

      fun onBackPressed() {
            if (wb_webView.canGoBack()) wb_webView.goBack() else super.onBackPressed()
        }

    }
}