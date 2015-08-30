package com.google.android.apps.watchme;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class StreamListActivity extends Activity{

    private RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stream_list);

        //testing
        List<StreamInfo> myDataset = new ArrayList<>();
        StreamInfo si = new StreamInfo(getResources().getDrawable( R.drawable.common_ic_googleplayservices ), "Stream1", "Stream2");
        StreamInfo si2 = new StreamInfo(getResources().getDrawable( R.drawable.common_ic_googleplayservices ), "Stream3", "Stream4");
        StreamInfo si3 = new StreamInfo(getResources().getDrawable( R.drawable.common_ic_googleplayservices ), "Stream5", "Stream6");
        StreamInfo si4 = new StreamInfo(getResources().getDrawable( R.drawable.common_ic_googleplayservices ), "Stream7", "Stream8");
        myDataset.add(si);
        myDataset.add(si2);
        myDataset.add(si3);
        myDataset.add(si4);


        RecyclerView recList = (RecyclerView) findViewById(R.id.streams_recycler_view);
        recList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        mAdapter = new StreamAdapter(myDataset);
        recList.setAdapter(mAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_stream_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
