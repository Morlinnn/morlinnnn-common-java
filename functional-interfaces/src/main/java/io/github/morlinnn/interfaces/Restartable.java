package io.github.morlinnn.interfaces;

public interface Restartable {
    void restart() throws Exception;

    /**
     * stop, delay and restart
     * @param delayMilliSeconds delay if something should stop
     */
    void restart(long delayMilliSeconds) throws Exception;
}
