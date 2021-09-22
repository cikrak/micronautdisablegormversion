package com.reybex.domain

import grails.gorm.annotation.Entity

@Entity
class User {
    String name
    String email

    static mapping = {

    }

}
