package com.carnegielearning.nextproblem.service;

import com.carnegielearning.nextproblem.model.Problem;
import com.carnegielearning.nextproblem.model.Skills;
import com.carnegielearning.nextproblem.model.Student;
import com.carnegielearning.nextproblem.builder.StudentBuilder;
import com.carnegielearning.nextproblem.dto.RequestDTO;
import com.carnegielearning.nextproblem.dto.ResponseDTO;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProblemService {
    private static final Integer threshold = 95;

    /**
     *
     * @param request
     * @return
     */
    public ResponseDTO findNextProblem(RequestDTO request){

        String studentId = request.getStudent();
        StudentBuilder builder = new StudentBuilder();
        Optional<Student> optionalStudent = builder.getStudent(studentId);
        if(optionalStudent.isPresent()){
            Map<Skills, Integer> skills = optionalStudent.get().getSkills();
            Set<Skills> list = new HashSet<>();
            for(Skills key : skills.keySet()){
                if(skills.get(key) < threshold){
                    list.add(key);
                }
            }
            Optional<Problem> valuesIn = Problem.getValuesIn(list);
            if (valuesIn.isPresent()){
                return new ResponseDTO(valuesIn.get().name());
            }
        }
        return new ResponseDTO(null);
    }
}
