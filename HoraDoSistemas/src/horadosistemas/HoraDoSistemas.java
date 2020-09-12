/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horadosistemas;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Rangel
 */
public class HoraDoSistemas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exibe hora do sistema.
        Date relogio = new Date();
        System.out.println("A hora do sistema é: " + relogio.toString());
        
        // Exibe idioma do sistema.
        Locale currentLocale = Locale.getDefault();
        System.out.println("Seu sistema está em " + currentLocale.getDisplayLanguage());
        
        // Exibe resolução da tela.
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        System.out.println("Sua resolução é " + width + " x " + height);
    }

}
