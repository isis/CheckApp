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

Copyright (c) 2013 Katsumi ISHIDA. All rights reserved.

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
