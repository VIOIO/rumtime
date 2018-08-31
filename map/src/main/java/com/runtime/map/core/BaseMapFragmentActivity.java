package com.runtime.map.core;


import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.amap.api.maps.AMap;

/**
 * 基本地图（MapFragment）实现
 */
public class BaseMapFragmentActivity extends FragmentActivity {

	private AMap mMap;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setUpMapIfNeeded();

	}

	@Override
	protected void onResume() {
		super.onResume();
		setUpMapIfNeeded();
	}
	
	@Override
	protected void onDestroy(){
		super.onDestroy();
	}

	/**
	 * 获取Amap 对象
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setUpMapIfNeeded() {
		if (mMap == null) {

		}
	}

}
