package com.kodluyoruz.hellokodluyoruz.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.kodluyoruz.hellokodluyoruz.R;

/**
 * Created by Feti on 16.07.2017.
 */

public class ExampleFragment extends Fragment implements View.OnClickListener {
    private Button dynamic_denemeButton;
    private View vi;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vi = inflater.inflate(R.layout.fragment_example,container,false);
        dynamic_denemeButton = (Button) vi.findViewById(R.id.deneme_button);
        dynamic_denemeButton.setOnClickListener(this);
        return vi;
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==dynamic_denemeButton.getId()){
            Toast.makeText(this.getActivity(),"Clicked2",Toast.LENGTH_LONG).show();
        }
    }
}
