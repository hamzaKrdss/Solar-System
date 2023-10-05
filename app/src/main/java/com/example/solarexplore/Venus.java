package com.example.solarexplore;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class Venus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venus);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            // Geri butonuna tıklandığında yapılacak işlemleri burada belirtin.
            // Örneğin, aktiviteyi sonlandırmak isterseniz:
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}