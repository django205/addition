package com.examle.yogeshkumar.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class result extends AppCompatActivity {
String r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView t=(TextView)findViewById(R.id.textView);
        Bundle extra=getIntent().getExtras();
        r=extra.getString("result");

        t.setText(r);


    }

    public void onclickbrowse(View v){
        Intent galleryIntent = new Intent(Intent.ACTION_PICK,
                android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

        this.startActivity(galleryIntent);
    }
}
