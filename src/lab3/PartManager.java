/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author SKaufman7
 */
public class PartManager {

    private String partNo;
    private String partDesc;
    private double partPrice;

    String[] partNums = new String[10];
    String[] partDescs = new String[10];
    double[] partPrices = new double[10];
    
    private int emptyRow;
    
    
    
    public String getPartNo() {
        return partNo;
    }

    public void setPartNo(String partNo) {
        this.partNo = partNo;
    }

    public String getPartDesc() {
        return partDesc;
    }

    public void setPartDesc(String partDesc) {
        this.partDesc = partDesc;
    }

    public double getPartPrice() {
        return partPrice;
    }

    public void setPartPrice(double partPrice) {
        this.partPrice = partPrice;
    }

    public int getEmptyRow() {
        return emptyRow;
    }

    public void setEmptyRow(int emptyRow) {
        this.emptyRow = emptyRow;
    }


    public void enterRecord(double partPrice, String partDesc, String partNo) {
                
        setPartPrice(partPrice);
        setPartDesc(partDesc);
        setPartNo(partNo);

    }
    
    
    public void finalizeRecord() {
        
            partNums[getEmptyRow()] = getPartNo();
            partDescs[getEmptyRow()] = getPartDesc();
            partPrices[getEmptyRow()] = getPartPrice();
            setEmptyRow(getEmptyRow()+1);
            
    }
    
    
    public void preformSearch(String searchNum){
        
        
        
        
    }
    
    
    
    
}
