module com.example.pz_3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pz_3 to javafx.fxml;
    exports com.example.pz_3;
}