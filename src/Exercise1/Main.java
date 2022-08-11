package Exercise1;

/*
You have grades.txt.txt a file containing the name of the student,
discipline and grade in the following format:
<name & surname>|<discipline>|<grade>

Have an object StudentGrade(name, discipline, grade).

Create an object that will receive the path to this file,
and it will have a method that will read this file and return a list of StudentGrade.

Have an object Classroom that will receive a list of StudentGrade
and implement the following methods:
- getGradesForDiscipline(String discipline) : List<Integer>
- getGradesForStudent(String student) : List<Integer>
- getMaxGrade(String discipline) : List<StudentGrade>
- getMaxGrade() : List<StudentGrade>
- getAverageGrade(String discipline) : Float
- getWorstGrade(String discipline) : List<StudentGrade>

Create a Main object that tests the functionality.
 */

/*
Continua exercitiul precedent si creeaza un obiect ReportGenerator
care primeste lista cu notele studentilor.

ReportGenerator are o metoda generateReport care genereaza
urmatorul raport intr-un fisier grade-reports.out:
Cea mai mare nota:  <studentul cu cea mai mare nota> <nota>
Nota medie: <nota medie>
Cea mai mica nota: <studentul cu cea mai mica nota> <nota>
 */

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Classroom classroom = new Classroom();

        System.out.println(classroom.getGradesForDiscipline("mathematics"));
        System.out.println(classroom.getGradesForStudent("Demetria Cosme"));
        System.out.println(classroom.getMaxGrade("history"));
        System.out.println(classroom.getMaxGrade());
        System.out.println(classroom.getAverageGrade("physics"));
        System.out.println(classroom.getAverageGrade());
        System.out.println(classroom.getWorstGrade("computer science"));
        System.out.println(classroom.getWorstGrade());

        ReportGenerator.generateReport();
    }
}
