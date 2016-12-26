package com.example.mypopupwindow;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;

public class MainActivity extends Activity {

	private SelectPicPopupWindow menuWindow;
	private Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		btn = (Button) findViewById(R.id.button);

		// View popupView = getLayoutInflater().inflate(R.layout.sharewindow,null);
		// mPopupWindow = new
		// PopupWindow(popupView,LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT,true);
		// mPopupWindow.setTouchable(true);
		// mPopupWindow.setOutsideTouchable(true);
		// mPopupWindow.setBackgroundDrawable(new BitmapDrawable(getResources(), (Bitmap) null));

		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				menuWindow = new SelectPicPopupWindow(MainActivity.this,
						itemsOnClick);
				menuWindow.showAtLocation(findViewById(R.id.Layout_main),
						Gravity.BOTTOM, 0, 0);

			}
		});

	}

	private OnClickListener itemsOnClick = new OnClickListener() {

		public void onClick(View v) {
			menuWindow.dismiss();
			switch (v.getId()) {
			// case R.id.btn_take_photo:
			// break;
			// case R.id.btn_pick_photo:
			// break;
			// default:
			// break;
			}

		}

	};

}