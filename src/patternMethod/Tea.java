package patternMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sa on 22.03.16.
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Завариваем чай");
    }

    @Override
    void addCondiments() {
        System.out.println("Добавляем лимон");
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
        System.out.println("Add lemon(yes/no)");
        try {
            answer=bufferedReader.readLine();
        } catch (IOException e) {
            answer="no";
        }
        return answer;
    }
}
