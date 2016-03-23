package facad;
import facad.device.*;
/**
 * Created by sa on 22.03.16.
 * Фасад предоставляем интерфейс к группе интерфейсов подсистемы. Фасад определяет
 * высокоуровневый интерфейс упрощающий работу с подсистемой
 */
public class Main {
    public static void main(String[] args) {
        FacadDevice facadDevice=new FacadDevice(
                new PopkornDevice(),
                new CD(),
                new Light(),
                new MovieDevice()
        );
        facadDevice.start();
        System.out.println();
        facadDevice.stop();
    }
}
