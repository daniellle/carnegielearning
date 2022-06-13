package com.carnegielearning.nextproblem.dto;

public class ResponseDTO {
    private String nextProblem;

    public ResponseDTO(String nextProblem) {
        this.nextProblem = nextProblem;
    }

    public String getNextProblem() {
        return nextProblem;
    }

    public void setNextProblem(String nextProblem) {
        this.nextProblem = nextProblem;
    }
}
