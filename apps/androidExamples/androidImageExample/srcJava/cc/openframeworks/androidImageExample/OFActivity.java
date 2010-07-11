package cc.openframeworks.androidImageExample;

import android.app.Activity;
import android.os.Bundle;
import cc.openframeworks.OFAndroid;


public class OFActivity extends Activity{

	@Override
    public void onCreate(Bundle savedInstanceState)
    { 
        super.onCreate(savedInstanceState);
        String packageName = getPackageName();

        ofApp = new OFAndroid(getResources().getText(R.string.app_name).toString(),packageName,this);
    }
	
	@Override
	public void onDetachedFromWindow() {
	}
	
    @Override
    protected void onPause() {
        super.onPause();
        ofApp.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        ofApp.resume();
    }
	
	OFAndroid ofApp;
}



