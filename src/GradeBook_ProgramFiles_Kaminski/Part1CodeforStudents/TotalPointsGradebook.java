package GradeBook_ProgramFiles_Kaminski.Part1CodeforStudents; /****************************************************


 **
** TotalPointsGradebook class
**
** This class represents a GradeBook_ProgramFiles_Kaminski.Part2CodeforStudents.Gradebook that calculates
** grades according to the total points grading system.
**
****************************************************/
import java.util.ArrayList;

public class TotalPointsGradebook implements Gradebook {
    private ArrayList<Assignment> myGrades;
    
    // TotalPointsGradebook constructor
    //
    // postcondition: myGrades is instantiated
    public TotalPointsGradebook() {

        myGrades = new ArrayList<>();

    }
    
    // add mutator method
    //
    // postcondition: the given Assignment object is added to myGrades

    
    // calculateGrade accessor method
    //
    // postcondition: the grade represented by myGrades is calculated and
    // returned, according to the total points grading system. The value is
    // the sum of the points earned on all Assignments in this GradeBook_ProgramFiles_Kaminski.Part2CodeforStudents.Gradebook,
    // divided by the sum of the points possible on all Assignments in 
    // this GradeBook_ProgramFiles_Kaminski.Part2CodeforStudents.Gradebook, and is converted to a value between 0 and 100,
    // inclusive. 
    public double calculateGrade() {

        double tmp = 0.0; 

        double tmp1 = 0.0;


        for(Assignment i : myGrades) {

            tmp += i.getPointsEarned();

            tmp1 += i.getPointsPossible();

        }

        return tmp/tmp1 * 100;
    }

    @Override
    public void add(GradeBook_ProgramFiles_Kaminski.Part1CodeforStudents.Assignment assign) {

        this.myGrades.add(assign);

    }
}
