package com.customer.ms.rest.model;

import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue
    private Long cif;

    @NotEmpty
    @Size(min = 3, max = 20, message = "İsim 3 ile 20 karakter arasında olmalıdır.")
    private String    name;
    
    @NotEmpty
    @Size(min = 3, max = 30, message = "Soyisim 3 ile 30 karakter arasında olmalıdır.")
    private String    surname;
    
    @NotNull
    @Past
    private LocalDate birthdate;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private CustomerExt customerExt;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public LocalDate getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(final LocalDate birthdateParam) {
        this.birthdate = birthdateParam;
    }
    
    public Long getCif() {
		return cif;
	}

	public void setCif(Long cif) {
		this.cif = cif;
	}

	public CustomerExt getCustomerExt() {
		return customerExt;
	}

	public void setCustomerExt(final CustomerExt customerExt) {
		this.customerExt = customerExt;
	}

	@Override
    public String toString() {
        return "Person [name="
               + this.name
               + ", surname="
               + this.surname
               + ", birthdate="
               + this.birthdate
               + "]";
    }
}