package com.tameen.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.Locale;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.tameen.model.User;
import com.tameen.service.UserService;
import com.tameen.util.Constants;
import com.tameen.util.PagesURL;;

@Component
@Scope(value = "session")
public class LoginController extends BaseController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Autowired
	private UserService userService;
	private String userName;
	private String password;
	private String locale = "ar";
	private Long localeId = 1L;
	private String direction = "rtl";
	private String inverseDirection = "ltr";

	public LoginController() {
		System.out.println("login controller");
	}

	public String loginAction() {
		if (userName == null && userName.isEmpty())
			return "";
		User user = userService.getUserByUsername(userName);
		if (user != null) {
			if (user.getPassword().equals(getPassword())) {
				System.out.println("true");
				setLoggedInUser(user);
				return PagesURL.HOME_PAGE.getPath();
			}
		} else {
			System.out.println("wrong user name");
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "Invalid Login!", "Please Try Again!"));
			return "";
		}
		return "";
	}

	private void applyLanguage() {
		FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale(this.locale));

	}

	public void changeToArabic() {
		this.direction = "rtl";
		this.inverseDirection = "ltr";
		this.locale = Constants.AR;
		this.localeId = (long) Constants.Codes.AR;
	}

	public void changeToEnglish() {
		this.direction = "ltr";
		this.inverseDirection = "rtl";
		this.locale = Constants.EN;
		this.localeId = (long) Constants.Codes.EN;
	}

	public void logout() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		FacesContext.getCurrentInstance().getExternalContext()
				.redirect(FacesContext.getCurrentInstance().getExternalContext().getApplicationContextPath()
						+ "/login.xhtml?faces-redirect=true");
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;

	}

}
