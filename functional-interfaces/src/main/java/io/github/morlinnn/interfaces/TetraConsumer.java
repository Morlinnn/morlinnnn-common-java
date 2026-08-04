package io.github.morlinnn.interfaces;

@FunctionalInterface
public interface TetraConsumer<W, X, Y, Z> {
    void accept(W w, X x, Y y, Z z);
}
