package servidordeconfiguracao.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ParametrosController {
    
    @GetMapping("/")
    public String showPage() {
        return "form";
    }
}
