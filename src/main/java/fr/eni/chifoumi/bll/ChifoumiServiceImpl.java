package fr.eni.chifoumi.bll;

import java.util.Random;

import org.springframework.stereotype.Service;

import fr.eni.chifoumi.bo.Partie;
@Service
public class ChifoumiServiceImpl implements ChifoumiService{
	

@Override
	public Partie regleJeu(String choix) {

	String[] tab = {"chi","fou","mi"};
	Random randomNumbers = new Random();
	String choixOrdi = tab[randomNumbers.nextInt(tab.length)];
	Partie partie = new Partie(choix, choixOrdi);

		System.out.println(choixOrdi);

		if(partie.getChoixOrdinateur() != null) {
			if(partie.getChoixOrdinateur().equals(partie.getChoixUtilisateur())) {
				partie.setResultat(0);


			}else {
				if(choixOrdi.equals("chi") && partie.getChoixUtilisateur().equals("fou") || choixOrdi.equals("fou") && partie.getChoixUtilisateur().equals("mi") || choixOrdi.equals("mi") && partie.getChoixUtilisateur().equals("chi") ) {
					partie.setResultat(1);

				}if(choixOrdi.equals("chi") && !partie.getChoixUtilisateur().equals("fou") || choixOrdi.equals("fou") && !partie.getChoixUtilisateur().equals("mi") || choixOrdi.equals("mi") && !partie.getChoixUtilisateur().equals("chi") ) {
					partie.setResultat(2);
				}


			}
		}
		return partie;
	}

}
