package com.example.chatuygulamas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransitionImpl;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class GirisActivity extends AppCompatActivity {
    EditText kullaniciAdiEditText;
    Button kayitOlButton;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);
    }
    public void tanimla()
    {
    kullaniciAdiEditText = (EditText)findViewById(R.id.kullaniciAdiEditText);
    kayitOlButton = (Button)findViewById(R.id.kayitOlButton);
    firebaseDatabase = FirebaseDatabase.getInstance();
    reference = firebaseDatabase.getReference();

    }

    public void ekle(String kadi)
    {
    reference.child("Kullanıcılar").child(kadi).child("kullaniciadi"  ).setValue(kadi).addOnCanceledListener(new OnCanceledListener() {
        @Override
        public void onCanceled() {

        }
    });
    }
    public void kayitOl()
    {

    }
}
