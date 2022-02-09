package com.example.damo.service;

import com.example.damo.Repository.SlipRepository;

public class SlipService {

    protected SlipRepository slipRepository;

    public boolean getSlip(){

        // getSlipがspyの対象です。
        if(this.slipRepository.getSlip().length() == 0){
            return false;
        }
        return true;
    }
}
