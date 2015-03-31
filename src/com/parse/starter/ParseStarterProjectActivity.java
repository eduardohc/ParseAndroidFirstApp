package com.parse.starter;

import android.app.Activity;
import android.os.Bundle;

import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseObject;

public class ParseStarterProjectActivity extends Activity {
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		Parse.initialize(this, "JodxAS94NHNFOhTGnDoBSFebZ5TkpyivkrILcq0c", 
				"Nrx2nLAcieEcsjdF8xsfBpzIQXcHejsGzcRyr87w");
		
		ParseObject lolcat = new ParseObject("Lolcat");
		lolcat.put("Name", "Eduardo");
		lolcat.saveInBackground();
		
		ParseAnalytics.trackAppOpenedInBackground(getIntent());
	}
}
