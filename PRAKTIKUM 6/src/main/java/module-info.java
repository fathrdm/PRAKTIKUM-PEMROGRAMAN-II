module com.example.prak6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.Praktikum6 to javafx.fxml;
    exports com.example.Praktikum6;
}