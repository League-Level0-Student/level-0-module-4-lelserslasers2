

void setup(){
  PImage face = loadImage("face.jpeg");
  size(800,600);
  face.resize(width,height);
  background(face);
}

void draw(){
  PImage face = loadImage("face.jpeg");
  size(800,600);
  face.resize(width,height);
  background(face);
  
  
  fill(#000000);
  float addX = (mouseX-270)*0.07;
  float addY = (mouseY-320)*0.07;
  float addX2 = (mouseX-520)*0.07;
  ellipse(270+addX,320+addY,50,50);
  ellipse(520+addX2,320+addY,50,50);
}
