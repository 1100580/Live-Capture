package com.google.android.apps.watchme;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class StarterActivity extends Activity {

    Button startStream, watchStreams;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);

        startStream =   (Button) findViewById(R.id.startStream);
        watchStreams =  (Button) findViewById(R.id.watchStream);

        startStream.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent stream = new Intent(StarterActivity.this, MainActivity.class);
                startActivity(stream);
            }
        });

        watchStreams.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent watch = new Intent(StarterActivity.this, StreamListActivity.class);
                startActivity(watch);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_starter, menu);
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
