package com.example.burritoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private TextView priceTextView;
    //private TextView orderSummaryTextView;
    private CheckBox lettuceCheckBox;
    private CheckBox spinachCheckBox;
    private CheckBox cornCheckBox;
    private CheckBox tomatoCheckBox;
    private CheckBox brownRiceCheckBox;
    private CheckBox whiteRiceCheckBox;
    private CheckBox redBeanCheckBox;
    private CheckBox blackBeanCheckBox;
    private CheckBox chickenCheckBox;
    private CheckBox porkCheckBox;
    private CheckBox steakCheckBox;
    private TextView summaryView;

    Double price =0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        priceTextView = findViewById(R.id.textViewPrice);
        //orderSummaryTextView = findViewById(R.id.textViewOrderSummaryTitle);
        summaryView = findViewById(R.id.textViewSummary);
        lettuceCheckBox = findViewById(R.id.checkBoxLettuce);
        spinachCheckBox = findViewById(R.id.checkBoxSpinach);
        cornCheckBox = findViewById(R.id.checkBoxCorn);
        tomatoCheckBox = findViewById(R.id.checkBoxTomatoes);
        brownRiceCheckBox = findViewById(R.id.checkBoxBrownRice);
        whiteRiceCheckBox =findViewById(R.id.checkBoxWhiteRice);
        redBeanCheckBox = findViewById(R.id.checkBoxRedBeans);
        blackBeanCheckBox = findViewById(R.id.checkBoxBlackBeans);
        chickenCheckBox = findViewById(R.id.checkBoxChicken);
        porkCheckBox = findViewById(R.id.checkBoxPork);
        steakCheckBox = findViewById(R.id.checkBoxSteak);
    }

    public void orderSummary(View view) {
        String myOrder ="";
        if(lettuceCheckBox.isChecked()){
            myOrder += "Lettuce, ";

        }
        if(tomatoCheckBox.isChecked()){
            myOrder += "Tomatoes, ";

        }
        if(spinachCheckBox.isChecked()){
            myOrder += "Spinach, ";

        }
        if(cornCheckBox.isChecked()){
            myOrder += "Corn, ";

        }
        if(brownRiceCheckBox.isChecked()){
            myOrder += "Brown Rice, ";

        }
        if(whiteRiceCheckBox.isChecked()){
            myOrder += "White Rice, ";

        }
        if(redBeanCheckBox.isChecked()){
            myOrder += "Red Beans, ";

        }
        if(blackBeanCheckBox.isChecked()){
            myOrder += "Black Beans, ";

        }
        if(chickenCheckBox.isChecked()){
            myOrder += "Chicken, ";

        }
        if(porkCheckBox.isChecked()){
            myOrder += "Pork, ";

        }
        if(steakCheckBox.isChecked()){
            myOrder += "steak, ";

        }
        summaryView.setText(myOrder);
    }

    public void priceUpdate(View view) {

        price = 4.95;
        if(cornCheckBox.isChecked()){
            price += 1.00;
        }
        if(redBeanCheckBox.isChecked()){
            price += 1.00;
        }
        if(chickenCheckBox.isChecked()){
            price += 1.00;
        }
        if(porkCheckBox.isChecked()){
            price += 1.00;
        }
        if(steakCheckBox.isChecked()){
            price += 2.00;
        }
        String totalPrice= Double.toString(price);
        priceTextView.setText(String.format("$"+totalPrice));
    }
}