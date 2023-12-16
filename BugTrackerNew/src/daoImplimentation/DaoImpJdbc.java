package daoImplimentation;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

import daoInterface.DaoIntf;
import model.User;
import model.UserTypeEnum;



public class DaoImpJdbc implements DaoIntf {
	
	private Set<User> usrSet;
	
	public DaoImpJdbc() {
		// TODO Auto-generated constructor stub
		usrSet = new HashSet<>();
	}
	
	@Override
	public void saveUser(User u) {
		
		Connection con = JdbcConnection.getConnection();
		
		  if(con!=null)
		  {
			  //('U1190','Suman','suman@xyz.com','tester')
				String qry = "insert into sysuser values (?,?,?,?)";
				
				try(PreparedStatement p = con.prepareStatement(qry))
				{
					p.setString(1,u.getUserId());
					p.setString(2, u.getUserName());
					p.setString(3,u.getUserEmail());
					
					int count = p.executeUpdate();
					System.out.println("inserted "+count+" no of rows");
					
					this.usrSet.add(u);
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
				finally
				{
					JdbcConnection.closeConnection(con);
				}
		  }
		  else
		  {
			  System.out.println("conn is null in saveUser");
		  }
		
	}

	@Override
	public User getUserById(String id) {
		Connection con = JdbcConnection.getConnection();
		
		  if(con!=null)
		  {
			  	usrSet = new HashSet<>();

				String qry1 = "select user_type from sysuser where userId = ?";
				
				try(PreparedStatement p = con.prepareStatement(qry1))
				{
					p.setString(1,id);
					
					ResultSet rs = p.executeQuery();
					
					String userType = "";
					while(rs.next()) {	
						userType = rs.getString(1);
					}
					
					String table = "";
					switch(userType) 
					{
						case "Developer":
							table = "DEVELOPER";
							break;
						case "Tester":
							table = "TESTER";
							break;
						case "ProjectManager":
							table = "PROJECTMANAGER";
							break;
						default:
							//RAISE exception
							table = "Invalid Table Name";
					}
					String qry2 = "select * from ? where userId = ?";
					
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
				finally
				{
					JdbcConnection.closeConnection(con);
				}
		  }
		  else
		  {
			  System.out.println("conn is null in saveUser");
		  }
	}

	@Override
	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}



}