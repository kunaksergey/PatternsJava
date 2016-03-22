package patternMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by sa on 22.03.16.
 */
public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Завариваем кофе");
    }

    @Override
    void addCondiments() {
        System.out.println("Добавляем сахар и молоко");
    }

    @Override
    boolean getAnswer() {
        String answer=getUsernput();
        if (answer.toLowerCase().startsWith("y"))
            return true;
        return false;
    }
    String getUsernput(){
        String answer= null;
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Add milk and sugar(yes/no)");
        try {
            answer=bufferedReader.readLine();
        } catch (IOException e) {
            answer="no";
        }
        return answer;
    }
}
