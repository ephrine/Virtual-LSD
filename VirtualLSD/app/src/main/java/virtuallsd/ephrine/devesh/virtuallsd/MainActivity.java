package virtuallsd.ephrine.devesh.virtuallsd;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

        return super.onOptionsItemSelected(item);
    }
}
