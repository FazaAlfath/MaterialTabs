package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;


public class OneFragment extends Fragment{

    Button btnplus;
    Button btnmin;
    Button btnkali;
    Button btnbagi;
    EditText txtAngka1;
    EditText txtAngka2;
    TextView txthasil;

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        super.onCreate(savedInstanceState);

        btnplus = view.findViewById(R.id.btnPenjumlahan);
        btnmin = view.findViewById(R.id.btnPengurangan);
        btnbagi = view.findViewById(R.id.btnPembagian);
        btnkali = view.findViewById(R.id.btnPerkalian);
        txtAngka1 = view.findViewById(R.id.txtAngka1);
        txtAngka2 = view.findViewById(R.id.txtAngka2);
        txthasil = (TextView)view.findViewById(R.id.hasil);

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Angka1 = txtAngka1.getText().toString();
                String angka2 = txtAngka2.getText().toString();
                if (Angka1.equalsIgnoreCase("")|| angka2.equalsIgnoreCase("")|| angka2.trim().isEmpty()){
                    Toast.makeText(getContext(), "maaf format salah",Toast.LENGTH_LONG).show();

                }else {
                    double angkat1, Angkat2 ,hasil;
                    angkat1 = Double.parseDouble(txtAngka1.getText().toString());
                    Angkat2 = Double.parseDouble(txtAngka2.getText().toString());
                    hasil = angkat1 + Angkat2;
                    txthasil.setText("Hasil dari" + angkat1+ "+" + Angkat2 + "=" + hasil);

                }
            }
        });
        btnmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Angka1 = txtAngka1.getText().toString();
                String angka2 = txtAngka2.getText().toString();
                if (Angka1.equalsIgnoreCase("")|| angka2.equalsIgnoreCase("")|| angka2.trim().isEmpty()){
                    Toast.makeText(getContext(), "maaf format salah",Toast.LENGTH_LONG).show();

                }else {
                    double angkat1, Angkat2 ,hasil;
                    angkat1 = Double.parseDouble(txtAngka1.getText().toString());
                    Angkat2 = Double.parseDouble(txtAngka2.getText().toString());
                    hasil = angkat1 - Angkat2;
                    txthasil.setText("Hasil dari" + angkat1+ "-" + Angkat2 + "=" + hasil);

                }
            }
        });
        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Angka1 = txtAngka1.getText().toString();
                String angka2 = txtAngka2.getText().toString();
                if (Angka1.equalsIgnoreCase("")|| angka2.equalsIgnoreCase("")|| angka2.trim().isEmpty()){
                    Toast.makeText(getContext(), "maaf format salah",Toast.LENGTH_LONG).show();

                }else {
                    double angkat1, Angkat2 ,hasil;
                    angkat1 = Double.parseDouble(txtAngka1.getText().toString());
                    Angkat2 = Double.parseDouble(txtAngka2.getText().toString());
                    hasil = angkat1 * Angkat2;
                    txthasil.setText("Hasil dari" + angkat1+ "*" + Angkat2 + "=" + hasil);

                }
            }
        });
        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Angka1 = txtAngka1.getText().toString();
                String angka2 = txtAngka2.getText().toString();
                if (Angka1.equalsIgnoreCase("")|| angka2.equalsIgnoreCase("")|| angka2.trim().isEmpty()){
                    Toast.makeText(getContext(), "maaf format salah",Toast.LENGTH_LONG).show();

                }else {
                    double angkat1, Angkat2 ,hasil;
                    angkat1 = Double.parseDouble(txtAngka1.getText().toString());
                    Angkat2 = Double.parseDouble(txtAngka2.getText().toString());
                    hasil = angkat1 / Angkat2;
                    txthasil.setText("Hasil dari" + angkat1+ "%" + Angkat2 + "=" + hasil);

                }
            }
        });
        // Inflate the layout for this fragment
        return view;

    }

}
