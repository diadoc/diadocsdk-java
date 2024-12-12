package Diadoc.Api.document;

import java.util.Date;

public class DocumentsFilter {
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

    /**
     * @deprecated Конструктор устарел
     * Рекомендуется использовать {@link #DocumentsFilter(Builder)}
     */
    @Deprecated
    public DocumentsFilter(){}

    /**
     * @deprecated Конструктор устарел
     * Рекомендуется использовать {@link #DocumentsFilter(Builder)}
     */
    @Deprecated
    public DocumentsFilter(
            String boxId,
            String filterCategory,
            String counteragentBoxId,
            Date timestampFrom,
            Date timestampTo,
            String fromDocumentDate,
            String toDocumentDate,
            String departmentId,
            boolean excludeSubdepartments,
            String sortDirection,
            String afterIndexKey,
            Integer count) {
        this.boxId = boxId;
        this.filterCategory = filterCategory;
        this.counteragentBoxId = counteragentBoxId;
        this.timestampFrom = timestampFrom;
        this.timestampTo = timestampTo;
        this.fromDocumentDate = fromDocumentDate;
        this.toDocumentDate = toDocumentDate;
        this.departmentId = departmentId;
        this.excludeSubdepartments = excludeSubdepartments;
        this.sortDirection = sortDirection;
        this.afterIndexKey = afterIndexKey;
        this.count = count;
    }

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

    public String getBoxId() {
        return boxId;
    }

    /**
     * @deprecated Setter устарел
     * Рекомендуется использовать {@link #DocumentsFilter(Builder)}
     */
    public DocumentsFilter setBoxId(String boxId) {
        this.boxId = boxId;
        return this;
    }

    public String getFilterCategory() {
        return filterCategory;
    }

    /**
     * @deprecated Setter устарел
     * Рекомендуется использовать {@link #DocumentsFilter(Builder)}
     */
    public DocumentsFilter setFilterCategory(String filterCategory) {
        this.filterCategory = filterCategory;
        return this;
    }

    public String getCounteragentBoxId() {
        return counteragentBoxId;
    }

    /**
     * @deprecated Setter устарел
     * Рекомендуется использовать {@link #DocumentsFilter(Builder)}
     */
    public DocumentsFilter setCounteragentBoxId(String counteragentBoxId) {
        this.counteragentBoxId = counteragentBoxId;
        return this;
    }

    public Date getTimestampFrom() {
        return timestampFrom;
    }

    /**
     * @deprecated Setter устарел
     * Рекомендуется использовать {@link #DocumentsFilter(Builder)}
     */
    public DocumentsFilter setTimestampFrom(Date timestampFrom) {
        this.timestampFrom = timestampFrom;
        return this;
    }

    public Date getTimestampTo() {
        return timestampTo;
    }

    /**
     * @deprecated Setter устарел
     * Рекомендуется использовать {@link #DocumentsFilter(Builder)}
     */
    public DocumentsFilter setTimestampTo(Date timestampTo) {
        this.timestampTo = timestampTo;
        return this;
    }

    public String getFromDocumentDate() {
        return fromDocumentDate;
    }

    /**
     * @deprecated Setter устарел
     * Рекомендуется использовать {@link #DocumentsFilter(Builder)}
     */
    public DocumentsFilter setFromDocumentDate(String fromDocumentDate) {
        this.fromDocumentDate = fromDocumentDate;
        return this;
    }

    public String getToDocumentDate() {
        return toDocumentDate;
    }

    /**
     * @deprecated Setter устарел
     * Рекомендуется использовать {@link #DocumentsFilter(Builder)}
     */
    public DocumentsFilter setToDocumentDate(String toDocumentDate) {
        this.toDocumentDate = toDocumentDate;
        return this;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * @deprecated Setter устарел
     * Рекомендуется использовать {@link #DocumentsFilter(Builder)}
     */
    public DocumentsFilter setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
        return this;
    }

    public boolean isExcludeSubdepartments() {
        return excludeSubdepartments;
    }

    /**
     * @deprecated Setter устарел
     * Рекомендуется использовать {@link #DocumentsFilter(Builder)}
     */
    public DocumentsFilter setExcludeSubdepartments(boolean excludeSubdepartments) {
        this.excludeSubdepartments = excludeSubdepartments;
        return this;
    }

    public String getSortDirection() {
        return sortDirection;
    }

    /**
     * @deprecated Setter устарел
     * Рекомендуется использовать {@link #DocumentsFilter(Builder)}
     */
    public DocumentsFilter setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
        return this;
    }

    public String getAfterIndexKey() {
        return afterIndexKey;
    }

    /**
     * @deprecated Setter устарел
     * Рекомендуется использовать {@link #DocumentsFilter(Builder)}
     */
    public DocumentsFilter setAfterIndexKey(String afterIndexKey) {
        this.afterIndexKey = afterIndexKey;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    /**
     * @deprecated Setter устарел
     * Рекомендуется использовать {@link #DocumentsFilter(Builder)}
     */
    public DocumentsFilter setCount(Integer count) {
        this.count = count;
        return this;
    }

    public String getFromDepartmentId() {
        return fromDepartmentId;
    }

    public String getToDepartmentId() {
        return toDepartmentId;
    }
}