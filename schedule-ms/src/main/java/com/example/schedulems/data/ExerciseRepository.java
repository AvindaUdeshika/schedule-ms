package com.example.schedulems.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise,Integer> {

    @Query("select e from Exercise e where e.name = ?1")
    List<Exercise> findExerciseByName(String name);

    @Query("select t from Exercise t where t.type = ?1")
    List<Exercise> findExerciseBytype(String type);
}
