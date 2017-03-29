package common.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class FileUtil {

	private FileUtil() {
	}

	/**
	 * Attempts to read the file located in src/main/resources/{@code filePath},
	 * and returns all of the file lines as a List of Strings.
	 * 
	 * @throws FileNotFoundException if the file is not found
	 */
	public static List<String> readLines(String filePath) throws FileNotFoundException {
		File file = new File(FileUtil.class.getClassLoader().getResource(filePath).getFile());

		List<String> lines = new ArrayList<>();
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			lines.add(scanner.nextLine());
		}
		scanner.close();
		return lines;
	}

}
