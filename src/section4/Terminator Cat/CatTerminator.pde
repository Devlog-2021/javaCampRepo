PImage catPic;
int x = 425;
int y = 378;
int acceleration = 1;

void setup(){
  
  size(800, 800);
  catPic = loadImage("Cat Pic.jpeg");
  catPic.resize(800,800);
  background(catPic);
  
}

void draw(){
  
  if (mousePressed) {
    println("Mouse's x-position: " + mouseX + "\n" + "Mouse's y-position: " + mouseY + "\n");
  }
    
  if(x > width) {
    
    print("hello");
    
  }
  
  ellipse(x, y, 60, 50);
  ellipse(425, 378, 50, 50);
  noStroke();
  fill(255, 20, 100);

}

void keyPressed() {
 
   y+=2*acceleration;
   x+=2*acceleration;

  
  }
