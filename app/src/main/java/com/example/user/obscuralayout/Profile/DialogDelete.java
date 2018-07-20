package com.example.user.obscuralayout.Profile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.obscuralayout.IObscura;
import com.example.user.obscuralayout.R;

/**
 * Created by User on 13.07.2018.
 */

public class DialogDelete extends DialogFragment implements View.OnClickListener {
    private IObscura iObscura;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dialog_delete, null);
        final TextView yes = (TextView) v.findViewById(R.id.dialog_delete_tv_yes);
        TextView no = (TextView) v.findViewById(R.id.dialog_delete_tv_no);
        TextView text = (TextView) v.findViewById(R.id.dialog_delete_tv_text);
        yes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               iObscura.deleteAccount();
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                iObscura.cancelDelete();
            }
        });
        return v;

    }
    @Override
    public void onClick(View view) {

    }
}
