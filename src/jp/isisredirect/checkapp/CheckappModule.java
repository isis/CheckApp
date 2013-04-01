/*
Copyright (c) 2013 Katsumi ISHIDA. All rights reserved.

Permission is hereby granted, free of charge, to any person obtaining a copy of 
this software and associated documentation files (the "Software"), to deal in the 
Software without restriction, including without limitation the rights to use, copy, 
modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, 
and to permit persons to whom the Software is furnished to do so, subject to the 
following conditions:

The above copyright notice and this permission notice shall be included in all copies
 or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, 
INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE 
 LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, 
 TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE 
 OR OTHER DEALINGS IN THE SOFTWARE.
 */
package jp.isisredirect.checkapp;

import java.util.ArrayList;
import java.util.List;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.kroll.common.TiConfig;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;


@Kroll.module(name="Checkapp", id="jp.isisredirect.checkapp")
public class CheckappModule extends KrollModule
{

	// Standard Debugging variables
	private static final String LCAT = "CheckappModule";
	private static final boolean DBG = TiConfig.LOGD;

	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;
	
	public CheckappModule()
	{
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app)
	{
		Log.d(LCAT, "inside onAppCreate");
		// put module init code that needs to run when the application is created
	}

	// Methods
	@Kroll.method
	public boolean exists(String packagename)
	{
	      boolean result = false;  
	      List<ResolveInfo> installedAppList = new ArrayList<ResolveInfo>();  
	      Intent mainIntent = new Intent(Intent.ACTION_MAIN, null);  
	      mainIntent.addCategory(Intent.CATEGORY_LAUNCHER);  
	      installedAppList = getActivity().getPackageManager().queryIntentActivities(mainIntent, 0);  
	      for (ResolveInfo info : installedAppList) {  
	         ActivityInfo activityInfo = info.activityInfo;  
	         if (activityInfo.packageName.equals(packagename)) {  
	           result = true;  
	           break;  
	         }  
	      }  
	      return result;  
	}
}

