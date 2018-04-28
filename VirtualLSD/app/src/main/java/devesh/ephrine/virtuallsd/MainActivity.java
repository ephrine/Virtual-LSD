package devesh.ephrine.virtuallsd;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
//import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;


public class MainActivity extends AppCompatActivity {

    public static final String presc1 = "presc1";
    public static final String presc1_stat ="presc1_stat";
    SharedPreferences sharedpreferences1;
    SharedPreferences sharedpreferences;

    InterstitialAd mInterstitialAd;



    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_main);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        MobileAds.initialize(getApplicationContext(), "ca-app-pub-6702661245453687~7321012252");

        mInterstitialAd = new InterstitialAd(this);

        //mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");   //Test admob-id
        mInterstitialAd.setAdUnitId("ca-app-pub-6702661245453687/1274478653");     //my own f*** id
        requestNewInterstitial();


/*        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();
            }
        });

*/
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when the ad is displayed.
            }

            @Override
            public void onAdLeftApplication() {
                finish();
                // Code to be executed when the user has left the app.
            }

            @Override
            public void onAdClosed() {
                finish();
                // Code to be executed when when the interstitial ad is closed.
            }
        });


        }

    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                                .build();

        mInterstitialAd.loadAd(adRequest);
    }

    @Override
    public void onBackPressed() {


        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            finish();
        }else {

            setContentView(R.layout.pro);
           // finish();
        }
    }


    @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu, menu);
            return true;
        }

        public void r1(View v){
            Intent r1 = new Intent(this, Ride1.class);
            startActivity(r1);

        }
        public void r2(View v){
            Intent r2 = new Intent(this, Ride2.class);
            startActivity(r2);

        }
        public void r3(View v){
            Intent r3 = new Intent(this, Ride3.class);
            startActivity(r3);

        }

        public void r4(View v){
            Intent r3 = new Intent(this, Ride4.class);
            startActivity(r3);

        }

    public void buy(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=devesh.ephrine.virtuallsd.pro"));
        startActivity(intent);  // get more ephrine apps

    }
    public void exit(View v){
       finish();

    }
    public void close(View v){
setContentView(R.layout.activity_main);
    }


    public void fsok(View v){

        setContentView(R.layout.activity_main);


    }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.about) {
               Intent a= new Intent(this, About.class);
                startActivity(a);
                return true;
            }
            if (id == R.id.how) {
                setContentView(R.layout.start1);

                return true;
            }
            if (id == R.id.buy) {
                setContentView(R.layout.pro);


                return true;
            }


            return super.onOptionsItemSelected(item);
        }




}

