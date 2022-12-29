package com.example.quizz_app;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;

public class ResultController {

    @FXML
    public Label remark;
    @FXML
    public Label marks;
    @FXML Label marksText;
    @FXML
    public Label correctText;
    @FXML
    public Label incorrectText;
    @FXML
    public ProgressIndicator correctProgress;
    @FXML
    public ProgressIndicator incorrectProgress;


    @FXML
    private void initialize(){
        correctText.setText(String.valueOf("Correct answers: " + QuizController.getCorrect()));
        incorrectText.setText(String.valueOf("Incorrect answers:" + QuizController.getWrong()));

        marks.setText(String.valueOf(QuizController.getCorrect() + "/10"));

        float correctF = (float) QuizController.getCorrect()/10;
        float incorrectF = (float) QuizController.getWrong()/10;

        correctProgress.setProgress(correctF);
        incorrectProgress.setProgress(incorrectF);

        int evaluation = QuizController.getCorrect();

        if (evaluation < 2){
            remark.setText("Oh no...! You have failed the quiz. It seems that you need to improve your general knowledge. Practice daily! Check your results here.");
        } else if (evaluation > 2 && evaluation < 5 ) {
            remark.setText("Oops...! You only scored few marks. It seems like you need to improve your general knowledge. Check your results here.");
        } else if (evaluation >= 5 && evaluation <= 7) {
            remark.setText("Good. A bit more improvement might help you to get better results. Practice is the key to success. Check your results here.");
        } else if (evaluation == 8 || evaluation == 9) {
            remark.setText("Congratulations! It's your hard work and determination which helped you to score good marks. Check your results here. ");
        }else if(evaluation == 10){
            remark.setText("Congratulations! You have passed the quiz with full marks due to your hard work and dedication towards studies. Keep it up. Check your results here.");
        }
    }
}
