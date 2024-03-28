package com.example.schedulems.service;

import com.example.schedulems.data.Exercise;
import com.example.schedulems.data.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    public List<Exercise> getAllExercises(){
        return exerciseRepository.findAll();
    }

    public Exercise getExerciseById(int id){
        Optional<Exercise> exercise = exerciseRepository.findById(id);
        if(exercise.isPresent()){
            return exercise.get();
        }
        return null;
    }

    public Exercise createExercise(Exercise exercise){
        return exerciseRepository.save(exercise);
    }

    public List<Exercise> findExerciseByName(String name){
        return exerciseRepository.findExerciseByName(name);
    }

    public Exercise updateExercise(Exercise exercise){
        return exerciseRepository.save(exercise);
    }

    public void deleteExercise(int id){
        exerciseRepository.deleteById(id);
    }

    public List<Exercise> findExerciseBytype(String type){
        return exerciseRepository.findExerciseBytype(type);
    }


}
