package GradeBook_ProgramFiles_Kaminski.Part2CodeforStudents;

/****************************************************
**
** CategoryAssignment class
**
** This class represents an CategoryAssignment.
** Do not add any additional methods to this class.
**
****************************************************/
public class CategoryAssignment extends Assignment {
    // declare any new instance variables that you need here
    // don't forget to make them private!
    // don't declare more that you really need!

    private String categoryName;

    // CategoryAssignment constructor
    //
    // postcondition: all instance variables are initialized with
    // the given values.     
    public CategoryAssignment(String categoryName, String n, double ptsPoss, double ptsEarned){


        super(n, ptsPoss, ptsEarned);

        this.categoryName = categoryName;
        
    }
    
    // getCategoryName accessor method
    //
    // postcondition: returns the name of the category associated
    // with this CategoryAssignment
    public String getCategoryName() {

        return this.categoryName;

    }
}
