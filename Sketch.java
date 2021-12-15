import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }
  float houseX = random(0,width);
  float houseY = random(0,height);
  float l1X = random(0,width);
  float l1Y = random(0,height);
  float l2X = random(0,width);
  float l2Y = random(0,height);
  float l3X = random(0,width);
  float l3Y = random(0,height);
  float l4X = random(0,width);
  float l4Y = random(0,height);
  float r1X = random(0,width);
  float r1Y = random(0,height);
  float r2X = random(0,width);
  float r2Y = random(0,height);
  float e1X = random(0,width);
  float e1Y = random(0,height);
  float e2X = random(0,width);
  float e2Y = random(0,height);
  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(22, 15, 73);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    stroke(0);
    line(l1X,l1X,l1Y,l1Y);  

    stroke(0);
    line(l2X,l2X,l2Y,l2Y);
    
    stroke(0);
    line(l3X,l3X,l3Y,l3Y);
    
    stroke(0);
    line(l4X,l4X,l4Y,l4Y);
    
    fill(0,0,0);
    rect(width - width,height/50*39,width,height/50*110);
    
    fill(255, 0, 0);
    rect(houseX,houseY,width/50*20,height/50*20);
    
    fill(165,42,42);
    rect(r1X,r1Y,width/50*4,height/50*17);
    
    fill(0,255,0);
    ellipse(e1X,e1Y,width/50*7,height/50*7);
    
    fill(165,42,42);
    rect(r2X,r2Y,width/50*4,height/50*7);
    
    fill(0,0,255);
    ellipse(e2X,e2Y,width/50,height/50);
    
  }
  
  // define other methods down here.
}