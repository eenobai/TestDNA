class TestDNA {
	
	String textDNA;
	
	
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
	  TestDNA dna1 = new TestDNA("ATGCGATACGCTTGA");
    System.out.println(dna1.proteinDetector());
  }

}