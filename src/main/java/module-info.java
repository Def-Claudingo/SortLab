module ni.edu.uam.sortlab {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens ni.edu.uam.sortlab to javafx.fxml;
    exports ni.edu.uam.sortlab;
}