package io.github.morlinnn.interfaces.sync;

public interface SyncRestartable {
    void syncRestart();

    /**
     * stop, delay and restart
     * @param delayMilliSeconds delay if something should stop
     */
    void syncRestart(long delayMilliSeconds);
}
