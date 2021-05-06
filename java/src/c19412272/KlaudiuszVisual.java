package c19412272;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;

public class KlaudiuszVisual extends PApplet {

    Minim minim; //connect to minim
    AudioPlayer ap; //connect to mp3
    AudioBuffer ab; // samples

    float[] lerpedBuffer;

    

    public void settings() {
        // size of screen 
        fullScreen(P3D,SPAN);
    }

    float y = 200;
    float lepredY = y;

    int menu = 0;


    public void setup() {
        minim = new Minim(this);
        ap = minim.loadFile("OldFriend.mp3", width);
        ab = ap.mix; // connect the buffer to the mp3 file
        ap.play();
        colorMode(HSB);
        lerpedBuffer = new float[width];

    }

    public void keyPressed() {
        if (keyCode >= '0' && keyCode <= '4') {
            menu = keyCode - '0';
        }
        if (keyCode == ' ') {
            if (ap.isPlaying()) {
                ap.pause();
            } else {
                ap.rewind();
                ap.play();
            }
        }
        if (keyCode == UP)
        {
            twoCubes = ! twoCubes;
        }

        if (keyCode == DOWN)
        {
            twoCircles = ! twoCircles;
        }
    }

    float lerpedAverage = 0;
    private float angle = 0;

    private boolean twoCubes = false;
    private boolean twoCircles = false;


    public void draw() {
        background(0);
        stroke(255);
        float halfHeight = height / 2;
        float average = 0;
        float sum = 0;
       
        // average of the buffer
        for(int i =0; i < ab.size(); i++)
        {
            sum += abs(ab.get(i));
        }

        average = sum / ab.size();

        // calculate the average amplitutde
        lerpedAverage = lerp(lerpedAverage,average, 0.1f);

        switch(menu)
        {
            case 0:
            {
                //iterate over all elements in audio buffer
                float c = map(average, 0, 1, 0, 255);
                stroke(c, 255, 255);        
                strokeWeight(4);
                noFill();
                ellipse(width / 2, height / 2, 50 + (lerpedAverage * 500), 50 + (lerpedAverage * 500));                                 
                break;
                
            }   
                
            case 1:
            {
                float c = map(average, 0, 1, 0, 255);
                stroke(c, 255, 255);        
                strokeWeight(2);
                noFill();
                rectMode(CENTER);
                float size = 50 + (lerpedAverage * 500);
                rect(width / 2, height / 2, size, size);
                break;
            }
            case 2:
            {
                lights();
                strokeWeight(2);
                float c = map(lerpedAverage, 0, 1, 0, 255);
                stroke(c, 255, 255);
                noFill();
                //fill(100, 255, 255);
                angle += 0.01f;
                float s = 100 + (100 * lerpedAverage * 10);
                
                if (! twoCubes)
                {
                    translate(width / 2, height / 2, 0);
                    rotateY(angle);
                    rotateX(angle);
                    box(s);
                }
                else
                {
                    pushMatrix();
                    translate(width / 4, height / 2, 0);
                    rotateY(angle);
                    rotateX(angle);
                    box(s);
                    popMatrix();

                    pushMatrix();
                    translate(width * 0.75f, height / 2, 0);
                    rotateY(angle);
                    rotateX(angle);
                    box(s);
                    popMatrix();
                    
                }
                break;
            }

            case 3:
            {
                 // Iterate over all the elements in the audio buffer
                 for (int i = 0; i < ab.size(); i++) {

                    float c = map(i, 0, ab.size(), 0, 255);
                    stroke(c, 255, 255);
                    lerpedBuffer[i] = lerp(lerpedBuffer[i], ab.get(i), 0.1f);        
                    line(i, halfHeight - lerpedBuffer[i] * halfHeight * 2, i, halfHeight + lerpedBuffer[i] * halfHeight * 2);
                }        
                break;
            }

            case 4:
            {
                for (int i = 0; i < ab.size(); i++) {

                    float c = map(i, 0, ab.size(), 0, 255);
                    stroke(c, 255, 255);
                    lerpedBuffer[i] = lerp(lerpedBuffer[i], ab.get(i), 0.1f);        
                    line(0, i, lerpedBuffer[i] * halfHeight * 2, i);
                    line(width, i, width - (lerpedBuffer[i] * halfHeight * 2), i);
                    line(i, 0, i, lerpedBuffer[i] * halfHeight * 2);
                    line(i, height, i, height - (lerpedBuffer[i] * halfHeight * 2));
                }        
                break;
            } 
        }
    }
}






