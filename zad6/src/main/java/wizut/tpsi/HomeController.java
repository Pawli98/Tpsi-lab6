/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizut.tpsi;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author pawel
 */
@Controller
public class HomeController 
{
    @RequestMapping("/")
    public String home()
    {
         
        return "home";
    }
    @RequestMapping("/hello")
    public String hello(Model model, String imie, Integer wiek)
    {
        model.addAttribute("imie", imie);
        model.addAttribute("wiek", wiek);
        return "hello";
    }
    
    @RequestMapping("/CalculatorController")
    public String hello(Model model, Integer x, Integer y,String suma)
    {
        model.addAttribute("x", x);
        model.addAttribute("y", y);
        model.addAttribute("suma", x+y);
        return "CalculatorController";
    }
    
    
     @RequestMapping("/opcja")
    public String opcja(Model model, Integer x, Integer y,String option)
    {
        if (option.equals("+")) 
        {
            model.addAttribute("x", x);
            model.addAttribute("y", y);
            model.addAttribute("option", x + y);
            model.addAttribute("znak", "+");
        }

        else if(option.equals("-")) 
        {
            model.addAttribute("x", x);
            model.addAttribute("y", y);
            model.addAttribute("option", x - y);
            model.addAttribute("znak", "-");
        }

        else if(option.equals("*")) 
        {
            model.addAttribute("x", x);
            model.addAttribute("y", y);
            model.addAttribute("option", x * y);
            model.addAttribute("znak", "*");
        }
        else if(option.equals("/")) 
        {
            model.addAttribute("x", x);
            model.addAttribute("y", y);
            model.addAttribute("option", x / y);
            model.addAttribute("znak", "/");
        }
        return "opcja";
     }

    @RequestMapping("/CalculatorController_zad3")
    public String func3(Model model, CalculatorForm calculatorForm) 
    {
        model.addAttribute("calculatorForm", calculatorForm);
        if((calculatorForm.getOperator().equals("+"))) 
        {
            model.addAttribute("wynik", calculatorForm.getX() + calculatorForm.getY());
            model.addAttribute("znak", "+");
        }

        else if((calculatorForm.getOperator().equals("-"))) 
        {
            model.addAttribute("wynik", calculatorForm.getX() - calculatorForm.getY());
            model.addAttribute("znak", "-");
        }

        else if((calculatorForm.getOperator().equals("*"))) 
        {
            model.addAttribute("wynik", calculatorForm.getX() * calculatorForm.getY());
            model.addAttribute("znak", "*");
        }
        else if((calculatorForm.getOperator().equals("/"))) 
        {
            model.addAttribute("wynik", calculatorForm.getX() / calculatorForm.getY());
            model.addAttribute("znak", "/");
        }
        return "CalculatorController_zad3";
    }
    
    
    
    
    
    
}