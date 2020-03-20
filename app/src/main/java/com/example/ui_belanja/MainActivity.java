package com.example.ui_belanja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.kingfisher.easyviewindicator.RecyclerViewIndicator;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    ArrayList<Model>Models = new ArrayList<>();
    Adapter Adapter;
    RecyclerViewIndicator indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recycler);
        indicator = findViewById(R.id.indicator);

        LinearLayoutManager layoutManager = new LinearLayoutManager(
          MainActivity.this,LinearLayoutManager.HORIZONTAL,false
        );

        recycler.setLayoutManager(layoutManager);
        recycler.setItemAnimator(new DefaultItemAnimator());

        Adapter = new Adapter(Models);
        recycler.setAdapter(Adapter);
        indicator.setRecyclerView(recycler);
        dataList();

    }

    private void dataList() {

        Model item = new Model(R.drawable.ic_omg,"Combo Extra Internet OMG!","50 GB","30 Hari","Rp 150.000 ","Rp 199.999");
        Models.add(item);
        Model item1 = new Model(R.drawable.ic_omg,"Internet Unlimited","12 GB","50 Hari","Rp 500.000","Rp 199.999");
        Models.add(item1);
        Model item2 = new Model(R.drawable.ic_omg,"Combo Extra Internet OMG!","50 GB","30 Hari","Rp 150.000","Rp 199.999");
        Models.add(item2);
        Model item3 = new Model(R.drawable.ic_omg,"Combo Extra Internet OMG!","50 GB","30 Hari","Rp 150.000","Rp 199.999");
        Models.add(item3);
        Model item4 = new Model(R.drawable.ic_omg,"Combo Extra Internet OMG!","50 GB","30 Hari","Rp 150.000","Rp 199.999");
        Models.add(item4);
        Model item5 = new Model(R.drawable.ic_omg,"Combo Extra Internet OMG!","50 GB","30 Hari","Rp 150.000","Rp 199.999");
        Models.add(item5);
        Model item6 = new Model(R.drawable.ic_omg,"Combo Extra Internet OMG!","50 GB","30 Hari","Rp 150.000","Rp 199.999");
        Models.add(item6);
        Model item7 = new Model(R.drawable.ic_omg,"Combo Extra Internet OMG!","50 GB","30 Hari","Rp 150.000","Rp 199.999");
        Models.add(item7);

    }
}
