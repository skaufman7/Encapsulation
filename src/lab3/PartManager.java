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

    private int foundIndex;
    private final int NOT_FOUND = -1; // flag for no record
    private final int UPDATE_COMPLETE = -2; //flag for task completion
    private String partNo;
    private String partDesc;
    private double partPrice;
    String[] partNums = new String[10];
    String[] partDescs = new String[10];
    double[] partPrices = new double[10];
    private int emptyRow;

    //validation is need on most of this although 
    //some is preformed in the GUI
    
    
    
    public String getPartNo() {
        return partNo;
    }

    public String[] getPartNums() {
        return partNums;
    }

    public String[] getPartDescs() {
        return partDescs;
    }

    public double[] getPartPrices() {
        return partPrices;
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

    public double getIndvidualPrice(int index){
        return partPrices[index];
    }
    
    public String getIndividualDesc(int index){
        return partDescs[index];
    }
    
    public String getIndividualPartNo(int index){
        return partNums[index];
    }
    
    
    
    
    public void finalizeRecord() {

        partNums[getEmptyRow()] = getPartNo();
        partDescs[getEmptyRow()] = getPartDesc();
        partPrices[getEmptyRow()] = getPartPrice();
        setEmptyRow(getEmptyRow() + 1);

    }

    public int preformSearch(String searchNum) {


        foundIndex = NOT_FOUND;


        if (searchNum != null && searchNum.length() > 0) {
            for (int i = 0; i < this.partNums.length; i++) {
                if (searchNum.equalsIgnoreCase(partNums[i])) {
                    foundIndex = i;
                    return foundIndex;
                }
            }
        }

        return foundIndex;
    }


public int preformUpdate(String partNo, String partDesc, double partPrice){
    
      if (foundIndex == NOT_FOUND) {
                return foundIndex;
        } else {
            partNums[foundIndex] = partNo;
            partDescs[foundIndex] = partDesc;
            partPrices[foundIndex] = partPrice;
            return UPDATE_COMPLETE;
}
}

public int preformSort(){
    
            if (emptyRow > 0) {
            // Bubble sort routine adapted from sample in text book...
            // Make sure the operations are peformed on all 3 arrays!
            for (int passNum = 1; passNum < emptyRow; passNum++) {
                for (int i = 1; i <= emptyRow - passNum; i++) {
                    String temp = "";
                    temp += partPrices[i - 1];
                    partPrices[i - 1] = partPrices[i];
                    partPrices[i] = Double.parseDouble(temp);

                    temp = partNums[i - 1];
                    partNums[i - 1] = partNums[i];
                    partNums[i] = temp;

                    temp = partDescs[i - 1];
                    partDescs[i - 1] = partDescs[i];
                    partDescs[i] = temp;
                }
            }
            }else{
                return NOT_FOUND;
            }
    return UPDATE_COMPLETE;
    
}






}
