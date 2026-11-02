module lab10_danielsavulescu.lab10_danielsavulescu {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens lab10_danielsavulescu.lab10_danielsavulescu to javafx.fxml;
    exports lab10_danielsavulescu.lab10_danielsavulescu;
}
