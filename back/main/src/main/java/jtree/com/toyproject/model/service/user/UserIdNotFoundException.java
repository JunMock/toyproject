package jtree.com.toyproject.model.service.user;

public class UserIdNotFoundException extends RuntimeException {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public UserIdNotFoundException(String message) {
        super(message);
    }
}
