package com.company.View;

public class View {

    public void test() {
        System.out.println(redFont(blueHighlight("................................................................................") + "\n" +
                        "................................................................................\n" +
                        "................................................................................\n" +
                        "................................................................................\n" +
                        "................................................................................\n" +
                        "................................................................................\n" +
                        "................................................................................\n" +
                        "................................................................................\n" +
                        "................................................................................\n" +
                        "................................................................................\n" +
                        "................................................................................\n" +
                        "................................................................................\n" +
                        "................................................................................\n" +
                        "................................................................................\n" +
                        "................................................................................\n" +
                        "................................................................................\n" +
                        "................................................................................\n" +
                        "................................................................................\n" +
                        "................................................................................\n" +
                        "................................................................................\n" +
                        "................................................................................\n")
                        );
    }
    //Methods for colors

    private String bold(String input) {
        String output;
        output = "\033[1m" + input + "\033[0m";
        return output;
    }

    private String slant(String input) {
        String output;
        output= "\033[3m" + input + "\033[0m";
        return output;
    }

    private String underline (String input) {
        String output;
        output = "\033[4m" + input + "\033[0m";
        return output;
    }

    private String crossout(String input) {
        String output;
        output = "\033[9m" + input + "\033[0m";
        return output;
    }

    private String boldUnderline(String input) {
        String output;
        output = "\033[21m" + input + "\033[0m";
        return output;
    }

    private String blackFont(String input) {
        String output;
        output = "\033[30m" + input + "\033[0m";
        return output;
    }

    private String redFont(String input) {
        String output;
        output = "\033[31m" + input + "\033[0m";
        return output;
    }

    private String greenFont(String input) {
        String output;
        output = "\033[32m" + input + "\033[0m";
        return output;
    }

    private String yellowFont(String input) {
        String output;
        output = "\033[33m" + input + "\033[0m";
        return output;
    }

    private String blueFont(String input) {
        String output;
        output = "\033[34m" + input + "\033[0m";
        return output;
    }

    private String purpleFont(String input) {
        String output;
        output = "\033[35m" + input + "\033[0m";
        return output;
    }

    private String cyanFont(String input) {
        String output;
        output = "\033[36m" + input + "\033[0m";
        return output;
    }

    private String whiteFont(String input) {
        String output;
        output = "\033[37m" + input + "\033[0m";
        return output;
    }

    private String blackHighlight(String input) {
        String output;
        output = "\033[40m" + input + "\033[0m";
        return output;
    }

    private String redHighlight(String input) {
        String output;
        output = "\033[41m" + input + "\033[0m";
        return output;
    }

    private String greenHighlight(String input) {
        String output;
        output = "\033[42m" + input + "\033[0m";
        return output;
    }

    private String yellowHighlight(String input) {
        String output;
        output = "\033[43m" + input + "\033[0m";
        return output;
    }

    private String blueHighlight(String input) {
        String output;
        output = "\033[44m" + input + "\033[0m";
        return output;
    }

    private String purpleHighlight(String input) {
        String output;
        output = "\033[45m" + input + "\033[0m";
        return output;
    }

    private String cyanHighlight(String input) {
        String output;
        output = "\033[46m" + input + "\033[0m";
        return output;
    }

    private String whiteHighlight(String input) {
        String output;
        output = "\033[47m" + input + "\033[0m";
        return output;
    }

    private String boxed(String input) {
        String output;
        output = "\033[51m" + input + "\033[0m";
        return output;
    }
}
