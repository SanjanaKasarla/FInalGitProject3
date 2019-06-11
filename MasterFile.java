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