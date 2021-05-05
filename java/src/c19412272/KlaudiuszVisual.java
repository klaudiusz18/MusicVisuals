package c19412272;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;

public class KlaudiuszVisual extends PApplet {

    Minim minim; //connect to minim
    AudioPlayer ap; //connect to mp3
    AudioBuffer ab; // samples

    public void settings() {
        // size of screen 
        size(1000,1000);
    }

    public void setup() {
        minim = new Minim(this);
        ap = minim.loadFile("OldFriend.mp3", width);
        ab = ap.mix; // connect the buffer to the mp3 file
        ap.play();
        colorMode(HSB);

    }


    public void draw() {
        background(0);
        stroke(255);
        float halfHeight = height / 2;
        for(int i =0; i < ab.size(); i++)
        {
            float c = map(i, 0, ab.size(), 0, 255);
            stroke(c, 255, 255);
            line(i, halfHeight, i, halfHeight + ab.get(i) * halfHeight);
        }

        
    }


}






