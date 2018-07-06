package com.example.dell.customlistview;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyCustomAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] title;
    private final String[] subtitle;
    private final Integer[] imid;

    public MyCustomAdapter(Activity context, String[] title,String[] subtitle,
                           Integer[] imid) {
        super(context, R.layout.alist, title);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.title=title;
        this.subtitle=subtitle;
        this.imid=imid;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rootView=inflater.inflate(R.layout.alist, null,true);

        TextView titleText = (TextView) rootView.findViewById(R.id.title);
        ImageView imageView = (ImageView) rootView.findViewById(R.id.icon);
        TextView subtitleText = (TextView) rootView.findViewById(R.id.subtitle);

        titleText.setText(title[position]);
        imageView.setImageResource(imid[position]);
        subtitleText.setText(subtitle[position]);
        return rootView;
    }
}
