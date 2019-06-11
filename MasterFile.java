<<<<<<< HEAD
public class MasterFile {
    public MasterFile() {
        PerfSquare function = (num) ->
        {
            double sr = Math.sqrt(num);
            if((sr)-(int)(sr) == 0)
                return true;
            
            return false;
        };
        
        System.out.println(function.perfSquare(25));
        System.out.println(function.perfSquare(24));
        
        //Sanjana - I learned what lambda functions were and how to make them. I also learned how to push and pull files and how GitKraken works and how it is much more efficient and easier when working with partners
        
        Quotient func = (numOne, numTwo) -> {
            float q = numOne/numTwo;
            System.out.printf("%f%n", q);
        };
        
        func.quotient(7.2f, 5.4f);
        
        //Nehal - I learned what it mean to push and pull files from the local server to the remote server. This was important to understand how to transfer files from one computer to another and will be helpful when working on group projects
    }
    
    public static void main (String [] args) {
        MasterFile app = new MasterFile();
    }
}

=======
public class MasterFile {
	public MasterFile() {
		PerfSquare function = (num) ->
		{
			double sr = Math.sqrt(num);
			if((sr)-(int)(sr) == 0)
				return true;

				return false;
		};

		System.out.println(function.perfSquare(25));
		System.out.println(function.perfSquare(24));

		//Sanjana - I learned what lambda functions were and how to make them. I also learned how to push and pull files and how GitKraken works and how it is much more efficient and easier when working with partners
	}

	public static void main (String [] args) {
		MasterFile app = new MasterFile();
	}
}
>>>>>>> Comments_Sanjana
