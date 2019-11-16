package com.example.shakeddromi.menuoptions;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * @author Shaked Dromi
 * @version beta
 * @since 16/11/19
 * this is the second activity. here you can choose between 4 options, the screen color.
 * in this activity there is a button that can take you back to the first activity.
 */

public class Main22Activity extends AppCompatActivity {
    LinearLayout ll;

    /**
     *ll- the LinearLayout object.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        ll=(LinearLayout)findViewById(R.id.ll);
    }

    /**
     * this method creates a menu.
     */

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,400,"yellow");
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
            }else {
                if (id == R.id.blue) {
                    ll.setBackgroundColor(Color.BLUE);
                } else ll.setBackgroundColor(Color.YELLOW);
            }
        }
        return true;
    }

    /**
     * this method takes the user to the first activity.
     */

    public void bk(View view) {
        finish();
    }
}
