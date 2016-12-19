package com.example.nadia.myapplication;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView textFrom; //От
    TextView textTo;   //До
    TextView question; //Вопрос
    TextView answer;   //Ответ

    int min; //Минимальное число
    int max; //Максимальное число
    int avg; //Среднее значение чисел

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View v)
    {
        textFrom = (TextView) findViewById(R.id.ifrom);
        textTo   = (TextView) findViewById(R.id.ito);
        question = (TextView)findViewById(R.id.question);
        answer   = (TextView)findViewById(R.id.answer);

        //Перевожу текст в число
        min = Integer.valueOf(textFrom.getText().toString());
        max = Integer.valueOf(textTo.getText().toString());
        avg = (max + min)  / 2;

        //Если неправильно указали диапазон (от и до) меняю местами
        if(max < min) {
            min = Integer.valueOf(textTo.getText().toString());;
            max = Integer.valueOf(textFrom.getText().toString());
            avg = (max + min)  / 2;
        }

        question.setText(" ");
        answer.setText(" ");

        onClick(v);
    }

    public void onClick(View v)
    {
        question.setText("Ваше число >=" + Integer.toString(avg));

        //Если заданы одинаковые числа вывожу ответ
        if(max == min)
        {
            answer.setText(Integer.toString(max));
        }
        else {


                if (v.getId() == R.id.yes && (max - min) != 1)
                {
                    min = avg;
                    avg = (max + min) / 2;
                }
                else if (v.getId() == R.id.no && (max - min) != 1)
                {
                    max = avg;
                    avg = (max + min) / 2;
                }

                question.setText("Ваше число >=" + Integer.toString(avg));

                if ((max - min) == 1) //Если осталось 2 числа, спрашиваю у пользователя какое из них он загадал
                {
                    question.setText("Ваше число = " + Integer.toString(min) + " ?");

                    if (v.getId() == R.id.yes)
                    {
                        if (avg < 0)
                        {
                            avg--;
                            answer.setText(Integer.toString(avg));
                        } else {
                            answer.setText(Integer.toString(avg));
                        }
                    }
                    else if (v.getId() == R.id.no)
                    {
                        answer.setText(Integer.toString(max));
                    }
                }
            }

    }
}
