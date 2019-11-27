package by.htp.task01.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Text {
	
	private String title;

	private List<Sentence> text;

	public Text() {

		this.text = new ArrayList<Sentence>();

	}

	public Text(List<Sentence> text) {

		this.text = text;
	}
	
	
	public Text(Sentence... sentence) {
		this.text.addAll(Arrays.asList(sentence));
		
	}


	public List<Sentence> getText() {
		return text;
	}

	public void setText(List<Sentence> text) {
		this.text = text;
	}
	
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Text [text=" + text + "]";
	}

}
