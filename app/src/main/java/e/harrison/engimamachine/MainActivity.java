package e.harrison.engimamachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstRotor, secondRotor, thirdRotor, inputText;
    TextView outputText, rotor1pos, rotor2pos, rotor3pos;
    RotorSetting firstRotorSetting, secondRotorSetting, thirdRotorSetting;
    String rotor1Setting, rotor2Setting, rotor3Setting, inputString;
    Rotor rotor1, rotor2, rotor3;
    chars chars;
    Button button;
    int test1, test2, test3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initRotors();

    }

    // initializes all text boxes etc.
    public void initViews(){
        firstRotor = findViewById(R.id.rotor1Setting);
        secondRotor = findViewById(R.id.rotor2Setting);
        thirdRotor = findViewById(R.id.rotor3Setting);
        inputText = findViewById(R.id.textInput);
        outputText = findViewById(R.id.outputText);
        button = findViewById(R.id.button);
        button.setOnClickListener(testbutton);
        rotor1pos = findViewById(R.id.rotor1position);
        rotor2pos = findViewById(R.id.rotor2position);
        rotor3pos = findViewById(R.id.rotor3position);

    }

    // initializes rotor settings, gets values from text boxes.
    public void initRotorSettings(){
        rotor1Setting = firstRotor.getText().toString();
        rotor2Setting = secondRotor.getText().toString();
        rotor3Setting = thirdRotor.getText().toString();

        firstRotorSetting = new RotorSetting();
        secondRotorSetting = new RotorSetting();
        thirdRotorSetting = new RotorSetting();
    }

    // initializes all rotors
    public void initRotors(){
        rotor1 = new Rotor();
        rotor2 = new Rotor();
        rotor3 = new Rotor();
    }


    // sets the values of each rotor via the rotor setting.
    public void setRotorInitialValues(){
        rotor1.initialPosition(firstRotorSetting.getSetting(rotor1Setting));
        rotor2.initialPosition(secondRotorSetting.getSetting(rotor2Setting));
        rotor3.initialPosition(thirdRotorSetting.getSetting(rotor3Setting));
    }

    // gets length of string, to be added to rotor position.
    public int getInputString(){
        int length;
        inputString = inputText.getText().toString();
        chars = new chars(inputString);
        length = chars.getStringLength();
        return length;

    }


    // updates position of rotor using length of string.
    public void updateRotorPosition(){
        test1  = rotor1.updatePosition(getInputString());
        test2 = rotor2.updatePosition(getInputString());
        test3 = rotor3.updatePosition(getInputString());


    }

    public void updateRotorSetting(){

        if (test1 > 26){ secondRotorSetting.incrementSetting(rotor2Setting);}
        if (test2 > 26){ thirdRotorSetting.incrementSetting(rotor3Setting);}
        if (test3 > 26){ firstRotorSetting.incrementSetting(rotor1Setting);}


    }

    View.OnClickListener testbutton = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            initRotorSettings();
            setRotorInitialValues();
            getInputString();
            updateRotorPosition();
            String string1 = String.valueOf(test1);
            String string2 = String.valueOf(test2);
            String string3 = String.valueOf(test3);
            rotor1pos.setText(string1);
            rotor2pos.setText(string2);
            rotor3pos.setText(string3);
        }
    };



}
