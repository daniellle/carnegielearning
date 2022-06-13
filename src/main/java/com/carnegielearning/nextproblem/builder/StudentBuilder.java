package com.carnegielearning.nextproblem.builder;

import com.carnegielearning.nextproblem.model.Skills;
import com.carnegielearning.nextproblem.model.Student;

import java.util.*;

/**
 * Class just to mock the data
 */
public class StudentBuilder {

    private Student student1;
    private Student student2;

    private Student student3;

    private List<Student> students = new ArrayList<>();

    public void builder(){
        Map<Skills, Integer> map = new HashMap<>();
        map.put(Skills.ADD_DECIMALS, 97);
        map.put(Skills.ADD_FRACTIONS, 17);
        map.put(Skills.MULTIPLY_FRACTIONS, 53);

        Map<Skills, Integer> map2 = new HashMap<>();
        map2.put(Skills.ADD_DECIMALS, 33);
        map2.put(Skills.ADD_FRACTIONS, 96);
        map2.put(Skills.MULTIPLY_FRACTIONS, 81);
        map2.put(Skills.MULTIPLY_DECIMALS, 47);
        Map<Skills, Integer> map3 = new HashMap<>();
        map3.put(Skills.ADD_FRACTIONS, 23);

        this.student1 = new Student("1", map);
        this.student2 = new Student("2", map2);
        this.student3 = new Student("3", map3);

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    /**
     * Get not real student - mocked
     * @param id
     * @return
     */
    public Optional<Student> getStudent(String id){
        builder();

        for (Student student : students){
            if(student.getId().equals(id)){
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }
}
