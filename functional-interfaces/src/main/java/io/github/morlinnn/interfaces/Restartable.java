package io.github.morlinnn.interfaces;

public interface Restartable {
    void restart();

    /**
     * stop and delay
     * @param delayMilliSeconds delay if something should stop
     */
    void restart(long delayMilliSeconds);
}
