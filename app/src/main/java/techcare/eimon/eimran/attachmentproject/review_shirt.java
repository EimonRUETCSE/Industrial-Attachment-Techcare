package techcare.eimon.eimran.attachmentproject;

/**
 * Created by Eimon on 24-05-18.
 */
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class review_shirt extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_shirt);

        viewPager = (ViewPager) findViewById(R.id.viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);

        viewPager.setAdapter(viewPagerAdapter);



        TextView tx = (TextView)findViewById(R.id.r_intro);

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/f.ttf");

        tx.setTypeface(custom_font);

    }

}