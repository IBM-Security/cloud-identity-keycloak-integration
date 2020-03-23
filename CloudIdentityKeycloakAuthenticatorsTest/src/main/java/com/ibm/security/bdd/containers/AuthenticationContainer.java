package com.ibm.security.bdd.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.ibm.security.bdd.util.TestUtils;
import com.ibm.security.bdd.util.WebDriverFactory;

public class AuthenticationContainer {

	public AuthenticationContainer() {
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
}
		
	@FindBy(how = How.LINK_TEXT , using = "Flows")		
	public WebElement FlowsTab;
	
	@FindBy(how = How.LINK_TEXT , using = "Bindings")		
	public WebElement BindingsTab;
	
	@FindBy(how = How.LINK_TEXT , using = "Required Actions")		
	public WebElement RequiredActionsTab;
	
	@FindBy(how = How.LINK_TEXT , using = "Password Policy")		
	public WebElement PasswordPolicyTab;
	
	@FindBy(how = How.LINK_TEXT , using = "OTP Policy")		
	public WebElement OTPPolicyTab;
	
	@FindBy(how = How.LINK_TEXT , using = "WebAuthn Policy")		
	public WebElement WebAuthnPolicyTab;
	
	@FindBy(how = How.CSS, using = "button[type*='submit']")
	public WebElement SaveButton;
	
	@FindBy(how = How.CSS, using = "button[ng-click*='cancel()']")
	public WebElement CancelButton;
	
	@FindBy(how = How.CSS, using = "button[ng-click*='ok()']")
	public WebElement OkButton;
	
	@FindBy(how = How.CSS, using = ".alert-success")
	public WebElement SuccessMessage;
	
	@FindBy(how = How.CSS, using = ".pficon-ok")
	public WebElement SuccessIcon;
	
	@FindBy(how = How.CSS, using = "button[ng-click*='ok()']")
	public WebElement DeleteConfirmButton;
	
	@FindBy(how = How.CSS, using = ".modal-title")
	public WebElement WindowHeader;
	
	@FindBy(how = How.CSS, using = ".modal-body")
	public WebElement DeleteConfirmDescription;
	
	@FindBy(how = How.CSS, using = "#name")
	public WebElement NewNameText;
	
	// Flows tab
	
	@FindBy(how = How.CSS, using = "button[data-ng-click*='createFlow()']")
	public WebElement NewButton;
	
	@FindBy(how = How.CSS, using = "button[data-ng-click*='copyFlow()']")
	public WebElement CopyButton;	
	
	@FindBy(how = How.CSS, using = "button[data-ng-click*='deleteFlow()']")
	public WebElement DeleteButton;
	
	@FindBy(how = How.CSS, using = "button[data-ng-click*='addExecution()']")
	public WebElement AddExecutionButton;
	
	@FindBy(how = How.CSS, using = "button[data-ng-click*='addFlow()']")
	public WebElement AddFlowButton;
	
	@FindBy(how = How.CSS, using = ".form-control")
	public WebElement FlowsDropDown;
	
	@FindBy(how = How.XPATH, using = "//table[@class='table table-striped table-bordered']")
	public WebElement AuthenticationTable;
	
	@FindBy(how = How.CSS, using = ".fa-question-circle")
	public WebElement QuestionToolip;
	
	
	// Create Top Level Form
	
	@FindBy(how = How.CSS, using = "#alias")
	public WebElement AliasText;
	
	@FindBy(how = How.CSS, using = "#description")
	public WebElement DescriptionText;
	
	@FindBy(how = How.CSS, using = "#flowType")
	public WebElement FlowTypeDropDown;
	
	// Add Execution
	
	@FindBy(how = How.CSS, using = "#provider")
	public WebElement ProviderDropDown;
	
	@FindBy(how = How.CSS, using = "button[type*='submit']")
	public WebElement AddExecSaveButton;
	
	@FindBy(how = How.CSS, using = "button[ng-click*='cancel()']")
	public WebElement AddExecCancelButton;
	
	// Authenticator Config
	
	@FindBy(how = How.CSS, using = "#name")
	public WebElement ConfigAliasText;
	
	@FindBy(how = How.CSS, using = ".ng-scope:nth-child(1) > .col-md-6 > .form-control")
	public WebElement TenantNameText;
	
	@FindBy(how = How.CSS, using = ".ng-scope:nth-child(2) > .col-md-6 > .form-control")
	public WebElement APIClientIDText;
	
	@FindBy(how = How.CSS, using = ".form-group:nth-child(3) .form-control")
	public WebElement APIClientSecretText;
	
	@FindBy(how = How.CSS, using = "#configId")
	public WebElement IDText;
	
	@FindBy(how = How.CSS, using = ".form-group:nth-child(3) .btn-primary")
	public WebElement ConfigSaveButton;
	
	@FindBy(how = How.CSS, using = ".form-group:nth-child(2) .btn-default")
	public WebElement ConfigCancelButton;
	
	@FindBy(how = How.CSS, using = ".pficon-delete")
	public WebElement ConfigDeleteIcon;
	
	@FindBy(how = How.CSS, using = "span[data-ng-show*='config.alias']")
	public WebElement ConfigHeader;
	
	@FindBy(how = How.CSS, using = ".col-sm-9 > .ng-binding")
	public WebElement CreateConfigHeader;

}
