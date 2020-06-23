import java.util.Scanner;

class TestDNA {
	
	String textDNA;
	String protein;
	
	public TestDNA(String myDNA) {
		textDNA = myDNA;
	}
	
	public String proteinDetector() {
	   String protein = null;
		
		int start = textDNA.indexOf("ATG");
	    int stop = textDNA.indexOf("TGA");
	    if(start >= 0 && stop >= 0 && (stop - start) % 3 == 0) {
	    	protein = textDNA.substring(start, stop + 3);	
	    }else { protein = "protein not found";}
	    return protein;
	}
	

  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  int i = 1;
	  while(i == 1) {
	  System.out.println("Enter your DNA pattern");
	  
	  
	  TestDNA dna1 = new TestDNA(input.nextLine());
    System.out.println(dna1.proteinDetector());
	  }
  }

}
