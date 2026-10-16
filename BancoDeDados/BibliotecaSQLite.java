import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

class BibliotecaSQLite{
    private static final String URL = "jdbc:sqlite:biblioteca.db";
    public static Connection conectar() throws SQLException{
        return DriverManager.getConnection(URL);
    }

    public static void criarTabela(){
        String sql = "CREATE TABLE IF NOT EXISTS livros (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "titulo TEXT NOT NULL, " +
                "autor TEXT NOT NULL, " +
                "isbn INTEGER" +
                ")";

        try (Connection conn = conectar();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void inserirLivro(String titulo, String autor, int isbn){
        String sql = "INSERT INTO livros(titulo, autor, isbn) VALUES(?, ?, ?)";

        try (Connection conn = conectar();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, titulo);
            pstmt.setString(2, autor);
            pstmt.setInt(3, isbn);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void atualizarLivro(int id, String titulo, String autor, int isbn){
        String sql = "UPDATE livros SET titulo = ?, autor = ?, isbn = ? WHERE id = ?";

        try (Connection conn = conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, titulo);
            pstmt.setString(2, autor);
            pstmt.setInt(3, isbn);
            pstmt.setInt(4, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deletarLivro(int id){
        String sql = "DELETE FROM livros WHERE id = ?";

        try (Connection conn = conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void listarLivros(){
        String sql = "SELECT * FROM livros";
        try(Connection conn = conectar();
            Statement stmt = conn.createStatement()){
                ResultSet result = stmt.executeQuery(sql);
                System.out.println("Lista de livros: ");
                while(result.next()){
                    System.out.println("id: " + result.getInt("id"));
                    System.out.println("id: " + result.getString("titulo"));
                    System.out.println("id: " + result.getString("autor"));
                    System.out.println("id: " + result.getString("isbn"));
                }
            }
    }

    public static void main(String[] args){
        
    }
} 