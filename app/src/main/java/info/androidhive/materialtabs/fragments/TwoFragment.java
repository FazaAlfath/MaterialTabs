package info.androidhive.materialtabs.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.activity.Lingkaran;
import info.androidhive.materialtabs.activity.Persegi;
import info.androidhive.materialtabs.activity.PersegiPanjang;
import info.androidhive.materialtabs.activity.Segitiga;


public class TwoFragment extends Fragment {
    Button persegi;
    Button persegipanjang;
    Button segitiga;
    Button lingkaran;

    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        persegi = (Button) view.findViewById(R.id.persegi);
        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PERSEGI = new Intent(getActivity(), Persegi.class);
                startActivity(PERSEGI);
            }
        });
        persegipanjang = (Button) view.findViewById(R.id.persegipanjang);
        persegipanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PERSEGIPANJANG = new Intent(getActivity(), PersegiPanjang.class);
                startActivity(PERSEGIPANJANG);
            }
        });
        segitiga = (Button) view.findViewById(R.id.segitiga);
        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SEGITIGA = new Intent(getActivity(), Segitiga.class);
                startActivity(SEGITIGA);
            }
        });
        lingkaran = (Button) view.findViewById(R.id.lingkaran);
        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LINGKARAN = new Intent(getActivity(), Lingkaran.class);
                startActivity(LINGKARAN);
            }
        });
        // Inflate the layout for this fragment
        return view;

    }

}

