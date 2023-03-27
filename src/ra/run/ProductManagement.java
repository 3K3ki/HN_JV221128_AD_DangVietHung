package ra.run;

import ra.bussinessImp.Catalog;
import ra.bussinessImp.Product;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Product> listProduct = new ArrayList<>();
        List<Catalog> listCatalog = new ArrayList<>();

        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-2-MENU***************\n" +
                    "1. Nhập số danh mục sản phẩm và nhập thông tin các danh mục [10 điểm]\n" +
                    "2. Nhập số sản phẩm và nhập thông tin các sản phẩm [20 điểm]\n" +
                    "3. Sắp xếp sản phẩm theo giá sản phẩm tăng dần (Comparable/Comparator) [10 điểm]\n" +
                    "4. Tìm kiếm sản phẩm theo tên danh mục sản phẩm [05 điểm]\n" +
                    "5. Thoát [05 điểm]");
            System.out.println("Mời bạn chọn: ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập số danh mục sản phẩm: ");
                    int countOfCatalog = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < countOfCatalog; i++) {
                        System.out.println("Nhập danh mục thứ "+ (i+1));
                        Catalog newCatalog = new Catalog();
                        newCatalog.inputData(input, listCatalog);
                        if(listCatalog.size()==0){
                            newCatalog.setCatalogId(1);
                        }else {
                            int newCatalogId = listCatalog.get(listCatalog.size()-1).getCatalogId()+1;
                            newCatalog.setCatalogId(newCatalogId);
                        }
                        listCatalog.add(newCatalog);
                    }
                    System.out.println("Thêm mới thành công");
                    showCatalogList(listCatalog);
                    break;
                case 2:
                    System.out.println("Nhập số sản phẩm: ");
                    int countOfProduct = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < countOfProduct; i++) {
                        System.out.println("Nhập sản phẩm thứ "+ (i+1));
                        Product newProduct = new Product();
                        newProduct.inputData(input, listCatalog);
                        if(listProduct.size()==0){
                            newProduct.setProductId(1);
                        }else {
                            int newProductId = listProduct.get(listProduct.size()-1).getProductId()+1;
                            newProduct.setProductId(newProductId);
                        }
                        listProduct.add(newProduct);
                    }
                    System.out.println("Thêm mới thành công");
                    showProductList(listProduct);
                    break;
                case 3:
                    Collections.sort(listProduct);
                    showProductList(listProduct);
                    break;
                case 4:
//                    System.out.println("Nhập sản phẩm cần tìm ");
//                    String searchProduct = input.nextLine();
//                    Product product = new Product();
//                    if(product.getProductId().contains(searchProduct){
//
//                    }
                    break;
                case 5:
                    System.out.println("Thoát thành công!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sai lựa chọn");
                    break;
            }
        }
    }
    public static void showCatalogList(List<Catalog> list){
        for (Catalog catalog: list) {
            catalog.displayData();
        }
    }
    public static void showProductList(List<Product> list){
        for (Product product: list) {
            product.displayData();
        }
    }
}
