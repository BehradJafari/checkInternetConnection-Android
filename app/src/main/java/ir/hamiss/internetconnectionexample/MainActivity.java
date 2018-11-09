package ir.hamiss.internetconnectionexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ir.hamiss.internetcheckconnection.InternetAvailabilityChecker;
import ir.hamiss.internetcheckconnection.InternetConnectivityListener;

public class MainActivity extends AppCompatActivity implements InternetConnectivityListener {
    private InternetAvailabilityChecker mInternetAvailabilityChecker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //connection
        mInternetAvailabilityChecker = InternetAvailabilityChecker.getInstance();
        mInternetAvailabilityChecker.addInternetConnectivityListener(this);

    }

    @Override
    public void onInternetConnectivityChanged(boolean isConnected) {
        if (isConnected){
            //internet is available
        }
        else {
            //internet is not available
        }
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mInternetAvailabilityChecker.removeAllInternetConnectivityChangeListeners();
    }
}
