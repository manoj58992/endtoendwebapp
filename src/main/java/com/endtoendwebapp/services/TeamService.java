package com.endtoendwebapp.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.endtoendwebapp.DTOS.TeamDTO;
import com.endtoendwebapp.entities.TeamsEntity;
import com.endtoendwebapp.repositories.TeamsRepository;
@Service
public class TeamService {

	@Autowired
	private TeamsRepository teamRepository;

	public void createTeam(TeamDTO dto) {
		TeamsEntity team = new TeamsEntity();
		team.setName("liverpool");
		team.setCountry("england");
		team.setManager("Jürgen Klopp");
		team.setLogo("red");
		team.setCreatedAt(new Date());
		team.setUpdatedAt(new Date());

		teamRepository.save(team);

	}
}
