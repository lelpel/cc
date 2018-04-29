package ua.lelpel.coloredcircles;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

public class CircleActivity extends AppCompatActivity implements CircleFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
    }

    @Override
    public void onListFragmentInteraction(String item) {
        AlertDialog dialog = createDialog(item);
        dialog.show();
    }

    private AlertDialog createDialog(String itemName) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(itemName).setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                dialog.dismiss();
            }
        }).setTitle("Result");

        return builder.create();
    }
}
