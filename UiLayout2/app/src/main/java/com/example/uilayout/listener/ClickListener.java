package com.example.uilayout.listener;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.content.Context;

import com.example.uilayout.R;

public class ClickListener implements View.OnClickListener{
    public Activity act;

    public ClickListener(Activity act) {
        this.act = act;
    }
    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.main_button1:
                activityChange();
                break;
                default:
                    break;
        }
    }

    //活动间跳转的方法
    public void activityChange()
    {
//        //显式跳转似乎不行，emmmmm,用了getApplicationContext(这个方法，好像也可以
//        Intent intent = new Intent(act.getApplicationContext(),ListView_Activity.class);
        //隐式跳转
        Log.d("act","点击了按钮啊，怎么回事，没反应");
        Intent intent = new Intent("com.example.activitytest.ACTION_START");
        intent.addCategory("com.example.activitytest.TESTFO");
        act.startActivity(intent);
    }
}
