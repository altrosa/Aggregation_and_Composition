package by.htp.task01.view;

import java.util.List;

import by.htp.task01.entity.Sentence;

public class ViewText {
	
	public void viewTitle(String title) {
		
		System.out.println(" / "+ title + " / ");
	}

	public void viewText(List<Sentence> text) {
	
		for(int i = 0; i<text.size(); i++) {
			for(int j = 0; j< text.get(i).getSentence().size(); j++) {
				System.out.print(text.get(i).getSentence().get(j).getWord() + " ");
			}
		}
	}
}
