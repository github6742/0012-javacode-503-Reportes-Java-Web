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
    
    
    //Metodo para invocar el reporte y enviarle los parametros si es que necesita  
    public void verReportePdf() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        //Instancia hacia la clase reporteClientes        
        reporteCliente rCliente = new reporteCliente();
        
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        String ruta = servletContext.getRealPath("/reportes/reporteCliente.jasper");
       
        rCliente.getReportePdf(ruta);        
        FacesContext.getCurrentInstance().responseComplete();               
    }
    //Metodo para invocar el reporte y enviarle los parametros si es que necesita  
    public void verReporteExcel() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        //Instancia hacia la clase reporteClientes        
        reporteCliente rCliente = new reporteCliente();
        
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        String ruta = servletContext.getRealPath("/reportes/reporteCliente.jasper");
       
        rCliente.getReporteExcel(ruta);        
        FacesContext.getCurrentInstance().responseComplete();               
    }
    
    
    //Metodo para invocar el reporte y enviarle los parametros si es que necesita  
    public void verReporteWord() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        //Instancia hacia la clase reporteClientes        
        reporteCliente rCliente = new reporteCliente();
        
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        String ruta = servletContext.getRealPath("/reportes/reporteCliente.jasper");
       
        rCliente.getReporteWord(ruta);        
        FacesContext.getCurrentInstance().responseComplete();               
    }
    
    
    //Metodo para invocar el reporte y enviarle los parametros si es que necesita  
    public void verReportePpt() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        //Instancia hacia la clase reporteClientes        
        reporteCliente rCliente = new reporteCliente();
        
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        String ruta = servletContext.getRealPath("/reportes/reporteCliente.jasper");
       
        rCliente.getReportePpt(ruta);        
        FacesContext.getCurrentInstance().responseComplete();               
    }
}
