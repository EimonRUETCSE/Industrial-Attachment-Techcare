package techcare.eimon.eimran.attachmentproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by HP on 5/2/2017.
 */

public class pref_activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pref_activity);

        Button orderB = (Button) findViewById(R.id.order);
        orderB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pref_activity.this, delivery_date.class);
                startActivity(intent);

            }
        });

    }


}
