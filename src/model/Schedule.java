package model;

import java.util.List;

/**
 * Structure to hold the weekly schedule
 * providing setting a default schedule and a temporary scehdule
 */
public class Schedule {
    private Activity activity;
    private List<TimeSlot> defaultWeeklySchedule;  // Default weekly times for the activity
    private List<TimeSlot> temporaryWeeklySchedule;   // One-time changes like reschedules or cancellations

    public Activity getActivity() {
        return this.activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public List<TimeSlot> getDefaultWeeklySchedule() {
        return this.defaultWeeklySchedule;
    }

    public void setDefaultWeeklySchedule(List<TimeSlot> defaultWeeklySchedule) {
        this.defaultWeeklySchedule = defaultWeeklySchedule;
    }

    public List<TimeSlot> gettemporaryWeeklySchedule() {
        return this.temporaryWeeklySchedule;
    }

    public void settemporaryWeeklySchedule(List<TimeSlot> temporaryWeeklySchedule) {
        this.temporaryWeeklySchedule = temporaryWeeklySchedule;
    }


}
