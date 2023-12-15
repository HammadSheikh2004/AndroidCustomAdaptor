package com.example.customadaptor;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<MobileData> arrayList = new ArrayList<>();

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        arrayList.add(new MobileData("IPhone 15","Black","iOS 15",R.drawable.img1));
        arrayList.add(new MobileData("IPhone 13","Blue","iOS 15",R.drawable.img1));

        CustomAdaptor customAdaptor = new CustomAdaptor(this,arrayList);
        listView.setAdapter(customAdaptor);
    }
}