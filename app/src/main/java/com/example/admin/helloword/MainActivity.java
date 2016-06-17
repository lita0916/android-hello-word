package com.example.admin.helloword;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //得到计算按钮实例
        Button calcBtn = (Button) findViewById(R.id.calc_btn);
        final MainActivity activityBean = this;
        calcBtn.setInputType(InputType.TYPE_NULL);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CalcBean bean = new CalcBean();
                bean.initAndCalcResultIngoreException(activityBean);

                //展示结果
                TextView result = (TextView) findViewById(R.id.result);
                result.setText(bean.getResult() != null ? bean.getResult().toString() : "计算出错");
            }
        });

        //得到计算按钮实例
        Button resetBtn = (Button) findViewById(R.id.reset_btn);
        resetBtn.setInputType(InputType.TYPE_NULL);
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((EditText) findViewById(R.id.a)).setText("");
                ((EditText) findViewById(R.id.c)).setText("");
                ((EditText) findViewById(R.id.d)).setText("");
                ((EditText) findViewById(R.id.e)).setText("");
                ((EditText) findViewById(R.id.f)).setText("");
                ((EditText) findViewById(R.id.g)).setText("");
                ((EditText) findViewById(R.id.h)).setText("");
                ((EditText) findViewById(R.id.i)).setText("");
                ((EditText) findViewById(R.id.j)).setText("");
                ((EditText) findViewById(R.id.k)).setText("");
                ((EditText) findViewById(R.id.l)).setText("");
                //清空结果
               ((TextView) findViewById(R.id.result)).setText("");
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
