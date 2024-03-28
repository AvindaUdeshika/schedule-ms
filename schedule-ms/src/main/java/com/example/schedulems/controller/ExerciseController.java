package com.example.schedulems.controller;

import com.example.schedulems.data.Exercise;
import com.example.schedulems.service.ExerciseService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @GetMapping(path = "/exercises")
    public List<Exercise> getAllExercises(){
        return exerciseService.getAllExercises();
    }

    @GetMapping(path = "/exercises/{id}")
    public Exercise getExerciseById(@PathVariable int id){
        return exerciseService.getExerciseById(id);
    }
    @PostMapping(path = "/exercises")
    public Exercise createExercise(@RequestBody Exercise exercise){
        return exerciseService.createExercise(exercise);
    }

    @PutMapping(path = "/exercises/{id}")
    public Exercise updateExercise(@RequestBody Exercise exercise){
        return exerciseService.updateExercise(exercise);
    }

    @DeleteMapping(path = "/exercises/{id}")
    public void deleteExerciseById(@PathVariable int id){
        exerciseService.deleteExercise(id);
    }

    @GetMapping(path = "/exercises" , params = "name")
    public List<Exercise> findExerciseByName(@RequestParam String name){
        return exerciseService.findExerciseByName(name);
    }

    @GetMapping(path = "/exercises" , params = "type")
    public List<Exercise> findExerciseBytype(@RequestParam String type){
        return exerciseService.findExerciseBytype(type);
    }


}
