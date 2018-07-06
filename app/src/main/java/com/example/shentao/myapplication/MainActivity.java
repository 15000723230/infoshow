package com.example.shentao.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.Button;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name=findViewById(R.id.typename);
        final EditText height=findViewById(R.id.typeheight);
        final EditText age=findViewById(R.id.typeage);
        Button button=findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                showToast(name.getText().toString(),age.getText().toString(),height.getText().toString());



            }
        });
        private RadioGroup.OnCheckedChangeListener listen=new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int id=group.getCheckedRadioButtonId();
                switch(group.getCheckedRadioButtonId()){
                    case R.id.girl_id:
                        textView.setText(.getText());
                        break;
                    case R.id.boy_id:

                }

            }
        }

    }

    public void showToast(String name,String age,String height) {
        Toast.makeText(MainActivity.this,getString(name,age,height),Toast.LENGTH_LONG).show();
    }
    @NonNull
    private  String getString(String name,String age,String height){
        return"Name:"+name+"\n" +"Age:"+age +"\n"+ "Height:"+height;
    }

}
