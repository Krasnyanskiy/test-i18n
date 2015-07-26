package com.alex.web;

import com.alex.service.UidGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Alexander Krasnyanskiy
 */
@Controller
@RequestMapping("/code")
public class CodeController {

    @Autowired
    private UidGeneratorService uidGeneratorService;

    @RequestMapping(method = RequestMethod.GET)
    String codePage(ModelMap model) {

        String uid = uidGeneratorService.generateUid();
        String serviceMessage = uidGeneratorService.getMessage();

        model.addAttribute("uidCode", uid);
        model.addAttribute("serviceMessage", serviceMessage);
        return "code";
    }

}
