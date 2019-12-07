package com.jjdd8_ism;

import java.io.IOException;

public class TerminalCleaner {

	private static final String checker = System.getProperty("os.name").toLowerCase();

	public static void cleanConsole() {

		try {
			if (checker.contains("win")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			}
			else {
				System.out.println("\033[H\033[2J");
				System.out.flush();
			}

		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}