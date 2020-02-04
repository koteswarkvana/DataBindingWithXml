# DataBindingWithXml

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
