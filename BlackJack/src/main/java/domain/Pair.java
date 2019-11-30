package main.java.domain;

public class Pair<L,R> {
    private final L left;
    private final R right;

    public Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    static <L,R> Pair<L,R> of(L left, R right){
        return new Pair<>(left, right);
    }
}
