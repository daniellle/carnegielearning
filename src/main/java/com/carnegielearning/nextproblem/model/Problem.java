package com.carnegielearning.nextproblem.model;


import java.util.Optional;
import java.util.Set;

public enum Problem {

    PROB1(Set.of(Skills.ADD_DECIMALS)),
    PROB2(Set.of(Skills.ADD_DECIMALS, Skills.MULTIPLY_DECIMALS)),
    PROB3(Set.of(Skills.ADD_FRACTIONS)),
    PROB4(Set.of(Skills.ADD_FRACTIONS, Skills.MULTIPLY_FRACTIONS)),
    PROB5(Set.of(Skills.MULTIPLY_DECIMALS, Skills.MULTIPLY_FRACTIONS)),
    PROB6(Set.of(Skills.ADD_FRACTIONS, Skills.ADD_DECIMALS));

    private Set<Skills> skills;

    private Problem(Set<Skills> skills){
        this.skills = skills;
    }

    public static Optional<Problem> getValuesIn(Set<Skills> compareSkills){
        for(Problem problem : Problem.values()){
            if(problem.skills.containsAll(compareSkills)){
                return Optional.of(problem);
            }
        }
        return Optional.empty();
    }
}
