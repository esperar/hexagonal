package esperer.user.domain.user.error;

import esperer.user.error.ErrorProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum UserErrorCode implements ErrorProperty {


    USER_NOT_FOUND(404, "User Not Found.."),
    USER_ALREADY_EXISTS(409, "Already Exist User");

    private final int status;
    private final String message;
}
