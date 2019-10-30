package com.fullstack.controller;

import com.fullstack.service.TechnologiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@CrossOrigin(maxAge = 3600)
@RestController
public class ApplicationController {


    @Autowired
    private TechnologiesService technologiesService;


    /**
     *
     * @param technologyId
     */
    @RequestMapping("/deleteTechnology")
    public void deleteTechnology(@RequestParam("technologyId") String technologyId) {
        System.out.println("/deleteTechnology/{technologyId} ===========> technologyId==========================================>" + technologyId);
        String testValue = technologyId;
        technologiesService.deleteTechnology(Long.valueOf(technologyId));
    }


}
