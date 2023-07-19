package com.sivasrinivas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class PositiveIterator {

    private final Iterator<Integer> iterator;
    private Optional<Integer> nextVal;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(-3);
        list.add(4);
        list.add(5);
        list.add(-6);
        list.add(7);
        list.add(8);
        list.add(-9);
        PositiveIterator pos = new PositiveIterator(list.iterator());
        while (pos.hasNext()) {
            Integer num = pos.next();
            System.out.println(num);
        }

    }

    public PositiveIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
        // Initialize nextVal here itself
        this.nextVal = iterator.hasNext() ? Optional.of(iterator.next()) : Optional.empty();
    }

    public Integer next() {
        Integer value = nextVal.get(); // if not present, throws NoSuchElementException which is expected

        // Update the "prev" to correct value
        nextVal = Optional.empty();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if(next>=0) {
                nextVal = Optional.of(next);
                break;
            }
        }



        return value;
    }

    public boolean hasNext() {
        return this.nextVal.isPresent();
    }

    // TODO
//    public void remove() {
//        iterator.remove();
//    }
}
