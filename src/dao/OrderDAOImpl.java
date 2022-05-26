/**
 * @author : ALE_IS_TER
 * Project Name: Layered_Architecture
 * Date        : 5/25/2022
 * Time        : 3:25 AM
 * @Since : 0.1.0
 */

package dao;

import model.CustomerDTO;
import model.OrderDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDAOImpl  implements CrudDAO<OrderDTO,String> {
    @Override
    public ArrayList<OrderDTO> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean save(OrderDTO dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(OrderDTO dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public OrderDTO search(String s) throws SQLException, ClassNotFoundException {
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
