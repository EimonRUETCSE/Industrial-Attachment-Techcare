package techcare.eimon.eimran.attachmentproject;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;

public class home_grid extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_grid);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        //Set Event
        setSingleEvent(mainGrid);
        //setToggleEvent(mainGrid);
    }



    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid

            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) mainGrid.getChildAt(0);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //Change background color
                cardView.setCardBackgroundColor(Color.parseColor("#1082d1"));



                cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));



                Intent intent = new Intent(home_grid.this,home.class);

                startActivity(intent);

            }
        });
//////////////////
        final CardView cardView_1= (CardView) mainGrid.getChildAt(3);

        cardView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //Change background color
                cardView_1.setCardBackgroundColor(Color.parseColor("#1082d1"));



                cardView_1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));



                Intent intent = new Intent(home_grid.this,review_shirt.class);

                startActivity(intent);

            }
        });

        //////////////////

        final CardView cardView_2= (CardView) mainGrid.getChildAt(5);

        cardView_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //Change background color
                cardView_2.setCardBackgroundColor(Color.parseColor("#1082d1"));



                cardView_2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));



                Intent intent = new Intent(home_grid.this,MainActivity.class);

                startActivity(intent);

            }
        });
//////////////////////

        final CardView cardView_3= (CardView) mainGrid.getChildAt(2);

        cardView_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //Change background color
                cardView_3.setCardBackgroundColor(Color.parseColor("#1082d1"));



                cardView_3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));



                Intent intent = new Intent(home_grid.this,oreder_history.class);

                startActivity(intent);

            }
        });


        ///////////////

        final CardView cardView_4= (CardView) mainGrid.getChildAt(4);

        cardView_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //Change background color
                cardView_4.setCardBackgroundColor(Color.parseColor("#1082d1"));



                cardView_4.setCardBackgroundColor(Color.parseColor("#FFFFFF"));



                Intent intent = new Intent(home_grid.this,account_settings.class);

                startActivity(intent);

            }
        });






        TextView tx = (TextView)findViewById(R.id.textGrid);

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/f.ttf");

        tx.setTypeface(custom_font);

    }
}

