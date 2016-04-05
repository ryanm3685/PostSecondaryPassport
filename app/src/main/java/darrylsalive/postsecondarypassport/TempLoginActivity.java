package darrylsalive.postsecondarypassport;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashMap;
import java.util.Map;

public class TempLoginActivity extends ActionBarActivity {

    Map<String, String> users = new HashMap<String,String>();
    EditText user, password;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_login);

        users.put("Sean", "password");
        users.put("Ryan", "password");
        user = (EditText)findViewById(R.id.usernameText);
        password = (EditText)findViewById(R.id.passwordText);
        loginButton = (Button)findViewById(R.id.loginButton);
    }

}
