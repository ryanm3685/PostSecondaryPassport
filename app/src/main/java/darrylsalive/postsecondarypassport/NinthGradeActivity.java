package darrylsalive.postsecondarypassport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NinthGradeActivity extends ActionBarActivity {
    TextView smartGoals, selfExploration, fourYearPlanning, volunteeringService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth_grade);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        smartGoals = (TextView)findViewById(R.id.smartGoalsText);
        selfExploration = (TextView)findViewById(R.id.selfExplorationText);
        fourYearPlanning = (TextView)findViewById(R.id.fourYearText);
        volunteeringService = (TextView)findViewById(R.id.volunteeringText);

        smartGoals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SMARTGoalsActivity.class);
                startActivity(intent);
            }
        });

        selfExploration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SelfExplorationActivity.class);
                startActivity(intent);
            }
        });

        fourYearPlanning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FourYearPlanningActivity.class);
                startActivity(intent);
            }
        });

        volunteeringService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), VolunteeringServiceActivity.class);
                startActivity(intent);
            }
        });



    }

}
