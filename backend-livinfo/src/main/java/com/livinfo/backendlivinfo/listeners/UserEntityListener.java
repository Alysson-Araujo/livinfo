package com.livinfo.backendlivinfo.listeners;

import com.livinfo.backendlivinfo.domain.user.User;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.util.Date;

public class UserEntityListener {

    @PrePersist
    public void prePersist(User user) {
        Date currentDate = new Date();
        user.setCreatedAt(currentDate);
        user.setUpdatedAt(currentDate);
    }
    @PreUpdate
    public void preUpdate(User user) {
        user.setUpdatedAt(new Date());
    }
}
