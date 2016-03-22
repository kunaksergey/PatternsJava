package adapter;

/**
 * Created by superkostya on 22.03.16.
 * Паттерн используется для преобразования одного интерфейса в другой, на который расчитан клиент.
 * Адаптер обеспечивает работу классов, не возможную в обычных условиях из-за
 * несовместимости интерфейсов
 **/
public class Main {
    public static void main(String[] args) {
            client(new Duck());
            client(new AdapterDuck(new Turkey()));

    }

    static void  client(Duckable duck){
        duck.quack();
        duck.fly();
    }
}
