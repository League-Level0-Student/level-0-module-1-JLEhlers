void setup(){
size(600,750);  
PImage face=loadImage("cat.jpg");
image(face,0,0); 
}

void draw(){
fill(10,195,247);
ellipse(187,227,56,60); 
ellipse(361,246,53,60);
fill(3,3,3);
ellipse(187,227,20,25);
ellipse(361,245,20,25);
}