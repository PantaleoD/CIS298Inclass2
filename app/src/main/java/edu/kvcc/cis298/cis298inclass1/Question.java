package edu.kvcc.cis298.cis298inclass1;

/**
 * Created by dbarnes on 9/23/2015.
 */
public class Question {

    //Class level variable to hold the question text
    //In order to get a string from strings.xml, we need
    //and integer as the reference value.
    private int mTextResId;
    //Integer to represent the integer id of the correct resource
    private int mCorrectAnswerResId;
    //Integer array to hold the resource ids of the choices for the question
    private int[] mChoiceResIds;

    //Constructor that accepts 3 parameters. The string id,
    //and the int correct answer
    public Question(int textResId, int correctAnswerResId, int[] choiceResIds) {
        //Assign the passed in ones to the class level ones.
        mTextResId = textResId;
        mCorrectAnswerResId = correctAnswerResId;
        mChoiceResIds = choiceResIds;
    }

    //Getters and Setters for ALL
    public int[] getChoiceResIds() {
        return mChoiceResIds;
    }

    public void setChoiceResIds(int[] choiceResIds) {
        mChoiceResIds = choiceResIds;
    }

    public int getCorrectAnswerResId() {
        return mCorrectAnswerResId;
    }

    public void setCorrectAnswerResId(int correctAnswerResId) {
        mCorrectAnswerResId = correctAnswerResId;
    }

    //Getter for mTextResId
    public int getTextResId() {
        return mTextResId;
    }

    //Setter for mTextResId
    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }
}
