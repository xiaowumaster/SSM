package cn.itsust.ssm.controller;

import cn.itsust.ssm.Product;
import cn.itsust.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author xiaowu
 * @create 2019-04-07  16:58
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Product> list = iProductService.findAll();
        mv.addObject("productList", list);
        mv.setViewName("/product-list.jsp");
        return mv;
    }
}
