package command;

/**
 * Created by sa on 21.03.16.
 */
public class Stereo {
    private int volume;
    public void on(){
        System.out.println("CD включен");
    };
    public void off(){
        System.out.println("CD выключен");
    };

    public void setCD(){
        System.out.println("Вставлен диск");
    }

    public void setVolume(int volume){
        this.volume=volume;
        System.out.println("Установлен уровень громкости:"+volume);
    }


}
