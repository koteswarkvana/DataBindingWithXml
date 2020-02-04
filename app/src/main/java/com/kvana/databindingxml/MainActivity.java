package com.kvana.databindingxml;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kvana.databindingxml.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Note:
    // 1. place below dataBinding code in app (build.gradle) file android block
    // dataBinding {
    //        enabled = true
    //    }
    // 2. write the code in .xml file like for Ex: <layout><RelativeLayout> <TextView> </TextView> </RelativeLayout> </layout>
    // 3. Create ActivityMainBinding object just type binding or activity it shows related binding name...
    // 4. assign and bind value to activityMainBinding object.
    // activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    // 5. By using activityMainBinding object we can call xml defined views
    // for Ex: activityMainBinding.tvData.setText("")
    // activityMainBinding.btSubmit.setOnClickListener(this)

    private ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        activityMainBinding.btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityMainBinding.tvData.setText("Hey Data binding working...");
            }
        });
    }
}
