package ducks;

import quack.Quackable;

public class MallarDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
