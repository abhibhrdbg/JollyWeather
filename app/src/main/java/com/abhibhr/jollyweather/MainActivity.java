package com.abhibhr.jollyweather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //Create a field to store the weather display TextView
    TextView mWeatherTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Use findViewById to get a reference to the weather display TextView
        mWeatherTextView = findViewById(R.id.tv_weather_data);

        // Create an array of Strings that contain fake weather data
        String weatherDatas[] = WeatherData.getWeatherData();

        // Append each String from the fake weather data array to the TextView
        for (String weatherData: weatherDatas){
            mWeatherTextView.append(weatherData+"\n\n\n");
        }

    }
}
