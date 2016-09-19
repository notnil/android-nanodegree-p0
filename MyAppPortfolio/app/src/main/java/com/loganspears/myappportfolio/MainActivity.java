package com.loganspears.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private Map<Integer, String> mAppLaunchMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAppLaunchMap.put(R.id.button, "This button will launch my popular movies app!");
        mAppLaunchMap.put(R.id.button2, "This button will launch my stock hawk app!");
        mAppLaunchMap.put(R.id.button3, "This button will launch my build it bigger app!");
        mAppLaunchMap.put(R.id.button4, "This button will launch my make your app material app!");
        mAppLaunchMap.put(R.id.button5, "This button will launch my go ubiquitous app!");
        mAppLaunchMap.put(R.id.button6, "This button will launch my capstone app!");

        for (Integer resourceId : mAppLaunchMap.keySet()) {
            Button button = (Button) findViewById(resourceId);
            final String message = mAppLaunchMap.get(resourceId);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
