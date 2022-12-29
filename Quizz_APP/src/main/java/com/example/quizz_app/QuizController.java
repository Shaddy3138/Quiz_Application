package com.example.quizz_app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class QuizController {

    @FXML
    public Label question;
    @FXML
    public Button opt1, opt2, opt3, opt4;

    private int counter = 0;
    private static int correct;
    private static int wrong;

    public static int getCorrect() {
        return correct;
    }

    public static int getWrong() {
        return wrong;
    }

    @FXML
    public void initialize(){
        loadQuestions();

    }

    private void loadQuestions() {

        switch (counter){
            case 0:
                question.setText("1. How many consonants are there in the English alphabet?");
                opt1.setText("19");
                opt2.setText("20");
                opt3.setText("21");
                opt4.setText("22");
                break;
            case 1:
                question.setText("2.Who invented the light bulb?");
                opt1.setText("Thomas Alva Edison");
                opt2.setText("Alexander Flaming");
                opt3.setText("Charles Babbage");
                opt4.setText("Albert Einstein");
                break;
            case 2:
                question.setText("3. In the Solar System, the farthest planet from the sun is?");
                opt1.setText("Jupiter");
                opt2.setText("Saturn");
                opt3.setText("Neptune");
                opt4.setText("Uranus");
                break;
            case 3:
                question.setText("4. Largest moon in the Solar System?");
                opt1.setText("Titan");
                opt2.setText("Ganymede");
                opt3.setText("Moon");
                opt4.setText("Europa");
                break;
            case 4:
                question.setText("5. Which of these is 'not' a property of metal?");
                opt1.setText("Good Conduction");
                opt2.setText("Malleable");
                opt3.setText("Non Ductile");
                opt4.setText("Sonourous");
                break;
            case 5:
                question.setText("6. Who discovered Pasteurisation?");
                opt1.setText("Alexander Flaming");
                opt2.setText("Louis Pasteur");
                opt3.setText("Simon Pasteur");
                opt4.setText("William Pasteur");
                break;
            case 6:
                question.setText("7. Hydrochloric acid(HCI) is produced by ?");
                opt1.setText("small Intestine");
                opt2.setText("Liver");
                opt3.setText("Oesophagus");
                opt4.setText("Stomach");
                break;
            case 7:
                question.setText("8. The fastest animal in the world is");
                opt1.setText("Lion");
                opt2.setText("Blackbuck");
                opt3.setText("Cheetah");
                opt4.setText("Quarter Horse");
                break;
            case 8:
                question.setText("9. Complementary colour of red is?");
                opt1.setText("Blue");
                opt2.setText("Green");
                opt3.setText("Yellow");
                opt4.setText("Pink");
                break;
            case 9:
                question.setText("10. World Environment day is on ?");
                opt1.setText("5th June");
                opt2.setText("5th July");
                opt3.setText("15th June");
                opt4.setText("25th June");
                break;
        }

    }

    @FXML
    public void opt1clicked(ActionEvent event){
        checkAnswer(opt1.getText().toString());
        if(checkAnswer(opt1.getText().toString())){
            correct = correct + 1;
        }else{
            wrong = wrong + 1;
        }

        if(counter == 9){
            try{

                Stage thisStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisStage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initStyle(StageStyle.TRANSPARENT);
                scene.setFill(Color.TRANSPARENT);
                stage.show();

            }catch (Exception e ){
                e.printStackTrace();
            }

        }else{
            counter ++;
            loadQuestions();
        }
    }



    @FXML
    public void opt2clicked(ActionEvent event){
        checkAnswer(opt2.getText().toString());
        if(checkAnswer(opt2.getText().toString())){
            correct = correct + 1;
        }else{
            wrong = wrong + 1;
        }

        if(counter == 9){
            try{

                Stage thisStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisStage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initStyle(StageStyle.TRANSPARENT);
                scene.setFill(Color.TRANSPARENT);
                stage.show();

            }catch (Exception e ){
                e.printStackTrace();
            }
        }else{
            counter ++;
            loadQuestions();
        }

    }
    @FXML
    public void opt3clicked(ActionEvent event){
        checkAnswer(opt3.getText().toString());
        if(checkAnswer(opt3.getText().toString())){
            correct = correct + 1;
        }else{
            wrong = wrong + 1;
        }

        if(counter == 9){
            try{

                Stage thisStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisStage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initStyle(StageStyle.TRANSPARENT);
                scene.setFill(Color.TRANSPARENT);
                stage.show();

            }catch (Exception e ){
                e.printStackTrace();
            }
        }else{
            counter ++;
            loadQuestions();
        }

    }
    @FXML
    public void opt4clicked(ActionEvent event){
        checkAnswer(opt4.getText().toString());
        if(checkAnswer(opt4.getText().toString())){
            correct = correct + 1;
        }else{
            wrong = wrong + 1;
        }

        if(counter == 9){
            try{

                Stage thisStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisStage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initStyle(StageStyle.TRANSPARENT);
                scene.setFill(Color.TRANSPARENT);
                stage.show();

            }catch (Exception e ){
                e.printStackTrace();
            }
        }else{
            counter ++;
            loadQuestions();
        }

    }
    private boolean checkAnswer(String answer) {

        switch (counter){
            case 0:
                if (answer.equals("21")){
                    return true;
                }
                return false;
            case 1:
                if (answer.equals("Thomas Alva Edison")){
                    return true;
                }
                return false;
            case 2:
                if (answer.equals("Neptune")){
                    return true;
                }
                return false;
            case 3:
                if (answer.equals("Ganymede")){
                    return true;
                }
                return false;
            case 4:
                if (answer.equals("Non Ductile")){
                    return true;
                }
                return false;
            case 5:
                if (answer.equals("Louis Pasteur")){
                    return true;
                }
                return false;
            case 6:
                if (answer.equals("Stomach")){
                    return true;
                }
                return false;
            case 7:
                if (answer.equals("Cheetah")){
                    return true;
                }
                return false;
            case 8:
                if (answer.equals("Green")){
                    return true;
                }
                return false;
            case 9:
                if (answer.equals("5th June")){
                    return true;
                }
                return false;

        }

        return false;
    }
}
