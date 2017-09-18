package StartegyPattern;

import java.util.Observable;
import java.util.Observer;

public class MiniDuckSimulator extends Observable implements Observer{
    public static void main(String[] args){
        duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }

    /*
    o : the subject that sent the notification is passed in as this arg
    arg : this will be the data object that was passed to notifyObservers(),
    or null if a data object wasn't specified
     */
    @Override
    public void update(Observable o, Object arg) {

    }
}
