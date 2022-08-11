package Exercise1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ListOfStudents {
    private final List<StudentGrade> studentGradeList = readFile("files/grades.txt");

    public List<StudentGrade> getStudentGradeList() {
        return studentGradeList;
    }

    private static List<StudentGrade> readFile(String file) {
        List<StudentGrade> studentGradeList = new ArrayList<>();
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split(Pattern.quote("|"));
                studentGradeList.add(new StudentGrade(tokens[0], tokens[1], Integer.parseInt(tokens[2])));
            }
            bufferedReader.close();
            return studentGradeList;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
