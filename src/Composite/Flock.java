package Composite;

import quack.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {

    ArrayList<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker){
        quackers.add(quacker);
    }

    @Override
    public void quack() {

        if(!quackers.isEmpty()) {

            Quackable head = quackers.get(0);
            for (int i = 0; i < 2 ; i++) {
                head.quack();
            }

        }

        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()){
            Quackable quacker = (Quackable)iterator.next();
            quacker.quack();
        }
    }
}
