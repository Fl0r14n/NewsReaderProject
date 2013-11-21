package ro.tpg.academy.newsreader;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Log.d(this.getLocalClassName(), new Exception().getStackTrace()[0].getMethodName());
    }

    @Override
    protected void onStart() {
        super.onStart(); //To change body of generated methods, choose Tools | Templates.
        Log.d(this.getLocalClassName(), new Exception().getStackTrace()[0].getMethodName());
    }

    @Override
    protected void onPause() {
        super.onPause(); //To change body of generated methods, choose Tools | Templates.
        Log.d(this.getLocalClassName(), new Exception().getStackTrace()[0].getMethodName());
    }

    @Override
    protected void onResume() {
        super.onResume(); //To change body of generated methods, choose Tools | Templates.
        Log.d(this.getLocalClassName(), new Exception().getStackTrace()[0].getMethodName());
    }

    @Override
    protected void onRestart() {
        super.onRestart(); //To change body of generated methods, choose Tools | Templates.
        Log.d(this.getLocalClassName(), new Exception().getStackTrace()[0].getMethodName());
    }

    @Override
    protected void onStop() {
        super.onStop(); //To change body of generated methods, choose Tools | Templates.
        Log.d(this.getLocalClassName(), new Exception().getStackTrace()[0].getMethodName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy(); //To change body of generated methods, choose Tools | Templates.
        Log.d(this.getLocalClassName(), new Exception().getStackTrace()[0].getMethodName());
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState); //To change body of generated methods, choose Tools | Templates.
        Log.d(this.getLocalClassName(), new Exception().getStackTrace()[0].getMethodName());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState); //To change body of generated methods, choose Tools | Templates.
        Log.d(this.getLocalClassName(), new Exception().getStackTrace()[0].getMethodName());
    }
}
