package models;

public class CleaningStaff extends Person {
    private String dayOff;

    public String getDayOff() {
        return dayOff;
    }

    public void setDayOff(String dayOff) {
        this.dayOff = dayOff;
    }

    public CleaningStaff(String name, String indetification, int age, String dayOff) {
        super(name, indetification, age);
        this.dayOff = dayOff;
    }
}
