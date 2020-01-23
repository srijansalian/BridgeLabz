package com.bridgelabz.designpattern.structural.facadedesignpattern;

import java.sql.Connection;

public class FacadeHelper {
	private FacadeHelper() {
	}

	public static enum DBtypes {
		MYSQL,ORACLE;
	}

	public static enum DBreport {
		HTML,PDF;
	}

	public static void generateReport(DBtypes dbtypes, DBreport dbreport, String tableName) {
		Connection con = null;
		switch (dbtypes) {

		case MYSQL:
			con = MySql.getMySqlDBConnection();
			MySql mySqlHelper = new MySql();
			switch (dbreport) {
			case HTML:
				mySqlHelper.generateMySqlHTMLReport(tableName, con);
				break;
			case PDF:
				mySqlHelper.generateMySqlPDFReport(tableName, con);
				break;
			}
			break;

		case ORACLE:
			con = MyOracle.getOracleDBConnection();
			MyOracle oracleHelper = new MyOracle();
			switch (dbreport) {
			case HTML:
				oracleHelper.generateOracleHTMLReport(tableName, con);
				break;
			case PDF:
				oracleHelper.generateOraclePDFReport(tableName, con);
				break;
			}
			break;
		
		}
	}

}
