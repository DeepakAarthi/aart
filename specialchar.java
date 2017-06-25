package specialchar;

public class specialchar {

	public static void main(String[] args) {
	char at='2';
	if(at>='A'&&at<='Z'||at>='a'&&at<='z')
	{
		System.out.println("alphabets");
	}
	else if(at>='0'&&at<='9')
	{
		System.out.println("digits");
	}
	else{
		System.out.println("Special characters");
	}
	}

	
}
