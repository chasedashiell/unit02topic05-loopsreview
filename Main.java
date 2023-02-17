import java.util.Arrays;

public class Main {

  public static String fromGradeString(int[] grades){
    String result = "";
    for (int grade : grades){
      if (grade >= 90){
        result += "A";
      } else if (grade >= 90){
        result += "B";
      }else if (grade >= 70){
        result += "C";
      }else if(grade >= 60){
        result += "D";
      }else {
        result += "F";
      }
    }
    return result;
  }

  public static String valedictorianName(String[] studentNames, double[] studentGrades){
    String valedictorian = studentNames[0];
    double valedictorianGpa = 0;
    for (int i = 0; i < studentGrades.length; i++){
      if (studentGrades[i] > valedictorianGpa){
        valedictorian = studentNames[i];
        valedictorianGpa = studentGrades[i];
      }
    }
    return valedictorian;
  }

  public static int[] longestPlateau(int[] nums) {
    int prevNum = nums[0];
    int startIndex = nums[0];
    int count = 0;
    boolean counting = false;
    for (int i = 1; i < nums.length; i++){
      if (prevNum < nums[i]){
        counting = true;
        startIndex = i;
      }else if (nums[i] < nums[i]+1){
        counting = false;
      }
      if(counting){
        count++;
      }
      prevNum = nums[i];
    }
    int[] result = {count, startIndex};
    return result;
  }
  public static void main(String[] args) {
    //int[] grades = {62, 79, 99, 50};
    //System.out.println(fromGradeString(grades));
    //String[] studentNames = {"emily", "albert", "sophie", "phillip", "ophelia"};
    //double[] studentGrades = {0.223, 3.538, 3.237, 1.437, 1.162};
    //System.out.println(valedictorianName(studentNames, studentGrades));
    int[] nums = {0, 3, 1, 1, 1, 0, 2, 2, 1, 1};
    System.out.println(Arrays.toString(longestPlateau(nums)));
  }
}