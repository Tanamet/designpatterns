package AbstactFactory;

import Decorator.QuackCounter;
import ducks.DuckCall;
import ducks.MallarDuck;
import ducks.RedHeadDuck;
import ducks.RubberDuck;
import quack.Quackable;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallarDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedHeadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

}
