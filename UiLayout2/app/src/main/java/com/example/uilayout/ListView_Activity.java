package com.example.uilayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.uilayout.widgetClass.Fruit;
import com.example.uilayout.widgetClass.FruitAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListView_Activity extends AppCompatActivity {

    private String[] data={"苹果","梨子","香蕉","西瓜","凤梨","火龙果","龙眼","枸杞","水蜜桃","樱桃"
    ,"fruit1","fruit1","fruit1","fruit1","fruit1","fruit1","fruit1","fruit1","fruit1"};

    private List<Fruit> fruitList = new ArrayList<>();
    public ArrayAdapter<String> adapter;
    public ListView test_listView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_);
        ActionBar actionbar = getSupportActionBar();
        if(actionbar!=null)
        {
            actionbar.hide();
        }
        //第一次使用listView时写的，只是单纯的文字
//        adapter = new ArrayAdapter<String>(ListView_Activity.this,android.R.layout.simple_list_item_1,data);
//        test_listView1 = (ListView)findViewById(R.id.test_listview);
//        test_listView1.setAdapter(adapter);

        //第二次尝试listView
        initfruit();
        FruitAdapter fruadpter = new FruitAdapter(ListView_Activity.this,R.layout.fruit_item,fruitList);
        test_listView1 = (ListView)findViewById(R.id.test_listview);
        test_listView1.setAdapter(fruadpter);
    }

    public void initfruit()
    {
    for(int i = 0;i<2;i++)
    {
        Fruit apple = new Fruit("苹果", R.drawable.apple);
        fruitList.add(apple);
        Fruit avocado = new Fruit("牛油果", R.drawable.avocado);
        fruitList.add(avocado);
        Fruit banana = new Fruit("香蕉", R.drawable.banana);
        fruitList.add(banana);
        Fruit cherry = new Fruit("樱桃", R.drawable.cherry);
        fruitList.add(cherry);
        Fruit grape = new Fruit("葡萄", R.drawable.grape);
        fruitList.add(grape);
        Fruit green_orange = new Fruit("青柠", R.drawable.green_orange);
        fruitList.add(green_orange);
        Fruit kiwi = new Fruit("猕猴桃", R.drawable.kiwi);
        fruitList.add(kiwi);
        Fruit lemon = new Fruit("柠檬", R.drawable.lemon);
        fruitList.add(lemon);
        Fruit lizhi = new Fruit("荔枝", R.drawable.lizhi);
        fruitList.add(lizhi);
        Fruit mugua = new Fruit("木瓜", R.drawable.mugua);
        fruitList.add(mugua);
        Fruit orange = new Fruit("橙子", R.drawable.orange);
        fruitList.add(orange);
        Fruit pineapple = new Fruit("菠萝", R.drawable.pineapple);
        fruitList.add(pineapple);
        Fruit pomegranate = new Fruit("石榴", R.drawable.pomegranate);
        fruitList.add(pomegranate);
        Fruit strawberry = new Fruit("草莓", R.drawable.strawberry);
        fruitList.add(strawberry);
        Fruit tao = new Fruit("桃子", R.drawable.tao);
        fruitList.add(tao);
        Fruit wuhuaguo = new Fruit("无花果", R.drawable.wuhuaguo);
        fruitList.add(wuhuaguo);
        Fruit yangtao = new Fruit("杨桃", R.drawable.yangtao);
        fruitList.add(yangtao);
    }
    }

}
