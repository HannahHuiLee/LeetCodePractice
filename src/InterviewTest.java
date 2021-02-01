import java.util.Arrays;

/**
 * created by Hannah Li on 2021-01-10
 */
public class InterviewTest {

    public static void main(String[] args) {
        String words = "pizza elephant cat caterpillar pie frog";
        InterviewTest interviewTest = new InterviewTest();
        interviewTest.printThreeColumns(words);
    }

    public void printThreeColumns(String words){
        String[] wordsArray = words.split(" ");
        Arrays.sort(wordsArray);

        for (String s : wordsArray) {
            setNumber(wordsArray, s);
        }
    }

    public String[][] setNumber(String[] wordsArray , String number){
        int row = wordsArray.length/3;
        String[][] layout = new String[row][3];
        for (int i = 0; i < wordsArray.length/3; i++ ) {
            for(int j = 0; j< i;j++){
                layout[i][j] = number;
                System.out.print(layout[i][j]);
            }
        }
        return layout;
    }

}
