package com.marcoleong.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void launchStreamer(View view) {
        this.displayToast("This button will launch Streamer");
    }

    public void launchDuo1(View view) {
        this.displayToast("This button will launch SCORES");
    }

    public void launchDuo2(View view) {
        this.displayToast("This button will launch LIBRARY");
    }

    public void launchAntTerminator(View view) {
        this.displayToast("This button will launch BUILD IT BIGGER");
    }

    public void launchMaterialize(View view) {
        this.displayToast("This button will launch BACON READER");
    }

    public void launchCapstone(View view) {
        this.displayToast("This button will launch CAPSTONE");
    }

    public void displayToast(CharSequence text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
