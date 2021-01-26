/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package New;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DataBase {
    String username;
    String password;
    Connection con;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
    String driver="net.ucanaccess.jdbc.UcanaccessDriver";
    String db="jdbc:ucanaccess://G:\\signUp.accdb";
    int i=0;
    public void call()
    {
        System.out.println(this.getUse());
        System.out.println(password);
    }
    public void setUser(String na)
    {
        username=na;
        //return username;
    }
    public String getUse()
    {
        return username;
    }
    public void setPas(String na)
    {
        password=na;
        //return username;
    }
    public void connect(){
        try {
            
            Class.forName(driver);
            con=DriverManager.getConnection(db);
            st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String sql="select * from signUp";
            rs=st.executeQuery(sql);
            System.out.println("connect");
            
            /*while(rs.next())
            {
            String fName=rs.getString("Fname");
            String lName=rs.getString("Lname");
            String age=rs.getString("age");
            System.out.println(fName+"  "+lName+"  "+age);
            }*/
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void sign(String re,String pas)
    {
         try{
            Class.forName(driver);
            con=DriverManager.getConnection(db);
            st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String sql="select * from signUp";
            rs=st.executeQuery(sql);
            rs.moveToInsertRow();
            rs.updateString("UserName",re);
            rs.updateString("Password",pas);
            rs.insertRow();
            rs.close();
            pst.close();
            st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            //String sql="select * from signUp";
            rs=st.executeQuery(sql);
            //rs.next();
            /* re.setText(rs.getString("UserName"));
            re_pass.setText(rs.getString("Password"));*/
        }catch(Exception e)
        {
            
        }
        JOptionPane.showMessageDialog(null,"Successfull to Sign Up");
    }
    public void login(String re,String pas)
    {
        try
        {
            String sql="select * from signUp where UserName='"+re+"' and Password='"+pas+"'";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
                {
                    JOptionPane.showMessageDialog(null, "You are Login");
                    username=re;
                    password=pas;
                    
                    
                     File f=new File("abc.txt");
		FileOutputStream fout;
		fout=new FileOutputStream("abc.txt");
		String name=re;
		char ch[]=name.toCharArray();
		for (int i=0;i<name.length();i++) 
		{
			fout.write(ch[i]);
		}
		fout.close();
                
                
                    
                    
                    
                    i=1;
                }
            else
                {
                    JOptionPane.showMessageDialog(null, "Invilad Username ,password","ERROR",JOptionPane.ERROR_MESSAGE);
                    i=0;
                }
        } catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     public void changePas(String re,String pas)
    {
        try
        {
            String driver="net.ucanaccess.jdbc.UcanaccessDriver";
            String db="jdbc:ucanaccess://G:\\signUp.accdb";
            Class.forName(driver);
            con=DriverManager.getConnection(db);
            st=con.createStatement();
            
            
            String sql="select * from signUp where UserName='"+re+"' and Password='"+pas+"'";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery(sql);
            int count=0;
            while(rs.next())
            {
                count++;
            }

            if(count==1)
                {
                    JOptionPane.showMessageDialog(null, "You are Login");
                }
            else if(count>0)
                {
                    JOptionPane.showMessageDialog(null, "Duplicate User, access");
                }
            else
                {
                    JOptionPane.showMessageDialog(null, "Invilad Old Registration ,password");
                }
        } catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
}
     public void update(String pas)
    {
        try {
            //String url1="insert into signUp values('"+re+"','"+pas+"')";
            //st.executeUpdate(url1);
            rs.updateString("UserName", this.username);
            rs.updateString("Password", pas);
            
            rs.updateRow();
            
            
            JOptionPane.showMessageDialog(null, "Your are Successfull to Change password");
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
