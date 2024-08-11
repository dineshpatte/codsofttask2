import java.util.*;
public class gradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number of subjects : ");
        int noSubjects = sc.nextInt();

        if(noSubjects <=0){
            System.out.println("please enter the valid number of subjcts !");
        }

        int totalMarks = 0;
        int maxMarks = 100;

        for(int i =1;i<=noSubjects;i++){
            System.out.println("Enter the marks obtained in subject " + (i+1) +" for 100");
            int marks = sc.nextInt();

            if(marks <0|| marks > maxMarks){
                System.out.println("marks has to be between the range of 0 and 100 sorry -_- try again");
                i--;
            }
            else{
                totalMarks+=marks;
            }


        }
        double avgPercentage = (double) totalMarks / (noSubjects + maxMarks)*100;
        System.out.println("Total marks :" + totalMarks );

        System.out.println("Average percentage :"+ avgPercentage+ "%");

        String grade;
        if(avgPercentage >= 90){
            grade = "A";
        }
        else if(avgPercentage >= 90){
            grade = "A";
        } 
        else if(avgPercentage >= 80){
            grade = "B";
        }
        else if(avgPercentage >= 70){
            grade = "C";
        }
        else if(avgPercentage >= 60){
            grade = "D";
        }
        else if(avgPercentage >= 50){
            grade = "PASS";
        }
        else{
            grade = "F";
        }

        System.out.println("grade : "+grade);


    }

}
