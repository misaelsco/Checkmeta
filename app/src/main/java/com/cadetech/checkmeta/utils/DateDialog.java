package com.cadetech.checkmeta.utils;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.cadetech.checkmeta.MetaActivity;
import com.cadetech.checkmeta.R;

import java.util.Calendar;

/**
 * Created by misael.correia on 24/09/2016.
 */
public class DateDialog extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    //public int quemChamou;
    public Button target;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current date as the default date in the picker
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getActivity(), this , year, month, day);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

        Log.i("btnIdView", String.valueOf(view.getId()) );
        String date = dayOfMonth + "/" + (month+1) + "/" + year;
        
       /* if(quemChamou == 1)
            ((Button) getActivity().findViewById(R.id.btnDataDesejada)).setText(date);
        else
            ((Button) getActivity().findViewById(R.id.btnDataRealizada)).setText(date);*/
        target.setText(date);
        Log.i("btnIdView", String.valueOf(view.getId()) );
    }



}
