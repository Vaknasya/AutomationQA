package testAutoFramework.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerManager {

    private static final Logger log = LoggerFactory.getLogger(
            LoggerManager.class.getName());

    public void getLoggerMessage(String message) {
        log.info(message);
    }

    public void getLoggerMessage(String message, String description) {
        log.info(message, description);
    }

    public void getLoggerError(String error) {
        log.error(error);
    }

    public void getLoggerError(String error, String description) {
        log.error(error, description);
    }

    public void getLoggerWarning(String warning) {
        log.warn(warning);
    }

    public void getLoggerWarning(String warning, String description) {
        log.warn(warning, description);
    }

    public void getLoggerInfo(String info) {
        log.info(info);
    }
}
