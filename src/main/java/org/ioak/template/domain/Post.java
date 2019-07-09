package org.ioak.template.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "post")
public class Post {
    @Id
    private String id;
    private String title;
    private String body;
}
