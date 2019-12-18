package com.endtoendwebapp.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.endtoendwebapp.DTOS.TeamDTO;

@RestController
@RequestMapping("/team")
public class TeamController {
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void createTeam(@RequestBody TeamDTO tdto) {
		System.out.println(tdto.toString());
		
	}

}
