package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.Model.Global;
import com.example.myapplication.Model.Users;
import com.example.myapplication.Prevalent.Prevalent;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AdminHomeActivity extends AppCompatActivity {
    private TextView nameAdmin;
    private Button btnProduct, btnPromo, btnGallery, btnActivity;
    private ImageView profileAdmin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);

        btnProduct = (Button)findViewById(R.id.btnProduct);
        btnPromo = (Button)findViewById(R.id.btnPromo);
        btnGallery = (Button)findViewById(R.id.btnGallery);
        btnActivity = (Button)findViewById(R.id.btnActivity);

        nameAdmin = (TextView)findViewById(R.id.nameAdmin);

        btnProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminHomeActivity.this, StoreProductActivity.class);
                startActivity(intent);
            }
        });
    }
}