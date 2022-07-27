PImage rainbow;
PImage unicorn;

void setup() {
  size(900, 900);
rainbow = loadImage("rainbow_.jpg");
rainbow.resize(900, 900);
unicorn = loadImage("unicorn.png");

}

void draw() {
  background(rainbow);
  
  if (mousePressed){ 
image (unicorn, mouseX- 180, mouseY - 150); }
}
