package khjin001010.kr.hs.emirim.simplecalculator;

import android.net.ParseException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText edit_1;
    EditText edit_2;
    TextView text_result;
    int input_1;
    int input_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_1 = (EditText) findViewById(R.id.edit_1);
        edit_2 = (EditText)findViewById(R.id.edit_2);

        Button btn_add = (Button) findViewById(R.id.btn_add);
        Button btn_sub = (Button) findViewById(R.id.btn_sub);
        Button btn_mul = (Button) findViewById(R.id.btn_mul);
        Button btn_div = (Button) findViewById(R.id.btn_div);

        text_result = (TextView)findViewById(R.id.text_result);
        btn_add.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
        btn_mul.setOnClickListener(this);
        btn_div.setOnClickListener(this);

       /* btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_1 = Integer.parseInt(edit_1.getText().toString());
                input_2 = Integer.parseInt(edit_2.getText().toString());
                text_result.setText("Result : "+(input_1+input_2));
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_1 = Integer.parseInt(edit_1.getText().toString());
                input_2 = Integer.parseInt(edit_2.getText().toString());
                text_result.setText("Result : "+ (input_1-input_2));
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_1 = Integer.parseInt(edit_1.getText().toString());
                input_2 = Integer.parseInt(edit_2.getText().toString());
                text_result.setText("Result : "+ (input_1*input_2));
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_1 = Integer.parseInt(edit_1.getText().toString());
                input_2 = Integer.parseInt(edit_2.getText().toString());
                text_result.setText("Result : "+ (input_1/input_2));
            }
        });*/
    }

    @Override
    public void onClick(View view) {
        input_1 = Integer.parseInt(edit_1.getText().toString());
        input_2 = Integer.parseInt(edit_2.getText().toString());
        int result = 0;

        switch(view.getId()) {
            case R.id.btn_add:
                result = input_1 + input_2;
                break;
            case R.id.btn_sub:
                result = input_1 - input_2;
                break;
            case R.id.btn_mul:
                result = input_1 * input_2;
                break;
            case R.id.btn_div:
                result = input_1 / input_2;
                break;
            default:
                result = 0;
        }

        text_result.setText("Result : "+ result);

    }
}
