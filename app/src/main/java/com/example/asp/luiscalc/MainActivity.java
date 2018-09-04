package com.example.asp.luiscalc;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import java.util.ArrayList;
        import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Button> buttonArrayList= new ArrayList<>();
    private String calc;
    private int resalt;
    private TextView textViewTimer;
    private TextView textViewCalculation;
    private TextView textViewScore;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonArrayList.add((Button) findViewById(R.id.button0));
        buttonArrayList.add((Button) findViewById(R.id.button1));
        buttonArrayList.add((Button) findViewById(R.id.button2));
        buttonArrayList.add((Button) findViewById(R.id.button3));

        textViewTimer = findViewById(R.id.textViewTimer);
        textViewCalculation = findViewById(R.id.textViewCalculation);
        textViewScore = findViewById(R.id.textViewScore);


        newGame(null);

    }
    public void newGame(View view){



        for(int i = 0; i
                <4; i++){
            Button button = buttonArrayList.get(i);
            button.setText(Integer.toString(generateRandom(10)));
        }

    }

    public int generateRandom(int limit){
        return new Random().nextInt(limit);
    }

    public void click(View view){
        Log.i("info","Es sollte was passiern");
        Log.i("info", view.getTag().toString());
    }

    public void generateCalc(){
        int a = generateRandom(10);
        int b = generateRandom(10);
        resalt = a+b;
        calc = a + " + " + b;



    }



}
