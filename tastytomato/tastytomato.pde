void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(200,0,0);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(0,100,50);
    rect(176, 103, 12, 32);
    if (keyPressed){
    fill(200,200,200);
    ellipse(75,200,50,50);
    }    
}