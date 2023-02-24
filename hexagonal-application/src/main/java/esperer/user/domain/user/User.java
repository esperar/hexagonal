package esperer.user.domain.user;

import esperer.user.annotation.Aggregate;
import esperer.user.domain.user.type.UserRole;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
@Aggregate
public class User {
    private final UUID id;
    private final String email;
    private final String password;
    private final String name;
    private final UserRole userRole;
}
