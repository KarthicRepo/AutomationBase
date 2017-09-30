package myTests;

import utilities.XLSReader;

public class TestngFileGenerator {
	/*
	 * Will create a TestNG xml file dynamically from an excel data//.
	 */
	public static void main(String[] args) {
		XLSReader suite = new XLSReader("src/main/resources/Test.xlsx");
		suite.getTests("select * from TestCase where module='index'");
	}

}
