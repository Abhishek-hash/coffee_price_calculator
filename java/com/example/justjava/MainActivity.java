package com.example.justjava;


import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     *  by default the quantity has been set to 2.
     */
    int quantity = 2;
    /**
     * This method is called when the order plus/increment is clicked.
     */
    public void increment(View view) {
        quantity++;
        display(quantity);
    }

    /**
     * This method is called when the order minus/decrement is clicked.
     */
    public void decrement(View view) {
        quantity--;
        if(quantity < 0) quantity = 0;
        display(quantity);

    }

    /**
     * price of one cup coffee is 5 rs.
     */

    int price = 5;
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        String message = "Total = " + quantity*price+" rs";
        message += "\n"+ "Thank you!";
        displayMessage(message);


    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}