package ua.lelpel.coloredcircles;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

/**
 * @author bruce
 * @date 02.05.2018
 */
public class NumberDialog extends DialogFragment {
    private String num;

    public static NumberDialog newInstance(String num) {
        NumberDialog d = new NumberDialog();

        Bundle args = new Bundle();
        args.putString("num", num);
        d.setArguments(args);

        return d;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        num = getArguments().getString("num");
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Вы кликнули на: " + num).setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                dialog.dismiss();
            }
        }).setTitle("Result");

        return builder.create();
    }
}
