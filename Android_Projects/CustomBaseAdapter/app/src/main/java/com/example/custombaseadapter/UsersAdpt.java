package com.example.custombaseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class UsersAdpt extends BaseAdapter {

    String[] names;
    String[] description ;
    Context context;
    LayoutInflater inflater;


    public UsersAdpt(Context appContext, String[] rName, String[] rDesc ){

        this.names= rName;
        this.description= rDesc;
        this.context = appContext;
        this.inflater = inflater.from(appContext);

    }


    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.from(context).inflate(R.layout.activity_my_list,null);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView desc = (TextView) convertView.findViewById(R.id.desc);

        name.setText(names[position]);
        desc.setText(description[position]);


        return convertView;
    }
}
