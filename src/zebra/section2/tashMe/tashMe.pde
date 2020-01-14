PImage mustache;
PImage face;

void setup(){
  // 1. On the line below, change "face0.jpg" to "face1.jpg" or "face2.jpg"...find the face you want
  face = loadImage("face0.jpg");
  size(600, 600);
  face.resize(width,height);
  
  // 2. load the mustache image like this: mustache = loadImage("mustache.png");

}


void draw() {
  background(face);
  // 3. draw your mustache like this: image(mustache, 400, 300);
  
  // 4. Change the previous line of code so that the mustache moves with your mouse! 
  // hint: mouseX and mouseY 
  
  // 5. Use an if statement to make the mustache appear only when the mouse is pressed. 
  
  // EXTRA CREDIT
  // Resize your mustache so that it fits better using: mustache.resize(int width, int height) 
  
  // EXTRA CREDIT
  // Go find your own face on the internet. 
  // 1. Find a picture of a face on the internet.
  // 2. Right-click on the file and use "Save As" to save it on your desktop
  // 3. Rename your image something short (e.g. "face")
  // 4. Drag the image from your desktop and drop it into your code
}
