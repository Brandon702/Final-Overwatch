package com.company.Controller;

import com.company.Model.*;
import com.company.View.View;

import java.util.ArrayList;

public class Controller {
    View view = new View();
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

    public void run() {
        //Make menu if/switch system here
        view.anaArt();
        System.out.println(ana.toString());
        //call models here

        view.genjiArt();
        System.out.println(genji.toString());



        view.hanzoArt();
        System.out.println(hanzo.toString());

        view.lucioArt();
        System.out.println(lucio.toString());

        view.mccreeArt();
        System.out.println(mcCree.toString());

        view.moriaArt();
        System.out.println(moria.toString());

        view.reaperArt();
        System.out.println(reaper.toString());

        view.reinhardtArt();
        System.out.println(reinhardt.toString());

        view.roadhogArt();
        System.out.println(roadhog.toString());

        view.tracerArt();
        System.out.println(tracer.toString());

        view.widowmakerArt();
        System.out.println(widowmaker.toString());

        view.wreckingballArt();
        System.out.println(wreckingBall.toString());
    }
}
