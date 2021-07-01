package com.example.graphview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @SuppressLint("SetJavaScriptEnabled")
    public void showcolumn(View a) {
        if (a.getId() == R.id.button_column) {
            WebView webView= findViewById(R.id.webView);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebChromeClient(new WebChromeClient());
            webView.loadUrl("file:///android_asset/index.html");
        }
    }
    @SuppressLint("SetJavaScriptEnabled")
    public void showpie(View a) {
        if (a.getId() == R.id.button_pie) {
            WebView webView= findViewById(R.id.webView);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebChromeClient(new WebChromeClient());
            webView.loadUrl("file:///android_asset/pie.html");
        }
    }
    @SuppressLint("SetJavaScriptEnabled")
    public void showdrilldown(View a) {
        if (a.getId() == R.id.button_drilldown) {
            WebView webView= findViewById(R.id.webView);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebChromeClient(new WebChromeClient());
            webView.loadUrl("file:///android_asset/drilldown.html");
        }
    }
}