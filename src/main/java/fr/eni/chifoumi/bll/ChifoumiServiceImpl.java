package fr.eni.chifoumi.bll;

import java.util.Random;

import org.springframework.stereotype.Service;
@Service
public class ChifoumiServiceImpl implements ChifoumiService{
@Override
	public String regleJeu(String choix) {
		String[] tab = {"chi","fou","mi"};
		Random randomNumbers = new Random();
		String test = tab[randomNumbers.nextInt(tab.length)];
		String vue = null;
		System.out.println(test);

		if(test != null) {
			if(test.equals(choix)) {
				vue = "egalite";


			}else {
				if(test.equals("chi") && choix.equals("fou") || test.equals("fou") && choix.equals("mi") || test.equals("mi") && choix.equals("chi") ) {
					vue = "gagne";

				}if(test.equals("chi") && !choix.equals("fou") || test.equals("fou") && !choix.equals("mi") || test.equals("mi") && !choix.equals("chi") ) {
					vue = "perdu";
				}


			}
		}
		return vue;
	}

}
