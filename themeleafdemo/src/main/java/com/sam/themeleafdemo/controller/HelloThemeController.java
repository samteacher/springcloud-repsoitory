package com.sam.themeleafdemo.controller;

import com.sam.themeleafdemo.bean.Product;
import com.sam.themeleafdemo.dao.DAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HelloThemeController{

    @RequestMapping("/index")
    public String helloTheme(Model model){
        model.addAttribute("name", "dfasdf工工工");
        return "/index";
    }

    @RequestMapping("/message")
    public String message(Model model){

        Map<String ,String> map = new HashMap<String ,String>();
        map.put("username","admin");
        map.put("password","123456");
        model.addAttribute("map" , map);

        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("c++");
        list.add("php");
        list.add("net");

        model.addAttribute("list",list);

        model.addAttribute("message", "早前的“疫苗事件”让人记忆犹新，近日，爱康集团董事长兼CEO张黎刚则在“2018中国企业领袖年会”曝出体检领域丑闻——“行业里边也有真体检、假体检”。他曝料称，“有一些同行抽了血做都不做检查就扔了，（直接）出结果，因为真正得癌症的比例只有千分之三，如果体检中心抽的血做都不做，错误率最高是千分之三。”\n" +
                "护士假扮医生、只抽血不检测，把行业暴利寄托在重大疾病发病率之上……这些底线下的猫腻，从体检从业者嘴里爆出来，尤其叫人脊背发冷。“疫苗事件”是血的教训，体检乱像何尝不关乎人命？真体检、假体检，叫人傻傻分不清。");
        return "/message";
    }

    @RequestMapping("/index/content")
    public String content(String id,String type){
        System.out.println(id+"======="+type);
        return "content";
    }

    /**  ---------------------------------------------------------------------------  */
    @GetMapping("/product")
    public String product(Model model) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Product product = new Product("花生油", 129, sdf.parse("2018-02-18"));
        model.addAttribute("product", product);
        return "product";
    }

    /**  ---------------------------------------------------------------------------  */
    @GetMapping("/escape")
    public String escape(Model model) throws ParseException {
        String html =  "Welcome to our <b>fantastic</b> grocery store!";
        model.addAttribute("html", html);
        return "escape";
    }

    /**  ---------------------------------------------------------------------------  */
    @GetMapping("/iteration")
    public String iteration(Model model) throws ParseException {
        List productList = DAO.loadAllProducts();
        model.addAttribute("productList", productList);
        return "iteration";
    }

    /**  ---------------------------------------------------------------------------  */
    @GetMapping("/conditional")
    public String conditional(Model model) throws ParseException {
        List productList = DAO.loadAllProducts();
        model.addAttribute("productList", productList);
        return "conditional";
    }

    /**  ---------------------------------------------------------------------------  */
    @GetMapping("/conditional2")
    public String conditional2(Model model) throws ParseException {
        List productList2 = DAO.loadAllProducts();
        model.addAttribute("productList2", productList2);
        return "conditional2";
    }

    /**  ---------------------------------------------------------------------------  */
    @GetMapping("/springel")
    public String sprinel(Model model) throws ParseException {
        List productList = DAO.loadAllProducts();
        model.addAttribute("productList", productList);
        return "springel";
    }

    /**  ---------------------------------------------------------------------------  */
    @RequestMapping(value = { "/addProduct" }, method = RequestMethod.GET)
    public String showaddProduct(Model model)throws ParseException {
        //List<Product> saleTypes = new ArrayList<Product>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Product product = new Product("花生油","花生油描述~", 119, sdf.parse("2018-02-11"), "CX");
        model.addAttribute("product", product);
        return "addProduct";
    }

    @RequestMapping(value = { "/saveProduct" }, method = RequestMethod.POST)
    public String saveprodcut(Model model, String name) throws ParseException {
        //List productList = DAO.loadAllProducts();
        System.out.println("-------------------------");
        //model.addAttribute("productList", productList);
        return "redirect:springel";
    }

}
