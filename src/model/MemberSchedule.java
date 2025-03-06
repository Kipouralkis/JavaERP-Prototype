package model;

import java.util.ArrayList;
import java.util.List;

public class MemberSchedule {
    Member member;
    Activity activity;
    List<TimeSlot> timeSlots;
    // dd a list of TimeSlots for each activity, with a "fixed" size 
    // (probably have it fixed with the use of conditionals),
    //  and the size corresponds to the monthly times available their subscription type allows


    public MemberSchedule(Member member, Activity activity, List<TimeSlot> timeSlots) {
        this.member = member;
        this.activity = activity;
        this.timeSlots = new ArrayList<>();
    }

    public Member getMember() {
        return this.member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Activity getActivity() {
        return this.activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public List<TimeSlot> getTimeSlots() {
        return this.timeSlots;
    }

    public void setTimeSlots(List<TimeSlot> timeSlots) {
        this.timeSlots = timeSlots;
    }

    
}
