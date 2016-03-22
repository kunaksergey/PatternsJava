package patternMethod;

/**
 * Created by sa on 22.03.16.
 * Паттерн Шаблонный метод задает "Cкелет" алгоритма в методе, оставляя определение реализации
 * некоторых шагов субклассам. Субклассы могут переопределять некоторые части алгоритма без изменения
 * его структуры
 * В шаблонный метод можно добавить перехватчики
 */
public class Main {
    public static void main(String[] args) {
        new Coffee().prepareRecipe();
        System.out.println();
        new Tea().prepareRecipe();
    }
}
