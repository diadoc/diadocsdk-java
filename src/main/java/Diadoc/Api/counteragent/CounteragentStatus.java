package Diadoc.Api.counteragent;

import java.util.Arrays;
import java.util.Optional;

public enum CounteragentStatus {
    IsMyCounteragent,
    InvitesMe,
    IsInvitedByMe,
    Rejected;

    public static Optional<CounteragentStatus> fromString(String value) {
        if (value == null) {
            return Optional.empty();
        }
        return Arrays.stream(values())
                .filter(status -> status.name().equals(value))
                .findFirst();
    }
}
