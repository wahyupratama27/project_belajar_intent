package com.example.projectbelajarintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void panggil(View view) {
        Intent panggil = new Intent(Intent. ACTION_WEB_SEARCH);
        startActivity(panggil);
    }
    public void tentang(View view) {
        Intent tentang= new Intent(MainActivity.this, Tentang.class);
        startActivity(tentang);
    }
    public void buka(View view) {
        String url = "https://shopee.co.id/?af_click_lookback=7d&af_reengagement_window=7d&af_siteid=an_11278610000&af_sub_siteid=1f093089e6d4204583cf55e6a714ef09----&af_viewthrough_lookback=1d&c=-&is_retargeting=true&pid=affiliates&utm_campaign=-&utm_content=1f093089e6d4204583cf55e6a714ef09----&utm_medium=affiliates&utm_source=an_11278610000" ;
        Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity(bukabrowser);
    }
}