package uk.gov.hmcts.reform.dev.Exception;

import java.time.LocalDateTime;

public class ErrorDetails {

    private String message;
    private String details;
    private LocalDateTime timestmp;

    public ErrorDetails(String message, String details, LocalDateTime timestmp) {
        this.message = message;
        this.details = details;
        this.timestmp = timestmp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDateTime getTimestmp() {
        return timestmp;
    }

    public void setTimestmp(LocalDateTime timestmp) {
        this.timestmp = timestmp;
    }
}
