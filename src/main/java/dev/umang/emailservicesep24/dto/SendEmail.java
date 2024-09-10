package dev.umang.emailservicesep24.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SendEmail {
    String subject;
    String from;
    String to;
    String body;
}
