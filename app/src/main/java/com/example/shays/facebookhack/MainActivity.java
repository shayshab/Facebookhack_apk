package com.example.shays.facebookhack;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    GridView grid;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mtoggle;
    String[] fh ={"Phishing","Keylogging","Saved Passwords From Browser","Session Hijacking","Sidejacking With Firesheep","Mobile Phone Hacking","DNS Spoofing","USB Hacking","Man In the Middle Attacks","Botnets","Social Engineering","Email ID Hacking","Viewing Masked Passwords"," Hacking WiFi Network","Logout"};
    int[] images={R.drawable.ntitled1,R.drawable.ntitled2,R.drawable.ntitled3,R.drawable.ntitled4,R.drawable.ntitled5,R.drawable.ntitled6,R.drawable.ntitled7,R.drawable.ntitled8,R.drawable.ntitled9,R.drawable.ntitled10,R.drawable.ntitled11, R.drawable.ntitled12, R.drawable.ntitled13,R.drawable.ntitled14,R.drawable.ntitled15,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawerLayout=(DrawerLayout) findViewById(R.id.drawer);
        mtoggle=new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);

        mDrawerLayout.addDrawerListener(mtoggle);
        mtoggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView=findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);







        MycustomAdapter adapter=new MycustomAdapter(this,fh,images);
        grid=(GridView)findViewById(R.id.grid);






       // ArrayAdapter adapter =new ArrayAdapter(this, R.layout.lvlayout,R.id.txid,fh);

        grid.setAdapter(adapter);


        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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



                    case 2:
                        Intent intent2= new Intent(getApplicationContext(),Spassword.class);
                        startActivity(intent2);
                        break;
                    case 4:
                        Intent intent3= new Intent(getApplicationContext(),SessionHijacking.class);
                        startActivity(intent3);
                        break;
                    case 5:
                        Intent intent4= new Intent(getApplicationContext(),SideJacking.class);
                        startActivity(intent4);
                        break;
                    case 6:
                        Intent intent5= new Intent(getApplicationContext(),MobilePhone.class);
                        startActivity(intent5);
                        break;
                    case 7:
                        Intent intent6= new Intent(getApplicationContext(),DnsSpoofing.class);
                        startActivity(intent6);
                        break;
                    case 8:
                        Intent intent7= new Intent(getApplicationContext(),USB.class);
                        startActivity(intent7);
                        break;
                    case 9:
                        Intent intent9= new Intent(getApplicationContext(),ManinTheMiddle.class);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10= new Intent(getApplicationContext(),Botnets.class);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11= new Intent(getApplicationContext(),SocialEng.class);
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12= new Intent(getApplicationContext(),Email.class);
                        startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13= new Intent(getApplicationContext(),Masked_pass.class);
                        startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14= new Intent(getApplicationContext(),WifiHack.class);
                        startActivity(intent14);
                        break;
                    case 15:
                        Intent intent15= new Intent(getApplicationContext(),Logout.class);
                        startActivity(intent15);
                        break;


                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mtoggle.onOptionsItemSelected(item)){
            return  true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id =item.getItemId();
        if(id==R.id.home){
            Toast.makeText(this,"thius",Toast.LENGTH_LONG).show();
        }

        if(id==R.id.setting){
            Toast.makeText(this,"korra",Toast.LENGTH_LONG).show();
        }

        if(id==R.id.log){
            Intent intent3= new Intent(getApplicationContext(),Spassword.class);
            startActivity(intent3);
        }
        return false;




    }
   
}
