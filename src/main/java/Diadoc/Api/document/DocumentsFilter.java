package Diadoc.Api.document;

import java.util.Date;

public class DocumentsFilter {
    private final String boxId;
    private final String filterCategory;
    private final String counteragentBoxId;

    private final String fromDepartmentId;
    private final String toDepartmentId;
    private final Date timestampFrom;
    private final Date timestampTo;
    private final String fromDocumentDate;
    private final String toDocumentDate;
    private final String departmentId;
    private final boolean excludeSubdepartments;
    private final String sortDirection;
    private final String afterIndexKey;
    private final Integer count;

    // Приватный конструктор
    private DocumentsFilter(Builder builder) {
        this.boxId = builder.boxId;
        this.filterCategory = builder.filterCategory;
        this.counteragentBoxId = builder.counteragentBoxId;
        this.timestampFrom = builder.timestampFrom;
        this.timestampTo = builder.timestampTo;
        this.fromDocumentDate = builder.fromDocumentDate;
        this.toDocumentDate = builder.toDocumentDate;
        this.departmentId = builder.departmentId;
        this.excludeSubdepartments = builder.excludeSubdepartments;
        this.sortDirection = builder.sortDirection;
        this.afterIndexKey = builder.afterIndexKey;
        this.count = builder.count;
        this.fromDepartmentId = builder.fromDepartmentId;
        this.toDepartmentId = builder.toDepartmentId;
    }

    // Статический внутренний класс Builder
    public static class Builder {
        private String boxId;
        private String filterCategory;
        private String counteragentBoxId;
        private String fromDepartmentId;
        private String toDepartmentId;
        private Date timestampFrom;
        private Date timestampTo;
        private String fromDocumentDate;
        private String toDocumentDate;
        private String departmentId;
        private boolean excludeSubdepartments;
        private String sortDirection;
        private String afterIndexKey;
        private Integer count;

        public Builder() {}

        public Builder boxId(String boxId) {
            this.boxId = boxId;
            return this;
        }

        public Builder filterCategory(String filterCategory) {
            this.filterCategory = filterCategory;
            return this;
        }

        public Builder counteragentBoxId(String counteragentBoxId) {
            this.counteragentBoxId = counteragentBoxId;
            return this;
        }

        public Builder timestampFrom(Date timestampFrom) {
            this.timestampFrom = timestampFrom;
            return this;
        }

        public Builder timestampTo(Date timestampTo) {
            this.timestampTo = timestampTo;
            return this;
        }

        public Builder fromDocumentDate(String fromDocumentDate) {
            this.fromDocumentDate = fromDocumentDate;
            return this;
        }

        public Builder toDocumentDate(String toDocumentDate) {
            this.toDocumentDate = toDocumentDate;
            return this;
        }

        public Builder departmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }

        public Builder excludeSubdepartments(boolean excludeSubdepartments) {
            this.excludeSubdepartments = excludeSubdepartments;
            return this;
        }

        public Builder sortDirection(String sortDirection) {
            this.sortDirection = sortDirection;
            return this;
        }

        public Builder afterIndexKey(String afterIndexKey) {
            this.afterIndexKey = afterIndexKey;
            return this;
        }

        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        public Builder fromDepartmentId(String fromDepartmentId) {
            this.fromDepartmentId = fromDepartmentId;
            return this;
        }

        public Builder toDepartmentId(String toDepartmentId) {
            this.toDepartmentId = toDepartmentId;
            return this;
        }

        public DocumentsFilter build() {
            return new DocumentsFilter(this);
        }
    }

    // Геттеры
    public String getBoxId() {
        return boxId;
    }

    public String getFilterCategory() {
        return filterCategory;
    }

    public String getCounteragentBoxId() {
        return counteragentBoxId;
    }

    public Date getTimestampFrom() {
        return timestampFrom;
    }

    public Date getTimestampTo() {
        return timestampTo;
    }

    public String getFromDocumentDate() {
        return fromDocumentDate;
    }

    public String getToDocumentDate() {
        return toDocumentDate;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public boolean isExcludeSubdepartments() {
        return excludeSubdepartments;
    }

    public String getSortDirection() {
        return sortDirection;
    }

    public String getAfterIndexKey() {
        return afterIndexKey;
    }

    public Integer getCount() {
        return count;
    }

    public String getFromDepartmentId() {
        return fromDepartmentId;
    }

    public String getToDepartmentId() {
        return toDepartmentId;
    }
}