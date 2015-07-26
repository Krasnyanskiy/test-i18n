package com.alex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Alexander Krasnyanskiy
 */
@Service
public class UidGeneratorService {

    @Autowired
    private MessageSource messageSource;

    private Object message;

    public String generateUid() {
        return UUID.randomUUID().toString();
    }

    public String getMessage() {
        String message = "noMessage";
        try {
            message = messageSource.getMessage("app.messages.service.output", null, LocaleContextHolder.getLocale());
        } catch (NoSuchMessageException ignored) {
        }
        return message;
    }
}
