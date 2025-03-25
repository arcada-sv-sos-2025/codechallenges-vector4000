package fi.arcada.codechallenge;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView Hello;
    ArrayList<Double> values;
    String out;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Hello = findViewById(R.id.hello);
        Hello.setText("Min app funkar!");
        values = new ArrayList<Double>();
        values.add(1.0);
        values.add(8.0);
        values.add(13.0);
        values.add(5.0);





    }
    public void calculate(View view) {
        out = String.format("%.2f",Statistics.calcMean(values));
        Hello.setText(out);
    }

}