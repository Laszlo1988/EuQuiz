package com.example.android.quizontheeu;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    //The number of correct answers are stored in this variable.
    int correct = 0;
    int incorrect = 0;

    //Initializing the variables for views, which could be modified by the app.
    RadioButton answer_1;
    RadioButton answer_2;
    RadioButton answer_3;
    RadioButton answer_4;
    RadioButton answer_5;
    RadioButton answer_6;
    RadioButton answer_7;
    RadioButton answer_8;
    RadioButton answer_9;
    RadioButton answer_10;
    CheckBox answer_11a;
    CheckBox answer_11c;

    RadioGroup questionsAnswers_1;
    RadioGroup questionsAnswers_2;
    RadioGroup questionsAnswers_3;
    RadioGroup questionsAnswers_4;
    RadioGroup questionsAnswers_5;
    RadioGroup questionsAnswers_6;
    RadioGroup questionsAnswers_7;
    RadioGroup questionsAnswers_8;
    RadioGroup questionsAnswers_9;
    RadioGroup questionsAnswers_10;
    CheckBox questionsAnswers_11a;
    CheckBox questionsAnswers_11b;
    CheckBox questionsAnswers_11c;
    CheckBox questionsAnswers_11d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //The variables for all the views modified in this app are initialized here.

        //The following RadioButtons contain the correct answers. The app will check later whether they are selected or not.
        answer_1 = (RadioButton) findViewById(R.id.answer1d);
        answer_2 = (RadioButton) findViewById(R.id.answer2c);
        answer_3 = (RadioButton) findViewById(R.id.answer3c);
        answer_4 = (RadioButton) findViewById(R.id.answer4b);
        answer_5 = (RadioButton) findViewById(R.id.answer5b);
        answer_6 = (RadioButton) findViewById(R.id.answer6c);
        answer_7 = (RadioButton) findViewById(R.id.answer7c);
        answer_8 = (RadioButton) findViewById(R.id.answer8b);
        answer_9 = (RadioButton) findViewById(R.id.answer9b);
        answer_10 = (RadioButton) findViewById(R.id.answer10c);
        answer_11a = (CheckBox) findViewById(R.id.answer11a);
        answer_11c = (CheckBox) findViewById(R.id.answer11c);


        //The following RadioGroups contain all answers. Using these variables the app will be able to reset all RadioButtons
        // to unchecked state. The same stands for the Checkboxes too.
        questionsAnswers_1 = (RadioGroup) findViewById(R.id.question_1_answers);
        questionsAnswers_2 = (RadioGroup) findViewById(R.id.question_2_answers);
        questionsAnswers_3 = (RadioGroup) findViewById(R.id.question_3_answers);
        questionsAnswers_4 = (RadioGroup) findViewById(R.id.question_4_answers);
        questionsAnswers_5 = (RadioGroup) findViewById(R.id.question_5_answers);
        questionsAnswers_6 = (RadioGroup) findViewById(R.id.question_6_answers);
        questionsAnswers_7 = (RadioGroup) findViewById(R.id.question_7_answers);
        questionsAnswers_8 = (RadioGroup) findViewById(R.id.question_8_answers);
        questionsAnswers_9 = (RadioGroup) findViewById(R.id.question_9_answers);
        questionsAnswers_10 = (RadioGroup) findViewById(R.id.question_10_answers);
        questionsAnswers_11a = (CheckBox) findViewById(R.id.answer11a);
        questionsAnswers_11b = (CheckBox) findViewById(R.id.answer11b);
        questionsAnswers_11c = (CheckBox) findViewById(R.id.answer11c);
        questionsAnswers_11d = (CheckBox) findViewById(R.id.answer11d);

    }

    //This method creates a toast message, which contains the number of correct and incorrect answers.

    public void resultMessage() {

        String endMessageForm = "Correct answers: " + correct + "\nIncorrect answers: " + incorrect;

        endMessageForm += "\n1:D\n2:C\n3:C\n4:B\n5:B\n6:C\n7:C\n8:B\n9:B\n10:C\n11:A,C";

        Toast.makeText(this, endMessageForm, Toast.LENGTH_LONG).show();
    }

    public void evaluateQuiz(View view) {

        // Question 1: Figure out if the correct answer (c) is selected or not.

        boolean hasAnswerSelected = answer_1.isChecked();

        if (hasAnswerSelected) {
            correct += 1;
        } else {
            incorrect += 1;
        }

        // Question 2: Figure out if the correct answer (c) is selected or not.

        hasAnswerSelected = answer_2.isChecked();

        if (hasAnswerSelected) {
            correct += 1;
        } else {
            incorrect += 1;
        }

        // Question 3: Figure out if the correct answer (c) is selected or not.

        hasAnswerSelected = answer_3.isChecked();

        if (hasAnswerSelected) {
            correct += 1;
        } else {
            incorrect += 1;
        }

        // Question 4: Figure out if the correct answer (b) is selected or not.

        hasAnswerSelected = answer_4.isChecked();

        if (hasAnswerSelected) {
            correct += 1;
        } else {
            incorrect += 1;
        }

        // Question 5: Figure out if the correct answer (b) is selected or not.

        hasAnswerSelected = answer_5.isChecked();

        if (hasAnswerSelected) {
            correct += 1;
        } else {
            incorrect += 1;
        }

        // Question 6: Figure out if the correct answer (c) is selected or not.

        hasAnswerSelected = answer_6.isChecked();

        if (hasAnswerSelected) {
            correct += 1;
        } else {
            incorrect += 1;
        }

        // Question 7: Figure out if the correct answer (c) is selected or not.

        hasAnswerSelected = answer_7.isChecked();

        if (hasAnswerSelected) {
            correct += 1;
        } else {
            incorrect += 1;
        }

        // Question 8: Figure out if the correct answer (b) is selected or not.

        hasAnswerSelected = answer_8.isChecked();

        if (hasAnswerSelected) {
            correct += 1;
        } else {
            incorrect += 1;
        }

        // Question 9: Figure out if the correct answer (b) is selected or not.

        hasAnswerSelected = answer_9.isChecked();

        if (hasAnswerSelected) {
            correct += 1;
        } else {
            incorrect += 1;
        }

        // Question 10: Figure out if the correct answer (c) is selected or not.

        hasAnswerSelected = answer_10.isChecked();

        if (hasAnswerSelected) {
            correct += 1;
        } else {
            incorrect += 1;
        }

        // Question 11: Figure out if the correct answer (a,c) is selected or not.

        boolean hasAnswerChecked11a = answer_11a.isChecked();

        boolean hasAnswerChecked11c = answer_11c.isChecked();

        if (hasAnswerChecked11a && hasAnswerChecked11c) {
            correct += 1;
        } else {
            incorrect += 1;
        }

        resultMessage();
    }


    public void restartQuiz(View v) {

        questionsAnswers_1.clearCheck();
        questionsAnswers_2.clearCheck();
        questionsAnswers_3.clearCheck();
        questionsAnswers_4.clearCheck();
        questionsAnswers_5.clearCheck();
        questionsAnswers_6.clearCheck();
        questionsAnswers_7.clearCheck();
        questionsAnswers_8.clearCheck();
        questionsAnswers_9.clearCheck();
        questionsAnswers_10.clearCheck();


        if (questionsAnswers_11a.isChecked()) {
            questionsAnswers_11a.setChecked(false);
        }

        if (questionsAnswers_11b.isChecked()) {
            questionsAnswers_11b.setChecked(false);
        }

        if (questionsAnswers_11c.isChecked()) {
            questionsAnswers_11c.setChecked(false);
        }

        if (questionsAnswers_11d.isChecked()) {
            questionsAnswers_11d.setChecked(false);
        }

        correct = 0;
        incorrect = 0;
    }


}
