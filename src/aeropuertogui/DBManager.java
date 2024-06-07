package aeropuertogui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 
public class DBManager implements AutoCloseable {
    private Connection connection;
 
    public DBManager() throws SQLException {
        connect();
    }
 
    private void connect() throws SQLException {
       
        String url="jdbc:mysql://localhost:3306/aeropuerto?serverTimezone=UTC";
        String user="root";
        String password="S3n42023*";
        connection = DriverManager.getConnection(url, user, password);
    }
 
   
    public void close() throws SQLException {
        if (connection != null) {
            connection.close();
        }
        connection = null;
    }
 
    public boolean agregarAeropuerto(String nombreAeropuerto, String ubicacionAeropuerto){
        try {
            String sql="INSERT INTO aeropuerto(nombreAeropuerto, ubicacionAeropuerto) VALUES(?,?)";
            try(PreparedStatement statement=connection.prepareStatement(sql) ){
                statement.setString(1, nombreAeropuerto);
                statement.setString(2, ubicacionAeropuerto);
                statement.executeUpdate();
            }
           
        } catch (SQLException ex) {
            return false;
        }
 
        return true;
    }
    
    public boolean agregarCliente(int numeroPasaporte, String nombre){
        try {
            
            String sql="INSERT INTO pasajero VALUES(?,?)";
            try(PreparedStatement statement=connection.prepareStatement(sql) ){
                statement.setInt(1, numeroPasaporte);
                statement.setString(2, nombre);
                statement.executeUpdate();
            }
           
        } catch (SQLException ex) {
            return false;
        }
 
        return true;
    }
    
    public boolean reservarVuelo(int numeroVuelo, int numeroPasaporte, int cantidadEquipaje, int precio){
        try {
            String sql="INSERT INTO reserva VALUES(?,?,?,?)";
            try(PreparedStatement statement=connection.prepareStatement(sql) ){
                statement.setInt(1, numeroVuelo);
                statement.setInt(2, numeroPasaporte);
                statement.setInt(3, cantidadEquipaje);
                statement.setInt(4, precio);
                statement.executeUpdate();
            }
           
        } catch (SQLException ex) {
            return false;
        }
 
        return true;
    }
    
    public boolean actualizacionReserva(int numeroVuelo){
        try {
            String sql="UPDATE vuelo\n" +
                       "SET capacidad = ?\n" +
                       "WHERE numeroVuelo = ?;";
            List<String> vuelo = getInfoVuelos(numeroVuelo);
            int capacidad = Integer.parseInt(vuelo.get(4));
            capacidad -= 1;
            try(PreparedStatement statement=connection.prepareStatement(sql) ){
                statement.setInt(1, capacidad);
                statement.setInt(2, numeroVuelo);
                statement.executeUpdate();
            } 
           
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }
    
    
    public List<String> getInfoAeropuertos(String nombreAeropuerto){
        List<String> aeropuerto = new ArrayList<>();
        String sql = "SELECT * FROM aeropuerto WHERE nombreAeropuerto = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, nombreAeropuerto);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    int idAeropuerto = resultSet.getInt("idAeropuerto");
                    String idString = String.valueOf(idAeropuerto);
                    String nombreAeropuertoResultado = resultSet.getString("nombreAeropuerto");
                    String ubicacionResultado = resultSet.getString("ubicacionAeropuerto");
                    aeropuerto.add(idString);
                    aeropuerto.add(nombreAeropuertoResultado);
                    aeropuerto.add(ubicacionResultado);    
                    }
                }
            } catch (SQLException ex) {
                System.out.println("Error");
        }
        return aeropuerto;
       
    }
      
    public List<String> getInfoAeropuertos(int idAeropuerto){
        List<String> aeropuerto = new ArrayList<>();
        String sql = "SELECT * FROM aeropuerto WHERE idAeropuerto = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, idAeropuerto);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    String idString = String.valueOf(idAeropuerto);
                    String nombreAeropuertoResultado = resultSet.getString("nombreAeropuerto");
                    String ubicacionResultado = resultSet.getString("ubicacionAeropuerto");
                    aeropuerto.add(idString);
                    aeropuerto.add(nombreAeropuertoResultado);
                    aeropuerto.add(ubicacionResultado);    
                    }
                }
            } catch (SQLException ex) {
                System.out.println("Error");
        }
        return aeropuerto;
       
    }
    
    public List<String> getInfoVuelos(int numeroVuelo){
        List<String> vuelo = new ArrayList<>();
        String sql = "SELECT * FROM vuelo WHERE numeroVuelo = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, numeroVuelo);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    
                    List<String> aeropuertoLlegada = getInfoAeropuertos(resultSet.getInt("aeropuertoLlegada"));
                    List<String> aeropuertoPartida =getInfoAeropuertos(resultSet.getInt("aeropuertoPartida"));
                    
                    String nombreLlegada = aeropuertoLlegada.get(1);
                    String nombrePartida = aeropuertoPartida.get(1);         
                    String numeroVueloString = String.valueOf(numeroVuelo);
                    String aerolinea = resultSet.getString("aerolinea");
                    String horaSalida = resultSet.getString("horaSalida");
                    String destino = resultSet.getString("destino");
                    int capacidad = resultSet.getInt("capacidad");
                    String stringCapacidad = String.valueOf(capacidad);
                    
                    
                    
                    
                    vuelo.add(numeroVueloString);
                    vuelo.add(aerolinea);
                    vuelo.add(horaSalida);    
                    vuelo.add(destino);    
                    vuelo.add(stringCapacidad);    
                    vuelo.add(nombreLlegada);   
                    vuelo.add(nombrePartida);  
                    
                    }
                }
            } catch (SQLException ex) {
                System.out.println("Error");
        }
        return vuelo;
       
    }

    public List<String> getInfoPasajeros(int numeroPasaporte){
        List<String> pasajeros = new ArrayList<>();
        String sql = "SELECT * FROM pasajero WHERE numeroPasaporte = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, numeroPasaporte);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    String pasaporteString = String.valueOf(numeroPasaporte);
                    String nombrePasajero = resultSet.getString("nombre");
                    pasajeros.add(pasaporteString);
                    pasajeros.add(nombrePasajero);   
                    }
                }
            } catch (SQLException ex) {
                System.out.println("Error");
        }
        return pasajeros;
       
    }
  
    public String mostrarAeropuertos(){
        StringBuilder mensaje=null;
 
        try {
            String sql="SELECT * FROM aeropuerto";
            try(PreparedStatement statement=connection.prepareStatement(sql); ResultSet rs=statement.executeQuery()){
                mensaje = new StringBuilder("Aeropuertos Registrados:\n");
 
                while (rs.next()) {
                    mensaje.append("ID: ").append(rs.getInt("idAeropuerto"))
                    .append(",   Nombre: ").append(rs.getString("nombreAeropuerto"))
                    .append(",   Ubicación: ").append(rs.getString("ubicacionAeropuerto"))
                    .append("\n");                    
                }
            }          
        } catch (Exception e) {
            // TODO: handle exception
        }
        return mensaje.toString();
    }
    
    public String mostrarPasajeros(){
        StringBuilder mensaje=null;
 
        try {
            String sql="SELECT * FROM pasajero";
            try(PreparedStatement statement=connection.prepareStatement(sql); ResultSet rs=statement.executeQuery()){
                mensaje = new StringBuilder("Pasajeros Registrados:\n");
 
                while (rs.next()) {
                    mensaje.append("Pasaporte: ").append(rs.getInt("numeroPasaporte"))
                    .append(",   Nombre: ").append(rs.getString("nombre"))
                    .append("\n");                    
                }
            }          
        } catch (Exception e) {
            // TODO: handle exception
        }
        return mensaje.toString();
    }
    
    public String mostrarReserva(){
        StringBuilder mensaje=null;
 
        try {
            String sql="SELECT * FROM reserva";
            try(PreparedStatement statement=connection.prepareStatement(sql); ResultSet rs=statement.executeQuery()){
                mensaje = new StringBuilder("Reservas Registrados:\n");
 
                while (rs.next()) {
                    mensaje.append("numero Vuelo: ").append(rs.getInt("numeroVuelo"))
                    .append(",   Numero Pasaporte: ").append(rs.getInt("pasaportePasajero"))
                    .append(",   Cantidad Equipaje: ").append(rs.getInt("cantidadEquipaje"))
                    .append(",   Valor Reserva: ").append(rs.getInt("valorReserva"))
                    .append("\n");                    
                }
            }          
        } catch (Exception e) {
            // TODO: handle exception
        }
        return mensaje.toString();
    }
    
    public List<String> obtenerListaAeropuertos() {

        List<String> aeropuertos = new ArrayList<>();
        try{
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT nombreAeropuerto FROM Aeropuerto");

            while (resultSet.next()) {
                aeropuertos.add(resultSet.getString("nombreAeropuerto"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return aeropuertos;
    }
    
    public List<String> obtenerListaVuelos() {

        List<String> vuelos = new ArrayList<>();
        try{
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT numeroVuelo FROM vuelo");

            while (resultSet.next()) {
                vuelos.add(resultSet.getString("numeroVuelo"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return vuelos;
    }
    
    public List<String> obtenerListaPasajeros() {

        List<String> pasajeros = new ArrayList<>();
        try{
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT numeroPasaporte FROM pasajero");

            while (resultSet.next()) {
                String numero = String.valueOf(resultSet.getInt("numeroPasaporte"));
                pasajeros.add(numero);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return pasajeros;
    }
    
    public boolean eliminarAeropuerto(String nombreAeropuerto) {
        try {
            String sql="DELETE FROM Aeropuerto WHERE nombreAeropuerto = ?";
            try(PreparedStatement statement=connection.prepareStatement(sql) ){
                statement.setString(1, nombreAeropuerto);
                statement.executeUpdate();
            }
           
        } catch (SQLException ex) {
            return false;
        }
 
        return true;
    }
    
    public boolean actualizarAeropuerto(String nombreAeropuerto, String nuevoNombre,String nuevaUbicacion) {
        
        if (!nuevoNombre.equals("") && !nuevaUbicacion.equals("")){
            
            try {
            String sql="UPDATE aeropuerto\n" +
                       "SET nombreAeropuerto = ?, ubicacionAeropuerto = ?\n" +
                       "WHERE nombreAeropuerto = ?;";
            try(PreparedStatement statement=connection.prepareStatement(sql) ){
                statement.setString(1, nuevoNombre);
                statement.setString(2, nuevaUbicacion);
                statement.setString(3, nombreAeropuerto);
                
                statement.executeUpdate();
            } 
           
        } catch (SQLException ex) {
            return false;
        }
            
        } else if(!nuevoNombre.equals("") && nuevaUbicacion.equals("")){
           
            try {
            String sql="UPDATE aeropuerto\n" +
                       "SET nombreAeropuerto = ?\n" +
                       "WHERE nombreAeropuerto = ?;";
            try(PreparedStatement statement=connection.prepareStatement(sql) ){
                statement.setString(1, nuevoNombre);
                statement.setString(2, nombreAeropuerto);
                
                statement.executeUpdate();
            } 
           
        } catch (SQLException ex) {
            return false;
        }
            
        } else if(nuevoNombre.equals("") && !nuevaUbicacion.equals("")){
           
           try {
            String sql="UPDATE aeropuerto\n" +
                       "SET ubicacionAeropuerto = ?\n" +
                       "WHERE nombreAeropuerto = ?;";
            try(PreparedStatement statement=connection.prepareStatement(sql) ){
                statement.setString(1, nuevaUbicacion);
                statement.setString(2, nombreAeropuerto);
                
                statement.executeUpdate();
            } 
           
        } catch (SQLException ex) {
            return false;
        } 
            
        }
        
 
        return true;
    }
    
    public boolean registrarVuelo(int numeroVuelo, String aerolinea, String horaSalida, int capacidadMaxima, String nombreAeropuertoPartida, String nombreAeropuertoLlegada){
        try {
            
            List<String> listAeropuertoPartida = getInfoAeropuertos(nombreAeropuertoPartida);
            List<String> listAeropuertoLlegada = getInfoAeropuertos(nombreAeropuertoLlegada);
            
            int idPartida = Integer.valueOf(listAeropuertoPartida.get(0));
            int idLlegada = Integer.valueOf(listAeropuertoLlegada.get(0));
            String destino = listAeropuertoLlegada.get(2);
            String sql="INSERT INTO vuelo VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
            try(PreparedStatement statement=connection.prepareStatement(sql) ){
                statement.setInt(1, numeroVuelo);
                statement.setString(2, aerolinea);
                statement.setString(3, horaSalida);
                statement.setString(4, destino);
                statement.setInt(5, capacidadMaxima);
                statement.setInt(6, capacidadMaxima);
                statement.setInt(7, idLlegada);
                statement.setInt(8, idPartida);
                statement.executeUpdate();
            }
           
        } catch (SQLException ex) {
            return false;
        }
 
        return true;
    }
    
    public String mostrarVuelos(){
        StringBuilder mensaje=null;
 
        try {
            String sql="SELECT * FROM vuelo";
            try(PreparedStatement statement=connection.prepareStatement(sql); ResultSet rs=statement.executeQuery()){
                mensaje = new StringBuilder("Vuelos Registrados:\n");
                
                while (rs.next()) {
                    
                    List<String> aeropuertoLlegada = getInfoAeropuertos(rs.getInt("aeropuertoLlegada"));
                    List<String> aeropuertoPartida =getInfoAeropuertos(rs.getInt("aeropuertoPartida"));
                    String nombreLlegada = aeropuertoLlegada.get(1);
                    String nombrePartida = aeropuertoPartida.get(1);
                    
                    mensaje.append("Número de Vuelo: ").append(rs.getInt("numeroVuelo"))
                    .append(",   Aerolinea: ").append(rs.getString("aerolinea"))
                    .append(",   Hora Salida: ").append(rs.getString("horaSalida"))
                    .append(",   Destino: ").append(rs.getString("destino"))
                    .append(",   Capacidad Máxima: ").append(rs.getInt("capacidadMaxima"))
                    .append(",   Capacidad Disponible: ").append(rs.getInt("capacidad"))
                    .append(",   Aeropuerto Llegada: ").append(nombreLlegada)
                    .append(",   Aeropuerto Partida: ").append(nombrePartida)
                    .append("\n");                    
                }
            }          
        } catch (Exception e) {
            mensaje.append("No hay Vuelos");
        }
        return mensaje.toString();
    }


}   
    
    