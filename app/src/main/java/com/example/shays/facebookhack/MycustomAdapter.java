package com.example.shays.facebookhack;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by shays on 17-Jan-18.
 */

public class MycustomAdapter  extends BaseAdapter{
    private Context mContext;
    private final String[] web;
    private final int[] Imageid;

    public MycustomAdapter(Context c,String[] web,int[] Imageid ) {
        mContext = c;
        this.Imageid = Imageid;
        this.web = web;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return web.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View grid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid = new View(mContext);
            grid = inflater.inflate(R.layout.lvlayout, null);
            TextView textView = grid.findViewById(R.id.imag);
            ImageView imageView = grid.findViewById(R.id.txid);
            textView.setText(web[position]);
            imageView.setImageResource(Imageid[position]);
        } else {
            grid = (View) convertView;
        }

        return grid;
    }
}