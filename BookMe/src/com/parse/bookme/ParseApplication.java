package com.parse.bookme;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseCrashReporting;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.ParseFacebookUtils;
import com.parse.SignUpCallback;


public class ParseApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    // Initialize Crash Reporting.
    ParseCrashReporting.enable(this);

    // Enable Local Datastore.
    Parse.enableLocalDatastore(this);

    // Add your initialization code here
    Parse.initialize(this, "xibRugv4vFBUOUrCSRbyQzhu0yqlLIL9V3HJFLFw", "foC0VeWeNRJdx4HGBk4L0zd2R4yFYWdGgcOLcGgR");
      ParseUser user = new ParseUser();
      user.setUsername("ADOLF");
      user.setPassword("hitler");

      ParseObject testObject = new ParseObject("TestObject");
      testObject.put("star", "wars");
      testObject.saveInBackground();














  }
}
