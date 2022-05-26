/**
 * @author : ALE_IS_TER
 * Project Name: Layered_Architecture
 * Date        : 5/25/2022
 * Time        : 3:26 AM
 * @Since : 0.1.0
 */

package dao;

import model.CustomerDTO;
import model.OrderDetailDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDetailsDAOImpl implements CrudDAO<OrderDetailDTO,String> {
    @Override
    public ArrayList<OrderDetailDTO> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean save(OrderDetailDTO dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(OrderDetailDTO dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public OrderDetailDTO search(String s) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean exist(String s) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean delete(String s) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public String generateNewID() throws SQLException, ClassNotFoundException {
        return null;
    }
}
