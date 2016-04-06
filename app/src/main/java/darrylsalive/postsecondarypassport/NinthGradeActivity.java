package darrylsalive.postsecondarypassport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NinthGradeActivity extends ActionBarActivity {
    TextView smartGoals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth_grade);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        smartGoals = (TextView)findViewById(R.id.smartGoalsText);

        smartGoals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SMARTGoalsActivity.class);
                startActivity(intent);
            }
        });

    }

}
