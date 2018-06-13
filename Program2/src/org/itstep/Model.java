package org.itstep;

import java.util.Scanner;

public class Model {
	private String word;
	private short number;

	public short getNumber() {
		return number;
	}

	public void setNumber(short number) {
		this.number = number;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Model(String word, short number) {
		super();
		this.word = word;
		this.number = number;
	}

	public Model() {
		super();
	}

	public String inputWordByScaner1(String word) {
		if (word == "") { // Имя студента
			String correctWord = word;
			return correctWord;
		} else {
			return null;
		}
	}

	public short inputWordByScaner2(short number) {
		if (number == 2) {
			short correctNumber = number;
			return correctNumber;
		} else {
			return 0;
		}
	}

	public String writeSentence(String word1, short number) {
		return word1 + " " + number;
	}
}
