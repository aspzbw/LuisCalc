package com.example.asp.luiscalc;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;

        import java.util.ArrayList;
        import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ArrayList<Button> buttonArrayList= new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonArrayList.add((Button) findViewById(R.id.button0));
        buttonArrayList.add((Button) findViewById(R.id.button1));
        buttonArrayList.add((Button) findViewById(R.id.button2));
        buttonArrayList.add((Button) findViewById(R.id.button3));

        start(null);

    }
    public void start(View view){
        for(int i = 0; i <4; i++){
            Button button = buttonArrayList.get(i);
            button.setText(Integer.toString(generateResalt(10)));
        }

    }

    public int generateResalt(int limit){
        return new Random().nextInt(limit);
    }

    public void click(View view){
        Log.i("info","Es sollte was passiern");
        Log.i("info", view.getTag().toString());
    }



}
