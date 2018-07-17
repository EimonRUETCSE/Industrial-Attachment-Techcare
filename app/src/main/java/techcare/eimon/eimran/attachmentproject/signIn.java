package techcare.eimon.eimran.attachmentproject;

/**
 * Created by Eimon on 21-05-18.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;


public class signIn extends AppCompatActivity {

    private EditText user_name, password, p_no;

    Button button;
    private DatabaseReference databaseRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        user_name=(EditText) findViewById(R.id.user_name);
        password=(EditText) findViewById(R.id.password);
        p_no=(EditText) findViewById(R.id.p_no);





    }
}

