package com.example.cashdroid;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SendMoneyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_money);

        EditText recipientInput = findViewById(R.id.recipientInput);
        EditText amountInput = findViewById(R.id.amountInput);
        Button sendButton = findViewById(R.id.sendButton);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipient = recipientInput.getText().toString();
                String amount = amountInput.getText().toString();

                if (recipient.isEmpty() || amount.isEmpty()) {
                    Toast.makeText(SendMoneyActivity.this, "Enter all fields", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SendMoneyActivity.this,
                            "Sent $" + amount + " to " + recipient,
                            Toast.LENGTH_LONG).show();
                    finish();
                }
            }
        });
    }
}
