package guru.springframework.thymeleafbeginnertoguru.controllers;

import guru.springframework.thymeleafbeginnertoguru.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jt on 1/20/16.
 */
@Controller
public class IndexController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/")
    public String getIndex(Model model){

        model.addAttribute("products", productService.listProducts());

        return "index";
    }
}