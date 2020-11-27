/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author stanislasduval
 */
public class ResultSetTableModel extends AbstractTableModel
{
   // variables 
    private ResultSet resultset; 
    public ResultSetTableModel(ResultSet resultset)
    {
        this.resultset =resultset; 
        fireTableDataChaned(); 
    }
    
    // fonction getcolumncount
    public int getColumnCount()
    {
    try
    {
        if (resultset == null)
        {
            return 0;
        }else
        {
            return resultset.getMetaData().getColumnCount();
        }
    }catch(SQLException e)
    {
        System.out.println("getColumnCount resultset generating error while getting column count");
        System.out.println(e.getMessage());
        return 0 ;
    }
    }
    // fonction getRowcount
    
    public int getRowCount()
    {
        try
    {
        if (resultset == null)
        {
            return 0;
        }else
        {
            return resultset.getRow();
        }
    }catch(SQLException e)
    {
        System.out.println("getRoxCount resultset generating error while getting Row count");
        System.out.println(e.getMessage());
        return 0 ;
    }
    }
    // fonction getvalue 
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        if (rowIndex< 0 || rowIndex > getRowCount() || columnIndex < 0 || columnIndex > getColumnCount())
        {
            return null ;
        }
        try
        {
        if (resultset == null)
        {
            return 0;
        }else
        {
           resultset.absolute(rowIndex +1);
           return resultset.getObject(columnIndex +1); 
        }
    }catch(SQLException e)
    {
        System.out.println("getValueAt resultset generating error while fetching rows");
        System.out.println(e.getMessage());
        return null ;
    }
        
    }
    // fonction getcolumn name
    @Override
    public String getColumnName(int columnIndex)
    {
        try
        {
            return resultset.getMetaData().getColumnName(columnIndex+1);
        }catch(SQLException e)
        {
            System.out.println("getColumnName resultset generating error while fetching column name");
            System.out.println(e.getMessage());
        }
        return super.getColumnName(columnIndex); 
    }
}
