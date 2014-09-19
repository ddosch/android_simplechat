package com.yahoo.ddosch.simplechat;

import android.app.Application;

import com.parse.LogInCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class ParseApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		Parse.initialize(this, "DqNRoWFIzxzMFIeZtAVuHdmeXakgPBl4PDogtvKq", "oNJ2J4qPj8O0la00RmmkNDaF4V8xqdKQblJULrwk");

	}
}