package cf.billlintw.tpcu_hw_20181024;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private  Button btnDo;
    private  TextView txtShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDo = (Button) findViewById(R.id.button);
        txtShow = (TextView) findViewById(R.id.textView);

        btnDo.setOnClickListener(btnDoLis);
    }
    private Button.OnClickListener btnDoLis =
            new Button.OnClickListener(){
                @Override
                public  void onClick(View v){
                    txtShow.setText("君の名は");
                }
            };

}
