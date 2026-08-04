package io.github.morlinnn.interfaces;

@FunctionalInterface
public interface TriConsumer<X, Y, Z> {
    void accept(X x, Y y, Z z);
}
