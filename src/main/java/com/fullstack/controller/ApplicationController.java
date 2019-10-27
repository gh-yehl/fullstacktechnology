package com.fullstack.controller;

import com.fullstack.domain.Users;
import com.fullstack.model.MentorCalendarDTO;
import com.fullstack.model.MentorSkillsDTO;
import com.fullstack.model.TrainingInfoDTO;
import com.fullstack.model.UsersDTO;
import com.fullstack.service.MentorCalendarService;
import com.fullstack.service.MentorSkillsService;
import com.fullstack.service.TechnologiesService;
import com.fullstack.service.UsersService;
import com.fullstack.utils.FullStackBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.Time;
import java.util.*;

@CrossOrigin(maxAge = 3600)
@RestController
public class ApplicationController {

    @Autowired
    private UsersService usersService;

    @Autowired
    private MentorCalendarService mentorCalendarService;

    @Autowired
    private MentorSkillsService mentorSkillsService;

    @Autowired
    private TechnologiesService technologiesService;


    /**
     * GuestSearch Function
     * @param request
     * @return
     */
    @RequestMapping("/deleteTechnology")
    public void deleteTechnology(HttpServletRequest request) {
        String technologyId = request.getParameter("technologyId");
        technologiesService.deleteTechnology(Long.valueOf(technologyId));
    }


}
