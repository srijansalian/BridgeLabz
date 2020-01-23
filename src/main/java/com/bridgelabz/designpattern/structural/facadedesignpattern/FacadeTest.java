package com.bridgelabz.designpattern.structural.facadedesignpattern;

import java.sql.Connection;

public class FacadeTest {

	public static void main(String[] args) {
		String tableName = "Employee";

		// generating MySql HTML report and Oracle PDF report without using Facade
		Connection con = MySql.getMySqlDBConnection();
		MySql mySqlHelper = new MySql();
		mySqlHelper.generateMySqlHTMLReport(tableName, con);

		Connection con1 = MyOracle.getOracleDBConnection();
		MyOracle oracleHelper = new MyOracle();
		oracleHelper.generateOraclePDFReport(tableName, con1);

		// generating MySql HTML report and Oracle PDF report using Facade
		FacadeHelper.generateReport(FacadeHelper.DBtypes.MYSQL, FacadeHelper.DBreport.HTML, tableName);
		FacadeHelper.generateReport(FacadeHelper.DBtypes.ORACLE, FacadeHelper.DBreport.PDF, tableName);
	}

}
