package me.maximenkov_anton.controller;

import lombok.RequiredArgsConstructor;
import me.maximenkov_anton.domain.Contract;
import me.maximenkov_anton.service.ContractService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

@Controller
@RequiredArgsConstructor
@RequestMapping("contract")
public class ContractController {
    private final ContractService contractService;

    @RequestMapping("get_all")
    @ResponseBody
    public Set<Contract> showRecipeById(){
        return contractService.findAll();
    }
}
