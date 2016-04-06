package darrylsalive.postsecondarypassport;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class VolunteeringServiceActivity extends ActionBarActivity {

    ListView lv;
    List<String> subGoals = new ArrayList<String>();
    Button addGoals;
    Context theContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteering_service);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        subGoals.add("5/3/2017.  GrubUp.  3 Hours.  Colin McGregor.");
        subGoals.add("5/10/2017.  Hossana House.  2 Hours.  Vicki Richetti.");
        subGoals.add("5/11/2017.  Gimp's Backyard Cleanup.  2 Hours.  Gimpzilla.");

        lv = (ListView) findViewById(R.id.volunteeringServiceList);
        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, subGoals);

        // Assign adapter to ListView
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,
                                    int position, long arg3) {
                // TODO Auto-generated method stub
                int itemPosition = position;

                // ListView Clicked item value
                String itemValue = (String) lv.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Position :" + itemPosition + "  ListItem : " + itemValue, Toast.LENGTH_LONG)
                        .show();
            }
        });

    }

}
