package com.decoderssquad.nss.facebooksecurity;

import android.content.Context;
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
    String[] namesz;
    int[] imsz;
    Context ct;
    private  static LayoutInflater inflater=null;

    public MycustomAdapter(MainActivity mainact, String[] name, int[] imag){
        namesz=name;
        imsz=imag;
        ct =mainact;
        inflater =(LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);




    }

    @Override
    public int getCount() {
        return namesz.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int positon) {
        return positon;
    }

    public class MyHOlder{
        TextView tvs;
        ImageView img;

    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        MyHOlder myh= new MyHOlder();
        View myview;
        myview=inflater.inflate(R.layout.lvlayout,null);
        myh.tvs =(TextView)myview.findViewById(R.id.txid);
        myh.img =(ImageView) myview.findViewById(R.id.img);

        myh.tvs.setText(namesz[position]);
        myh.img.setImageResource(imsz[position]);





        return myview;
    }
}
