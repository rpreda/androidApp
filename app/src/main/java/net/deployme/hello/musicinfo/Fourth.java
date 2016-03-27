package net.deployme.hello.musicinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Fourth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }
    public void nextAct(View v) {
        Intent i = new Intent(getApplicationContext(), Fifth.class);
        startActivity(i);
    }
}
