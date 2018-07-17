package techcare.eimon.eimran.attachmentproject;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout l1,l2;
    Button btnsub;
    Animation uptodown,downtoup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // btnsub = (Button)findViewById(R.id.buttonsub);
        l1 = (LinearLayout) findViewById(R.id.l1);
        l2 = (LinearLayout) findViewById(R.id.l2);
        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        l1.setAnimation(uptodown);
        l2.setAnimation(downtoup);



        TextView tx = (TextView)findViewById(R.id.intro_1);

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/f.ttf");

        tx.setTypeface(custom_font);

        TextView tx_1 = (TextView)findViewById(R.id.intro_2);

        tx_1.setTypeface(custom_font);

        TextView tx_2 = (TextView)findViewById(R.id.intro_3);

        tx_2.setTypeface(custom_font);

       Button tv = (Button) findViewById(R.id.log_in);


        tv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, welcome.class);
                startActivity(intent);

            }
        });


        Button tv_1 = (Button) findViewById(R.id.explore);


        tv_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, home_grid.class);
                startActivity(intent);

            }
        });

    }
}