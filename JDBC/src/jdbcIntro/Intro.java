package jdbcIntro;

public class Intro {
	
	public static void main(String[] args)
	{
		System.out.println("JDBC Introduction");				
	}
}


//JDBC

//JDBC is an API(Application Programming interface) which makes connectivity with database.

/** API means Collection of predefine classes,methods and interface */

/*
 * Ex.Collection - It is an API which manage group of object
 * 
 * Java use JDBC to connect with RDBMS\
 * 
 * JDBC can interact with 27 RDBMS (Oracle, Mysql, SQLServer, POstgreSQL, SQL Lite, Maria DB , Derby)
 * 
 * EveryApplication use API for DB connection
 * 
 * Java-JDBC
 * Python-PDBC
 * .Net-ADO.net
 * C/C++ -Pro c compiler
 * 

 */


// Database

/* data- information
 * 
 *  database- collection of inter-related/meaningful data
 *  
 *  How database keep data?
 *  RDBMS- In form of table
 *  MongoDB- in form of JSON
 *  
 *  
 *  In relational DB-
 *  Table-relation/entity
 *  Row- Tuple/Record
 *  Column-Attribute/Field
 *  
 *  
 *   DB [inside DB we have tables[inside table we have data]]
 *  
 *  
 *  */

// How JDBC makes connectivity with database?


/*
 * JDBC use driver for connectivity,
 * 
 * When we install DB, we didn't get the driver We have to manually download the driver(in jar )from internet
 * based on our database.
 * 
 * BUt only oracle gives this facility ,when we install oracle db, we get driver inside jdbc folder in the form of jar.
 * 
 * If we will install mysql , then we will have to download driver manually from internet.
 * 
 * 
 * inside java.sql - we have DriverManager class which manages all drivers
 * 
 * 
 */



// we have 4 type of drivers , but in some  drivers there are some drawbacks

/*
 * 1. Type 1 driver -OdbcJDBCBrigdeDriver ---works only on windows and it use c lang to store data in DB
 * 										 ---platform issues and speed issue
 * 
 * 
 * 
 * 2 Type 2 driver(Partly Java Driver) - in this some code is written  in C and C++ some in java.
 * 				---- First java converts into c++ then oracle (speed issue)
 * 
 * 
 * 3.Type 3 -Network driver-- As name indicates this driver is installed on 
 * 							middleware server and via that all comm takes place.--speed slow
 * 
 * 
 * Type 4-Thin driver/ Pure Java Driver/ Vender Specific Driver---------ye driver java lang me hi bna h
 * 
 */


//Drivers Which we use

/** these drivers are called vender specific driver, because company are creating to connect with their db.
 * 
 * 
* 
*  oracle - OracleDriver (available when we install oracle) created by oracle company using java language.
* 
*  mysql-  mysql-connector-java-5.1.23-bin.jar.(manually download from Internet) 
*  			created by sql company using java language.
*  
*  
*  SQL server- SQL server-- Driver created by Microsoft company using java language.
*  
*  
*  
*  PostgreSQL JDBC driver jars like postgresql-9.4-1201.jdbc41.jar,
*  
*  
*  
*  When we download drivers , it comes in form of jar.
*  
*  */


//How vender specific driver works?

/*
 * It store values in DB by converting java into oracle datatype.
 * 
 * String ---varchar2
 *  int-----Number
 */







