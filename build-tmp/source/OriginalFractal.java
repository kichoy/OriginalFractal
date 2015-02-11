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

public int count = 0;
public void draw()
{
	background(100, 5);
	recursiveSquareBox(width/2, height/2, sizeFractal, count); 
	sizeFractal += 10;
	count++;

	//resets sizeFractal to conserve memory
	if (sizeFractal >= 2*width)
	{
		sizeFractal = detail*15;
	}

	println("count: "+count);
}

public void mouseClicked() //reset when clicked
{
	sizeFractal = detail*15;
}

public void recursiveSquareBox(int x, int y, int len, int colorChange) //recursive func to draw recursiveSquareBox
{
	int colorNew = (int)(sin(colorChange)*255);
	fill(colorNew, colorNew, colorNew); //fill color changes periodically
	strokeWeight(1);
	rect(x-len/2, y-len/2, len, len); //draws square centered with h/w of len
	len = len/2;

	println("colorNew: "+colorNew);

	// recursive call
	if (len > detail)
	{
		recursiveSquareBox(x, y, len, colorNew);
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
