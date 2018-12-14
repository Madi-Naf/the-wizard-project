package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("personage")
public class Gandalf implements WizardInterface{

	@Override
	public String giveAdvice() {
		// TODO Auto-generated method stub
		return "Teste Gandalf give advice";
	}

	@Override
	public String changeDress() {
		// TODO Auto-generated method stub
		return "The wizard's dress is blue";
	}

}
