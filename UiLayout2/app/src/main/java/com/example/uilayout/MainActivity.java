package com.example.uilayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.uilayout.listener.ClickListener;

public class MainActivity extends AppCompatActivity {
    public ClickListener onclikls;

    public Button main_bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionbar = getSupportActionBar();
        if(actionbar!=null)
        {
            actionbar.hide();
        }
        onclikls = new ClickListener(this);
        init();
    }

    public void  init()
    {
        main_bt1 = (Button)findViewById(R.id.main_button1);
        main_bt1.setOnClickListener(onclikls);
    }

}
