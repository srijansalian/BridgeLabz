package com.bridgelabz.DesignPattern.Structural.facadedesignpattern;

import java.sql.Connection;

public class MySql {

	public static Connection getMySqlDBConnection() {
		// get MySql DB connection using connection parameters
		return null;
	}

	public void generateMySqlPDFReport(String tableName, Connection con) {
		// get data from table and generate pdf report
		System.out.println("IAM PDF");
	}

	public void generateMySqlHTMLReport(String tableName, Connection con) {
		// get data from table and generate pdf report
		System.out.println("IAM HTML");
	}
}
