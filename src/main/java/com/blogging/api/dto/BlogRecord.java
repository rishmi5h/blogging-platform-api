package com.blogging.api.dto;

import java.util.List;

public record BlogRecord(Long id, String title, String content, String author, List<String> tags, String createdAt, String updatedAt) {
}
