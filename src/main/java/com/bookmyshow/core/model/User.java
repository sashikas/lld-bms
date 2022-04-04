package com.bookmyshow.core.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

public class User extends Auditable {
    @Column(unique = true)
    @Getter @Setter
    private String email;
    private String SaltedHashedPassword;

    @ManyToMany
    private List<Role> roles=new ArrayList<>();

    @OneToOne
    private Profile profile;
    //Hash the password
    //Hash(Something) => hashcode
    //one way function
    //MD5 is big nono ,MD5 is cracked
    //SHA256/SHA512
    //base64 is also big NOOO
    //salt => some random value based on username that is added to the password before hashing

}
