package programa.connect;
import JFrames.FormPrincipal;
import JFrames.Login;
import java.net.URL;
import javax.swing.ImageIcon;


/**
 *
 * @author David
 */
public class ProgramaConnect {

    public static void main(String[] args) {
       // CARREGAR FAVICON
        URL urlFavIconUrl = Login.class.getResource("/imgs/favicon.png");
        URL urlLogo = Login.class.getResource("/imgs/logo.png");
        // CRIO DUAS INSTANCIAS DE IMAGEICON
        ImageIcon img = new ImageIcon(urlFavIconUrl);
        ImageIcon logo = new ImageIcon(urlLogo);
        // AQUI CRIO UMA NOVA INSTANCIA DA MINHA CLASSE LOGIN
        Login nLogin = new Login();
        
        // SETO MEU FAVICON
        nLogin.setIconImage(img.getImage());
        nLogin.lblLogo.setIcon(logo);
        // CENTRALIZAR JFRAME
        nLogin.setLocationRelativeTo(null);
        // MOSTRAR  JFRAME LOGIN
        nLogin.setVisible(true);
        /*FormPrincipal  nFormPrincipal = new FormPrincipal();
        nFormPrincipal.setLocation(100, 100);
        nFormPrincipal.setVisible(true);*/
        
    }
    
}
