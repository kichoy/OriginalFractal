//drawing parameters
public int detail = 30; //makes triangle more 'detailed' by recursive func
public int sizeSier = detail*10;


public void setup()
{
	background(100, 5);
	size(sizeSier+sizeSier/4, sizeSier+sizeSier/4); //fits the triangle
}

public int count = 5;
public void draw()
{
	recursiveSquareBox(sizeSier/8, sizeSier+sizeSier/8, sizeSier);
}

public void mouseMoved()//optional
{
	//sizeSier++;
	detail = mouseX/2;
}

public void recursiveSquareBox(int x, int y, int len) //recursive func to draw recursiveSquareBox triangle
{
	if (len > detail)
	{
		recursiveSquareBox(x, y, len/2);
		recursiveSquareBox(x+len/2, y, len/2);
		recursiveSquareBox(x+len/4, y-len/2, len/2);
	}
	else 
	{
		strokeWeight(1);
		rect(x, y, len, len);
	}
}