package com.example.appcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText angka1, angka2;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Tambah(View v){
        angka1 = findViewById(R.id.txt_angkaPertama);
        angka2 = findViewById(R.id.txt_angkaKedua);
        hasil = findViewById(R.id.txt_hasil);

        if (TextUtils.isEmpty(angka1.getText()) || TextUtils.isEmpty(angka2.getText())){
            Toast.makeText(this, "Silahkan Masukkan Angka", Toast.LENGTH_SHORT).show();
        }else{
            double hasilHitung = Double.parseDouble(angka1.getText().toString()) + Double.parseDouble(angka2.getText().toString());
            hasil.setText(String.valueOf(hasilHitung));
        }
    }

    public void Kurang(View v){
        angka1 = findViewById(R.id.txt_angkaPertama);
        angka2 = findViewById(R.id.txt_angkaKedua);
        hasil = findViewById(R.id.txt_hasil);

        if (TextUtils.isEmpty(angka1.getText()) || TextUtils.isEmpty(angka2.getText())){
            Toast.makeText(this, "Silahkan Masukkan Angka", Toast.LENGTH_SHORT).show();
        }else{
            double hasilHitung = Double.parseDouble(angka1.getText().toString()) - Double.parseDouble(angka2.getText().toString());
            hasil.setText(String.valueOf(hasilHitung));
        }
    }

    public void Kali(View v){
        angka1 = findViewById(R.id.txt_angkaPertama);
        angka2 = findViewById(R.id.txt_angkaKedua);
        hasil = findViewById(R.id.txt_hasil);

        if (TextUtils.isEmpty(angka1.getText()) || TextUtils.isEmpty(angka2.getText())){
            Toast.makeText(this, "Silahkan Masukkan Angka", Toast.LENGTH_SHORT).show();
        }else{
            double hasilHitung = Double.parseDouble(angka1.getText().toString()) * Double.parseDouble(angka2.getText().toString());
            hasil.setText(String.valueOf(hasilHitung));
        }
    }

    public void Bagi(View v){
        angka1 = findViewById(R.id.txt_angkaPertama);
        angka2 = findViewById(R.id.txt_angkaKedua);
        hasil = findViewById(R.id.txt_hasil);

        if (TextUtils.isEmpty(angka1.getText()) || TextUtils.isEmpty(angka2.getText())){
            Toast.makeText(this, "Silahkan Masukkan Angka", Toast.LENGTH_SHORT).show();
        }else{
            double hasilHitung = Double.parseDouble(angka1.getText().toString()) / Double.parseDouble(angka2.getText().toString());
            hasil.setText(String.valueOf(hasilHitung));
        }
    }

    public void Clear(View v){
        angka1 = findViewById(R.id.txt_angkaPertama);
        angka2 = findViewById(R.id.txt_angkaKedua);
        hasil = findViewById(R.id.txt_hasil);

        angka1.setText(null);
        angka2.setText(null);
        hasil.setText(null);
    }
}