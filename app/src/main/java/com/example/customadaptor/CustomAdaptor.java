package com.example.customadaptor;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;

public class CustomAdaptor extends BaseAdapter {
    Context context;
    LayoutInflater layoutInflater;
    ArrayList<MobileData> mobile_arrayList;

    @RequiresApi(api = Build.VERSION_CODES.M)
    public CustomAdaptor(Context context, ArrayList<MobileData> mobile_arrayList) {
        this.context = context;
        this.layoutInflater = layoutInflater;
        this.mobile_arrayList = mobile_arrayList;
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mobile_arrayList.size();
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
        View my_View = layoutInflater.inflate(R.layout.mobile_data,null);
        ImageView img = my_View.findViewById(R.id.mobileImage);
        TextView mobileName = my_View.findViewById(R.id.mobileName);
        TextView mobileColor = my_View.findViewById(R.id.mobileColor);
        TextView mobileModel = my_View.findViewById(R.id.mobileModel);

        MobileData mobileData = mobile_arrayList.get(position);
        mobileName.setText(mobileData.MobileName);
        mobileColor.setText(mobileData.MobileColor);
        mobileModel.setText(mobileData.MobileModel);
        img.setImageResource(mobileData.ImageId);

        return my_View;
    }
}
