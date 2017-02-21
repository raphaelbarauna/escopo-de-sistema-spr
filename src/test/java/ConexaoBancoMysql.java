


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.softplan.projeto.Boot;
import br.com.softplan.projeto.domain.Usuario;
import br.com.softplan.projeto.repositories.UsuarioRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Boot.class)
public class ConexaoBancoMysql
{
	
	@Autowired
	private UsuarioRepository usuarioRepository;


  
@Test
public void main2()
{
	try
	  {  
	
  	Usuario user = new Usuario();  
  	
    user.setNome("Raphael");
    user.setEmail("Rafael_barauna@hotmail.com");
    user.setSenha("teste");
    user.setTelefone("33744400");
    
    Date data = new Date();
    user.setAniversario(data);
    System.out.println(user);  
    
    this.usuarioRepository.save(user);
  	
  	System.out.println(user);
	  }
	  catch (Exception e)
	  {
	    System.err.println("Got an exception! ");
	    System.err.println(e.getMessage());
	  }
}


public void main()
{
  try
  {

    // create our mysql database connection
    String myDriver = "org.gjt.mm.mysql.Driver";
    String myUrl = "jdbc:mysql://10.11.0.91:3306/teste";
    Class.forName(myDriver);
    //Connection conn = DriverManager.getConnection(myUrl, "seinfra", "S!Tminhoca6116");
    Connection conn = DriverManager.getConnection(myUrl, "rafael", "0405");
    if(conn != null){
  	  System.out.println("Conexão realizada");
    }
    // our SQL SELECT query. 
    // if you only need a few columns, specify them by name instead of using "*"
    String query = "SELECT * FROM tb_usuario";

    // create the java statement
    Statement st = conn.createStatement();
    
    // execute the query, and get a java resultset
    ResultSet rs = st.executeQuery(query);
    
    // iterate through the java resultset
    while (rs.next())
    {
      //int id = rs.getInt("id");
      String nome = rs.getString("nome");
      /*String lastName = rs.getString("last_name");
      Date dateCreated = rs.getDate("date_created");
      boolean isAdmin = rs.getBoolean("is_admin");
      int numPoints = rs.getInt("num_points");*/
      
      // print the results
      System.out.println(/*"Codigo:" + id+"- "*/ " Nome:"+ nome);
    }
    st.close();
  }
  catch (Exception e)
  {
    System.err.println("Got an exception! ");
    System.err.println(e.getMessage());
  }
}
}