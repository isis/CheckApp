# checkapp Module

## Description

CheckApp module can check whether the application specified by package name is installed into Android device. 

## Accessing the checkapp Module

To access this module from JavaScript, you would do the following:

  var checkapp = require("jp.isisredirect.checkapp");

The checkapp variable is a reference to the Module object.	

## Reference

### method
#### exists  
check whether the application is installed on Android device.
##### Arguments
+	packagename [string] : package name of the application to check

##### return value
+ [boolean] if true, the application is installed, otherwise not.


## Usage

	var checkapp = require('jp.isisredirect.checkapp');
	if (checkapp.exists("com.google.android.apps.maps")) {
		label.text = "Google Map App is installed ";
	}else{
		label.text = "Google Map App is not installed ";
	}

## Author

Kastumi ISHIDA (isis re-direct) in k.i.office.

isis331@gmail.com


## License

read 'license' file
