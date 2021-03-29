package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;

@Entity
public class Skill extends AbstractEntity {

    private String description;

    public Skill () {}

    public Skill (String description) {
        this.description = description;
    }

    public String getLocation() {
        return description;
    }

    public void setLocation(String description) {
        this.description = description;
    }
}