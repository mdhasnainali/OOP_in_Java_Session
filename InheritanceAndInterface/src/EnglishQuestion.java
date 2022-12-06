public class EnglishQuestion extends Question{

    public EnglishQuestion(String question){
        super(question);
    }

    void showResult(String ans){
        boolean isPass = super.checkAnswer(ans);
        if(isPass){
            System.out.println("Your result in English is very good.");
            System.out.println("You got: " + super.getMark());
            System.out.println("Your grade: A+");
        }
        else {
            System.out.println("Your result in English is very bad.");
            System.out.println("You got: 0");
            System.out.println("Your grade: F");
        }
    }
}
