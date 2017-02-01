
package com.connectedlab.rctlogger;

import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNRctLoggerModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNRctLoggerModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNRctLogger";
  }

  @ReactMethod
  public void log(String tag, String message) {
    Log.v(getName(), String.format("%s %s", tag, message));
  }
}