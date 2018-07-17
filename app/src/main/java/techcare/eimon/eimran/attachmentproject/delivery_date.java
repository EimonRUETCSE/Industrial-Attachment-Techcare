package techcare.eimon.eimran.attachmentproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

public class delivery_date extends AppCompatActivity {
    CalendarView calendarView;

    public void weekOne(View view)
    {
        Toast.makeText(delivery_date.this, "You are ordering for one week", Toast.LENGTH_SHORT).show();
    }
    public void weekTwo(View view)
    {
        Toast.makeText(delivery_date.this, "You are ordering for two weeks", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_date);

        Button myButton =(Button) findViewById(R.id.s_1);
        myButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(delivery_date.this, delivery_date_select.class));
                calendarView = (CalendarView) findViewById(R.id.calend);
                calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
                    @Override
                    public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                        Toast.makeText(delivery_date.this, dayOfMonth + "/" + month + "/" + year + " is your starting day", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });




    }
    }

