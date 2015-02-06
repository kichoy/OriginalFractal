import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

//drawing parameters
public int detail = 30; //makes fractal more 'detailed' by recursive func
public int sizeFractal = detail*15;


public void setup()
{
	background(100, 5);
	size(sizeFractal, sizeFractal); //fits the fractal
}

public int count = 5;
public void draw()
{
	background(100, 5);
	recursiveSquareBox(0, 0, sizeFractal);
}

public void mouseMoved() 
{
	sizeFractal += 5;
	// detail = mouseX;
}

public void recursiveSquareBox(int x, int y, int len) //recursive func to draw recursiveSquareBox
{
	fill(100, 20);
	strokeWeight(1);
	rect(x, y, len, len);

	x = x + len/4;
	y = y + len/4;
	len = len/2;

	if (len > detail)
	{
		recursiveSquareBox(x, y, len);
	}

	/* method 1 */
	// if (len > detail)
	// {
	// 	recursiveSquareBox(x+len/4, y+len/4, len/2);
	// 	// recursiveSquareBox(x+len/2, y, len/2);
	// 	// recursiveSquareBox(x+len/4, y-len/2, len/2);
	// }
	// else 
	// {
	// 	fill(255, 255, 255);
	// 	strokeWeight(1);
	// 	rect(x, y, len, len);
	// }

	/* method 2 */
	// if (len < detail)
	// {

	// }
	// else 
	// {
	// 	fill(255, 255, 255);
	// 	strokeWeight(1);
	// 	rect(x, y, len, len);
	// 	recursiveSquareBox(x+len/4, y+len/4, len/2);
	// }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
