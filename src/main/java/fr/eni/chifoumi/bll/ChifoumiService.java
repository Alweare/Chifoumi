package fr.eni.chifoumi.bll;

import org.springframework.stereotype.Service;

import fr.eni.chifoumi.bo.Partie;


public interface ChifoumiService {
	Partie regleJeu(String choix);


}
