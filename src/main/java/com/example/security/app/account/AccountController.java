package com.example.security.app.account;

import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.security.domain.model.Account;
import com.example.security.domain.service.userdetails.SampleUserDetails;
import com.example.security.domain.service.userdetails.TemporarySampleUserDetails;

@Controller
public class AccountController {

    @RequestMapping("account")
    public String view(@AuthenticationPrincipal SampleUserDetails userDetails, Model model) {
        Account account = userDetails.getAccount();
        model.addAttribute(account);
        return "account/view";
    }
}
