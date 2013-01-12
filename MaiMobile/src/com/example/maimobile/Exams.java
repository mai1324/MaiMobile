package com.example.maimobile;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Exams extends Activity{
	
	private WebView webview;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webpage);

        String url = "http://docs.google.com/viewer?url=http%3A%2F%2Fwww.uom.gr%2Fexetaseis%2Fmet_efpl%2Fa_ex_new_met_ef_pl_jan_13.pdf";

        webview = (WebView) findViewById(R.id.myWebView);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setLoadWithOverviewMode(true);
        webview.getSettings().setUseWideViewPort(true);
        webview.getSettings().setBuiltInZoomControls(true);
        webview.loadUrl(url);
       }   
    
}