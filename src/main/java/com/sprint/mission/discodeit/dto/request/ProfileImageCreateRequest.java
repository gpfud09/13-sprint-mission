package com.sprint.mission.discodeit.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ProfileImageCreateRequest {
        private String fileName;
        private String contentType;
        private byte[] bytes;
}