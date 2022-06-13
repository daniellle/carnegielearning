package com.carnegielearning.nextproblem.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class RequestDTO {


    @JsonProperty("studentId")
    private String studentId;
    @JsonProperty("problems")
    private List<String> problems;

    public RequestDTO(String studentId,  List<String> problems) {
        this.studentId = studentId;
        this.problems = problems;
    }

    public String getStudent() {
        return studentId;
    }

    public void setStudent(String studentId) {
        this.studentId = studentId;
    }

    public  List<String> getProblems() {
        return problems;
    }

    public void setProblems( List<String> problems) {
        this.problems = problems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequestDTO that = (RequestDTO) o;
        return Objects.equals(studentId, that.studentId) && Objects.equals(problems, that.problems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, problems);
    }
}
