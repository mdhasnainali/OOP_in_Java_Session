public class Question {
    private String text;
    private String ans;
    private int mark;
    private int time;

    public Question(String text){
        this.text = text;
    }

    public Question(){

    }

    public String getText() {
        return text;
    }

    public String getAns() {
        return ans;
    }

    public int getMark() {
        return mark;
    }

    public int getTime() {
        return time;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void printQuestionDetails(){
        System.out.println("Question: " + this.text);
        System.out.println("Answer: " + this.ans);
        System.out.println("Time: " + this.time + " Minutes");
        System.out.println("Mark: " + this.mark);
    }

    public void printQuestionForStudents(){
        System.out.println("Question: " + this.text);
        System.out.println("Time: " + this.time + " Minutes" + "\tMark: " + this.mark);
    }

    public boolean checkAnswer(String ans){
        if(this.ans.equals(ans)) return true;
        else return false;
    }
}
