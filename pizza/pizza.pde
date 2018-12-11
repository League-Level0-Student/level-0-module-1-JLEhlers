import ddf.minim.*;
Minim minim;
AudioPlayer sound;
void draw(){
 
 PImage pepperoni = loadImage("pepperoni.jpg");
 pepperoni.resize(50,50);
 PImage onion = loadImage("onion.jpg");
 onion.resize(75,75);
 if(mousePressed){
 image(pepperoni, mouseX,mouseY);
 sound.play();
 sound.rewind();
 }
 if(keyPressed){
   image(onion, mouseX,mouseY);
   sound.play();
 sound.rewind();
 }
}

void setup(){
  minim=new Minim(this);
  sound=minim.loadFile("click.mp3");
size(1000,1000); 
fill(245,202,94);
 ellipse(500,500,500,500);
 fill(250,50,34);
 ellipse(500,500,400,400);
 fill(247,214,45);
 ellipse(500,500,350,350);  
}