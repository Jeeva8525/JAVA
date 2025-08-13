//Finding the total and average of students using jagged array ... each student can choose variable number of subjects
import java.util.Scanner;

class mark {
    int[][] arr;
    int[] total;
    float[] avg;
    int n;
    Scanner scan = new Scanner(System.in);
    mark()
    {
        System.out.print("Enter the number of students: ");
        n = scan.nextInt();
        arr = new int[n][];
        total = new int[n];
        avg = new float[n];
    }
    void getDetails() {
        int noOfSubjects;
        for (int x = 0; x < n; x++) {
            total[x]=0;
            System.out.print("Enter the number of subjects student-" + (x + 1) + " have choosed: ");
            noOfSubjects = scan.nextInt();
            arr[x] = new int[noOfSubjects];
            for (int y = 0; y < noOfSubjects; y++) {
                System.out.print("Enter the mark of subject-" + (y + 1) + ": ");
                arr[x][y] = scan.nextInt();
                total[x]+=arr[x][y];
            }

            avg[x]=total[x]/(float)noOfSubjects;
            avg[x] = Math.round(avg[x]*100)/100.0f;

        }
    }
    void printDetails()
    {
        for(int x=0;x<n;x++)
        {
            System.out.println("Details of student-"+(x+1));
            System.out.println("The marks are");
            for(int y=0;y<arr[x].length;y++)
            {
                System.out.println("Mark-"+(y+1)+": "+arr[x][y]);
            }
            System.out.println("Total : "+total[x]);
            System.out.println("Average : "+avg[x]);
        }


    }
}

public class differentMarks {

    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);

        mark A = new mark();
        A.getDetails();
        A.printDetails();
        inp.close();
    }
}