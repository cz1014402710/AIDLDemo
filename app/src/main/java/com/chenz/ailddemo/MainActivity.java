package com.chenz.ailddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView= (WebView) findViewById(R.id.webview);
        //设置WebView属性，能够执行Javascript脚本
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDefaultTextEncodingName("utf-8");
        //即asserts文件夹下有一个a.html
        webView.loadUrl("file:///android_asset/a.html");
    }
}
