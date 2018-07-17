package techcare.eimon.eimran.attachmentproject;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class welcome extends AppCompatActivity {

    EditText user_name;
    EditText password;
    Button tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        user_name = (EditText) findViewById(R.id.user_name);
        password  = (EditText) findViewById(R.id.password);
        tv = (Button) findViewById(R.id.s_up_button);


        tv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(welcome.this, signIn.class);
                startActivity(intent);

            }
        });

        final Button login = (Button) findViewById(R.id.log_in);
        //login.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //       Intent intent = new Intent(MainActivity.this, home.class);
        //      startActivity(intent);

        //  }
        //  });



        final FirebaseDatabase database =FirebaseDatabase.getInstance();
        final DatabaseReference table_user = database.getReference("User");

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final ProgressDialog mDailogue=new ProgressDialog(welcome.this);
                mDailogue.setMessage("Please Wait...");
                mDailogue.show();

                table_user.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if(dataSnapshot.child(user_name.getText().toString()).exists()) {

                            mDailogue.dismiss();
                            User user = dataSnapshot.child(user_name.getText().toString()).getValue(User.class);
                            if (user.getPassword().equals( password.getText().toString())) {

                                Intent intent = new Intent(welcome.this, home_grid.class);
                                startActivity(intent);


                            } else {

                                Toast.makeText(welcome.this, "Sign In Failed", Toast.LENGTH_SHORT).show();


                            }
                        }
                        else
                        {
                            Toast.makeText(welcome.this, "User Dont Exist!", Toast.LENGTH_SHORT).show();

                        }


                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });





            }
        });



    }
}
