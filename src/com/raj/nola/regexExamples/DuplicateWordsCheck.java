package com.raj.nola.regexExamples;

import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWordsCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter a string : ");
		Scanner scanner = new Scanner(System.in);

		String sentence = scanner.nextLine();

		List<String> repeatedWordList = new ArrayList<>();

		String regex = "\\b(\\w+)(\\s+\\1\\b)*";

		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		Matcher matcher = pattern.matcher(sentence);

		System.out.println("Entered Sentence:\n" + sentence);

		while (matcher.find()) {

			if (!(matcher.group(0).equals(matcher.group(1)))) {

				repeatedWordList.add(matcher.group(1));

			}

			sentence = sentence.replace(matcher.group(0), matcher.group(1));
		}

		System.out.println("\nReplaced Sentence:\n" + sentence);

		System.out.println("\nRepeated Words:");
		repeatedWordList.stream().forEach(System.out::println);

		// System.out.println(Arrays.toString(repeatedWord));

	}

}
