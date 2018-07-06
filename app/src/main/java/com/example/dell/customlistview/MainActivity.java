package com.example.dell.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    String[]  title ={
            "Title 1","Title 2",
            "Title 3","Title 4",
            "Title 5",
    };
    String[] subtitle ={
            "Sub Title 1","Sub Title 2",
            "Sub Title 3","Sub Title 4",
            "Sub Title 5",
    };
    Integer[] imid = {R.drawable.c6
                        ,R.drawable.c7,
                        R.drawable.c8,
                        R.drawable.c9,
                 R.drawable.c10};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyCustomAdapter adapter = new MyCustomAdapter(this, title, subtitle, imid);
        lv=(ListView)findViewById(R.id.list);
        lv.setAdapter(adapter);

    }
}
