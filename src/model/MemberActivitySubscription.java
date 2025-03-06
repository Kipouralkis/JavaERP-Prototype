package model;

/**
 * Structure that holds information that associates each member with 
 * an activity and the subscription type they chose for said activity
 */
public class MemberActivitySubscription {
    private Member member;
    private Activity activity;
    private Subscription subscription;


    public MemberActivitySubscription(Member member, Activity activity, Subscription subscription) {
        this.member = member;
        this.activity = activity;
        this.subscription = subscription;
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

    public Subscription getSubscription() {
        return this.subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

}
