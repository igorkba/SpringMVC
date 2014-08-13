package com.springapp.mvc.controlers;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JSONController {

    @RequestMapping(value="/ajax", method = RequestMethod.POST)

    @ResponseBody
    public String ajaxText(@RequestParam String id) throws JSONException {
        JSONObject userJSON = new JSONObject();
        userJSON.put("id", id);
        userJSON.put("ok", true);
        userJSON.put("bad", 1);
        return (userJSON.toString());
        //return ("{\"id\":\"id\"}");
    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "ajax-test";
    }

    @RequestMapping(value="/ajaxHTML", method = RequestMethod.POST)

    @ResponseBody
    public String ajaxHTML(@RequestParam String id) throws JSONException {
//        JSONObject userJSON = new JSONObject();
//        userJSON.put("id", id);
//        userJSON.put("ok", true);
//        userJSON.put("bad", 1);
        return "ajax-test_html";
        //return ("{\"id\":\"id\"}");
    }

}