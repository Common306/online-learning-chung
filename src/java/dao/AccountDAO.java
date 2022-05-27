package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Role;

public class AccountDAO extends DBContext {

    public Account getAccount(String email, String password) {
        try {
            String sql = "SELECT a.*, p.PasswordHash FROM [Account] a JOIN [Password] p \n"
                    + "ON a.AccountID = p.AccountID\n"
                    + "WHERE a.[Email] = ? AND p.[PasswordHash] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, email);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Account account = new Account();
                Role role = new Role();

                role.setId(rs.getInt("RoleID"));

                account.setAccountId(rs.getInt("AccountID"));
                account.setFirstName(rs.getString("FirstName"));
                account.setLastName(rs.getString("LastName"));
                account.setEmail(rs.getString("Email"));
                account.setProfilePictureUrl(rs.getString("ProfilePictureUrl"));
                account.setRole(role);
                account.setCreatedTime(rs.getTimestamp("CreatedTime"));
                account.setModifiedTime(rs.getTimestamp("ModifiedTime"));
                account.setPhone(rs.getString("Phone"));
                account.setAddress(rs.getString("Address"));
                account.setGender(rs.getBoolean("Gender"));
                account.setPassword(rs.getString("PasswordHash"));

                return account;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int getAccountIdByEmail(String email) {
        try {
            String sql = "SELECT [AccountId] FROM [Account]\n"
                    + "WHERE [Email] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, email);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return rs.getInt("AccountId");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public boolean isExistAccount(String email) {
        try {
            String sql = "SELECT * FROM [Account] WHERE Email = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, email);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void insertAccount(String email, String fname, String lname, boolean gender, String phone) {

        Timestamp createdTime = new Timestamp(System.currentTimeMillis());
        PreparedStatement stm = null;
        try {
            String sqlAccount = "INSERT INTO [Account]([FirstName],[LastName],[Email],"
                    + "[RoleID],[CreatedTime],[Phone],[Gender],[Balance])\n"
                    + "VALUES(?,?,?,2,?,?,?,10000)";
            stm = connection.prepareStatement(sqlAccount);
            stm.setString(1, fname);
            stm.setString(2, lname);
            stm.setString(3, email);
            stm.setTimestamp(4, createdTime);
            stm.setString(5, phone);
            stm.setBoolean(6, gender);

            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    public void updateDateModify(String email) {
        PreparedStatement stm = null;
        Timestamp timeModified = new Timestamp(System.currentTimeMillis());
        try {
            String sql = "UPDATE [Account] SET [ModifiedTime] = ? WHERE [Email] = ?";
            stm = connection.prepareStatement(sql);
            stm.setTimestamp(1, timeModified);
            stm.setString(2, email);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Timestamp getTimeModify(String email) {
        try {
            String sql = "SELECT [ModifiedTime] FROM [Account] WHERE Email = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, email);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return rs.getTimestamp("ModifiedTime");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void insertPassword(int accountId, String password) {
        PreparedStatement stm = null;
        try {
            String sqlPassword = "INSERT INTO [Password]([AccountID],[PasswordHash]) \n"
                    + "VALUES (?,?)";
            stm = connection.prepareStatement(sqlPassword);
            stm.setInt(1, accountId);
            stm.setString(2, password);

            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
