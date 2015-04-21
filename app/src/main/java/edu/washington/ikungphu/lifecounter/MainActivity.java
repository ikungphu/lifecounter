package edu.washington.ikungphu.lifecounter;

import android.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.View.OnClickListener;

import org.w3c.dom.Text;


public class MainActivity extends ActionBarActivity {

    LinearLayout ll;
    LinearLayout.LayoutParams layoutParams;

    private int p1 = 20;
    private int p2 = 20;
    private int p3 = 20;
    private int p4 = 20;

    Button p1p1;
    Button p1p5;
    Button p1m1;
    Button p1m5;

    Button p2p1;
    Button p2p5;
    Button p2m1;
    Button p2m5;

    Button p3p1;
    Button p3p5;
    Button p3m1;
    Button p3m5;

    Button p4p1;
    Button p4p5;
    Button p4m1;
    Button p4m5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView tv = (TextView) findViewById(R.id.p1life);

        p1p1 = (Button) findViewById(R.id.p1p1);
        p1p5 = (Button) findViewById(R.id.p1p5);
        p1m1 = (Button) findViewById(R.id.p1m1);
        p1m5 = (Button) findViewById(R.id.p1m5);

        p2p1 = (Button) findViewById(R.id.p2p1);
        p2p5 = (Button) findViewById(R.id.p2p5);
        p2m1 = (Button) findViewById(R.id.p2m1);
        p2m5 = (Button) findViewById(R.id.p2m5);

        p3p1 = (Button) findViewById(R.id.p3p1);
        p3p5 = (Button) findViewById(R.id.p3p5);
        p3m1 = (Button) findViewById(R.id.p3m1);
        p3m5 = (Button) findViewById(R.id.p3m5);

        p4p1 = (Button) findViewById(R.id.p4p1);
        p4p5 = (Button) findViewById(R.id.p4p5);
        p4m1 = (Button) findViewById(R.id.p4m1);
        p4m5 = (Button) findViewById(R.id.p4m5);

        OnClickListener listener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case (R.id.p1p1):
                        TextView update = (TextView) findViewById(R.id.p1life);
                        update.setText(p1 + 1 + "");
                        p1++;
                        checkLoser("1", p1);
                        break;
                    case (R.id.p1p5):
                        update = (TextView) findViewById(R.id.p1life);
                        update.setText(p1 + 5 + "");
                        p1 = p1 + 5;
                        checkLoser("1", p1);
                        break;
                    case (R.id.p1m1):
                        update = (TextView) findViewById(R.id.p1life);
                        if(p1 > 0) {
                            update.setText(p1 - 1 + "");
                            p1--;
                        } else {
                            update.setText("0");
                        }
                        checkLoser("1", p1);
                        break;
                    case (R.id.p1m5):
                        update = (TextView) findViewById(R.id.p1life);
                        if(p1 > 0) {
                            update.setText(p1 - 5 + "");
                            p1 = p1 - 5;
                        } else {
                            update.setText("0");
                            p1 = 0;
                        }
                        checkLoser("1", p1);
                        break;

                    case (R.id.p2p1):
                        update = (TextView) findViewById(R.id.p2life);
                        update.setText(p2 + 1 + "");
                        p2++;
                        checkLoser("2", p2);
                        break;
                    case (R.id.p2p5):
                        update = (TextView) findViewById(R.id.p2life);
                        update.setText(p2 + 5 + "");
                        p2 = p2 + 5;
                        checkLoser("2", p2);
                        break;
                    case (R.id.p2m1):
                        update = (TextView) findViewById(R.id.p2life);
                        if(p2 > 0) {
                            update.setText(p2 - 1 + "");
                            p2--;
                        } else {
                            update.setText("0");
                        }
                        checkLoser("2", p2);
                        break;
                    case (R.id.p2m5):
                        update = (TextView) findViewById(R.id.p2life);
                        update.setText(p2 - 5 + "");
                        p2 = p2 - 5;
                        checkLoser("2", p2);
                        break;

                    case (R.id.p3p1):
                        update = (TextView) findViewById(R.id.p3life);
                        update.setText(p3 + 1 + "");
                        p3++;
                        checkLoser("3", p3);
                        break;
                    case (R.id.p3p5):
                        update = (TextView) findViewById(R.id.p3life);
                        update.setText(p3 + 5 + "");
                        p3 = p3 + 5;
                        checkLoser("3", p3);
                        break;
                    case (R.id.p3m1):
                        update = (TextView) findViewById(R.id.p3life);
                        if(p3 > 0) {
                            update.setText(p3 - 1 + "");
                            p3--;
                        } else {
                            update.setText("0");
                        }
                        checkLoser("3", p3);
                        break;
                    case (R.id.p3m5):
                        update = (TextView) findViewById(R.id.p3life);
                        update.setText(p3 - 5 + "");
                        p3 = p3 - 5;
                        checkLoser("3", p3);
                        break;

                    case (R.id.p4p1):
                        update = (TextView) findViewById(R.id.p4life);
                        update.setText(p4 + 1 + "");
                        p4++;
                        checkLoser("4", p4);
                        break;
                    case (R.id.p4p5):
                        update = (TextView) findViewById(R.id.p4life);
                        update.setText(p4 + 5 + "");
                        p4 = p4 + 5;
                        checkLoser("4", p4);
                        break;
                    case (R.id.p4m1):
                        update = (TextView) findViewById(R.id.p4life);
                        if(p4 > 0) {
                            update.setText(p4 - 1 + "");
                            p4--;
                        } else {
                            update.setText("0");
                        }
                        checkLoser("4", p4);
                        break;
                    case (R.id.p4m5):
                        update = (TextView) findViewById(R.id.p4life);
                        update.setText(p4 - 5 + "");
                        p4 = p4 - 5;
                        checkLoser("4", p4);
                        break;

                }
            }
        };

        p1p1.setOnClickListener(listener);
        p1p5.setOnClickListener(listener);
        p1m5.setOnClickListener(listener);
        p1m1.setOnClickListener(listener);

        p2p1.setOnClickListener(listener);
        p2p5.setOnClickListener(listener);
        p2m5.setOnClickListener(listener);
        p2m1.setOnClickListener(listener);

        p3p1.setOnClickListener(listener);
        p3p5.setOnClickListener(listener);
        p3m5.setOnClickListener(listener);
        p3m1.setOnClickListener(listener);

        p4p1.setOnClickListener(listener);
        p4p5.setOnClickListener(listener);
        p4m5.setOnClickListener(listener);
        p4m1.setOnClickListener(listener);
    }

        public void checkLoser(String player, int life) {
            if(life <= 0) {
                TextView update = (TextView)findViewById(R.id.gameover);
                update.setText("Player " + player + " LOSES!");



            }
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
}

