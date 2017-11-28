package com.sahil.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringEndExtract {
 public static void main(String args[]){
	 String str="JobName1";
	 String str5=".*MEGA.Error.0x80020008.*";
	 String str2=".*A SQL error occurred while trying to populate the java object:.*";
	 Pattern p = Pattern.compile(str5);
	 String match="Failed to open the MEGA Session: MEGA Error 0x80020009(MegaDatabase.Open) : User Private Session is already Connected";
	 String match2="A SQL error occurred while trying to populate the java object: [Simba][ImpalaJDBCDriver](500051) ERROR processing query/statement. Error Code: 0, SQL state: TStatus(statusCode:ERROR_STATUS, sqlState:HY000, errorMessage:AnalysisException: Could not resolve column/field reference: 'cmdb_ci.attributes'";
	 Matcher match3 = p.matcher(match);
	 System.out.println(match3.matches());
	 
 }
}
