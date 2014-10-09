package edu.ntust.cs.idsl.hellonfc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 
 * @author Chun-Kai Wang <m10209122@mail.ntust.edu.tw>
 *
 */
public class MainActivity extends NfcActivity {

	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_main);
		textView = (TextView) findViewById(R.id.textView);
		super.onCreate(savedInstanceState);	
	}

	@Override
	protected void onNfcFeatureNotFound() {
		textView.setText(R.string.nfc_unsupported);
	}

	@Override
	protected void onNfcStateEnabled() {
		textView.setText(R.string.nfc_ready);
	}

	@Override
	protected void onNfcStateDisabled() {
		textView.setText(R.string.nfc_disabled);
	}
	
	@Override
	protected void onTagDiscovered(Intent intent) {
		Toast.makeText(this, getString(R.string.hello_nfc), Toast.LENGTH_SHORT).show();
	}
	
}

