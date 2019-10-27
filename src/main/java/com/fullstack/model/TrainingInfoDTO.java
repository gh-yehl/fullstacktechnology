package com.fullstack.model;

import com.fullstack.domain.Trainings;
import com.fullstack.domain.Users;

import java.util.List;

public class TrainingInfoDTO {

    private Long mentorId;
    private String mentorName;
    private String fee;
    private String trainingName;
    private String workingYears;
    private String trainingsDelivered;
    private Users user;

    public TrainingInfoDTO(Long mentorId, String mentorName, String fee, String trainingName, String workingYears, Users user) {
        this.mentorId = mentorId;
        this.mentorName = mentorName;
        this.fee = fee;
        this.trainingName = trainingName;
        this.workingYears = workingYears;
        this.user = user;
    }

    public Long getMentorId() {
        return mentorId;
    }

    public void setMentorId(Long mentorId) {
        this.mentorId = mentorId;
    }

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getTrainingName() {
        return trainingName;
    }

    public void setTrainingName(String trainingName) {
        this.trainingName = trainingName;
    }

    public String getWorkingYears() {
        return workingYears;
    }

    public void setWorkingYears(String workingYears) {

        this.workingYears = workingYears;
    }

    public String getTrainingsDelivered() {
        int numbersOfTrainingsDelivered = 0;
        if(this.user != null) {
            List<Trainings> list = user.getTrainingsList();
            if(list != null && list.size() > 0) {
                for(Trainings trainings : list) {
                    if("1". equals(trainings.getStatus())) {
                        numbersOfTrainingsDelivered ++;
                    }
                }
            }
        }
        return String.valueOf(numbersOfTrainingsDelivered);
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
