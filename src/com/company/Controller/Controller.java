package com.company.Controller;

import com.company.Model.*;
import com.company.View.View;

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
        //call models here

        view.genjiArt();


        view.hanzoArt();


        view.lucioArt();


        view.mccreeArt();


        view.moriaArt();


        view.reaperArt();


        view.reinhardtArt();


        view.roadhogArt();


        view.tracerArt();


        view.widowmakerArt();


        view.wreckingballArt();

    }
}
