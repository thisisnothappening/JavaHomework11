package Exercise1;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private final ListOfStudents listOfStudents = new ListOfStudents();

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> listOfGradesForDiscipline = new ArrayList<>();
        for (StudentGrade studentGrade : listOfStudents.getStudentGradeList()) {
            if (studentGrade.getDiscipline().equalsIgnoreCase(discipline)) {
                listOfGradesForDiscipline.add(studentGrade.getGrade());
            }
        }
        return listOfGradesForDiscipline;
    }

    public List<Integer> getGradesForStudent(String name) {
        List<Integer> listOfGradesForStudent = new ArrayList<>();
        for (StudentGrade studentGrade : listOfStudents.getStudentGradeList()) {
            if (studentGrade.getName().equals(name)) {
                listOfGradesForStudent.add(studentGrade.getGrade());
            }
        }
        return listOfGradesForStudent;
    }

    public List<StudentGrade> getMaxGrade(String discipline) {
        List<StudentGrade> listOfStudentsWithMaxGrade = new ArrayList<>();
        int maxGrade = 0;
        for (StudentGrade studentGrade : listOfStudents.getStudentGradeList()) {
            if (studentGrade.getDiscipline().equalsIgnoreCase(discipline)) {
                if (maxGrade < studentGrade.getGrade()) {
                    maxGrade = studentGrade.getGrade();
                }
            }
        }
        for (StudentGrade studentGrade : listOfStudents.getStudentGradeList()) {
            if (studentGrade.getDiscipline().equalsIgnoreCase(discipline)) {
                if (studentGrade.getGrade() == maxGrade) {
                    listOfStudentsWithMaxGrade.add(studentGrade);
                }
            }
        }
        return listOfStudentsWithMaxGrade;
    }

    public List<StudentGrade> getMaxGrade() {
        List<StudentGrade> listOfStudentsWithMaxGrade = new ArrayList<>();
        int maxGrade = 0;
        for (StudentGrade studentGrade : listOfStudents.getStudentGradeList()) {
            if (maxGrade < studentGrade.getGrade()) {
                maxGrade = studentGrade.getGrade();
            }
        }
        for (StudentGrade studentGrade : listOfStudents.getStudentGradeList()) {
            if (studentGrade.getGrade() == maxGrade) {
                listOfStudentsWithMaxGrade.add(studentGrade);
            }
        }
        return listOfStudentsWithMaxGrade;
    }

    public Float getAverageGrade(String discipline) {
        float sum = 0;
        float counter = 0;
        for (StudentGrade studentGrade : listOfStudents.getStudentGradeList()) {
            if (studentGrade.getDiscipline().equalsIgnoreCase(discipline)) {
                sum += studentGrade.getGrade();
                counter++;
            }
        }
        return Float.valueOf(String.format("%.2f", sum / counter));
    }

    public Float getAverageGrade() {
        float sum = 0;
        float counter = 0;
        for (StudentGrade studentGrade : listOfStudents.getStudentGradeList()) {
            sum += studentGrade.getGrade();
            counter++;
        }
        return Float.valueOf(String.format("%.2f", sum / counter));
    }

    public List<StudentGrade> getWorstGrade(String discipline) {
        List<StudentGrade> listOfStudentsWithWorstGrade = new ArrayList<>();
        int worstGrade = 10;
        for (StudentGrade studentGrade : listOfStudents.getStudentGradeList()) {
            if (studentGrade.getDiscipline().equalsIgnoreCase(discipline)) {
                if (worstGrade > studentGrade.getGrade()) {
                    worstGrade = studentGrade.getGrade();
                }
            }
        }
        for (StudentGrade studentGrade : listOfStudents.getStudentGradeList()) {
            if (studentGrade.getDiscipline().equalsIgnoreCase(discipline)) {
                if (studentGrade.getGrade() == worstGrade) {
                    listOfStudentsWithWorstGrade.add(studentGrade);
                }
            }
        }
        return listOfStudentsWithWorstGrade;
    }

    public List<StudentGrade> getWorstGrade() {
        List<StudentGrade> listOfStudentsWithWorstGrade = new ArrayList<>();
        int worstGrade = 10;
        for (StudentGrade studentGrade : listOfStudents.getStudentGradeList()) {
            if (worstGrade > studentGrade.getGrade()) {
                worstGrade = studentGrade.getGrade();
            }
        }
        for (StudentGrade studentGrade : listOfStudents.getStudentGradeList()) {
            if (studentGrade.getGrade() == worstGrade) {
                listOfStudentsWithWorstGrade.add(studentGrade);
            }
        }
        return listOfStudentsWithWorstGrade;
    }
}
