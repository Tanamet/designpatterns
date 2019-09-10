package AbstactFactory;

import Decorator.QuackCounter;
import Decorator.QuackEcho;
import ducks.DuckCall;
import ducks.MallarDuck;
import ducks.RedHeadDuck;
import ducks.RubberDuck;
import quack.Quackable;

public class CounterEchoDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new QuackEcho(new MallarDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new QuackEcho(new RedHeadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new QuackEcho(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new QuackEcho(new RubberDuck()));
    }
}
