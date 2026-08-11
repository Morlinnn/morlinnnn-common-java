package io.github.morlinnn.interfaces;

@FunctionalInterface
public interface BiFunction<A, B, R> {
    R apply(A a, B b);
}
