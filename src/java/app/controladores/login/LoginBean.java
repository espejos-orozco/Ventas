package app.controladores.login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;



@ManagedBean(name = "loginBean")
@SessionScoped

public class LoginBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private String uname;
    private String password;
    
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUname() {
        return uname;
    }
    
    public void setUname(String uname) {
        this.uname = uname;
    }
    
    public String loginProject() throws MalformedURLException, ProtocolException, IOException {
        System.out.println(uname);
        System.out.println(password);
        
        
        boolean result = true;//UserDAO.login(uname, password);
        
        URL url = new URL("http://localhost:8080/VentasOnlinev2/webresources/entities.clientes");//your url i.e fetch data from .
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        /*
        if (conn.getResponseCode() != 200) {
            System.out.println("Problemas");
        }
        /*
        
        InputStreamReader in = new InputStreamReader(conn.getInputStream());
        BufferedReader br = new BufferedReader(in);
        String output;
        while ((output = br.readLine()) != null) {
            System.out.println(output);
        }
        conn.disconnect();
        */
        
        
        result = true;
        if (result) {
            return "";
            //return "index";
        } else {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Invalid Login!",
                            "Please Try Again!"));
            return "login";
        }
    }
}