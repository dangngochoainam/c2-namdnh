package com.mycompany.mavenproject2;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}


public class Handle {
    int a = 1;
    int b = 2;
    int d = a + b;
}