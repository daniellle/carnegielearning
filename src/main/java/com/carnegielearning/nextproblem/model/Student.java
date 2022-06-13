package com.carnegielearning.nextproblem.model;

import java.util.Map;
import java.util.Objects;

public class Student {
    private String id;

    private Map<Skills, Integer> skills;

    public Student(String id, Map<Skills, Integer> skills) {
        this.id = id;
        this.skills = skills;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<Skills, Integer> getSkills() {
        return skills;
    }

    public void setSkills(Map<Skills, Integer> skills) {
        this.skills = skills;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(skills, student.skills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, skills);
    }
}
