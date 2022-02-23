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
    int a = 10;
    int b = 20;
    int c = a + b;
}