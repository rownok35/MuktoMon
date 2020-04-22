package com.example.muktomon2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class web4 extends AppCompatActivity {
    private WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web4);
        webView1=findViewById(R.id.webview4);
        webView1.setWebViewClient(new WebViewClient());
        webView1.loadUrl("https://www.unicef.org/bangladesh/%E0%A6%97%E0%A6%B2%E0%A7%8D%E0%A6%AA%E0%A6%B8%E0%A6%AE%E0%A7%82%E0%A6%B9/%E0%A6%95%E0%A6%B0%E0%A7%8B%E0%A6%A8%E0%A6%BE%E0%A6%AD%E0%A6%BE%E0%A6%87%E0%A6%B0%E0%A6%BE%E0%A6%B8-%E0%A6%B0%E0%A7%8B%E0%A6%97-%E0%A6%95%E0%A7%8B%E0%A6%AD%E0%A6%BF%E0%A6%A1-%E0%A7%A7%E0%A7%AF");
        WebSettings webSettings=webView1.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (webView1.canGoBack()) {
            webView1.goBack();
        } else {
            super.onBackPressed();
        }
    }
}

