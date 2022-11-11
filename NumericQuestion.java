/*3. Add a class NumericQuestion to the question hierarchy of Section 9.1. If the
response and the expected answer differ by no more than 0.01, accept the
response as correct. */

public class NumericQuestion extends Question{
    private double Answer;



    public void setAnswer(double Response)
    {
        Answer=Response;
    }
    public boolean checkAnswer(String Response)
    {
        super.checkAnswer(Response)
        double responseDouble = Double.parseDouble(Response);
        return Math.abs (responseDouble - Answer) <= 0.01;
    }

}