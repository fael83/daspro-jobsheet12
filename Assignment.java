import java.util.Arrays;
import java.util.Scanner;
public class Assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] surveyResults = new int [10][6];
        String []question = {
            "How satisfied are you with the quality of our services?",
            "How satisfied are you with the responsiveness of our customer service?",
            "How satisfied are you with the professionalism of our staff?",
            "How satisfied are you with the timeliness of our service delivery?",
            "How satisfied are you with the value for money of our services?",
            "How likely are you to recommend our services to others?",          
        };
        System.out.println("============");
        System.out.println("Survey Result");
        for (int i = 0; i < surveyResults.length; i++) {
            System.out.println("Respondent " + (i + 1));
            for (int j = 0; j < surveyResults[i].length; j++) {
                System.out.println((j+1) + ". " + question[j]);
                System.out.print("Enter the value for the question " + (j + 1) + " (1-5): ");
                surveyResults [i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("===================================");
        System.out.println("Average Score for Each Respondent");
        for (int i = 0; i < surveyResults.length; i++) {
            int sum = 0;
            for (int j = 0; j < surveyResults[i].length; j++) {
                sum += surveyResults[i][j];
            }
            double average = (double) sum / surveyResults[i].length;
            System.out.printf("Respondent %d: %.2f\n", (i + 1), average);
        }
        System.out.println("=================================");
        System.out.println("Average Score for Each Question");
        for (int i = 0; i < surveyResults[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < surveyResults.length; j++) {
                sum += surveyResults[j][i];
            }
            double average = (double) sum / surveyResults.length;
            System.out.printf("Question %d: %.2f\n", (i + 1), average);
        }
        System.out.println("=====================");
        System.out.println("Overall Average Value");
        int totalSum = 0;
        int totalCount = 0;
        for (int i = 0; i < surveyResults.length; i++) {
            for (int j = 0; j < surveyResults[i].length; j++) {
                totalSum += surveyResults[i][j];
                totalCount++;
            }
        }
        double overallAverage = (double) totalSum / totalCount;
        System.out.printf("Overall Average Score: %.2f\n", overallAverage);
    }
}
        