package javaOOPs;



//this whole secret class is being used  to hide data
class secret
{
	//making the data private to access only inside class
	private int data;
	//to set the data
	public void setdata(int data) {
		//this.data is actually the private int data which is being equal to the 
		//functiont setdata(int data)
		//basically the if is used to validate that the input is always above 100 & not below it
		
		if(data>100)
		this.data = data;
		
	}

//to print the data 
public int getdata()
{
	return data;
}

}

public class learnEncapsulation {

public static void main(String[] args) {
		
		secret obj = new secret();
		//obj.data  = 4;
		obj.setdata(103);
		//the below when you execute by commenting the if statement it gives the output 4
		//but when we uncomment the if statement & execute the program it wont give the value 4 instead it will 
		//print 103
		//obj.setdata(4);
		System.out.println(obj.getdata());
	}

}

