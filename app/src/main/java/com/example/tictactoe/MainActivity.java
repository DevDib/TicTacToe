package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //button referance
    Button btn11, btn12, btn13, btn21, btn22, btn23, btn31, btn32, btn33;
    // To store btn value into a string
    String btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    // to check even odd button press
    int flag = 0;
    //
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);
        btn21 = findViewById(R.id.btn21);
        btn22 = findViewById(R.id.btn22);
        btn23 = findViewById(R.id.btn23);
        btn31 = findViewById(R.id.btn31);
        btn32 = findViewById(R.id.btn32);
        btn33 = findViewById(R.id.btn33);

    }

    public void checkAction(View view) {
        Button currentButton = (Button) view;

        if (currentButton.getText().toString().equals("")) {
            count++;
            if (flag == 0) {
                currentButton.setText("X");
                flag = 1;
            } else {
                currentButton.setText("O");
                flag = 0;
            }
        }

        //getting value of buttons
        btn1 = btn11.getText().toString();
        btn2 = btn12.getText().toString();
        btn3 = btn13.getText().toString();
        btn4 = btn21.getText().toString();
        btn5 = btn22.getText().toString();
        btn6 = btn23.getText().toString();
        btn7 = btn31.getText().toString();
        btn8 = btn32.getText().toString();
        btn9 = btn33.getText().toString();

        if (count > 4) {
            // Horizontal check
            if (btn1.equals(btn2) && btn2.equals(btn3) && !btn1.equals("")) {
                Toast.makeText(this, btn1 + " is winner", Toast.LENGTH_SHORT).show();
                restartGame();
            } else if (btn4.equals(btn5) && btn5.equals(btn6) && !btn1.equals("")) {
                Toast.makeText(this, btn4 + " is winner", Toast.LENGTH_SHORT).show();
                restartGame();
            } else if (btn7.equals(btn8) && btn8.equals(btn9) && !btn7.equals("")) {
                Toast.makeText(this, btn7 + " is winner", Toast.LENGTH_SHORT).show();
                restartGame();
            }
            // Vertical check
            else if (btn1.equals(btn4) && btn4.equals(btn7) && !btn1.equals("")) {
                Toast.makeText(this, btn1 + " is winner", Toast.LENGTH_SHORT).show();
                restartGame();
            } else if (btn2.equals(btn5) && btn5.equals(btn8) && !btn2.equals("")) {
                Toast.makeText(this, btn2 + " is winner", Toast.LENGTH_SHORT).show();
                restartGame();
            } else if (btn3.equals(btn6) && btn6.equals(btn9) && !btn3.equals("")) {
                Toast.makeText(this, btn3 + " is winner", Toast.LENGTH_SHORT).show();
                restartGame();
            }
            // Diagonal check
            else if (btn1.equals(btn5) && btn5.equals(btn9) && !btn1.equals("")) {
                Toast.makeText(this, btn1 + " is winner", Toast.LENGTH_SHORT).show();
                restartGame();
            } else if (btn3.equals(btn5) && btn5.equals(btn7) && !btn3.equals("")) {
                Toast.makeText(this, btn3 + " is winner", Toast.LENGTH_SHORT).show();
                restartGame();
            } else if (count == 9) {
                Toast.makeText(this, "Match is draw", Toast.LENGTH_SHORT).show();
                restartGame();
            }
        }
    }

    private void restartGame() {
        btn11.setText("");
        btn12.setText("");
        btn13.setText("");
        btn21.setText("");
        btn22.setText("");
        btn23.setText("");
        btn31.setText("");
        btn32.setText("");
        btn33.setText("");
        flag = 0;
        count = 0;
    }
}