package bootcamp.wssrs.domain.member.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FindMemberRequestDTO {
    private String email;
    private String studentId;
}
