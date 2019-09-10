package simulator;

import AbstactFactory.CountingDuckFactory;
import Adapter.Pigeon;
import Adapter.PigeonAdapter;
import Composite.Flock;
import Adapter.Goose;
import Adapter.GooseAdapter;
import Decorator.QuackCounter;
import Decorator.QuackEcho;
import ducks.MallarDuck;
import quack.Quackable;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }
    void simulate() {

        CountingDuckFactory duckFactory = new CountingDuckFactory();

        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        // adapter
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());

        // decorator
        Quackable mallardEcho = new QuackCounter(new QuackEcho(new MallarDuck()));

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);
        simulate(flockOfDucks);
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
