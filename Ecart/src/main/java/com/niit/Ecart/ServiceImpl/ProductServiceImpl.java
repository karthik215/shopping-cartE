package com.niit.Ecart.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.Ecart.DAO.ProductDAO;
import com.niit.Ecart.Service.ProductService;
import com.niit.Ecart.model.Product;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDao;

    public Product getProductById (int productId) {
        return productDao.getProductById(productId);
    }

    public List<Product> getProductList () {
        return productDao.getProductList();
    }

    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    public void editProduct(Product product) {
        productDao.editProduct(product);
    }

    public void deleteProduct(Product product) {
        productDao.deleteProduct(product);
    }
}
