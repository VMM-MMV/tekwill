
import java.util.*;

public class Hippo {
    private String name;
    private double weight;
 
    public Hippo(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object item) {
        if (!(item instanceof Hippo)) {
            return false;
        }
        Hippo hippo = (Hippo) item;

        boolean hasSameName = this.name.equals(hippo.name);
        boolean hasSameWeight = this.weight == hippo.weight;
        boolean isSame = hasSameName && hasSameWeight;
        return isSame;
    }
 
    @Override
    public String toString() {
        return "nume: " + name + ", greutate: " + weight;
    }

    @Override
    public int hashCode() {
        return (int) (this.name.hashCode() + this.weight);
    }
 
    public static void main(String[] args) {
        Hippo h1 = new Hippo("Harry", 3100);
        Hippo h2 = new Hippo("Harry", 3100);
        System.out.println(h1.equals(h2));
        // System.out.println(h1.hashCode() + " " + h2.hashCode());
        // Set<Hippo> hippos = new HashSet<>();
    }
 }