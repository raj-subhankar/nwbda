package com.example.subhankar.nwbda;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class Register extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Show the Up button in the action bar.
        getActionBarToolbar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu);
        getSupportActionBar().setTitle("Registration Form");

        WebView browser = (WebView) findViewById(R.id.webview);
        browser.loadUrl("https://docs.google.com/forms/d/1T2_tsDXmv6rpzJfATUM0-gLJU0UTaJgymrh7Y52VwMk/viewform");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sample_actions, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                openDrawer();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean providesActivityToolbar() {
        return true;
    }

    @Override
    public void onBackPressed()
    {
        Intent intent = new Intent(this, RegistrationDetails.class);
        finish(); // to simulate "restart" of the activity.
        startActivity(intent);
    }
}
