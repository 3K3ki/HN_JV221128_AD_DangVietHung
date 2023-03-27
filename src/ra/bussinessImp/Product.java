package ra.bussinessImp;

import ra.bussiness.IShop;

import java.util.List;
import java.util.Scanner;

public class Product implements IShop,Comparable<Product> {
    private int productId;
    private String productName;
    private String title;
    private String description;
    private Catalog catalog;
    private float importPrice;
    private float exportPrice;
    private boolean productStatus;

    public Product() {
    }

    public Product(int productId, String productName, String title, String description, Catalog catalog, float importPrice, float exportPrice, boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.description = description;
        this.catalog = catalog;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.productStatus = productStatus;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public void inputData(Scanner sc, List<Catalog> listCatalog) {
        System.out.println("Nhập vào mã sản phẩm: ");
        this.productId = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào tên sản phẩm: ");
        this.productName = sc.nextLine();
        System.out.println("Nhập vào tiêu đề:  ");
        this.title = sc.nextLine();
        System.out.println("Nhập vào phần mô tả: ");
        this.description = sc.nextLine();
        System.out.println("Nhập vào giá sản phẩm: ");
        this.importPrice = Float.parseFloat(sc.nextLine());
        System.out.println("Trạng thái sản phẩm: ");
        this.productStatus = Boolean.parseBoolean(sc.nextLine());
        this.exportPrice = this.importPrice * RATE;
        System.out.println("Chọn danh mục cho sách (Mã số của danh mục): ");
        if (listCatalog.size()==0){
            System.out.println("Không có danh mục, mời thêm trước danh mục");
            System.exit(0);
        }
        for (Catalog catalog: listCatalog) {
            catalog.displayData();
        }
        int catalogId = Integer.parseInt(sc.nextLine());
        for (Catalog catalog: listCatalog) {
            if(catalog.getCatalogId() == catalogId) {
                this.catalog = catalog;
                break;
            }
        }
    }

    @Override
    public void displayData() {
        System.out.println("--------------------------------");
        System.out.printf("Mã sản phẩm: %d\n", productId);
        System.out.printf("Tên sản phẩm: %s\n", productName);
        System.out.printf("Danh mục sản phẩm: %s\n", catalog.getCatalogName());
        System.out.printf("Giá bán sản phẩm: %.1f\n", exportPrice);
        System.out.printf("Trạng thái sản phẩm: %s\n", productStatus?"còn bán": "Hết bán");
    }

    @Override
    public int compareTo(Product o) {
        return (int) (this.exportPrice - o.getExportPrice());
    }
}
