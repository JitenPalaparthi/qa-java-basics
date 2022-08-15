import java.util.List;

// bounded generics. Means here you can only give Animal or derived classes of Animal.
// it does not allow you to add any other Classes
public class Cage<T extends Animal> {

    private List<T> list;

    public void add(List<T> list) {
        this.list = list;
    }

    public List<T> get() {
        return list;
    }
}