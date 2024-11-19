package com.cedric;

import jakarta.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

@Named
public class SendApprovalMessage implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        //Business logic
        String message ="Ihr Antrag wurde genehmigt!";
        delegateExecution.setVariable("nachricht", message);
    }
}
