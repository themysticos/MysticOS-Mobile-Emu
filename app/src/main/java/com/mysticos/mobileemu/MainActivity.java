package com.mysticos.mobileemu;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    static {
        // Заглушка для загрузки QEMU через JNI
        // System.loadLibrary("qemu");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("MysticOS Mobile Emulator\n\nQEMU integration coming soon!");
        setContentView(tv);
    }
}
