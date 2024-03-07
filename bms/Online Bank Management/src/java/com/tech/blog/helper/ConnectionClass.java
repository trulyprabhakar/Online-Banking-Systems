package com.tech.blog.helper;

import java.sql.*;
public class ConnectionClass 
{
    Connection cn;
    public Statement stm;
    public ConnectionClass()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Sudeepta2004");
			stm=cn.createStatement();
                        if(cn.isClosed())
                        {
                            System.out.println("y");
                        }
                        else
                        {
                            System.out.println("n");
                        }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String s[])
	{
		new ConnectionClass();
	}
}
