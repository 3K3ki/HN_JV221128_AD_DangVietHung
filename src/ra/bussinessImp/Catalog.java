package ra.bussinessImp;

import ra.bussiness.IShop;

import java.util.List;
import java.util.Scanner;

public class Catalog implements IShop {
    private int catalogId;
    private String catalogName;
    private int priority;
    private String description;
    private Boolean catalogStatus;

    public Catalog(int catalogId, String catalogName, int priority, String description, Boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.priority = priority;
        this.description = description;
        this.catalogStatus = catalogStatus;
    }

    public Catalog() {
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(Boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    @Override
    public void inputData(Scanner sc, List<Catalog> list) {
        System.out.println("Nhập mã danh mục sản phẩm: ");
        this.catalogId = Integer.parseInt(sc.nextLine());
        System.out.println("Nhâp tên danh mục sản phẩm: ");
        this.catalogName = sc.nextLine();
        System.out.println("Nhập độ ưu tiên: ");
        this.priority = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập mô tả danh muc: ");
        this.description = sc.nextLine();
        System.out.println("Nhập trạng thái: ");
        this.catalogStatus = Boolean.parseBoolean(sc.nextLine());
    }

    @Override
    public void displayData() {
        System.out.printf("\nMã danh mục là: %d"+ "\nTên danh mục là: %s\n"+"\n-----------\n", catalogId,catalogName);
    }
}
