package com.fullstack.model;

import com.fullstack.domain.Technologies;
import com.fullstack.domain.Users;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.sql.Time;

public class TrainingsDTO {


    private Long id;
    private long userId;
    private long mentorId;
    private long technologyId;
    private String trainingName;
    private String feeCharged;
    private String status;
    private Time startTime;
    private Time endTime;
    private Users user;
    private String userName;
    private Technologies technologies;

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
        if (user != null) {
            this.userName = user.getUserName();
        }

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getMentorId() {
        return mentorId;
    }

    public void setMentorId(long mentorId) {
        this.mentorId = mentorId;
    }

    public long getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(long technologyId) {
        this.technologyId = technologyId;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public String getTrainingName() {
        return trainingName;
    }

    public void setTrainingName(String trainingName) {
        this.trainingName = trainingName;
    }

    public String getFeeCharged() {
        return feeCharged;
    }

    public void setFeeCharged(String feeCharged) {
        this.feeCharged = feeCharged;
    }

    public Technologies getTechnologies() {
        return technologies;
    }

    public void setTechnologies(Technologies technologies) {
        this.technologies = technologies;
        if (technologies != null) {
            this.trainingName = technologies.getTechnologyName();
            this.feeCharged = technologies.getFee();
        }
    }
}
