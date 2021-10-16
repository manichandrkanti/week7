public abstract class StudentPerformanceandAnanlytictool {
    int marks;
    GradesAdapter grades;

    abstract void setMarks(int marks);

    public int calculateGrades(int units){
        return units*marks;
    }
}
