package com.example.uilayout.widgetClass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.uilayout.R;

import java.util.List;

public class FruitAdapter extends ArrayAdapter<Fruit> {

    private  int resouceID;
    public FruitAdapter(Context context, int textViewResourceid, List<Fruit> objects)
    {
        super(context, textViewResourceid, objects);
        resouceID = textViewResourceid;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //ViewHolder内部类
        class ViewHolder{
            ImageView fruitImage;
            TextView fruitname;
        }

        //获取当前的Fruit实例
        Fruit fruit = getItem(position);
        View view;
        ViewHolder viewhold;
        if(convertView==null)
        {
            viewhold = new ViewHolder();
            view = LayoutInflater.from(getContext()).inflate(resouceID,parent,false);
            viewhold.fruitImage = (ImageView)view.findViewById(R.id.fruit_image);
            viewhold.fruitname = (TextView) view.findViewById(R.id.fruit_name);
            view.setTag(viewhold);//将viewHolder存储在view中
        }
        else
        {
            view = convertView;
            viewhold = (ViewHolder)view.getTag();
        }
        viewhold.fruitImage.setImageResource(fruit.getImageID());
        viewhold.fruitname.setText(fruit.getName());
        return view;
    }
}
