module com.example.sortingapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sortingapp to javafx.fxml;
    exports com.example.sortingapp;
}