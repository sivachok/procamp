package com.globallogic.procamp.lesson3.rest.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper = true)
public class EbookResource extends BookResource {
    
    private final BookType type = BookType.EBOOK;
    private String url;

    @Builder
    public EbookResource(String url, String name, String author) {
        super(name, author);
        this.url = url;
    }

    @Override public BookType getBookType() {
        return type;
    }
}
