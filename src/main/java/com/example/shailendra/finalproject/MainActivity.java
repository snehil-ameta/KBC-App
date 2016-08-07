package com.example.shailendra.finalproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    TextView tv1,tv2,tv3,tv4;
    int flag=0;
    public static TextView scr,ans,HS,ft,ex,exans,pbs,pban,rsg;
    public static RadioButton rb;
    public static int ran=0,k=0,fnd=0,exid=0,pbid=0,q=1,total;
    public static int count=0;
    String st;
    String[][]Ques=new String[100][6];
    public RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ran =(int)(Math.random() * (30));
        Question();
        CheckAns();


}

    private void PrBar()
    {
        TextView tv1;
        switch (count){
            case 1: tv1 = (TextView) findViewById(R.id.a1);
                    tv1.setBackgroundColor(Color.parseColor("#f09a91"));
                break;
            case 2:tv1 = (TextView) findViewById(R.id.a2);
                tv1.setBackgroundColor(Color.parseColor("#ee897e"));
                break;
            case 3:tv1 = (TextView) findViewById(R.id.a3);
                tv1.setBackgroundColor(Color.parseColor("#eb786c"));
                break;
            case 4:tv1 = (TextView) findViewById(R.id.a4);
                tv1.setBackgroundColor(Color.parseColor("#e9675a"));
            break;
            case 5:tv1 = (TextView) findViewById(R.id.a5);
                tv1.setBackgroundColor(Color.parseColor("#e75748"));
                break;
            case 6:tv1 = (TextView) findViewById(R.id.a6);
                tv1.setBackgroundColor(Color.parseColor("#cf4e40"));
            break;
            case 7:tv1 = (TextView) findViewById(R.id.a7);
                tv1.setBackgroundColor(Color.parseColor("#b84539"));
            break;
            case 8:tv1 = (TextView) findViewById(R.id.a8);
                tv1.setBackgroundColor(Color.parseColor("#a13c32"));
            break;
            case 9:tv1 = (TextView) findViewById(R.id.a9);
                tv1.setBackgroundColor(Color.parseColor("#8a342b"));
            break;
            case 10:tv1 = (TextView) findViewById(R.id.a10);
                tv1.setBackgroundColor(Color.parseColor("#732b24"));
            break;
            case 11:Toast.makeText(getApplicationContext(),"You Won",Toast.LENGTH_LONG).show();
                Intent intent = getIntent();
                finish();
                startActivity(intent);
                break;
        }
    }

    private void PrBar2()
    {
        TextView tv1;
        switch (count){
            case 1: tv1 = (TextView) findViewById(R.id.b1);
                tv1.setBackgroundColor(Color.parseColor("#f09a91"));
                break;
            case 2:tv1 = (TextView) findViewById(R.id.b2);
                tv1.setBackgroundColor(Color.parseColor("#ee897e"));
                break;
            case 3:tv1 = (TextView) findViewById(R.id.b3);
                tv1.setBackgroundColor(Color.parseColor("#eb786c"));
                break;
            case 4:tv1 = (TextView) findViewById(R.id.b4);
                tv1.setBackgroundColor(Color.parseColor("#e9675a"));
                break;
            case 5:tv1 = (TextView) findViewById(R.id.b5);
                tv1.setBackgroundColor(Color.parseColor("#e75748"));
                break;
            case 6:tv1 = (TextView) findViewById(R.id.b6);
                tv1.setBackgroundColor(Color.parseColor("#cf4e40"));
                break;
            case 7:tv1 = (TextView) findViewById(R.id.b7);
                tv1.setBackgroundColor(Color.parseColor("#b84539"));
                break;
            case 8:tv1 = (TextView) findViewById(R.id.b8);
                tv1.setBackgroundColor(Color.parseColor("#a13c32"));
                break;
            case 9:tv1 = (TextView) findViewById(R.id.b9);
                tv1.setBackgroundColor(Color.parseColor("#8a342b"));
                break;
            case 10:tv1 = (TextView) findViewById(R.id.b10);
                tv1.setBackgroundColor(Color.parseColor("#732b24"));
                break;

        }
    }
    //public void Hs() throws Exception{
//    String FILENAME = "hello";
//    FileInputStream fis=openFileInput(FILENAME);
//    int an=fis.read();
//    HS=(TextView)findViewById(R.id.hs);
//    HS.setText(Integer.toString(an));
//}
    private void Question() {
        String line="";
        int i=0,j=0,k=0;
        InputStream istream=getResources().openRawResource(R.raw.data);
        BufferedReader bReader=new BufferedReader(new InputStreamReader(istream));
        tv=(TextView)findViewById(R.id.Ques);
        tv1=(TextView)findViewById(R.id.Op1);
        tv2=(TextView)findViewById(R.id.Op2);
        tv3=(TextView)findViewById(R.id.Op3);
        tv4=(TextView)findViewById(R.id.Op4);
        try {
            while ((line = bReader.readLine()) != null) {
                if(j%6==0){
                    Ques[k][0]=line;
                }
                else if(j%6==1){
                    Ques[k][1]=line;
                }
                else if(j%6==2){
                    Ques[k][2]=line;
                }
                else if(j%6==3){
                    Ques[k][3]=line;
                }
                else if(j%6==4){
                    Ques[k][4]=line;
                }
                else if(j%6==5){
                    Ques[k][5]=line;
                    k++;
                }
                j++;
            }
        }catch (IOException e){

        }
       // ran =(int)(Math.random() * (k-1));
        total=k;
        tv.setText(Ques[ran][0]);
        tv1.setText(Ques[ran][1]);
        tv2.setText(Ques[ran][2]);
        tv3.setText(Ques[ran][3]);
        tv4.setText(Ques[ran][4]);
        st=Ques[ran][5];
        q++;


    }
    public void CheckAns(){
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                RadioButton rb1=(RadioButton)findViewById(checkedId);
                rb=rb1;
                flag=1;
                //Toast.makeText(getApplicationContext(), rb.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void OnclickSubmit(View view) throws Exception{
        if(k==0 && flag==1){
            //  Hs();
            //exans = (TextView) findViewById(R.id.expans);
            //exans.setText("");
          //  pban=(TextView)findViewById(R.id.pbans);
            //pban.setText("");
            //ans = (TextView) findViewById(R.id.ans);
            tv1 = (TextView) findViewById(R.id.Op1);
            tv2 = (TextView) findViewById(R.id.Op2);
            tv3 = (TextView) findViewById(R.id.Op3);
            tv4 = (TextView) findViewById(R.id.Op4);
            tv1.setTextColor(Color.parseColor("#FFFFFF"));
            tv2.setTextColor(Color.parseColor("#FFFFFF"));
            tv3.setTextColor(Color.parseColor("#FFFFFF"));
            tv4.setTextColor(Color.parseColor("#FFFFFF"));
           // ans.setTextColor(Color.parseColor("#000000"));
            rb.setTextColor(Color.parseColor("#ff0000"));
            if (st.equals("1")) {

                tv1.setTextColor(Color.parseColor("#7ddc1f"));
            } else if (st.equals("2")) {
                tv2.setTextColor(Color.parseColor("#7ddc1f"));
            } else if (st.equals("3")) {
                tv3.setTextColor(Color.parseColor("#7ddc1f"));
            } else if (st.equals("4")) {

                tv4.setTextColor(Color.parseColor("#7ddc1f"));

            }

            SetResult();
            PrBar();
            PrBar2();
            flag=0;
        }
        else{
            Toast.makeText(getApplicationContext(), "No option selected !", Toast.LENGTH_SHORT).show();
            flag=0;
        }
    }
    public void SetResult() throws Exception{
        //ans=(TextView)findViewById(R.id.ans);
      //  HS=(TextView)findViewById(R.id.hs);
        scr=(TextView)findViewById(R.id.score);
        if(Ques[ran][Integer.parseInt(st)].equals(rb.getText())){
            count++;
            scr.setText("Score :" + Integer.toString(count));
          //  ans.setText("Result: True");
            rb.setTextColor(Color.parseColor("#FFFFFF"));
       //     rb.setChecked(false);
            radioGroup.clearCheck();
            ran++;
            if(ran==total)
                ran=0;
            Question();
            CheckAns();
        }
        else{
             k=1;
             ran=0;
         /* String FILENAME = "hello";
           int an=0;
          FileOutputStream fos = openFileOutput(FILENAME, Context.MODE_PRIVATE);
            FileInputStream fis=openFileInput(FILENAME);
           an=fis.read();
            if(count>an) {
                fos.write(Integer.toString(count).getBytes());
            //    HS.setText(Integer.toString(count));
            }else{
             //   HS.setText(Integer.toString(an));
            }
            fos.close();
            fis.close();*/
           // ans.setText("Wrong Answer");
            rsg=(TextView)findViewById(R.id.restart);
            rsg.setText("Click Here to Restart");

        }

    }
    public void StartGame(View view){
        Intent intent = getIntent();
        finish();
        startActivity(intent);
        ran =(int)(Math.random() * (30));
        radioGroup.clearCheck();
        count=0;
        q=1;
        k=0;
        flag=0;
        tv1 = (TextView) findViewById(R.id.Op1);
        tv2 = (TextView) findViewById(R.id.Op2);
        tv3 = (TextView) findViewById(R.id.Op3);
        tv4 = (TextView) findViewById(R.id.Op4);
        tv1.setTextColor(Color.parseColor("#FFFFFF"));
        tv2.setTextColor(Color.parseColor("#FFFFFF"));
        tv3.setTextColor(Color.parseColor("#FFFFFF"));
        tv4.setTextColor(Color.parseColor("#FFFFFF"));
        rsg=(TextView)findViewById(R.id.restart);
        rsg.setText("");
        ft = (TextView) findViewById(R.id.fifty);
        ft.setText("50-50");
        fnd=0;
        ex = (TextView) findViewById(R.id.exp);
        ex.setText("Expert");
        exid=0;
        pbs=(TextView)findViewById(R.id.pb);
        pbs.setText("Public");
        pbid=0;
        scr=(TextView)findViewById(R.id.score);
        scr.setText("Score :" + Integer.toString(0));
//        ans=(TextView)findViewById(R.id.ans);
//        ans.setText("ans");
        Question();
        CheckAns();
    }
    public void FiftyFifty(View view){
        if(fnd==0) {
            int m = 0, n = 0;
            ft = (TextView) findViewById(R.id.fifty);
            int in = 1 + (int) (Math.random() * (4));
            while (st.equals(Integer.toString(in)) || in > 4 || in == 0) {
                in = 1 + (int) (Math.random() * (4));
            }
            m = in;
            in = 1 + (int) (Math.random() * (4));
            n = in;
            while (st.equals(Integer.toString(in)) || (m == n) || in > 4 || in == 0) {
                in = 1 + (int) (Math.random() * (4));
                n = in;
            }
            n = in;
            tv1 = (TextView) findViewById(R.id.Op1);
            tv2 = (TextView) findViewById(R.id.Op2);
            tv3 = (TextView) findViewById(R.id.Op3);
            tv4 = (TextView) findViewById(R.id.Op4);
            if (m == 1 || n == 1) {
                tv1.setText("");
                ;
            }
            if (m == 2 || n == 2) {
                tv2.setText("");
                ;
            }
            if (m == 3 || n == 3) {
                tv3.setText("");
                ;
            }
            if (m == 4 || n == 4) {
                tv4.setText("");
            }
            ft.setText("50-50");
            fnd++;
            ft.setBackgroundColor(Color.RED);
        }
    }

    public void ExpertAns(View view){
        if(exid==0) {
            ex = (TextView) findViewById(R.id.exp);

            ex.setText("Expert");
            //exans.setText("Expert Op is "+st);
            Toast.makeText(getApplicationContext(),st, Toast.LENGTH_LONG).show();
            exid++;
            ex.setBackgroundColor(Color.RED);
        }
    }

    public void PublicAns(View view){
        if(pbid==0){
            pbs=(TextView)findViewById(R.id.pb);

            int a=0,b=0,c=0,d=0;
            a= 0 + (int) (Math.random() * (100));
            b=0+(int) (Math.random() * (100-a));
            c=(int) (Math.random() * (100-a-b));
            d=100-a-b-c;
            pbs.setText("Public");
           // pban.setText("Op A:"+a+"% "+" Op B:"+b+"% " +"Op C:"+c+"% "+"Op D:"+d+"%");
            Toast.makeText(getApplicationContext(),"A:"+a+"% "+" B:"+b+"% " +" C:"+c+"% "+" D:"+d+"%", Toast.LENGTH_LONG).show();
            pbid++;
            pbs.setBackgroundColor(Color.RED);
        }

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
