package techcare.eimon.eimran.attachmentproject;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class home extends AppCompatActivity {
    final Context context = this;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test1);

        Button button = (Button) findViewById(R.id.button9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(home.this, pref_activity.class);
                startActivity(intent);

            }
        });

        TextView txt = (TextView) findViewById(R.id.textView11);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.cus_dailogue);
                dialog.setTitle("       About Regular Deal!");

                // set the custom dialog components - text, image and button


                Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();

            }
        });



///////////////////////////////


        TextView txt_1 = (TextView) findViewById(R.id.textView1);
        txt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.cus_dialogue_p);
                dialog.setTitle("     About Premimum Deal!");

                // set the custom dialog components - text, image and button


                Button dialogButton = (Button) dialog.findViewById(R.id.cus_id_1);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();

            }
        });



        ////////////////////////


        TextView txt_2 = (TextView) findViewById(R.id.s_d);
        txt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.share_how);
                dialog.setTitle("          How To Share!");

                // set the custom dialog components - text, image and button


                Button dialogButton = (Button) dialog.findViewById(R.id.cus_id_2);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();

            }
        });


        /////////////////////

        Button button_1 = (Button) findViewById(R.id.bun9);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(home.this, share_shirt.class);
                startActivity(intent);

            }
        });







    }
}
