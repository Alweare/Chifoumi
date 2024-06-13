package fr.eni.chifoumi.controller;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.chifoumi.bll.ChifoumiService;

@Controller


public class ChifoumiController {
	private ChifoumiService chifoumiService;


	// injection de dépendance
	public ChifoumiController(ChifoumiService chifoumiService) {
		this.chifoumiService = chifoumiService;
	}


	@GetMapping("/jouer")
	public String jouer(@RequestParam(name="choix") String choix) {
		String vue = chifoumiService.regleJeu(choix);
		return vue;

	}
	

	@PostMapping("/jouer")
	public String jeuPost (@RequestParam(name="choix") String choix) {
		String vue = chifoumiService.regleJeu(choix);
		return vue;

	}


}



