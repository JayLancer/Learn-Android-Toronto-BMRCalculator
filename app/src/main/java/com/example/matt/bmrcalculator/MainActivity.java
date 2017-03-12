package com.example.matt.bmrcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the views defined in the XML and assign them to variables representing the
        // objects that they are.
        TextView ageTextView = (TextView) findViewById(R.id.ageTextView);
        TextView sexTextView = (TextView) findViewById(R.id.sexTextView);
        TextView heightTextView = (TextView) findViewById(R.id.heightTextView);
        TextView weightTextView = (TextView) findViewById(R.id.weightTextView);
        TextView bmrTextView = (TextView) findViewById(R.id.bmrTextView);

        BasalMetabolicRate person1 = new BasalMetabolicRate(BasalMetabolicRate.MALE, 183, 21, 93);
        double bmrOfPerson1 = person1.getBmr();

        ageTextView.setText(String.valueOf(person1.getAge()));
        sexTextView.setText(person1.getGender());
        heightTextView.setText(String.valueOf(person1.getHeight()));
        weightTextView.setText(String.valueOf(person1.getWeight()));
        bmrTextView.setText(String.valueOf(person1.getBmr()));
    }
}
