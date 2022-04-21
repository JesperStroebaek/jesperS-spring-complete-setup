package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FrontController
{
    @GetMapping("/")
    public String renderIndex()
    {
        return "/index";
    }
    @GetMapping("contract-page")
    public String renderContract()
    {
        return "/contract-page";
    }
    @PostMapping("submit-contract")
    public String submitContract()
    {
        return "redirect:/contract-submit-succes";
    }
    @GetMapping("/submit-contract-succes")
    public String renderContractSucces()
    {
        // todo code that adds data from contractform/mysql table - row to an ArrayList for further use..
        return "submit-contract-succes";
    }
    @GetMapping("/car-page")
    public String renderCar()
    {
        return "/car-page";
    }
    @PostMapping("/submit-car")
    public String submitCar()
    {
        return "redirect:/car-submit-succes";
    }
    @GetMapping("/submit-car-succes")
    public String renderCarSucces()
    {
        // todo code that adds data from car form/mysql table - row to an ArrayList for further use..

        return "/submit-car-succes";
    }
    @GetMapping("/customer-page")
    public String renderCustomer()
    {
        return "/customer-page";
    }
    @PostMapping("/submit-customer")
    public String submitCustomer()
    {
        return "redirect:/submit-customer-succes";
    }
    @GetMapping("/submit-customer-succes")
    public String renderCustomerSucces()
    {
        // todo code that adds data from customer-form/mysql table - row to an ArrayList for further use..

        return "/submit-customer-succes";
    }

}
