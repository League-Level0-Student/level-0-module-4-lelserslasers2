PImage donkey;
PImage tail;
int xPos;
int yPos;
boolean gameOn = true;
import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;

void setup() {
  donkey = loadImage("donkey.jpeg");
  tail = loadImage("tail.png");
  size(400,200);
  donkey.resize(400,200);
  tail.resize(25, 0); 
  Minim minim = new Minim(this);     //In the setup method
  woohooSound = minim.loadSample("Homer - Woohoo! (2).wav");
}

void draw(){
  background(donkey);
  if (dist(0, 0, xPos, yPos) > 30 && gameOn){
    background(#D8D8D8);
  }
  rect(0, 0, 30, 30);
  //rect(245,90,30,30);
  if (gameOn){
    image(tail, mouseX-20, mouseY);
    xPos = mouseX - 20;
    yPos = mouseY;
  }
  else{
      image(tail, xPos, yPos);
  }
  
  if (mousePressed){
     gameOn= false; 
  }
  if (dist(245,90, xPos, yPos) < 30 && gameOn== false){
     if (playSound) {
       woohooSound.trigger();
       playSound = false;
       print("ya");
      } 
  }
  
}
