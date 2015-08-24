package org.sayem.stormy.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import org.sayem.stormy.R;

/**
 * Created by syed.sayem on 8/20/15.
 */
public class AlertDialogFragment  extends DialogFragment{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(context.getResources().getString(R.string.error_title))
                .setMessage(context.getResources().getString(R.string.error_message))
                .setPositiveButton(context.getResources().getString(R.string.error_ok_button), null);

        AlertDialog dialog = builder.create();
        return dialog;

    }
}