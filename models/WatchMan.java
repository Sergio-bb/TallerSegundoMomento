package models;

import java.util.Date;

public class WatchMan  extends Person {
private String weapon;
private Date workday;
public String getWeapon() {
    return weapon;
}
public WatchMan(String name, String indetification, int age, String weapon, Date workday) {
    super(name, indetification, age);
    this.weapon = weapon;
    this.workday = workday;
}
public void setWeapon(String weapon) {
    this.weapon = weapon;
}
public Date getWorkday() {
    return workday;
}
public void setWorkday(Date workday) {
    this.workday = workday;
}
}

 