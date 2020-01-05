package com.example.thepranami.addtwostringff;



import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragone extends Fragment {
    EditText e1, e2, e3;
    Button b;



    public Fragone() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragone, container, false);
        e1 = (EditText)view.findViewById(R.id.ed1);
        e2 = (EditText)view.findViewById(R.id.ed2);
        e3 = (EditText)view.findViewById(R.id.ed3);
        b = (Button)view.findViewById(R.id.send);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname = e1.getText().toString();
                String mname = e2.getText().toString();
                String lname = e3.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("Fn",fname);
                bundle.putString("Mn",mname);
                bundle.putString("Ln",lname);
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        Fragtwo frt = new Fragtwo();
        frt.setArguments(bundle);
        fragmentTransaction.replace(R.id.main_frame, frt);
        fragmentTransaction.commit();

            }
        });
        return view;
    }

}
