package com.sprint.mission.discodeit.dto.response;

import com.sprint.mission.discodeit.entity.BinaryContent;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class BinaryContentResponse {
    private UUID id;
    private String filename;
    private String contentType;
    private Long fileSize;

    public static BinaryContentResponse from(BinaryContent content) {
        return new BinaryContentResponse(
                content.getId(),
                content.getFileName(),
                content.getContentType(),
                content.getFileSize()
        );
    }
}
