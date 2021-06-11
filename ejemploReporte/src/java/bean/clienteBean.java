/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

@ManagedBean
@ViewScoped
public class clienteBean implements Serializable{
    
    private String pais;
    
    public clienteBean() {
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
    
    
    
    //Metodo para invocar el reporte y enviarle los parametros si es que necesita  
    public void verReporte() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        //Instancia hacia la clase reporteClientes        
        reporteCliente rCliente = new reporteCliente();
        
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        String ruta = servletContext.getRealPath("/reportes/reporteCliente.jasper");
       
        rCliente.getReporte(ruta);        
        FacesContext.getCurrentInstance().responseComplete();               
    }
    //Metodo para invocar el reporte y enviarle los parametros si es que necesita  
    public void verReporte2() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        //Instancia hacia la clase reporteClientes        
        reporteCliente rCliente = new reporteCliente();
        
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        String ruta = servletContext.getRealPath("/reportes/reportCliente2.jasper");
       
        rCliente.getReporte2(ruta);        
        FacesContext.getCurrentInstance().responseComplete();               
    }
    //Metodo para invocar el reporte y enviarle los parametros si es que necesita  
    public void verReporte3() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        //Instancia hacia la clase reporteClientes        
        reporteCliente rCliente = new reporteCliente();
        
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        String ruta = servletContext.getRealPath("/reportes/reporteClienteParametro.jasper");
       
        rCliente.getReporte3(ruta,this.pais);        
        FacesContext.getCurrentInstance().responseComplete();               
    }
}
