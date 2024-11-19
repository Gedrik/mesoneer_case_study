package com.cedric;

import jakarta.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

@Named
public class FormStatus implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        String aktuellerStatus = "";

        aktuellerStatus = (String) delegateExecution.getVariable("Status");

        delegateExecution.setVariable("status", aktuellerStatus);
    }
}
