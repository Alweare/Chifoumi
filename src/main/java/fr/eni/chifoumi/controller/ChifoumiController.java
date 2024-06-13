package fr.eni.chifoumi.controller;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.chifoumi.bll.ChifoumiService;
import fr.eni.chifoumi.bo.Partie;

@Controller


public class ChifoumiController {
	private ChifoumiService chifoumiService;


	// injection de dépendance
	public ChifoumiController(ChifoumiService chifoumiService) {
		this.chifoumiService = chifoumiService;
	}


	@GetMapping("/jouer")
	public String jouer(@RequestParam(name="choix") String choix, Model model) {
		Partie partie = this.chifoumiService.regleJeu(choix);
		
		model.addAttribute("partie",partie);
		
		return "resultat";
	}
	

//	@PostMapping("/jouer")
//	public String jeuPost (@RequestParam(name="choix") String choix) {
//		String vue = chifoumiService.regleJeu(choix);
//		return vue;
//
//	}


}



