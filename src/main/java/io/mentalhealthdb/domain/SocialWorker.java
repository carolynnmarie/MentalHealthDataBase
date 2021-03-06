package io.mentalhealthdb.domain;

import javax.persistence.*;
import java.util.ArrayList;

public class SocialWorker {

    @Id
    @GeneratedValue
    @Column(name = "COUNSELOR_ID")
    private long id;

    @Column(name = "FIRST_NAME")
    private String first_name;

    @Column(name = "LAST_NAME")
    private String last_name;

    @Column(name = "E_MAIL")
    private String e_mail;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "ADDRESS_ID")
    private ArrayList<Address> addresses;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "social_workers")
    private ArrayList<PsychPractice> practices;

}
