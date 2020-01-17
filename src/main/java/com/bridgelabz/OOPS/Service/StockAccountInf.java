package com.bridgelabz.OOPS.Service;

import java.io.IOException;

import org.json.simple.parser.ParseException;

public interface StockAccountInf {
	void createUser() throws IOException, ParseException;
	void buyShare() throws IOException, ParseException ;
	void sellShare() throws Throwable;
}
