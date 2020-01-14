//Graphics from pngtree.com https://pngtree.com/

import processing.sound.*;
SoundFile meow;
SoundFile woof;
PImage cat;
PImage dog;
PImage background;

int catX = 00;
int catY = 100;
int dogX = 0;
int dogY = 300;


void setup() {
  size(1200, 500); 
  textSize(35);
  meow = new SoundFile(this, "meow.wav");
  woof = new SoundFile(this, "woof.wav");
  cat = loadImage("lion.png");
  dog = loadImage("dog.png");
  background = loadImage("space.png");
  background.resize(width, height);
  /* ▼ Write code BELOW this line ▼ */




  
  /* ▲ Write code ABOVE this line ▲*/
}


void draw() {
  background(background);
  /* ▼ Write code BELOW this line ▼ */
  
  





  
  /* ▲ Write code ABOVE this line ▲*/
  image(cat, catX, catY);
  image(dog, dogX, dogY);
  
  checkForWinner();
}

void moveCat(){
  catX = catX + 10;
}

void moveDog(){
  dogX = dogX + 10;
}

void checkForWinner(){
  if (catX>width-60){
    text("CATS ARE THE BEST", 400, 50); 
    meow.play();
    noLoop();
  }
  
  if (dogX>width-60){
    text("DOGS RULE", 500, 50); 
    woof.play();
    noLoop();
  }
}
 
    
