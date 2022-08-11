package Exercise1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReportGenerator {
    private static final Classroom classroom = new Classroom();

    public static void generateReport() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("files/grade-reports.out"));
        bufferedWriter.write("Nota medie: " + classroom.getAverageGrade());
        bufferedWriter.newLine();
        for (StudentGrade studentGrade : classroom.getMaxGrade()) {
            bufferedWriter.write("Studentul cu cea mai mare nota: " + studentGrade.getName() + " - " + studentGrade.getGrade());
            bufferedWriter.newLine();
        }
        for (StudentGrade studentGrade : classroom.getWorstGrade()) {
            bufferedWriter.write("Studentul cu cea mai mica nota: " + studentGrade.getName() + " - " + studentGrade.getGrade());
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
