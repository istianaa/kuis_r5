/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_r5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import static java.lang.Integer.parseInt;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
/**
 *
 * @author Anggi
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
  
    @FXML
    private JFXTextField editnama;

    @FXML
    private JFXTextField edittinggi;

    @FXML
    private JFXTextField editberat;

    @FXML
    private JFXRadioButton rdlaki;

    @FXML
    private JFXRadioButton rdper;
        
    @FXML
    private ToggleGroup jeniskelamin;

    @FXML
    private JFXButton proses;

    @FXML
    private JFXButton reset;

    @FXML
    private TextField beratideal;

    @FXML
    private TextArea hasil;

    @FXML
    private TextArea saran;

    
    @FXML
    void hapus(ActionEvent event) {
        editnama.setText("");
        edittinggi.setText("");
        editberat.setText("");
        rdlaki.setSelected(false);
        rdper.setSelected(false);
        beratideal.setText("");
        saran.setText("");
        hasil.setText("");
        
        
        
    }

    @FXML
    void ok(ActionEvent event) {
        int brtideal = 0;
        String analisa = null;
        String analisasaran = null;
        if(rdlaki.isSelected()){
            brtideal = parseInt(edittinggi.getText().toString()) - 105;
        }
        if(rdper.isSelected()){
            brtideal = parseInt (edittinggi.getText().toString()) - 110;
        }
    
        beratideal.setText(""+beratideal);
        
        if(brtideal == parseInt(edittinggi.getText())){
            analisa = "ideal";
            analisasaran =" Berat anda sudah ideal \n jaga berat dan pola makan anda.";
        }else if(brtideal > parseInt(edittinggi.getText())){
            analisa="Overweight";
            analisasaran="Anda sedang mengalami Overweight\n kurangi porsi makan anda dan jaga pola makan";
        }else if(brtideal < parseInt(edittinggi.getText())){
            analisa = " Underweight";
            analisasaran = "Anda sedang mengalami Underweight \n makan yang banyak dan bergizi";
        }   
        
    }    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private int ParseInt(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
