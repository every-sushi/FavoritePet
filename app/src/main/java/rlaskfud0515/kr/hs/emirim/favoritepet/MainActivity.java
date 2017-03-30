package rlaskfud0515.kr.hs.emirim.favoritepet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener{
    TextView textQuest;
    CheckBox checkSelect;
    RadioGroup rg;
    RadioButton radioDog, radioCat, radioRabbit;
    Button butOk;
    ImageView imgvPet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkSelect=(CheckBox) findViewById(R.id.check_select);
        rg=(RadioGroup)findViewById(R.id.rg);
        radioDog=(RadioButton) findViewById(R.id.radio_dog);
        radioCat=(RadioButton) findViewById(R.id.radio_cat);
        radioRabbit=(RadioButton) findViewById(R.id.radio_rabbit);
        butOk=(Button)findViewById(R.id.but_ok);
        imgvPet=(ImageView) findViewById(R.id.imgv_net);
        checkSelect.setOnCheckedChangeListener(this);
        butOk.setOnClickListener(this);


    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(checkSelect.isChecked()){
            textQuest.setVisibility(View.VISIBLE);
            rg.setVisibility(View.VISIBLE);
            butOk.setVisibility(View.VISIBLE);
            imgvPet.setVisibility(View.VISIBLE);
        }
        else{
            textQuest.setVisibility(View.INVISIBLE);
            rg.setVisibility(View.INVISIBLE);
            butOk.setVisibility(View.INVISIBLE);
            imgvPet.setVisibility(View.INVISIBLE);
        }

    }

    @Override
    public void onClick(View view) {
        switch(rg.getCheckedRadioButtonId()){ //라디오 그룹 안에 체크된 거 id 넘기는
            case R.id.radio_dog: imgvPet.setImageResource(R.drawable.hleleo);break;
            case R.id.radio_cat: imgvPet.setImageResource(R.drawable.hello);break;
            case R.id.radio_rabbit: imgvPet.setImageResource(R.drawable.hlelo);break;
            default:
                Toast.makeText(this, "라디오버튼이 선택되지않음",Toast.LENGTH_SHORT).show();


        }

    }
}
