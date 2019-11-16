package com.example.shakeddromi.menuoptions;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

/**
 * @author Shaked Dromi
 * @version beta
 * @since 16/11/19
 * this is the main activity. here you can choose between 3 options, the screen color.
 * in this activity there is a button that can take you to the second activity.
 */

public class MainActivity extends AppCompatActivity {
    LinearLayout ll;

    /**
     *ll- the LinearLayout object.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll=(LinearLayout)findViewById(R.id.ll);
    }

    /**
     * this method creates a menu.
     */

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /**
     * @param item - this is the option the user chose.
     * this method changes the background color, according to the color the user chose.
     */

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (R.id.green == id) {
            ll.setBackgroundColor(Color.GREEN);
        } else {
            if (id == R.id.red) {
                ll.setBackgroundColor(Color.RED);
            } else
                ll.setBackgroundColor(Color.BLUE);
        }
        return true;
    }

    /**
     * this method takes the user to the second activity.
     */

    public void nxt(View view) {
        Intent si=new Intent(this,Main22Activity.class);
        startActivity(si);
    }
}