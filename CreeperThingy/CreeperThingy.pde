PImage creeper;
PImage minecraft;
int xPos = 350;
int yPos = 375;

void setup(){
  size(800,600);
  minecraft = loadImage("minecraft.jpeg");     //in setup method
  minecraft.resize(width, height);          //in setup method
  background(minecraft);     //in setup method
  creeper=loadImage("creeper.png");
  creeper.resize(25,40);     //in setup method//in setup method
}

void draw(){
  background(minecraft);
  image(creeper, xPos, yPos);
  
  if (mousePressed){
    if (dist(xPos+10,yPos+20,mouseX,mouseY) < 10){
    fill(#1BF53D);
    xPos = (int)random(0,800);
    yPos = (int)random(0,600);
    }
    else{
      fill(#ED0C2A);
    }
    ellipse(mouseX, mouseY, 10,10);
  }
}
