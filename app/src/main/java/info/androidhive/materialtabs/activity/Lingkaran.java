package info.androidhive.materialtabs.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;

public class Lingkaran extends AppCompatActivity {


    EditText number1,number2;
    TextView result;
    Button luas;
    Button keliling;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        number1=findViewById(R.id.txtnumber1);
        number2=findViewById(R.id.txtnumber2);
        result=findViewById(R.id.hasil);
        luas=findViewById(R.id.luas);
        keliling=findViewById(R.id.keliling);

        toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka2 = number1.getText().toString();
                if(angka2.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Invalid opration",Toast.LENGTH_LONG).show();
                }else {
                    double Diameter1=Double.parseDouble(angka2);
                    double Diameter2=Double.parseDouble(angka2);
                    double tambah= 22*(Diameter1*Diameter2)/7;
                    result.setText(String.valueOf(tambah));
                }
            }
        });
        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka2 = number1.getText().toString();
                if(angka2.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Invalid opration",Toast.LENGTH_LONG).show();
                }else {
                    double Diameter1=Double.parseDouble(angka2);
                    double Diameter2=Double.parseDouble(angka2);
                    double tambah= 2*22*(Diameter1*Diameter2)/7;
                    result.setText(String.valueOf(tambah));
                }

            }
        });

    }
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}

