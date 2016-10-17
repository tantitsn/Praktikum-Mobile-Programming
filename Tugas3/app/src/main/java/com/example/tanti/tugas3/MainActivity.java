package com.example.tanti.tugas3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
	
	// Alert Dialog Manager
	AlertDialogManager alert = new AlertDialogManager();
	
	// Session Manager Class
	SessionManager session;
    Session2 session2;
	
	// Button Logout
	Button btnLogout;
    EditText edtNim, edtNama;

    // login button
    Button btnSubmit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Session class instance
        session = new SessionManager(getApplicationContext());
        session2 = new Session2(getApplicationContext());
        
        TextView lblName = (TextView) findViewById(R.id.lblName);
        TextView lblEmail = (TextView) findViewById(R.id.lblEmail);

        edtNim = (EditText)findViewById(R.id.edtNim);
        edtNama = (EditText)findViewById(R.id.edtNama);
        // Button logout
        btnLogout = (Button) findViewById(R.id.btnLogout);
        btnSubmit =(Button) findViewById(R.id.btnSubmit);
        
        Toast.makeText(getApplicationContext(), "User Login Status: " + session.isLoggedIn(), Toast.LENGTH_LONG).show();
        
        
        /**
         * Call this function whenever you want to check user login
         * This will redirect user to LoginActivity is he is not
         * logged in
         * */
        session.checkLogin();
        
        // get user data from session
        HashMap<String, String> user = session.getUserDetails();
        
        // name
        String name = user.get(SessionManager.KEY_NAME);
        
        // email
        String email = user.get(SessionManager.KEY_EMAIL);
        
        // displaying user data
        lblName.setText(Html.fromHtml("Name: <b>" + name + "</b>"));
        lblEmail.setText(Html.fromHtml("Email: <b>" + email + "</b>"));
        
        
        /**
         * Logout button click event
         * */
        btnLogout.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// Clear the session data
				// This will clear all session data and 
				// redirect user to LoginActivity
				session.logoutUser();
			}
		});

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nim = edtNim.getText().toString();
                String nama = edtNama.getText().toString();

                session2.createLoginSession(nim, nama);

                // Staring MainActivity
                Intent a = new Intent(getApplicationContext(), Hasil.class);
                startActivity(a);
                finish();
            }
        });
    }
        
}