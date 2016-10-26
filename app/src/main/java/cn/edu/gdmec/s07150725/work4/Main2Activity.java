package cn.edu.gdmec.s07150725.work4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
private Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn2 = (Button) findViewById(R.id.button2);
        btn2.setText("匿名内部类");
        btn2.setOnClickListener(new Neibu());
    }

        class  Neibu implements View.OnClickListener{


            public void onClick(View v){
                Toast.makeText(Main2Activity.this,"第二个",Toast.LENGTH_LONG).show();
            }
    }
}
