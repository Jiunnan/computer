package tw.org.iii.computer_2_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Act1 extends AppCompatActivity {
    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnadd;
    Button btnless;
    Button btnMultiply;
    Button btnexcept;
    Button btnans;
    TextView tv1;
    TextView tv2;
    double a;
    String op,strop;
    ArrayList<String> strlist=new ArrayList<String>();
    boolean ifans;

    private View.OnClickListener btn0_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num("0");
        }
    };
    private View.OnClickListener btn1_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num("1");
        }
    };
    private View.OnClickListener btn2_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num("2");
        }
    };
    private View.OnClickListener btn3_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num("3");
        }
    };
    private View.OnClickListener btn4_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num("4");
        }
    };
    private View.OnClickListener btn5_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num("5");
        }
    };
    private View.OnClickListener btn6_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num("6");
        }
    };
    private View.OnClickListener btn7_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num("7");
        }
    };
    private View.OnClickListener btn8_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num("8");
        }
    };
    private View.OnClickListener btn9_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num("9");
        }
    };
    private View.OnClickListener btnadd_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strres="";
            if(!"".equals(strop)&&"".equals(tv1.getText().toString())){
               strres= strop.substring(strop.length()-1);
            }
            if("+".equals(strres)||"-".equals(strres)||"*".equals(strres)||"/".equals(strres)){

            }else{
                strlist.add(tv1.getText().toString());
                strop+=tv1.getText().toString();
                tv1.setText("");
                strlist.add("+");
                strop+="+";
                tv2.setText(strop);
                ifans=false;
            }
        }
    };
    private View.OnClickListener btnless_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strres="";
            if(!"".equals(strop)&&"".equals(tv1.getText().toString())){
                strres= strop.substring(strop.length()-1);
            }
            if("+".equals(strres)||"-".equals(strres)||"*".equals(strres)||"/".equals(strres)){

            }else{
                strlist.add(tv1.getText().toString());
                strop+=tv1.getText().toString();
                tv1.setText("");
                strlist.add("-");
                strop+="-";
                tv2.setText(strop);
                ifans=false;
            }
        }
    };
    private View.OnClickListener btnMultiply_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strres="";
            if(!"".equals(strop)&&"".equals(tv1.getText().toString())){
                strres= strop.substring(strop.length()-1);
            }
            if("+".equals(strres)||"-".equals(strres)||"*".equals(strres)||"/".equals(strres)){

            }else{
                strlist.add(tv1.getText().toString());
                strop+=tv1.getText().toString();
                tv1.setText("");
                strlist.add("*");
                strop+="*";
                tv2.setText(strop);
                ifans=false;
            }
        }
    };
    private View.OnClickListener btnexcept_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strres="";
            if(!"".equals(strop)&&"".equals(tv1.getText().toString())){
                strres= strop.substring(strop.length()-1);
            }
            if("+".equals(strres)||"-".equals(strres)||"*".equals(strres)||"/".equals(strres)){

            }else{
                strlist.add(tv1.getText().toString());
                strop+=tv1.getText().toString();
                tv1.setText("");
                strlist.add("/");
                strop+="/";
                tv2.setText(strop);
                ifans=false;
            }
        }
    };
    private View.OnClickListener btnans_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strres="";
            if(!"".equals(strop)&&"".equals(tv1.getText().toString())){
                strres= strop.substring(strop.length()-1);
            }
            if("+".equals(strres)||"-".equals(strres)||"*".equals(strres)||"/".equals(strres)){

            }else{
                strlist.add(tv1.getText().toString());
                strop+=tv1.getText().toString();
                tv2.setText(strop);
                boolean ifop=false;
                while(ifop==false){
                    for(int i=0;i<strlist.size();i++){
                        if("*".equals(strlist.get(i))){
                            strlist.set(i, String.format("%f", (Double.parseDouble(strlist.get(i-1))*Double.parseDouble(strlist.get(i+1)))));
                            strlist.remove(i+1);
                            strlist.remove(i-1);
                            break;
                        }
                        if("/".equals(strlist.get(i))){
                            strlist.set(i, String.format("%f", (Double.parseDouble(strlist.get(i-1))/Double.parseDouble(strlist.get(i+1)))));
                            strlist.remove(i+1);
                            strlist.remove(i-1);
                            break;
                        }
                        if(i==strlist.size()-1){
                            ifop=true;
                        }
                    }
                }
                ifop=false;
                while(ifop==false){
                    for(int i=0;i<strlist.size();i++){
                        if("+".equals(strlist.get(i))){
                            strlist.set(i, String.format("%f", (Double.parseDouble(strlist.get(i-1))+Double.parseDouble(strlist.get(i+1)))));
                            strlist.remove(i+1);
                            strlist.remove(i-1);
                            break;
                        }
                        if("-".equals(strlist.get(i))){
                            strlist.set(i, String.format("%f", (Double.parseDouble(strlist.get(i-1))-Double.parseDouble(strlist.get(i+1)))));
                            strlist.remove(i+1);
                            strlist.remove(i-1);
                            break;
                        }
                        if(i==strlist.size()-1){
                            ifop=true;
                        }
                    }
                }
                Double ansres=Double.parseDouble(strlist.get(0));
                if(ansres%1==0){
                    tv1.setText(String.format("%.0f",ansres));
                }else{
                    tv1.setText(""+ansres);
                }
                ifans=true;
                strlist.clear();
                strop="";
            }
        }
    };

    private void num(String num){
        String strMsg=tv1.getText().toString();
        if(ifans==true){
            strMsg=num;
            tv2.setText("");
            ifans=false;
        }else{
            if("0".equals(strMsg)||"".equals(strMsg)){
                strMsg=num;
            }else{
                strMsg+=num;
            }
        }
        tv1.setText(strMsg);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act1);
        InitialComponent();
    }

    private void InitialComponent() {
        btn0=(Button) findViewById(R.id.btn0);
        btn0.setOnClickListener(btn0_click);
        btn1=(Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(btn1_click);
        btn2=(Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(btn2_click);
        btn3=(Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(btn3_click);
        btn4=(Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(btn4_click);
        btn5=(Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(btn5_click);
        btn6=(Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(btn6_click);
        btn7=(Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(btn7_click);
        btn8=(Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(btn8_click);
        btn9=(Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(btn9_click);
        btnadd=(Button) findViewById(R.id.btnadd);
        btnadd.setOnClickListener(btnadd_click);
        btnless=(Button) findViewById(R.id.btnless);
        btnless.setOnClickListener(btnless_click);
        btnMultiply=(Button) findViewById(R.id.btnMultiply);
        btnMultiply.setOnClickListener(btnMultiply_click);
        btnexcept=(Button) findViewById(R.id.btnexcept);
        btnexcept.setOnClickListener(btnexcept_click);
        btnans=(Button) findViewById(R.id.btnans);
        btnans.setOnClickListener(btnans_click);
        tv1=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.tv2);
        a=0;
        op="";
        strop="";
        ifans=false;
    }
}
