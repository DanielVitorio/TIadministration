package ti.administration;

import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author tecnico.daniel
 */
public class TIAdministration {

    public static void main(String[] args) {

        frmLoginVIEW login = new frmLoginVIEW(); //variavel esta recebendo a tela de login
        login.setVisible(true); //que irá setar como verdadeiro a visibilidade da tela de login e irá abrir a tela de login
    } //classe principal 
    
    public void inseriricone(JFrame frm){
        try {
            
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Program Files (x86)\\TIadministration\\icone.png"));
            
        } catch (Exception e) {
            System.out.println("erro ao carregar imagem");
        }
        
    } //essa class irá trocar o icone do java para o icone.png

}


