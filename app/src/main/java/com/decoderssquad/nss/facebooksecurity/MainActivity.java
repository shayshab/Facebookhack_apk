package com.decoderssquad.nss.facebooksecurity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomButtons.TextOutsideCircleButton;
import com.nightonke.boommenu.BoomMenuButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   public ListView lv;
    BoomMenuButton bmb;
    ArrayList<Integer> imageIdList;
    ArrayList<String> titleList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        bmb = findViewById(R.id.bmb);
        imageIdList = new ArrayList<>();
        titleList = new ArrayList<>();
        setInitialData();

        for (int i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++) {
            int position = i;
            if (position == 0) {
                TextOutsideCircleButton.Builder builder = new TextOutsideCircleButton.Builder()
                        .normalImageRes(imageIdList.get(i))
                        .normalText(titleList.get(i))
                        .normalTextColor(Color.BLACK)
                        .textSize(12)
                        .pieceColor(Color.WHITE)
                        .unableColor(Color.BLACK)

                        .listener(new OnBMClickListener() {
                            @Override
                            public void onBoomButtonClick(int index) {


                                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                                builder.setTitle("to get more tips");
                                builder

                                        .setMessage("type START cybrscrty and SEND the SMS to 21213")
                                        .setCancelable(false)
                                        .setPositiveButton("ok",new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog,int id) {
                                                dialog.cancel();
                                            }
                                        });

                                AlertDialog alertDialog = builder.create();
                                alertDialog.show();


                            }

                        });
                bmb.addBuilder(builder);
            } else if (position == 1) {
                TextOutsideCircleButton.Builder builder = new TextOutsideCircleButton.Builder()
                        .normalImageRes(imageIdList.get(i))
                        .normalText(titleList.get(i))
                        .normalTextColor(Color.BLACK)
                        .textSize(12)

                        .listener(new OnBMClickListener() {
                            @Override
                            public void onBoomButtonClick(int index) {





                                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                                builder.setTitle("Shayshab Azad");
                                builder

                                        .setMessage("shayshabazad@gmail.com")
                                        .setCancelable(false)
                                        .setPositiveButton("ok",new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog,int id) {
                                                dialog.cancel();
                                            }
                                        });

                                AlertDialog alertDialog = builder.create();
                                alertDialog.show();

                            }

                        });
                bmb.addBuilder(builder);
            } else if (position == 2) {
                TextOutsideCircleButton.Builder builder = new TextOutsideCircleButton.Builder()
                        .normalImageRes(imageIdList.get(i))
                        .normalText(titleList.get(i))
                        .normalTextColor(Color.BLACK)
                        .textSize(12)

                        .listener(new OnBMClickListener() {
                            @Override
                            public void onBoomButtonClick(int index) {
                                finish();




                            }

                        });
                bmb.addBuilder(builder);
            }


        }









        lv=(ListView) findViewById(R.id.ls);


        String[] fh ={"Phishing attack","Keylogging attack","Saved Passwords","Session Hijacking","Sidejacking attack","Mobile Hacking","DNS Spoofing","USB Hacking","MITM Attacks","Botnets Attack","Social Engineering","Email Hacking","Viewing Passwords","WiFi Network","Logout from browser"};
        int[] images={R.drawable.ntitled1,R.drawable.ntitled2,R.drawable.ntitled3,R.drawable.ntitled4,R.drawable.ntitled5,R.drawable.ntitled6,R.drawable.ntitled7,R.drawable.ntitled8,R.drawable.ntitled9,R.drawable.ntitled10,R.drawable.ntitled11, R.drawable.ntitled12, R.drawable.ntitled13,R.drawable.ntitled14,R.drawable.ntitled15,};

        MycustomAdapter adapter=new MycustomAdapter(this,fh,images);






       // ArrayAdapter adapter =new ArrayAdapter(this, R.layout.lvlayout,R.id.txid,fh);

        lv.setAdapter(adapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch(i){

                    case 0:

                    Intent intent0= new Intent(getApplicationContext(),Phising.class);
                    startActivity(intent0);
                    break;
                    case 1:

                       Intent intent1= new Intent(getApplicationContext(),Keylogging.class);
                        startActivity(intent1);
                        break;


                    case 2:
                        Intent intent2= new Intent(getApplicationContext(),Spassword.class);
                        startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3= new Intent(getApplicationContext(),SessionHijacking.class);
                        startActivity(intent3);
                        break;


                    case 4:
                        Intent intent4= new Intent(getApplicationContext(),SideJacking.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5= new Intent(getApplicationContext(),MobilePhone.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6= new Intent(getApplicationContext(),DnsSpoofing.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7= new Intent(getApplicationContext(),USB.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent9= new Intent(getApplicationContext(),ManinTheMiddle.class);
                        startActivity(intent9);
                        break;
                    case 9:
                        Intent intent10= new Intent(getApplicationContext(),Botnets.class);
                        startActivity(intent10);
                        break;
                    case 10:
                        Intent intent11= new Intent(getApplicationContext(),SocialEng.class);
                        startActivity(intent11);
                        break;
                    case 11:
                        Intent intent12= new Intent(getApplicationContext(),Email.class);
                        startActivity(intent12);
                        break;
                    case 12:
                        Intent intent13= new Intent(getApplicationContext(),Masked_pass.class);
                        startActivity(intent13);
                        break;
                    case 13:
                        Intent intent14= new Intent(getApplicationContext(),WifiHack.class);
                        startActivity(intent14);
                        break;
                    case 14:
                        Intent intent15= new Intent(getApplicationContext(),Logout.class);
                        startActivity(intent15);
                        break;


                }
            }
        });
    }

    private void setInitialData() {

        imageIdList.add(R.drawable.ic_more_black_24dp);
        imageIdList.add(R.drawable.ic_code_black_24dp);
        imageIdList.add(R.drawable.ic_exit_to_app_black_24dp);

        titleList.add("Cyber security Tips");
        titleList.add("Developer");
        titleList.add("Exit");

    }
}
