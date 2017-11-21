package com.patech.javatutorial;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;

public class ChapterActivity extends AppCompatActivity {

    private WebView webHolder = null;
    public static String PATH = "FILE_PATH";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        webHolder = (WebView) findViewById(R.id.webView);

        Intent i = getIntent();
        String filePath = i.getStringExtra(PATH);
        setTitle(filePath);

        String path = "file:///android_asset/" + "java/tutorial/" + filePath;
        webHolder.loadUrl(path);
    }
}
