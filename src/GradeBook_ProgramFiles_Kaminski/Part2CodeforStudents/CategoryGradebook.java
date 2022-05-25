package GradeBook_ProgramFiles_Kaminski.Part2CodeforStudents;

import java.util.ArrayList;

/****************************************************
**
** GradeBook_ProgramFiles_Kaminski.Part2CodeforStudents.CategoryGradebook class
**
** This class represents a GradeBook_ProgramFiles_Kaminski.Part2CodeforStudents.CategoryGradebook that calculates
** grades according to the weighted category grading system.
**
****************************************************/
public class CategoryGradebook implements Gradebook {
    // declare any new instance variables that you need here
    // don't forget to make them private!
    // don't declare more that you really need!
    private ArrayList<CategoryAssignment> list;
    private String[] cate;
    private int[] weight;

    
    // precondition: categories.length == weights.length;
    // categories contains the names of all categories in this GradeBook_ProgramFiles_Kaminski.Part2CodeforStudents.Gradebook;
    // weights contains the values of the weights of each corresponding category;
    // each value in weights is between 0 and 100 inclusive
    // postcondition: all instance variables are initialized;
    // if sum of elements in weights is not equal to 100, then the weight of
    // the last category is adjusted so that the sum is equal to 100
    public CategoryGradebook(String[] categories, int[] weights) {

        list = new ArrayList<>();

        this.cate = categories;

        this.weight = weights;

        int tmp = 0; 

        for(int i : weights) {

            tmp += i;

        }

        if(tmp != 100) {

            weights[weights.length-1] = tmp - 100;

        }

    }


    private double calculateAVG(String cate){

        /**
         * tmp0 is the total points earned
         * tmp1 is the total points possible,
         *
         * get both val,
         *
         * and divide them by each other
         *
         * also commented out debug lines
         *
         * */

        double tmp0 = 0; 

        double tmp1 = 0;



        for (int i = 0; i < this.list.size(); i ++) {

            if (list.get(i).getCategoryName().equals(cate)) {

                tmp0 += list.get(i).getPointsEarned();

                tmp1 += list.get(i).getPointsPossible();

            }

            //System.out.printf("%s\t%s\t%b\n",tmp0,tmp1, list.get(i).getCategoryName().equals(cate));

        }



        //System.out.println(cate+"\t"+tmp0+"\t"+tmp1+"\t"+list.get(2).getCategoryName().equalsIgnoreCase("Tests"));

        return tmp0/tmp1;

    }

    // calculateGrade accessor method
    //
    // postcondition: the grade represented by this GradeBook_ProgramFiles_Kaminski.Part2CodeforStudents.Gradebook is calculated and
    // returned, according to the weighted category grading system. To calculate this
    // value, first calculate the average of all assignments in each category. Then,
    // multiply each of those values with the value of the weight for that category.
    // Finally, add the values together. This value is between 0 and 100, inclusive.
    // 
    // If your task can be made easier by adding private helper methods to this class,
    // then be sure that they are thoroughly documented with comments. 



    public double calculateGrade() {

        double[] tmp = new double[cate.length];
        
        for (int i = 0; i < cate.length; i ++) {

            tmp[i] = calculateAVG(this.cate[i]);

            //System.out.println(tmp[i]);

        }

        for(int i = 0; i < tmp.length; i ++) {

            tmp[i] *= this.weight[i];

        }

        double returnVal = 0; 

        for(double i : tmp) {

            returnVal += i;

        }

        return returnVal;

    }

    @Override
    public void add(CategoryAssignment assign) {

        this.list.add(assign);

    }

    // add mutator method
    //
    // precondition: assign IS-A CategoryAssignment
    // postcondition: the given Assignment object is added to this GradeBook_ProgramFiles_Kaminski.Part2CodeforStudents.Gradebook

}
