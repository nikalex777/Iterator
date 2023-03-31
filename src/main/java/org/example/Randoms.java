package org.example;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>();
    }

    class Iterator<Integer> implements java.util.Iterator {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Object next() {
            return random.nextInt(max - min + 1) + min;
        }
    }

}


