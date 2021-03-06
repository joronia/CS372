package com.example.jose.cointoss;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends ActionBarActivity {
    //setting textview to null.
    TextView myAwesomeTextView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myAwesomeTextView = (TextView) findViewById(R.id.cointoss);
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

    /**
     * function to get heads or tails.
     * @param v
     */
    public void cointossgame(View v) {
        Random coin = new Random();
        int result = coin.nextInt(2);

        if (result == 1) {
            myAwesomeTextView.setText("It is tails!");
        } else myAwesomeTextView.setText("It is Heads!");
    }

    /**
     * Class example.
     * @param v
     */
    public void toggleLabel(View v) {
        TextView f = (TextView)this.findViewById(R.id.cointoss);
        int visible = f.getVisibility() == View.VISIBLE ?
                View.INVISIBLE : View.VISIBLE;
        f.setVisibility(visible);
    }
}
