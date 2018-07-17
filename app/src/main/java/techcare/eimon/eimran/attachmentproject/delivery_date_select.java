package techcare.eimon.eimran.attachmentproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class delivery_date_select extends AppCompatActivity {

    public void buttonClick(View view)
    {
        Button button = (Button)findViewById(R.id.button4);
        Toast.makeText(this, "This is the starting day & can't be pickup day.", Toast.LENGTH_LONG).show();
    }
    public void buttonClicked(View view)
    {
        Button button = (Button)findViewById(R.id.button5);
        Toast.makeText(this, "This is the end day & can't be return day.", Toast.LENGTH_LONG).show();
    }
    public void buttonTwo(View view)
    {
        Button button2 =(Button) findViewById(R.id.button4);
        Toast.makeText(this, "This is set as your pickup day.", Toast.LENGTH_LONG).show();
    }
    public void buttonThree(View view)
    {
        Button button2 = (Button)findViewById(R.id.button4);
        Toast.makeText(this, "This is set as your return day.", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_date_select);

        Button d_done = (Button) findViewById(R.id.delivery_done);
        d_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(delivery_date_select.this, map.class);
                startActivity(intent);

            }
        });




    }
}
