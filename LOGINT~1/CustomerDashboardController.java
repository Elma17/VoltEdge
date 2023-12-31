/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author farhan
 */
public class CustomerDashboardController implements Initializable {


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    




    @FXML
    private void OnActionRenewable(ActionEvent event) throws IOException{
        
        Parent BuyRenewableViewParent = FXMLLoader.load(getClass().getResource("CustomerBuyRenewable.fxml"));
        Scene BuyRenewableViewScene = new Scene(BuyRenewableViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Buy Renewable");
        newWindow.setScene(BuyRenewableViewScene);
        newWindow.show();
    }

    @FXML
    private void OnActionNonRenewable(ActionEvent event) throws IOException{
                        
        Parent CustomerBuyNonRenewableViewParent = FXMLLoader.load(getClass().getResource("CustomerBuyNonRenewable.fxml"));
        Scene CustomerBuyNonRenewableViewScene = new Scene(CustomerBuyNonRenewableViewParent);

        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Buy Non-Renewable");
        newWindow.setScene(CustomerBuyNonRenewableViewScene);
        newWindow.show();
    }

    @FXML
    private void OnActionTransactionTable(ActionEvent event)  throws IOException{
                
        Parent CustomerPurchaseTableViewParent = FXMLLoader.load(getClass().getResource("CustomerPurchaseTable.fxml"));
        Scene CustomerPurchaseTableViewScene = new Scene(CustomerPurchaseTableViewParent);

        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Purchase Table");
        newWindow.setScene(CustomerPurchaseTableViewScene);
        newWindow.show();
    }

    private void OnActionPieChart(ActionEvent event) throws IOException{
                
        Parent PieChartViewParent = FXMLLoader.load(getClass().getResource("PurchasedEnergyTypePieChart.fxml"));
        Scene PieChartViewScene = new Scene(PieChartViewParent);

        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Pie-Chart");
        newWindow.setScene(PieChartViewScene);
        newWindow.show();
        
    }



    @FXML
    private void payBillMenuOnaction(ActionEvent event) throws IOException {
        Parent PayBillViewParent = FXMLLoader.load(getClass().getResource("PayBill.fxml"));
        Scene PayBillViewScene = new Scene(PayBillViewParent);

        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Connections");
        newWindow.setScene(PayBillViewScene);
        newWindow.show();
    }

    @FXML

    private void newConncectionOnactionMenu(ActionEvent event) throws IOException {
        Parent ConnectionApplyDashboardViewParent = FXMLLoader.load(getClass().getResource("ConnectionApplyDashboard.fxml"));
        Scene ConnectionApplyDashboardViewScene = new Scene(ConnectionApplyDashboardViewParent);

        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Connections");
        newWindow.setScene(ConnectionApplyDashboardViewScene);
        newWindow.show();
    }

    @FXML
    private void allConncectionOnactionMenu(ActionEvent event) throws IOException {
        Parent ConnectionTableViewParent = FXMLLoader.load(getClass().getResource("ConnectionTableView.fxml"));
        Scene ConnectionTableViewScene = new Scene(ConnectionTableViewParent);
        
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Connections Table View");
        newWindow.setScene(ConnectionTableViewScene);
        newWindow.show();
    }

    @FXML
    private void repairRequestMenuOnAction(ActionEvent event) throws IOException {
        Parent RepairRequestViewParent = FXMLLoader.load(getClass().getResource("RepairRequestSceneController.fxml"));
        Scene RepairRequestViewScene = new Scene(RepairRequestViewParent);

        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Connections Table View");
        newWindow.setScene(RepairRequestViewScene);
        newWindow.show();
    }


    @FXML
    private void OnActionConnectionPieChart(ActionEvent event) throws IOException {
        Parent ConnectionPieChartParent = FXMLLoader.load(getClass().getResource("ConnectionPieChart.fxml"));
        Scene ConnectionPieChartViewScene = new Scene(ConnectionPieChartParent);
 
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Connections Pie Chart");
        newWindow.setScene(ConnectionPieChartViewScene);
        newWindow.show();
    }

    @FXML
    private void pdfGenerationPurchaseMenubuttonOnclick(ActionEvent event) throws FileNotFoundException {
        List<PurchaseData> purchaseDataList = PurchaseDataFileHandling.loadPurchaseData();
        String pdfFilePath = "purchase_report.pdf"; 
        
        PDFGenerator.generatePurchasePDF(purchaseDataList, pdfFilePath);
    }

    @FXML
    private void showRepairHistoryMenuOnAction(ActionEvent event) throws IOException {
        Parent ShowRepairHistoryParent = FXMLLoader.load(getClass().getResource("ConfirmedRepairs.fxml"));
        Scene ShowRepairHistoryScene = new Scene(ShowRepairHistoryParent);

        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Repair History");
        newWindow.setScene(ShowRepairHistoryScene);
        newWindow.show();
        
    }

    @FXML
    private void OnActionEnergyBarChart(ActionEvent event) throws IOException {
        Parent EnergyBarChartParent = FXMLLoader.load(getClass().getResource("BarChartScene.fxml"));
        Scene EnergyBarChartScene = new Scene(EnergyBarChartParent);

        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Pie-Chart");
        newWindow.setScene(EnergyBarChartScene);
        newWindow.show();
    }

    
}
