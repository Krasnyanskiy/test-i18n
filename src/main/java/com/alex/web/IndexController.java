package com.alex.web;

import lombok.extern.java.Log;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

import static java.lang.String.format;

@Log
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String home(ModelMap model) {
        // Print current locale (please check console for output)
        Locale currentLocale = LocaleContextHolder.getLocale();
        System.out.println(format("locale=%s%n", currentLocale));
        return "index";
    }
}