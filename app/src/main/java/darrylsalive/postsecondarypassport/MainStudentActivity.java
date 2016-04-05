package darrylsalive.postsecondarypassport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;

public class MainStudentActivity extends ActionBarActivity {
    ImageView nineImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_student);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nineImage = (ImageView)findViewById(R.id.nineView);

        nineImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NinthGradeActivity.class);
                startActivity(intent);
            }
        });
    }

}
