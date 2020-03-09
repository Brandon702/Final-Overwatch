package com.company;

import com.company.Controller.Controller;
import com.company.Model.Lucio;
import com.company.Model.McCree;
import com.company.Model.Reinhardt;
import com.company.View.View;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Controller controller = new Controller();
        controller.run();
    }
}
