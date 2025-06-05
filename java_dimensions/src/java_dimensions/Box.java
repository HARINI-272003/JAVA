package java_dimensions;

public class Box {
	
	int height;
	int width;
	int length;

	//constructor to initialize the dimensions of the box
	public Box(int height,int width,int length)
	{
		this.length=length;
		this.height=height;
		this.width=width;
	}
	
	// Method to calculate the volume of the box
    public int calculateVolume() 
    {
        return length * width * height;  // Volume formula: length * width * height
    }
    
	public static void main(String[] args) 
	{
		Box myBox=new Box(5,5,7);

        // Calculate and print the volume of the box
        int volume = myBox.calculateVolume();
        System.out.println("The volume of the box is: " + volume);

	}

}
