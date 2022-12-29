module com.example.quizz_app {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.quizz_app to javafx.fxml;
    exports com.example.quizz_app;
}