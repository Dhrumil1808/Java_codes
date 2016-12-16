package lec13;

import java.io.*;
import java.util.*;

public class StudentParser {
	private List<Lect4Student> students;

	public StudentParser() {
		students = new ArrayList<Lect4Student>();
	}

	public void showGrades() {
		for (Lect4Student s : students) {
			System.out.println(s.toString());
		}
		showAverage();
	}

	public void showAverage() {
		double total = 0;
		for (Lect4Student stu : students)
			total += stu.getGrade();
		System.out.println("Class Average: " + total / students.size());
	}
	public void readFile() throws IOException {
		try {
			System.out.println("Enter a filepath to read from ");
			Scanner in = new Scanner(System.in);
			File inFile = new File(in.next()); // File to read from.
			Scanner freader = new Scanner(inFile);

			freader.nextLine(); // skip the header

			String line;
			String[] fields;
			String name;
			double grade;
			
			while (freader.hasNextLine()) {
				line = freader.nextLine();
				fields = line.split(",");
				name = fields[0];
				grade = Double.parseDouble(fields[1]);
				students.add(new Lect4Student(name, grade));
			}
			freader.close(); // Close to unlock.
			in.close();
	} catch (IOException e) {
		System.err.println(e);
		System.exit(1);
	}
          }

}