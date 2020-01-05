package com.example.thepranami.addtwostringff;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class  Fragtwo extends Fragment {


    public Fragtwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragtwo, container, false);
        Bundle bundle = getArguments();
        String s1 = bundle.getString("Fn");
        String s2 = bundle.getString("Mn");
        String s3 = bundle.getString("Ln");

        TextView t1 =  (TextView) view.findViewById(R.id.tv1);
        t1.setText(s1+" "+s2+" "+s3);

        return view;
    }

}
