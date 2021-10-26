package UserModule;

import org.springframework.web.bind.annotation.GetMapping;

public class ViewController {

    @GetMapping({"/","/index"})
    public String home() {
        return "index";
    }

    @GetMapping({"/login"})
    public String login() {
        return "login";
    }

    @GetMapping({"/changeUser"})
    public String changeUser(){
        return "changerUser";
    }

    @GetMapping({"/listUsers"})
    public String listUsers() {
        return "listUsers";
    }

}
