PImage face;

void setup(){
  // 1. On the line below, change "face1.jpg" to be the name of the face you want to use
  face = loadImage("face1.jpg");
  
  // 2. Run your program.  Is the face stretched?
  // Fix the numbers below so the face looks good
  size(200, 600);
  
  face.resize(width,height);
  background(face);
}


void draw() {
  // 4. Give the eyes a color by using fill(red, green, blue);
  // (use numbers in place of red, green, blue)
  // Example: fill(255, 10, 200);
  
  // 3. Use circle(x, y, size) to put two BIG eyes on the face
  // Example: circle(100, 50, 80);
 
  
  // 5. Use mouseX and mouseY to change the color of the irises when the mouse moves
  // hint: mouseX is a int variable, so you can use it anywhere you're using a number
  // hint: you will be changing the fill command you wrote in step 4
  
  // 6. Draw black pupils on top of the eyes.

  
  
  // BONUS: Use your own face!
// 1. Open photobooth and take a picture of your face
// 2. Right-click on the photo you just took and choose "Export"
// 3. Choose an easy name for your photo, like "me.jpg"
// 4. Save your photo on the desktop so it's easy to find
// 5. Drag the image from your desktop and drop it into your code
// 6. Find the place in your code where you loadImage and change the file name to match your photo
// 7. Change your code so the eyes are in the right place on your face
  
}
