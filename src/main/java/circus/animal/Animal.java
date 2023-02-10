package circus.animal;

import circus.Asset;

import java.util.Comparator;

public abstract class Animal implements Asset, Comparable<Animal> {

    public String name;

    public final static Comparator<Animal> AnimalNameComparator = new Comparator<Animal>() {
        @Override
        public int compare(Animal a, Animal b) {
            return a.name.compareToIgnoreCase(b.name);
        }
    };

    public abstract String speak();

    @Override
    public int compareTo(Animal other) {
        return this.name.compareToIgnoreCase(other.name);
    }
}
