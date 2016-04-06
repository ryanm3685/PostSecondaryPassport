package darrylsalive.postsecondarypassport;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class SMARTGoalsActivity extends ActionBarActivity {
    ListView lv;
    List<String> subGoals = new ArrayList<String>();
    Button addGoals;
    Context theContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smartgoals);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        subGoals.add("Get 90% or higher on math quiz - completed 5/5/2017");
        subGoals.add("Receive assistance in derivatives by Ryan - in progress");

        lv=(ListView) findViewById(R.id.smartGoalsListView);
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

        addGoals = (Button)findViewById(R.id.addSubgoalButton);


        addGoals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                DatePickerDialog dialog = new DatePickerDialog(getApplicationContext(), new DatePickerDialog.OnDateSetListener() {
//                    @Override
//                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
//
//                    }
//                }, Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH);
//                dialog.show();
                EditText subgoal, date;
                subgoal = (EditText) findViewById(R.id.subgoalText);
                date = (EditText) findViewById(R.id.dueDateText);
                ryanFragment r = new ryanFragment();
                r.show(getFragmentManager(), "The Dialog");


                }


        });
    }

    public static class ryanFragment extends DialogFragment {
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            // Get the layout inflater
            LayoutInflater inflater = getActivity().getLayoutInflater();

            // Inflate and set the layout for the dialog
            // Pass null as the parent view because its going in the dialog layout
            builder.setView(inflater.inflate(R.layout.enter_subgoal, null))
                    // Add action buttons
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int id) {

                        }
                    })
                    .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            ryanFragment.this.getDialog().cancel();
                        }
                    });
            return builder.create();
        }
    }
}
