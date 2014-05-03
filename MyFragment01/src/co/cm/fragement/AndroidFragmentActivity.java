package co.cm.fragement;

import android.app.Activity;
import android.os.Bundle;

public class AndroidFragmentActivity extends Activity {
    // 主activity
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        WifiAdmin.getWifiAdmin().setmContext(AndroidFragmentActivity.this);
        WifiAdmin.getWifiAdmin().getWifiMeathod();
    }
}