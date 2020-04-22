package com.example.muktomon2;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hotline extends AppCompatActivity {
    private Button phnbtn1,phnbtn2,phnbtn3,phnbtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotline);
        phnbtn1=findViewById(R.id.phnbtn1);
        phnbtn2=findViewById(R.id.phnbtn2);
        phnbtn3=findViewById(R.id.phnbtn3);
        phnbtn4=findViewById(R.id.phnbtn4);
        phnbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emerg = "tel:01521427950";
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse(emerg));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (checkSelfPermission(Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    Activity#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for Activity#requestPermissions for more details.
                        return;
                    }
                }
                startActivity(callintent);
            }
        });
        phnbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emerg = "tel:01521433867";
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse(emerg));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (checkSelfPermission(Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    Activity#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for Activity#requestPermissions for more details.
                        return;
                    }
                }
                startActivity(callintent);
            }
        });
        phnbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emerg = "tel:01731500488";
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse(emerg));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (checkSelfPermission(Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    Activity#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for Activity#requestPermissions for more details.
                        return;
                    }
                }
                startActivity(callintent);
            }
        });
        phnbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emerg = "tel:01521436444";
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse(emerg));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (checkSelfPermission(Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    Activity#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for Activity#requestPermissions for more details.
                        return;
                    }
                }
                startActivity(callintent);
            }
        });
    }
}
