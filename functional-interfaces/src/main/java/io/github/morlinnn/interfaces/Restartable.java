package io.github.morlinnn.interfaces;

public interface Restartable {
    void restart();

    /**
     * stop, delay and restart
     * @param delayMilliSeconds delay if something should stop
     */
    void restart(long delayMilliSeconds);
}
