package com.example.uilayout.widgetClass;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.uilayout.R;

public class TitleLayout extends LinearLayout {
    public Button title_bt_back,title_bt_edit;


    public TitleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        title_bt_back = (Button)findViewById(R.id.title_bt_back);
        title_bt_edit = (Button)findViewById(R.id.title_bt_edit);

        title_bt_back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                ((Activity)getContext()).finish();
            }
        });

        title_bt_edit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"你想怎么编辑我呢？哼",Toast.LENGTH_SHORT).show();
            }
        });
    }
}