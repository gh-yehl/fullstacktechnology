package com.fullstack.repository;

import com.fullstack.domain.Trainings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrainingsRepository extends JpaRepository<Trainings,Long> {
    public Trainings findByMentorId(int id);
    public List<Trainings> findByMentorIdAndStatus(int id, String status);
    public List<Trainings> findByUserIdAndStatus(int id, String status);
}

