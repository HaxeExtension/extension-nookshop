/* Copyright (c) 2014 Pozirk Games
* http://www.pozirk.com
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.pozirk.nook;

import android.util.Log;
import android.content.Intent;
import org.haxe.extension.Extension;

public class Shop extends Extension
{
	static public void details(String ean)
	{
		Log.d("nook-shop", "details: "+ean);
		try
		{
			Intent i = new Intent();
			i.setAction("com.bn.sdk.shop.details");
			i.putExtra("product_details_ean", ean); // Your real EAN goes here
			mainActivity.startActivity(i);
		}
		catch(Exception e)
    {
    	e.printStackTrace();
    }
	}
}