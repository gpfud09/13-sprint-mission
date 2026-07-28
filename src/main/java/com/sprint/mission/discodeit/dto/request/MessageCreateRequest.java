package com.sprint.mission.discodeit.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Getter
@NoArgsConstructor
public class MessageCreateRequest {

    private String content;
    private UUID channelId;
    private UUID authorId;

    private List<BinaryContentCreateRequest> attachments;

    public MessageCreateRequest(String content, UUID channelId, UUID authorId) {
        this.content = content;
        this.channelId = channelId;
        this.authorId = authorId;
    }
}
