package com.bridgelabz.DesignPattern.Structural.facadedesignpattern;

import java.sql.Connection;

public class MyOracle {
	public static Connection getOracleDBConnection() {
		// get Oracle DB connection using connection parameters
		return null;
	}

	public void generateOraclePDFReport(String tableName, Connection con) {
		// get data from table and generate pdf report
		System.out.println("IAM PDF");
	}

	public void generateOracleHTMLReport(String tableName, Connection con) {
		// get data from table and generate pdf report
		System.out.println("IAM HTML");
	}

}
