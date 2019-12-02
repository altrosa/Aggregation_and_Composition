package by.htp.task01.main;

import by.htp.task01.entity.Sentence;
import by.htp.task01.entity.Text;
import by.htp.task01.entity.Word;
import by.htp.task01.view.ViewText;

public class MainText {

	/*
	 * 1. Создать объект класса Текст, используя классы Предложение, Слово. Методы:
	 * дополнить текст, вывести на консоль текст, заголовок текста.
	 */

	public static void main(String[] args) {

		Word word1 = new Word("Мы");
		Word word2 = new Word("стали");
		Word word3 = new Word("намного");
		Word word4 = new Word("могущественнее");
		Word word5 = new Word("своих");
		Word word6 = new Word("предков");
		Word word7 = new Word("но");
		Word word8 = new Word("не");
		Word word9 = new Word("стали");
		Word word10 = new Word("счастливее");
		

		Sentence sentence1 = new Sentence();
		Sentence sentence2 = new Sentence();
		sentence1.getSentence().add(word1);
		sentence1.getSentence().add(word2);
		sentence1.getSentence().add(word3);
		sentence1.getSentence().add(word4);
		sentence1.getSentence().add(word5);

		sentence2.getSentence().add(word6);
		sentence2.getSentence().add(word7);
		sentence2.getSentence().add(word8);
		sentence2.getSentence().add(word9);
		sentence2.getSentence().add(word10);


		Text text = new Text();
		
		text.setTitle("Люди");
		text.getText().add(0, sentence1);
		text.getText().add(1, sentence2);

		ViewText view = new ViewText();
		
		view.viewTitle(text.getTitle());
		view.viewText(text.getText());

	}

}
