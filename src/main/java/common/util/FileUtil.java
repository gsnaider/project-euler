package common.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.common.io.Resources;

public final class FileUtil {

	private FileUtil() {}

	/**
	 * Attempts to read the file located in src/main/resources/{@code filePath},
	 * and returns all of the file lines as a List of Strings.
	 * 
	 * @throws FileNotFoundException
	 *             if the file is not found
	 */
	public static List<String> readLines(String filePath) throws FileNotFoundException {
		File file = new File(Resources.getResource(filePath).getFile());
		try (Scanner scanner = new Scanner(file)) {
			List<String> lines = new ArrayList<>();
			while (scanner.hasNextLine()) {
				lines.add(scanner.nextLine());
			}
			return lines;
		}

	}

}
