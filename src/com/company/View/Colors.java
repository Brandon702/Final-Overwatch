package com.company.View;

public class Colors {



    String bold(String input) {
        String output;
        output = "\033[1m" + input + "\033[0m";
        return output;
    }

    String slant(String input) {
        String output;
        output= "\033[3m" + input + "\033[0m";
        return output;
    }

    String underline (String input) {
        String output;
        output = "\033[4m" + input + "\033[0m";
        return output;
    }

    String crossout(String input) {
        String output;
        output = "\033[9m" + input + "\033[0m";
        return output;
    }

    String boldUnderline(String input) {
        String output;
        output = "\033[21m" + input + "\033[0m";
        return output;
    }

    String blackFont(String input) {
        String output;
        output = "\033[30m" + input + "\033[0m";
        return output;
    }

    String redFont(String input) {
        String output;
        output = "\033[31m" + input + "\033[0m";
        return output;
    }

    String greenFont(String input) {
        String output;
        output = "\033[32m" + input + "\033[0m";
        return output;
    }

    String yellowFont(String input) {
        String output;
        output = "\033[33m" + input + "\033[0m";
        return output;
    }

    String blueFont(String input) {
        String output;
        output = "\033[34m" + input + "\033[0m";
        return output;
    }

    String purpleFont(String input) {
        String output;
        output = "\033[35m" + input + "\033[0m";
        return output;
    }

    String cyanFont(String input) {
        String output;
        output = "\033[36m" + input + "\033[0m";
        return output;
    }

    String whiteFont(String input) {
        String output;
        output = "\033[37m" + input + "\033[0m";
        return output;
    }

    String blackHighlight(String input) {
        String output;
        output = "\033[40m" + input + "\033[0m";
        return output;
    }

    String redHighlight(String input) {
        String output;
        output = "\033[41m" + input + "\033[0m";
        return output;
    }

    String greenHighlight(String input) {
        String output;
        output = "\033[42m" + input + "\033[0m";
        return output;
    }

    String yellowHighlight(String input) {
        String output;
        output = "\033[43m" + input + "\033[0m";
        return output;
    }

    String blueHighlight(String input) {
        String output;
        output = "\033[44m" + input + "\033[0m";
        return output;
    }

    String purpleHighlight(String input) {
        String output;
        output = "\033[45m" + input + "\033[0m";
        return output;
    }

    String cyanHighlight(String input) {
        String output;
        output = "\033[46m" + input + "\033[0m";
        return output;
    }

    String whiteHighlight(String input) {
        String output;
        output = "\033[47m" + input + "\033[0m";
        return output;
    }

    String boxed(String input) {
        String output;
        output = "\033[51m" + input + "\033[0m";
        return output;
    }


}
