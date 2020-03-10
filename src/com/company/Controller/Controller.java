package com.company.Controller;

import com.company.Model.*;
import com.company.View.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Controller {
    View v = new View();
    Ana ana = new Ana();
    Genji genji = new Genji();
    Hanzo hanzo = new Hanzo();
    Lucio lucio = new Lucio();
    McCree mcCree = new McCree();
    Moria moria = new Moria();
    Reaper reaper = new Reaper();
    Reinhardt reinhardt = new Reinhardt();
    Roadhog roadhog = new Roadhog();
    Tracer tracer = new Tracer();
    Widowmaker widowmaker = new Widowmaker();
    WreckingBall wreckingBall = new WreckingBall();

    public void run() throws IOException {
        //Make menu if/switch system here
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        boolean exit = true;
        while(exit) {
            v.createMenu();
            String input = userInput.readLine();
            switch (input) {
                case "1":
                    while(exit){
                        v.createCharacterMenu();
                        String input2 = userInput.readLine();
                        switch (input2){
                            case "1":
                                v.anaArt();
                                System.out.println(ana.toString());
                                break;
                            case "2":
                                v.genjiArt();
                                System.out.println(genji.toString());
                                break;
                            case "3":
                                v.hanzoArt();
                                System.out.println(hanzo.toString());
                                break;
                            case "4":
                                v.lucioArt();
                                System.out.println(lucio.toString());
                                break;
                            case "5":
                                v.mccreeArt();
                                System.out.println(mcCree.toString());
                                break;
                            case "6":
                                v.moriaArt();
                                System.out.println(moria.toString());
                                break;
                            case "7":
                                v.reaperArt();
                                System.out.println(reaper.toString());
                                break;
                            case "8":
                                v.reinhardtArt();
                                System.out.println(reinhardt.toString());
                                break;
                            case "9":
                                v.roadhogArt();
                                System.out.println(roadhog.toString());
                                break;
                            case "10":
                                v.tracerArt();
                                System.out.println(tracer.toString());
                                break;
                            case "11":
                                v.widowmakerArt();
                                System.out.println(widowmaker.toString());
                                break;
                            case "12":
                                v.wreckingballArt();
                                System.out.println(wreckingBall.toString());
                                break;
                            case "13":
                                exit = false;
                                break;
                            default:
                                System.out.println("Hey can you enter a number 1 - 13");
                        }
                    }

                    break;
                case "2":
                    exit = false;
                    break;
                default:
                    System.out.println("Enter a number between 1 - 2");
            }
        }

    }
}
