package ricoapp.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  public void convertMoney(View view){
      double result,number;
      EditText text = (EditText) findViewById(R.id.money);
      number = Double.parseDouble(text.getText().toString());
      result=number*0.77;
      Toast.makeText(MainActivity.this," "+String.format("%.2f",result),Toast.LENGTH_LONG).show();
  }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.converter);
    }
}
