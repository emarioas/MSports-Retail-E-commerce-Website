/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marioasmal
 */

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class JDBCLect {
	
	JDBCLect connect1=null;
	
	Connection c1=null;
	
	
	
	
	public void connectDB() {
				connect1=new JDBCLect();
		 		
			try {
				c1=connect1.getConnection();
				System.out.println("Connection to SQLite has been established.");
				//c1.close();
			}catch (SQLException e) {
				System.out.println(e.getMessage());
			}
	}
	
		public void insertBrands(int brandId,String name ) {	
				
			try {
				
				String query="INSERT INTO Brands (BrandId,Name) "+
						"Values	("+brandId+ ",' "+name+"')";
				Connection c1=connect1.getConnection();
				Statement s1=c1.createStatement();
				int rowcount=s1.executeUpdate(query);
			}catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
                
                
                public void insertRegistration(int userId,String Username,String Password,String Email, String firsName,String lastName,String Address, String Phone ) {	
				
			try {
				
				String query="INSERT INTO user(userId,Username,Password,Email,firsName,lastName,Address,Phone) values('"+userId+ "',' "+Username+ "',' "+Password+"','"+Email+"','"+firsName+"','"+lastName+"','"+Address+"','"+Phone+"')";
				Connection c1=connect1.getConnection();
				Statement s1=c1.createStatement();
				int rowcount=s1.executeUpdate(query);
			}catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		
		public void insertCatogories(int id,String name ) {	
			
			try {
				
				String query="INSERT INTO Category (CategoryId,Name) "+
						"Values	("+id+ ",' "+name+"')";
				Connection c1=connect1.getConnection();
				Statement s1=c1.createStatement();
				int rowcount=s1.executeUpdate(query);
			}catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		
		
	public void insertProduct(int id,String description, String name, double price, int categoryId, int brandId, byte[] image ) {	
			
			
            
                    try {
				
				String query="INSERT INTO Products(ProductId,Description,Name,Price,CategoryId,BrandId,image) "+
						"Values	("+id+ ",' "+description+ "',' "+name+"',"+price+","+categoryId+","+brandId+",'"+image+"')";
				Connection c1=connect1.getConnection();
				Statement s1=c1.createStatement();
				int rowcount=s1.executeUpdate(query);
			}catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	
	
	public ArrayList<Product> getData(String word) {	
		
		ArrayList<Product> list = new ArrayList<Product>();
		try {
			Connection c1=connect1.getConnection();
			Statement s1=c1.createStatement();
			ResultSet rs=s1.executeQuery("select p.ProductId,p.name,p.description,p.price,c.name,b.name,p.image \t"+
					"from Products p,Category c,Brands b \t " + 
					"where  p.CategoryId=c.CategoryId \t" + 
					"and    p.BrandId=b.BrandId  " +
                                         "and b.Name LIKE '%"+word+"%'" );
			
			Product p ;
                       
			while (rs.next()) {
				p=new Product(
                                                  rs.getInt(1),
		                		  rs.getString(2), 
		                		  rs.getString(3) , 
		                		  rs.getDouble(4),
		                		  rs.getString(5),
		                		  rs.getString(6),
		                		  rs.getString(7)
		                	);
				
				list.add(p);
		                		  
               		
                		
            }
			c1.close();
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	return list;
	}
        
        
        public ArrayList<Product> getDataByCategory(String word) {	
		
	
		ArrayList<Product> list = new ArrayList<Product>();
		try {
			Connection c1=connect1.getConnection();
			Statement s1=c1.createStatement();
			ResultSet rs=s1.executeQuery("select p.ProductId,p.name,p.description,p.price,c.name,b.name,p.image \t"+
					"from Products p,Category c,Brands b \t " + 
					"where  p.CategoryId=c.CategoryId \t" + 
					"and    p.BrandId=b.BrandId  " +
                                         "and c.Name LIKE '%"+word+"%'" );
			
			Product p ;
			while (rs.next()) {
				p=new Product(
                                                  rs.getInt(1),
		                		  rs.getString(2), 
		                		  rs.getString(3) , 
		                		  rs.getDouble(4),
		                		  rs.getString(5),
		                		  rs.getString(6),
		                		  rs.getString(7)
		                	);
				
				
				list.add(p);
		                		  
               		
                		
            }
			c1.close();
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	return list;
	}
        
        
         public Vector getDataCartRegister() {	
		
		Vector vct= new Vector();
		try {
			Connection c1=connect1.getConnection();
			Statement s1=c1.createStatement();
			ResultSet rs=s1.executeQuery("select ProductId from CartRegister "  );
		
			while (rs.next()) {
				
                                                 vct.add( rs.getInt(1));
		                		  
                		
            }
			c1.close();
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	return vct;
	}
        
        public ArrayList<Product> getDataDescription(int id) {	
		
		
	
		ArrayList<Product> list = new ArrayList<Product>();
		try {
			Connection c1=connect1.getConnection();
			Statement s1=c1.createStatement();
			ResultSet rs=s1.executeQuery("select p.ProductId,p.name,p.description,p.price,c.name,b.name,p.image \t"+
					"from Products p,Category c,Brands b \t " + 
					"where  p.CategoryId=c.CategoryId \t" + 
					"and    p.BrandId=b.BrandId  \t" +
					 "and p.ProductId="+id );
			
			Product p ;
			while (rs.next()) {
				p=new Product(
                                                  rs.getInt(1),
		                		  rs.getString(2), 
		                		  rs.getString(3) , 
		                		  rs.getDouble(4),
		                		  rs.getString(5),
		                		  rs.getString(6),
		                		  rs.getString(7)
		                	);
				
				
				list.add(p);
		                		  
               		
                		
            }
			c1.close();
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	return list;
	}

        
        
        public Product getProductById(int id) {	
		
		Product p =null;
		try {
			Connection c1=connect1.getConnection();
			Statement s1=c1.createStatement();
			ResultSet rs=s1.executeQuery("select p.ProductId,p.name,c.name,p.price,b.name \t"+
					"from Products p,Category c,Brands b \t " + 
					"where  p.CategoryId=c.CategoryId \t" + 
					"and    p.BrandId=b.BrandId  \t" +
					 "and p.ProductId="+id );
			
			
			while (rs.next()) {
				p=new Product(
                                                  rs.getInt(1),
		                		  rs.getString(2), 
		                		  rs.getString(3) , 
		                		  rs.getDouble(4),
		                		  rs.getString(5),
                                                  null,
                                                  null
		                		 
		                		  
		                	);
				
				
		                		  
               		
                		
            }
			c1.close();
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	return p;
	}

        

        
        
        
        

public void insertCartRegister(int productId){

    
    try {
			String query="INSERT INTO CartRegister (ProductId)"+
					"Values	("+productId+")";
			Connection c1=connect1.getConnection();
			Statement s1=c1.createStatement();
			int rowcount=s1.executeUpdate(query);
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
    
    

}


public void DeleteCartRegister(){

    
    try {
			String query="DELETE FROM CartRegister ";
					
			Connection c1=connect1.getConnection();
			Statement s1=c1.createStatement();
			int rowcount=s1.executeUpdate(query);
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
    
    

}



public void insertOrder(int orderId, String address,String name,int paymentId, int userId){

    
    try {
			String query="INSERT INTO Orders (OrderId,Address,Name,PaymentId, userId )"+
					"Values	("+orderId+ ",' "+address+ "',' "+name+"',"+paymentId+","+userId+")";
			Connection c1=connect1.getConnection();
			Statement s1=c1.createStatement();
			int rowcount=s1.executeUpdate(query);
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
    
    

}


public void insertPayment(int paymentId, String ccv, String cardExpire,String cardNumber, double total){

    
    try {
			String query="INSERT INTO Payment(PaymentId,CCV,CardExpiry,CardNumber,Total )"+
					"Values	("+paymentId+ ",' "+ccv+ "',' "+cardExpire+"',' "+cardNumber+"',"+total+")";
			Connection c1=connect1.getConnection();
			Statement s1=c1.createStatement();
			int rowcount=s1.executeUpdate(query);
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
    
    

}


public int payementId() {	
		
		
	int id=0;
	try {
			Connection c1=connect1.getConnection();
			Statement s1=c1.createStatement();
			ResultSet rs=s1.executeQuery("select MAX(PaymentId)from Payment");
			while (rs.next()) {
                        id=rs.getInt(1); 
                		
                		
                		
            }
			c1.close();
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	return id;
	}



public int UserId(String email) {	
		
		
	int id=0;
	try {
			Connection c1=connect1.getConnection();
			Statement s1=c1.createStatement();
			ResultSet rs=s1.executeQuery("select  userId from user where Username='"+email+"'");
			while (rs.next()) {
                        id=rs.getInt(1); 
                		
                		
                		
            }
			c1.close();
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	return id;
	}


public String UserName(int id) {	
		
		
	String name="";
	try {
			Connection c1=connect1.getConnection();
			Statement s1=c1.createStatement();
			ResultSet rs=s1.executeQuery("select  Username from user where userId="+id+"");
			while (rs.next()) {
                        name=rs.getString(1); 
                		
                		
                		
            }
			c1.close();
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	return name;
	}



public int OrderId() {	
		
		
	int id=0;
	try {
			Connection c1=connect1.getConnection();
			Statement s1=c1.createStatement();
			ResultSet rs=s1.executeQuery("select MAX(OrderId) from Orders");
			while (rs.next()) {
                        id=rs.getInt(1); 
                		
                		
                		
            }
			c1.close();
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	return id;
	}


public Vector SearchProductbyWord(String word) {	
		
		
	Vector vct= new Vector();
	try {
			Connection c1=connect1.getConnection();
			Statement s1=c1.createStatement();
			ResultSet rs=s1.executeQuery("select p.ProductId,p.name,p.description,p.price,c.name,b.name,p.image \t"+
					"from Products p,Category c,Brands b \t " + 
					"where  p.CategoryId=c.CategoryId \t" + 
					"and    p.BrandId=b.BrandId  \t" +
					 "and b.name LIKE '%"+word+"%'" );
			while (rs.next()) {
                        vct.add(rs.getString(1)); 
                		vct.add(rs.getString(2) ); 
                		vct.add(rs.getString(4) ); 
                		vct.add(rs.getString(6));
                		vct.add(rs.getString(7));
                		
                		
            }
			c1.close();
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	return vct;
	}
		


public int extract(String username, String password){
    
            String str="";
      
   try {
			Connection c1=connect1.getConnection();
			Statement s1=c1.createStatement();
			System.out.println("select Username,Password from user where Username='"+username+"' and Password='"+password+"'");
			
                        ResultSet rs=s1.executeQuery("select Username,Password from user where Username='"+username+"' and Password='"+password+"'");
			
			
			while (rs.next()) {
				
                                               
		                str= rs.getString(1);
                		
            }
			c1.close();
                      
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
     if(str.equals("")){
                            return 0;
                        }else return 1;
}
	
	public byte[] InsertImage(String filepath){
            
            byte[] person_image=null;
            
            try {
                
                
                File image = new File(filepath);
                FileInputStream fis=new FileInputStream(image);
                
                
                ByteArrayOutputStream bos= new ByteArrayOutputStream();
                byte[] buf =new byte[1024];
                for(int redNum;(redNum=fis.read(buf))!=-1;){
                    bos.write(buf,0,redNum);
                }
                
                person_image=bos.toByteArray();
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
                
            }
            
            
           return person_image;
        
        }
        	
	private Connection getConnection() throws SQLException {
		String dbUrl="jdbc:sqlite:C:\\Users\\manth\\Downloads\\SQLiteStudio-3.2.1\\SQLiteStudio/JDBCLect";
		Connection connection=DriverManager.getConnection(dbUrl);
		return connection;
	}
	
}