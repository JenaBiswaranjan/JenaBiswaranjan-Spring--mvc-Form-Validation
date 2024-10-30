package in.mvc.controller;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class User {
	@NotEmpty(message = "Uname is required")
	@Size(min = 3, max = 8, message = "Uname should be 3 to 8 characters")
	private String uname;

	@NotEmpty(message = "Pwd is required")
	private String pwd;

	@NotEmpty(message = "Email is required")
	@Email(message = "Enter valid email id")
	private String email;

	@NotEmpty(message = "Phno is required")
	@Size(min = 10, message = "Phno should have atleast 10 digits")
	private String phno;

	@NotNull(message = "Age is required")
	@Min(value = 21, message = "Age should be minimum 21 years")
	@Max(value = 60, message = "Age shouldn't cross 60 years")
	private Integer age;


}
