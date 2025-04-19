package guru.qa.niffler.data.entity.spend;

import guru.qa.niffler.grpc.CurrencyValues;
import guru.qa.niffler.model.UserJson;
import lombok.Getter;
import lombok.Setter;

import java.nio.charset.StandardCharsets;
import java.util.*;

@Getter
@Setter
public class UserEntity {
    private UUID id;
    private String username;
    private CurrencyValues currency;
    private String firstname;
    private String surname;
    private String fullname;
    private byte[] photo;
    private byte[] photoSmall;

    public static UserEntity fromEntity(UserJson json) {
        UserEntity entity = new UserEntity();
        entity.getId(),
                entity.setUsername(json.username()),
                entity.setFirstname(json.firstname()),
                entity.setSurname(json.surname()),
                entity.setFullname(json.fullname()),
                entity.setCurrency(json.currency()),
                entity.setPhoto(json.photo() != null ? json.photo().getBytes(StandardCharsets.UTF_8) : null);
        entity.setPhotoSmall(json.photoSmall() != null ? json.photoSmall().getBytes(StandardCharsets.UTF_8) : null);
        return entity;
    }
}
