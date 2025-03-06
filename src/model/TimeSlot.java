package model;

import java.time.LocalDateTime;

/**
 * Data structure that represents a time slot
 */
public class TimeSlot {

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private boolean isCancelled;

    public TimeSlot(LocalDateTime startTime, LocalDateTime endTime, boolean isCancelled) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.isCancelled = isCancelled;
    }

    public LocalDateTime getStartTime() {
        return this.startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return this.endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public boolean isIsCancelled() {
        return this.isCancelled;
    }

    public boolean getIsCancelled() {
        return this.isCancelled;
    }

    public void setIsCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }


}
