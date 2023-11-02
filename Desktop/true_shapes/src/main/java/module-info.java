module com.example.true_shapes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.true_shapes to javafx.fxml;
    exports com.example.true_shapes;
}