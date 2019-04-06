package InterviewList;

/**
 * created by Hannah Li on 19/4/6
 * Project name: LeetcodeProject
 * LeetCode NO.:
 */
public class UserInput {

    public static class TextInput {

        StringBuilder s = new StringBuilder();
        public void add(char c){
            s.append(String.valueOf(c));
        }
        public String getValue(){

            return s.toString();
        }
    }

    public static class NumericInput extends TextInput{

        @Override
        public void add(char c){
            if(Character.isDigit(c)){
                s.append(String.valueOf(c));
            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }

}
