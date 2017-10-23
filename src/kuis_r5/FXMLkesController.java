/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_r5;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Anggi
 */
public class FXMLkesController implements Initializable {

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
    private ToggleGroup jeniskelamin;
    @FXML
    private JFXRadioButton rdper;
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ok(ActionEvent event) {
        int brtideal = 0;
        String hasil1 = "";
        String saran1 = "";
        int Tinggi = Integer.parseInt(edittinggi.getText());
        int Berat = Integer.parseInt(editberat.getText());
        
        if(rdlaki.isSelected()){
            brtideal = Tinggi - 105;
        }
        if(rdper.isSelected()){
            brtideal = Tinggi - 110;
        }
    
        beratideal.setText(""+brtideal);
        
        if(brtideal == Berat){
            hasil1 = "ideal";
            saran1 =" Berat anda sudah ideal \n jaga berat dan pola makan anda.";
        }else if(brtideal < Berat){
            hasil1="Overweight";
            saran1="Anda sedang mengalami Overweight\n kurangi porsi makan anda dan jaga pola makan";
        }else if(brtideal > Berat){
            hasil1 = " Underweight";
            saran1 = "Anda sedang mengalami Underweight \n makan yang banyak dan bergizi";
        }   
        hasil.setText(hasil1);
        saran.setText(saran1);
    }    
    

    @FXML
    private void hapus(ActionEvent event) {
        editnama.setText("");  
        edittinggi.setText("");
        editberat.setText("");
        rdlaki.setSelected(false);
        rdper.setSelected(false);
        beratideal.setText("");
        saran.setText("");
        hasil.setText("");
        
    }
    
}
