package eu.tutrial.layout_intership;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.SensorEvent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    TextView GasSensorValue;
    TextView GasSensorValue_reading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GasSensorValue = (TextView) findViewById(R.id.GasSensorValue);
        GasSensorValue_reading = (TextView) findViewById(R.id.GasSensorValue_reading);
    }

    public void changeImage(SensorEvent sensorEvent){
        Log.d(TAG,"onSensorChange: GasSensorValue" + sensorEvent.values[0] + "GasSensorValue_reading: "+ sensorEvent.values[1]);

        GasSensorValue.setText((int) sensorEvent.values[0]);
        GasSensorValue_reading.setText((int) sensorEvent.values[1]);


    }
}