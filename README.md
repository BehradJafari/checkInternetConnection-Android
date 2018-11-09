# CheckInternetConnection-Android
A simple and easy way to check your internet connection and trace it changes.

# Requirements
* Android 4.0.3  (API lvl 15) or greater
* Android Studio ;)


# Installation 

* in your build.gradle(app) add :
```
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
        maven { 
            url "https://maven.google.com"
          }
      }
  }
```
* then in dependency part add :
```
    compile 'com.github.BehradJafari:checkInternetConnection-Android:1.0.1'
```


# How to Use 

* in activity that you want to trace connection , you should do like below :
```java

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

```
* overriding the  onLowMemory() method is not necessary

# Hamiss 
visit our website :
[Hamiss.ir](https://www.google.com "Hamiss's Homepage")


![alt text](https://hamiss.ir/img/bg-img/logo.png "Logo Title Text 1")

