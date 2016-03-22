package adapter;

/**
 * Created by superkostya on 22.03.16.
 */
public class AdapterDuck implements Duckable {
    Turkeyable turkeyable;

    public AdapterDuck(Turkeyable turkeyable) {
        this.turkeyable = turkeyable;
    }

    @Override
    public void quack() {
        turkeyable.blabla();
    }

    @Override
    public void fly() {
        for(int i=0;i<5;i++){
            turkeyable.fly();
        }
    }
}
