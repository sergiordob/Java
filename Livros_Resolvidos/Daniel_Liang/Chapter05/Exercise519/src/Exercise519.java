public class Exercise519
{
    public static void main (String[] args)
    {
        for(int i = 0, spaces = 7; i < 8; i++, spaces--) {
		String line = "";
		int start = 1;
			int num = 1;


			//left side
			for(int s = spaces; s > 0; s--){
				line += "    ";

			}

			while(start <= i) {
				line += num + " ";
				if(num > 70) line += " " + num;
				else{
				line += (num < 10) ? "   " + num : "  " + num;}
				start++;
				num += num;

			}

			while(start >= 1) {
				line += num + " ";
				if(num > 70) line += " " + num;
				else {
					line += (num < 10) ? "   " + num : "  " + num;
				}
				start--;
    			num /= 2;
			}
			System.out.printf("start: " + start + ", num = " + num + "      %21s\n", line);
			System.out.println(line);
		}
    }
}
