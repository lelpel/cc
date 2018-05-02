package ua.lelpel.coloredcircles;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class CircleActivity extends AppCompatActivity implements CircleFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
    }

    @Override
    public void onListFragmentInteraction(String item) {
        NumberDialog.newInstance(item).show(getSupportFragmentManager(), "dialog");
    }
}
