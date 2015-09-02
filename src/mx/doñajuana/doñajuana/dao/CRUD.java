/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.doñajuana.doñajuana.dao;

import java.util.List;
import mx.doñajuana.doñajuana.datos.Producto;

/**
 *
 * @author Rodrigo
 */
public interface CRUD {
    
    public List<Producto> list();
    
    public void create(Producto producto);
    
    public void update(Producto producto);
    
    public void delete(Integer id);
    
}
