/*8. Provide toString methods for the Question and ChoiceQuestion classes.*/
public class Question
{
    private String answer;
    private String text;
    public Question()
    {
        text = "";
        answer = "";
    }

    public void setText(String questionText)
    {
        text = questionText;
    }

    public void setAnswer(String correctResponse)
    {
        answer = correctResponse;
    }

    public boolean checkAnswer(String response)
    {
        return response.equals(answer);
    }

    public void display()
    {
        System.out.println(text);
    }
    @Override
    public String toString() {
        return "Question{" + "\n answer='" + answer + '\'' + ", \ntext='" + text + '\'' + '}';
    }
}