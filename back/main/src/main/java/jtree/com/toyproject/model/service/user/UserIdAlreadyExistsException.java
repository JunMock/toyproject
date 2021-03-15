package jtree.com.toyproject.model.service.user;

public class UserIdAlreadyExistsException extends RuntimeException {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public UserIdAlreadyExistsException(String message) {
        super(message);
    }
}