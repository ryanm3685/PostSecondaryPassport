package darrylsalive.postsecondarypassport;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class TempLoginActivity extends ActionBarActivity {

    Map<String, String> users = new HashMap<String,String>();
    EditText user, password;
    //Button loginButton;
    ImageButton loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_login);

        users.put("Sean", "password");
        //users.put("Ryan", "password"); todo:  possibly add back in as "teacher" user
        user = (EditText)findViewById(R.id.usernameText);
        password = (EditText)findViewById(R.id.passwordText);
        loginButton = (ImageButton)findViewById(R.id.signInButton);//(Button)findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT);
                String username = user.getText().toString();

                if (users.containsKey(username)) { //user exisits
                    String pwdString = password.getText().toString();
                    if (users.get(username).equals(pwdString)) //log in
                    {
                        Intent intent = new Intent(getApplicationContext(), MainStudentActivity.class);
                        startActivity(intent);
                    }
                    else //wrong password
                    {
                        toast.setText("That password is incorrect for this user");
                        toast.show();
                    }
                }
                else //user doesn't exisit
                {
                    toast.setText("That user doesn't exist");
                    toast.show();
                }
            }
        });

    }


}
