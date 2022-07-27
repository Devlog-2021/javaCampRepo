

void setup() {
  
// 1. Set the size of the sketch. Make it 600 pixels square. 
 size(600, 600);

}

void draw() {
  
// 2. Draw an ellipse
ellipse(300, 300, 200, 200);

// Run the program to make sure it works before moving on.

fill(210, 300, 101);
stroke(210, 100, 101);

// 3. Change the color of the ellipse when the mouse is pressed.
//    Use the following code, but put your colors where indicated
//    Remember to use the   fill()  command to set colors.

if (mousePressed) {
 
  fill(240, 340, 125);
  stroke(230, 310, 115);
   //  put one color here 
  
} else {
  
   // put a different color here
   
   fill(100, 300, 135);
   stroke(300,300,120);
  
}  
  
  
  
}
