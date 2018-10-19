package com.sean.bmi;

//import android.arch.lifecycle.ViewModelStoreOwner;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edWeight;
    private EditText edHeight;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
        edWeight = findViewById(R.id.ed_weight);
        edHeight = findViewById(R.id.ed_height);
        result = findViewById(R.id.result);
        Button help =findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Help")
                        .setMessage("世界衛生組織建議以身體質量指數（Body Mass Index, BMI）來衡量肥胖程度，其計算公式是以體重（公斤）除以身高（公尺）的平方。 國民健康署建議我國成人BMI應維持在18.5（kg/m2）及24（kg/m2）之間，太瘦、過重或太胖皆有礙健康。 研究顯示，體重過重或是肥胖（BMI≧24）為糖尿病、心血管疾病、惡性腫瘤等慢性疾病的主要風險因素；而過瘦的健康問題，則會有營養不良、骨質疏鬆、猝死等健康問題。")
                        .setPositiveButton("OK",null)
                        .show();
            }
        });

    }

    public  void bmi(View view){

        String w = edWeight.getText().toString();
        String h = edHeight.getText().toString();
        float weight = Float.parseFloat(w);
        float height = Float.parseFloat(h);
        float bmi = weight/(height*height);

        Log.d("MainActivity","BMI:"+bmi);
        Toast.makeText(this,"Your BMI is"+bmi,Toast.LENGTH_LONG).show();
        result.setText("Your BMI is"+bmi);
        new AlertDialog.Builder(this)
                .setTitle("Bmi")
                .setMessage("Your BMI is:" + bmi)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        edWeight.setText("");
                        edHeight.setText("");
                        result.setText("");
                    }
                })
                .show();

    }
}
