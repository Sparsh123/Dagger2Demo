package com.example.dagger2demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    DependencyPOJO dependencyPOJO;

    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtView = findViewById(R.id.txtView);
        DaggerAppComponent.builder().appModule(new AppModule()).build().inject(this);
        txtView.setText(dependencyPOJO.getText());
    }
}
