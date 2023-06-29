/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 9 jun 2023                     *
 * Fecha de actualización: 9 jun 2023                *
 * Descripción: Clase para utilidades.
 **************************************************** */
package util;

import com.formdev.flatlaf.extras.components.FlatTextArea;
import com.formdev.flatlaf.extras.components.FlatTextField;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class Util {

    public static boolean validCamposLlenos(Container contenedor) {
        Component[] components = contenedor.getComponents();

        for (Component component : components) {
            if (component instanceof JTextComponent || component instanceof FlatTextArea) {
                if (!component.getName().equals("opcional")) {
                    JTextField textField = (JTextField) component;
                    if (textField.getText().isBlank()) {
                        return false;
                    }
                }
            } else if (component instanceof JScrollPane) {
                for (Component component1 : ((JScrollPane) component).getComponents()) {
                    if (component1 instanceof JTextArea) {
                        JTextArea textField = (JTextArea) component1;
                        if (!textField.getName().equals("opcional")) {
                            if (textField.getText().isBlank()) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void limpiarFrame(Container contenedor) {
        Component[] components = contenedor.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                JTextField compo = (JTextField) component;
                // Realiza la acción deseada con el JTextField encontrado
                compo.setText("");
            } else if (component instanceof FlatTextField) {
                FlatTextField compo = (FlatTextField) component;
                // Realiza la acción deseada con el JTextField encontrado
                compo.setText("");
            } else if (component instanceof FlatTextArea) {
                FlatTextArea compo = (FlatTextArea) component;
                // Realiza la acción deseada con el JTextField encontrado
                compo.setText("");
            } else if (component instanceof JTextArea) {
                JTextArea compo = (JTextArea) component;
                // Realiza la acción deseada con el JTextField encontrado
                compo.setText("");
            }
        }
    }
}
