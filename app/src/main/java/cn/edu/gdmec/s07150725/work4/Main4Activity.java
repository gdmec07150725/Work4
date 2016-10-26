package cn.edu.gdmec.s07150725.work4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

    }
    public void myClick(View v){
        Toast.makeText(this,"第四个",Toast.LENGTH_LONG).show();
    }
}
