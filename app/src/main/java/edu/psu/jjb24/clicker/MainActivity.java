package edu.psu.jjb24.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int clickCount = 0;  // The number of times the user clicked
    int[] clickLevels = {243, 81, 27, 9, 3, 1};
    String[] rewardDescriptions = {"The Eiffel Tower", "A 20 foot waterfall", "The London Eye",
            "A sleeping puppy", "A field of sunflowers" , "An unmowed yard"};
    int[] rewardIds = {R.id.imageEiffel, R.id.imageWaterfall, R.id.imageLondonEye,
            R.id.imagePuppy, R.id.imageSunflower, R.id.imageUnmowedYard};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("life_cycle", "onCreate invoked");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
