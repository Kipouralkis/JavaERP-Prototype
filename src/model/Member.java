package model;

import java.util.HashMap;
import java.util.Map;

/**
 * POJO to store basic member information
 */
public class Member {
    private String name;
    private String email;
    private String phoneNumber;
    private int age;
    private Map<Activity, Subscription> memberActivities;


    public Member(String name, String email, String phoneNumber, int age) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.memberActivities = new HashMap<>();
    }

    public Member(Member source){
        setName(source.getName());
        setEmail(source.getEmail());
        setPhoneNumber(source.getPhoneNumber());
        setAge(source.getAge());
        setMemberActivities(new HashMap<>(source.getMemberActivities()));
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Map<Activity,Subscription> getMemberActivities() {
        return this.memberActivities;
    }

    public void setMemberActivities(Map<Activity,Subscription> memberActivities) {
        this.memberActivities = memberActivities;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", phone number='" + getPhoneNumber() + "'" +
            ", age='" + getAge() + "'" +
            ", member activities='" + getMemberActivities() + "'" +
            "}";
    }

}
