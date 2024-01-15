import java.util.ArrayList;
import java.util.List;

interface Iterator<T> {
    boolean hasNext();
    T next();
}

interface IterableCollection<T> {
    Iterator<T> createIterator();
}

class MyCollection implements IterableCollection<String> {
    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    @Override
    public Iterator<String> createIterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < items.size();
        }

        @Override
        public String next() {
            if (hasNext()) {
                return items.get(index++);
            }
            return null;
        }
    }
}

class ThreeTest
{
    public static void main(String[] args) {
        MyCollection collection = new MyCollection();
        collection.addItem("Item 1");
        collection.addItem("Item 2");
        collection.addItem("Item 3");

        Iterator<String> iterator = collection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}