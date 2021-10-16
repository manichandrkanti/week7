/**
 * This class implements the factory design pattern
 */

public class StudentPerformanceandAnanlytictoolFactory {
    public StudentPerformanceandAnanlytictool getItem(String item, String grades){
        if(item == null){
            return null;
        }
        if(item.equalsIgnoreCase("Performance")) {
            StudentPerformanceandAnanlytictool g= new Performance();
            ((Performance) g).selectGrades(grades);
            return g;
        }
        else if(item.equalsIgnoreCase("Analysis")){
            StudentPerformanceandAnanlytictool g= new Analysis();
            ((Analysis) g).selectGrades(grades);
            return g;
        }
        else if(item.equalsIgnoreCase("Improvement ")) {
            StudentPerformanceandAnanlytictool g= new Improvement ();
            ((Improvement ) g).selectGrades(grades);
            return g;
        }
        return null;
    }
}
