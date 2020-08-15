//Graphics from pngtree.com https://pngtree.com/

	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
boolean canPlaySounds = true;

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
    if (canPlaySounds) {
        meow = new SoundFile(this, "meow.wav");
	      meow.play();
	  }
    noLoop();
    	
  }
  
  if (dogX>width-60){
    text("DOGS RULE", 500, 50); 
    if (canPlaySounds) {
		   woof = new SoundFile(this, "woof.wav");
	     woof.play();
	  } 
    noLoop();
  }
}
 
    
