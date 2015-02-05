//drawing parameters
public int detail = 30; //makes fractal more 'detailed' by recursive func
public int sizeSier = detail*10;


public void setup()
{
	background(100, 5);
	size(sizeSier+sizeSier/4, sizeSier+sizeSier/4); //fits the fractal
}

public int count = 5;
public void draw()
{
	recursiveSquareBox(sizeSier/8, sizeSier/8, sizeSier);
}

public void mouseMoved() 
{
	// sizeSier++;
	// detail = mouseX;
}

public void recursiveSquareBox(int x, int y, int len) //recursive func to draw recursiveSquareBox
{
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


	len = len/2;
	x = x + len/4;
	y = y + len/4;

	fill(255, 255, 255);
	strokeWeight(1);
	rect(x, y, len, len);
	if (len > detail)
	{
		recursiveSquareBox(x, y, len);
	}
}