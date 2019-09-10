package Decorator;

import quack.Quackable;

public class QuackEcho implements Quackable {

    Quackable duck;

    public QuackEcho(Quackable duck){
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        System.out.println("echo :");
        duck.quack();
    }

}
