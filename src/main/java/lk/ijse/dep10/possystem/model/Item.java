package lk.ijse.dep10.possystem.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;




@AllArgsConstructor
@NoArgsConstructor
public class Item implements Serializable {

    private String role;
    private int batchNo;
    private Long itemCode;
    private String model;
    private String brandName;
    private String partsCategory;
    private String itemName;
    private BigDecimal netPrice;
    private int qty;
    private String consumedQty = "0";
    private BigDecimal price;
    private BigDecimal discount;
    private Date dateOfBought;
    private BigDecimal sellingPrice;
    private BigDecimal profit;



    public Item(Long itemCode, String itemName, BigDecimal sellingPrice) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.sellingPrice = sellingPrice;

    }

    public Item(Long itemCode, String itemName, BigDecimal sellingPrice, int qty, BigDecimal price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.sellingPrice = sellingPrice;
        this.qty = qty;
        this.price = price;
    }

    public Item(Long itemCode, String itemName, BigDecimal sellingPrice,  String consumedQty, BigDecimal price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.sellingPrice = sellingPrice;
        this.consumedQty = consumedQty;
        this.price = price;
    }

    public Item(Long itemCode, String itemName, BigDecimal sellingPrice, int qty, String consumedQty, BigDecimal price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.sellingPrice = sellingPrice;
        this.qty = qty;
        this.consumedQty = consumedQty;
        this.price = price;
    }

    public Item(Long itemCode, String itemName, String brandName,String partsCategory, String model,int qty,Date dateOfBought) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.brandName = brandName;
        this.partsCategory = partsCategory;
        this.model = model;
        this.qty = qty;
        this.dateOfBought = dateOfBought;

    }

    public Item(String role, int batchNo, Long itemCode, String model, String itemName, BigDecimal netPrice, int qty,
                BigDecimal discount, Date dateOfBought, BigDecimal sellingPrice, BigDecimal profit) {
        this.role = role;
        this.batchNo = batchNo;
        this.itemCode = itemCode;
        this.model = model;
        this.itemName = itemName;
        this.netPrice = netPrice;
        this.qty = qty;
        this.discount = discount;
        this.dateOfBought = dateOfBought;
        this.sellingPrice = sellingPrice;
        this.profit = profit;
    }



    public BigDecimal getPrice(){
        return new BigDecimal(getConsumedQty()).multiply(sellingPrice);
    }

    public String getConsumedQty() {
        return consumedQty;
    }

    public void setConsumedQty(String consumedQty) {
        this.consumedQty = consumedQty;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Long getItemCode() {
        return itemCode;
    }

    public void setItemCode(Long itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(BigDecimal sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    public int getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(int batchNo) {
        this.batchNo = batchNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(BigDecimal netPrice) {
        this.netPrice = netPrice;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Date getDateOfBought() {
        return dateOfBought;
    }

    public void setDateOfBought(Date dateOfBought) {
        this.dateOfBought = dateOfBought;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getPartsCategory() {
        return partsCategory;
    }

    public void setPartsCategory(String partsCategory) {
        this.partsCategory = partsCategory;
    }
}
