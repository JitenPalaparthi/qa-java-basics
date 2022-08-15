import java.util.List;

public class Cage {

    private List<? super Elephant> list;

    public void add(List<? super Elephant> list) {
        this.list = list;
    }

    public List<? super Elephant> get() {
        return list;
    }
}