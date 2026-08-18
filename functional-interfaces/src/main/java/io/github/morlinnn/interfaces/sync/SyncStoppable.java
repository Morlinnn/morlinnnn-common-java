package io.github.morlinnn.interfaces.sync;

public interface SyncStoppable {
    void syncStop();

    /**
     * sync stop, delay and sync restart
     * @param delayMilliSeconds delay if something should stop
     */
    void syncRestart(long delayMilliSeconds);
}
