package com.example.grid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class GridViewAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<GridItem> items;

    public GridViewAdapter(Context context, ArrayList<GridItem> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
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
        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.item_grid, null);
        TextView tv = convertView.findViewById(R.id.gridtv);
        ImageView iv = convertView.findViewById(R.id.gridimg);
        ImageView star  = convertView.findViewById(R.id.star);

        tv.setText(items.get(position).getText());
        iv.setImageResource(items.get(position).getImage());
        if (items.get(position).promotion) {
            star.setVisibility(View.VISIBLE);
        } else {
            star.setVisibility(View.INVISIBLE);
        }
        return convertView;
    }
}
