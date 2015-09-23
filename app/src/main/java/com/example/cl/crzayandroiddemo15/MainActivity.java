package com.example.cl.crzayandroiddemo15;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

//基于ListActivity实现列表
//Acitvity继承ListActivity，ListActivity的子类无须条用setContentView方法来显示个界面，
//而是可以直接传入一个内容Adapter，ListActivity的子类就呈现出一个列表。
public class MainActivity extends ListActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //无须使用布局文件
        String[] arr = {"孙悟空", "猪八戒", "唐僧"};
        //创建ArrayAdapter对象
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_multiple_choice, arr);
        //设置改窗口显示列表
        setListAdapter(adapter);
      //  button = (Button) findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                setContentView(R.layout.sipleadapter);
//            }
//        });
    }
}
