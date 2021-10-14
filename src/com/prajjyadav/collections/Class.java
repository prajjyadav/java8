package com.prajjyadav.collections;

import java.util.Iterator;
import java.util.LinkedList;

class Class implements Iterable<String> {
    private LinkedList<String> students = new LinkedList<>();

    private class ClassIterator implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < students.size();
        }

        @Override
        public String next() {

            // we can even write some custom logic to give mre details here

            String student = students.get(index);
            index++;
            return student;
        }

        @Override
        public void remove() {
            students.remove(index);
        }
    }

    public Class() {
        students.add("john");
        students.add("johnny");
        students.add("jack");
        students.add("jake");
    }

//    @Override
//    public Iterator<String> iterator() {
//        return students.iterator();
//    }

    @Override
    public Iterator<String> iterator() {
        return new ClassIterator();
    }
}
