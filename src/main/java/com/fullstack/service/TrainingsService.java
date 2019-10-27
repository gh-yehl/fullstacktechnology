package com.fullstack.service;

import com.fullstack.domain.Trainings;
import com.fullstack.model.TrainingsDTO;
import com.fullstack.repository.TrainingsRepository;
import com.fullstack.utils.FullStackBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrainingsService {

    @Autowired
    private TrainingsRepository trainingsRepository;

    /**
     * Find training by mentor ID(Table: Trainings; Column: Mentor_ID)
     * @param id
     * @return
     */
    public List getMentorCurrentTraining(int id) {
        List<Trainings> list = trainingsRepository.findByMentorIdAndStatus(id, "0");
        List<TrainingsDTO> newList = new ArrayList<TrainingsDTO>();
        for (Trainings trainings : list) {
            TrainingsDTO trainingsDTO = FullStackBeanUtils.cloneTrainings(trainings);
            newList.add(trainingsDTO);
        }
        return newList;
    }

    public List getMentorCompletedTraining(int id) {
        List<Trainings> list = trainingsRepository.findByMentorIdAndStatus(id, "1");
        List<TrainingsDTO> newList = new ArrayList<TrainingsDTO>();
        for (Trainings trainings : list) {
            TrainingsDTO trainingsDTO = FullStackBeanUtils.cloneTrainings(trainings);
            newList.add(trainingsDTO);
        }
        return newList;
    }

    public List getUserCurrentTraining(int id) {
        List<Trainings> list = trainingsRepository.findByUserIdAndStatus(id, "0");
        List<TrainingsDTO> newList = new ArrayList<TrainingsDTO>();
        for (Trainings trainings : list) {
            TrainingsDTO trainingsDTO = FullStackBeanUtils.cloneTrainings(trainings);
            newList.add(trainingsDTO);
        }
        return newList;
    }

    public List getUserCompletedTraining(int id) {
        List<Trainings> list = trainingsRepository.findByUserIdAndStatus(id, "1");
        List<TrainingsDTO> newList = new ArrayList<TrainingsDTO>();
        for (Trainings trainings : list) {
            TrainingsDTO trainingsDTO = FullStackBeanUtils.cloneTrainings(trainings);
            newList.add(trainingsDTO);
        }
        return newList;
    }
}
