package com.endtoendwebapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.endtoendwebapp.DTOS.TeamDTO;
import com.endtoendwebapp.services.TeamService;

@RestController
@RequestMapping("/team")
public class TeamController {

	@Autowired
	private TeamService teamService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void createTeam(@RequestBody TeamDTO tdto) {
		teamService.createTeam(tdto);
		

	}

}
