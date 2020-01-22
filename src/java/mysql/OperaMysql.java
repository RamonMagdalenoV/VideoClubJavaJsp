package mysql;
/*@author Ramón*/
import java.sql.*;
public class OperaMysql {
    private final String server="jdbc:mysql://127.0.0.1/videoclubp";
    private final String user="root";
    private final String pass="root";
    public Connection cx;
    public Integer contador=0;
    

    public OperaMysql() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cx = DriverManager.getConnection(server,user,pass);
            
       }catch(Exception e){       
           System.out.println("ERROR EN LA CONEXION");
       }
    }
    public void addPelicula(String Titulo,String Anio,String Duracion,String Sinopsis,String Genero,String Clasificacion,Integer Cantidad)
    {
      String sentencia = "INSERT INTO peliculas"
              + " VALUES(null,'"+Titulo+"','"+Anio+"','"+Duracion+"','"+Sinopsis+"','"+Genero+"',"
              + "'"+Clasificacion+"',"+Cantidad+")";
      try{
        Statement sql = cx.createStatement();
        sql.executeUpdate(sentencia);
     
      }catch(Exception e){
        System.out.println("NO SE EJECUTO LA SENTECIA INSERT!!");
        System.out.println(sentencia);
      }
    
    }
    
    public String [][] getReg(){
         String[][] datos=null;
        String sentencia= "SELECT * FROM peliculas";
        ResultSet resultado= null;
        try {
            PreparedStatement query= 
            cx.prepareStatement(sentencia);
            resultado= query.executeQuery();
            int contador=0;
            while (resultado.next()) {
               contador++;
                
            }
            datos= new String[contador][8];
            resultado.first();
            int i=0;
            do { 
                datos[i][0]= resultado.getString(1);
                datos[i][1]= resultado.getString(2);
                datos[i][2]= resultado.getString(3);
                datos[i][3]= resultado.getString(4);
                datos[i][4]= resultado.getString(5);
                datos[i][5]= resultado.getString(6);
                datos[i][6]= resultado.getString(7);
                datos[i][7]= resultado.getString(8);
                i++;
                this.contador++;
            } while (resultado.next());
            
        } catch (Exception e) {
            System.out.println("ERROR EN EL SELECT");
        }
        
        return datos;
         
     }
         
    public void addSocio(String Nombre,String Direccion,String FechaInscripcion)
    {
      String sentencia = "INSERT INTO socios VALUES(null,'"+Nombre+"','"+Direccion+"','"+FechaInscripcion+"')";
      try{
        Statement sql = cx.createStatement();
        sql.executeUpdate(sentencia);
     
      }catch(Exception e){
        System.out.println("NO SE EJECUTO LA SENTECIA INSERT!! "+e.toString());
        System.out.println(sentencia);
      }
    
    }
    
    public String[][] getSocio(){
         String[][] datos = null;
         String sentencia = "SELECT * FROM socios";
         ResultSet resultado = null;
         try {
            PreparedStatement query = cx.prepareStatement(sentencia);
            resultado = query.executeQuery();
            int contador = 0;
            while (resultado.next()) {
               contador++;
            }
            datos = new String[contador][4];
            resultado.first();
            int i = 0;
            do { 
                datos[i][0]= resultado.getString(1);
                datos[i][1]= resultado.getString(2);
                datos[i][2]= resultado.getString(3);
                datos[i][3]= resultado.getString(4);
                
                i++;
                this.contador++;
            } while (resultado.next());
         } catch (Exception e) {
             System.out.println("NO SE EJECUTO LA SENTENCIA SELECT: "+ e.toString());
         }
         return datos;
     }
     
    public String[][] getIdSocio(String idSocio){

        String[][] datos = null;
        String sentencia = "SELECT * FROM socios WHERE idsocios ='"+idSocio+"'";
        ResultSet resultado = null;
        System.out.println(sentencia);
        try {
            PreparedStatement query = cx.prepareStatement(sentencia);
            resultado= query.executeQuery();
            int contador=0;
            while (resultado.next()) {
               contador++;
                
            }
            datos = new String[contador][5];
            resultado.first();
            int i = 0;
            do { 
                datos[i][0]= resultado.getString(1);
                datos[i][1]= resultado.getString(2);
                datos[i][2]= resultado.getString(3);
                datos[i][3]= resultado.getString(4);
                datos[i][4]= resultado.getString(5);
                i++;
                this.contador++;
            } while (resultado.next());
            
        } catch (Exception e) {
            System.out.println("ERROR EN EL SELECT: "+ e.toString());
            
        }
        return datos;
    }
    
    public String[][] getIdRenta(String idrenta){

        String[][] datos = null;
        String sentencia = "SELECT * FROM rentas WHERE idrentas ='"+idrenta+"'";
        ResultSet resultado = null;
        System.out.println(sentencia);
        try {
            PreparedStatement query = cx.prepareStatement(sentencia);
            resultado= query.executeQuery();
            int contador=0;
            while (resultado.next()) {
               contador++;
                
            }
            datos = new String[contador][9];
            resultado.first();
            int i = 0;
            do { 
                datos[i][0]= resultado.getString(1);
                datos[i][1]= resultado.getString(2);
                datos[i][2]= resultado.getString(3);
                datos[i][3]= resultado.getString(4);
                datos[i][4]= resultado.getString(5);
                datos[i][5]= resultado.getString(6);
                datos[i][6]= resultado.getString(7);
                datos[i][7]= resultado.getString(8);
                datos[i][8]= resultado.getString(9);
                i++;
                this.contador++;
            } while (resultado.next());
            
        } catch (Exception e) {
            System.out.println("ERROR EN EL SELECT: "+ e.toString());
            
        }
        return datos;
    }
     
    public String[][] UpdateSocio(String idSocio, String nombre, String direccion, String fechaInscripcion){
        String[][] datos = null;
    
        String sentecia = "UPDATE socios SET nombre ='"+nombre+"',direccion ='"+direccion+"',"
                + "fechainscripcion='"+fechaInscripcion+"' WHERE idsocios="+idSocio;
        System.out.println(sentecia);
        try{
          Statement query = cx.createStatement();
          query.executeUpdate(sentecia);
        }catch(Exception e){
            System.out.println("ERROR NO SE EJECUTO EL UPDATE:"+e.toString());
        }
        return datos;        
    }  
     
    public String[][] getPelicula(String idPelicula){

        String[][] datos=null;
        String sentencia= "SELECT * FROM peliculas WHERE idpeliculas='"+idPelicula+"'";
        ResultSet resultado= null;
        System.out.println(sentencia);
        try {
            PreparedStatement query = cx.prepareStatement(sentencia);
            resultado= query.executeQuery();
            int contador=0;
            while (resultado.next()) {
               contador++;
                
            }
            datos = new String[contador][8];
            resultado.first();
            int i = 0;
            do { 
                datos[i][0]= resultado.getString(1);
                datos[i][1]= resultado.getString(2);
                datos[i][2]= resultado.getString(3);
                datos[i][3]= resultado.getString(4);
                datos[i][4]= resultado.getString(5);
                datos[i][5]= resultado.getString(6);
                datos[i][6]= resultado.getString(7);
                datos[i][7]= resultado.getString(8);
                i++;
                this.contador++;
            } while (resultado.next());
            
        } catch (Exception e) {
            System.out.println("ERROR EN EL SELECT"+ e.toString());
            
        }
        return datos;
    }
     
    public String[][] Actualizar(String idPelicula,String Titulo,String Anio,String Duracion,String Sinopsis,String Genero,String Clasificacion,String Cantidad){
        String[][] datos = null;
    
        String sentecia = "UPDATE peliculas SET titulo ='"+Titulo+"',anio ='"+Anio+"',"
                + "duracion='"+Duracion+"',sinopsis='"+Sinopsis+"',genero='"+Genero+"',"
                + "clasificacion ='"+Clasificacion+"',cantidad ='"+Cantidad+"' WHERE idpeliculas="+idPelicula;
        System.out.println(sentecia);
        try{
          Statement query = cx.createStatement();
          query.executeUpdate(sentecia);
        }catch(Exception e){
            System.out.println("Erroor no se ejecuto sentencia UPDATE "+e.toString());
        }
        return datos;        
    }
    
    public void addRenta(String Titulo, String Clasificacion, String Cantidad, String fechaRenta, String fechaEntrega, String Recargo, String idPelicula,String Socio){
        int cant = Integer.parseInt(Cantidad);
        int id = Integer.parseInt(idPelicula);
        String sentencia = "INSERT INTO rentas VALUES"
                + "(null,'"+Titulo+"','"+Clasificacion+"',"+cant+",'"+fechaRenta+"','"+fechaEntrega+"','"+Recargo+"',"+id+",'"+Socio+"')";
      try{
        Statement sql = cx.createStatement();
        sql.executeUpdate(sentencia);
     
      }catch(Exception e){
        System.out.println("NO SE EJECUTO LA SENTECIA INSERT!!: "+e.toString());
        System.out.println(sentencia);
      }
    }
    
    public String[][] UpdateCantP(String Cantidad, String idPeliculas){
        int cant = Integer.parseInt(Cantidad);
        int idp = Integer.parseInt(idPeliculas);
        String[][] datos = null;
    
        String sentecia = "UPDATE peliculas SET cantidad = cantidad - "+cant+" WHERE idpeliculas = "+idp;
        System.out.println(sentecia);
        try{
          Statement query = cx.createStatement();
          query.executeUpdate(sentecia);
        }catch(Exception e){
            System.out.println("ERROR NO SE EJECUTO EL UPDATE: "+e.toString());
        }
        return datos;        
    }  
    
    public String[][] UpdateCantP2(String Cantidad, String idPeliculas){
        int cant = Integer.parseInt(Cantidad);
        int idp = Integer.parseInt(idPeliculas);
        String[][] datos = null;
    
        String sentecia = "UPDATE peliculas SET cantidad = cantidad + "+cant+" WHERE idpeliculas = "+idp;
        System.out.println(sentecia);
        try{
          Statement query = cx.createStatement();
          query.executeUpdate(sentecia);
        }catch(Exception e){
            System.out.println("ERROR NO SE EJECUTO EL UPDATE: "+e.toString());
        }
        return datos;        
    } 
    
    public String[][] getRenta(){
         String[][] datos = null;
         String sentencia = "SELECT * FROM rentas";
         ResultSet resultado = null;
         try {
            PreparedStatement query = cx.prepareStatement(sentencia);
            resultado = query.executeQuery();
            int contador = 0;
            while (resultado.next()) {
               contador++;
            }
            datos = new String[contador][9];
            resultado.first();
            int i = 0;
            do { 
                datos[i][0]= resultado.getString(1);
                datos[i][1]= resultado.getString(2);
                datos[i][2]= resultado.getString(3);
                datos[i][3]= resultado.getString(4);
                datos[i][4]= resultado.getString(5);
                datos[i][5]= resultado.getString(6);
                datos[i][6]= resultado.getString(7);
                datos[i][7]= resultado.getString(8);
                datos[i][8]= resultado.getString(9);
              
                i++;
                this.contador++;
            } while (resultado.next());
         } catch (Exception e) {
             System.out.println("NO SE EJECUTO LA SENTENCIA SELECT: "+ e.toString());
             System.out.println(sentencia);
             
         }
         return datos;
     }
    
    
    
    public String[][] UpdateRenta(String Titulo, String Clasificacion, String Cantidad, String fechaRenta,String fechaEntrega,String Recargo,String nombreSocio,String idRenta){
        int cant = Integer.parseInt(Cantidad);
        int idrenta = Integer.parseInt(idRenta);
        String[][] datos = null;
    
        String sentecia = "UPDATE rentas SET titulo = '"+Titulo+"', clasificacion='"+Clasificacion+"',"
           + "cantidad="+cant+",fechaRenta='"+fechaRenta+"',fechaEntrega='"+fechaEntrega+"',recargo='"+Recargo+"',nombreSocio='"+nombreSocio+"' WHERE idrentas = "+idrenta;
        System.out.println(sentecia);
        try{
          Statement query = cx.createStatement();
          query.executeUpdate(sentecia);
        }catch(Exception e){
            System.out.println("ERROR NO SE EJECUTO EL UPDATE: "+e.toString());
        }
        return datos;        
    }  
}
